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

import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.Error
import dev.g000sha256.tdl.dto.ServiceUpdate
import dev.g000sha256.tdl.dto.Update
import dev.g000sha256.tdl.dto.UpdateAuthorizationState
import kotlinx.atomicfu.atomic
import kotlinx.atomicfu.updateAndGet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.flow.transform

internal class TdlRepository(private val engine: TdlEngine) {

    private val stopped = atomic(initial = false)
    private val clientId = engine.createClientId()

    val updates: Flow<Update>

    init {
        updates = engine
            .getUpdates(clientId = clientId)
            .onStart { emit(value = ServiceUpdate.Start) }
            .transform { update -> transform(update = update) }
            .takeWhile { update -> !checkStopped(update = update) }
            .filter { update -> update !is ServiceUpdate }
    }

    @Suppress("UNCHECKED_CAST")
    suspend fun <F : Any, M> send(function: F): TdlResult<M> {
        val dto = engine.send(function = function, clientId = clientId)
        when {
            dto is Error -> return TdlResult.Failure(code = dto.code, message = dto.message)
            else -> return TdlResult.Success(result = dto as M)
        }
    }

    private suspend fun FlowCollector<Update>.transform(update: Update) {
        emit(value = update)

        val closed = checkClosed(update = update)
        if (closed) {
            emit(value = ServiceUpdate.Stop)
        }
    }

    private fun checkClosed(update: Update): Boolean {
        if (update !is UpdateAuthorizationState) {
            return false
        }

        return update.authorizationState is AuthorizationStateClosed
    }

    private fun checkStopped(update: Update): Boolean {
        return stopped.updateAndGet { alreadyStopped ->
            if (alreadyStopped) {
                return@updateAndGet true
            }

            return@updateAndGet update == ServiceUpdate.Stop
        }
    }

}
