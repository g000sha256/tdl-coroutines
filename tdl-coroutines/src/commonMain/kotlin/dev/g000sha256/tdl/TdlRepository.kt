/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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

import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.Error
import dev.g000sha256.tdl.dto.Update
import dev.g000sha256.tdl.dto.UpdateAuthorizationState
import kotlin.concurrent.atomics.AtomicBoolean
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.onSubscription
import kotlinx.coroutines.flow.transformWhile
import kotlinx.coroutines.launch

internal class TdlRepository(
    private val coroutineScope: CoroutineScope,
    private val engine: TdlEngine,
) {

    private val clientId = engine.createClientId()

    val updates = createUpdates()

    @Suppress("UNCHECKED_CAST")
    suspend fun <F : Any, M> send(function: F): TdlResult<M> {
        val dto = engine.send(function = function, clientId = clientId)
        when {
            dto is Error -> return TdlResult.Failure(code = dto.code, message = dto.message)
            else -> return TdlResult.Success(result = dto as M)
        }
    }

    @OptIn(ExperimentalAtomicApi::class)
    private fun createUpdates(): Flow<Update> {
        val updates = MutableSharedFlow<Update?>(extraBufferCapacity = Int.MAX_VALUE)
        val stopped = AtomicBoolean(value = false)

        coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
            engine
                .getUpdates(clientId = clientId)
                .transformWhile { update ->
                    val closed = update.isClosed()

                    if (closed) {
                        stopped.store(newValue = true)
                    }

                    emit(value = update)

                    if (closed) {
                        emit(value = null)
                    }

                    return@transformWhile closed.not()
                }
                .collect(collector = updates)
        }

        return updates
            .onSubscription {
                val stopped = stopped.load()
                if (stopped) {
                    emit(value = null)
                }
            }
            .transformWhile { update ->
                if (update == null) {
                    return@transformWhile false
                }

                emit(value = update)

                return@transformWhile true
            }
    }

    private fun Update.isClosed(): Boolean {
        if (this !is UpdateAuthorizationState) {
            return false
        }

        return authorizationState is AuthorizationStateClosed
    }
}
