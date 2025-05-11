/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.g000sha256.tdl

import kotlin.time.Duration.Companion.hours
import kotlinx.atomicfu.atomic
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onSubscription
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.Client as TdlNative

private const val MAX_SIZE = 100

private val MAX_TIMEOUT = 24.hours.inWholeSeconds.toDouble()

internal class TdlEngine(private val coroutineScope: TdlCoroutineScope, private val native: TdlNative) {

    private val initialized = atomic(initial = false)
    private val requestIdsCounter = atomic(initial = 0L)
    private val responsesMutableSharedFlow = MutableSharedFlow<Pair<Long, TdApi.Object>>()
    private val updatesMutableSharedFlow = MutableSharedFlow<Pair<Int, TdApi.Object>>(extraBufferCapacity = Int.MAX_VALUE)

    fun createClientId(): Int {
        return native.createNativeClient()
    }

    fun getUpdates(clientId: Int): Flow<TdApi.Object> {
        return updatesMutableSharedFlow
            .filter { update -> update.first == clientId }
            .map { update -> update.second }
    }

    suspend fun send(clientId: Int, function: TdApi.Function<*>): TdApi.Object {
        startIfNeeded()

        val requestId = requestIdsCounter.incrementAndGet()
        return responsesMutableSharedFlow
            .onSubscription { native.nativeClientSend(clientId, requestId, function) }
            .first { update -> update.first == requestId }
            .second
    }

    private fun startIfNeeded() {
        val notInitialized = initialized.compareAndSet(expect = false, update = true)
        if (!notInitialized) {
            return
        }

        coroutineScope.launch {
            val clientIds = IntArray(MAX_SIZE) { -1 }
            val requestIds = LongArray(MAX_SIZE) { -1L }
            val responses = Array<TdApi.Object?>(MAX_SIZE) { null }

            while (true) {
                val responsesCount = native.nativeClientReceive(clientIds, requestIds, responses, MAX_TIMEOUT)
                repeat(responsesCount) { index ->
                    val clientId = clientIds.getAndSet(index, newValue = -1)
                    val requestId = requestIds.getAndSet(index, newValue = -1L)
                    val response = responses.getAndSet(index, newValue = null)!!

                    if (requestId == 0L) {
                        updatesMutableSharedFlow.emit(value = clientId to response)
                    } else {
                        responsesMutableSharedFlow.emit(value = requestId to response)
                    }
                }
            }
        }
    }

    companion object {

        const val GIT_COMMIT_HASH = TdApi.GIT_COMMIT_HASH
        const val VERSION = TdApi.VERSION

    }

}
