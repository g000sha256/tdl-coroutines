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

import dev.g000sha256.tdl.dto.Update
import dev.g000sha256.tdl.util.buildJsonObjectString
import dev.g000sha256.tdl.util.put
import kotlin.time.Duration.Companion.hours
import kotlinx.atomicfu.atomic
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.onSubscription
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.putJsonObject

private val MAX_TIMEOUT = 24.hours.inWholeSeconds.toDouble()

internal class TdlEngine(
    private val coroutineDispatcherReceiver: CoroutineDispatcher,
    private val coroutineDispatcherSender: CoroutineDispatcher,
    private val coroutineScope: CoroutineScope,
    private val native: TdlNative,
    private val deserializer: TdlDeserializer,
    private val serializer: TdlSerializer,
) {

    private val requestIdsCounter = atomic(initial = 0L)
    private val startedCompletableDeferred = CompletableDeferred<Unit>()
    private val responsesMutableSharedFlow = MutableSharedFlow<Triple<Int, Long, Any>>(extraBufferCapacity = Int.MAX_VALUE)

    init {
        native.execute(
            request = buildJsonObjectString {
                put(key = "@type", string = "setLogVerbosityLevel")
                put(key = "new_verbosity_level", int = 0)
            },
        )
        native.execute(
            request = buildJsonObjectString {
                put(key = "@type", string = "setLogStream")
                putJsonObject(key = "log_stream") {
                    put(key = "@type", string = "logStreamEmpty")
                }
            },
        )

        coroutineScope.launch(context = coroutineDispatcherReceiver) {
            startedCompletableDeferred.complete(value = Unit)

            while (true) {
                native
                    .receive(timeoutInSeconds = MAX_TIMEOUT)
                    .let { json -> json ?: continue }
                    .let { json -> deserializer.deserialize(json = json) }
                    .also { triple -> responsesMutableSharedFlow.emit(value = triple) }
            }
        }
    }

    fun createClientId(): Int {
        return native.createClientId()
    }

    fun getUpdates(clientId: Int): Flow<Update> {
        return responsesMutableSharedFlow.mapNotNull { triple ->
            if (triple.first != clientId) {
                return@mapNotNull null
            }

            if (triple.second > 0L) {
                return@mapNotNull null
            }

            val dto = triple.third
            if (dto !is Update) {
                return@mapNotNull null
            }

            return@mapNotNull dto
        }
    }

    suspend fun <F : Any> send(function: F, clientId: Int): Any {
        startedCompletableDeferred.await()

        return withContext(context = coroutineDispatcherSender) {
            val requestId = requestIdsCounter.incrementAndGet()

            val json = serializer.serialize(function = function, requestId = requestId)

            return@withContext responsesMutableSharedFlow
                .onSubscription { native.send(clientId = clientId, request = json) }
                .first { triple -> triple.first == clientId && triple.second == requestId }
                .third
        }
    }

}
