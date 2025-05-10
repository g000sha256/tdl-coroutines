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

import kotlin.reflect.KClass
import kotlinx.atomicfu.atomic
import kotlinx.atomicfu.updateAndGet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.flow.transform
import org.drinkless.tdlib.TdApi

internal class TdlRepository(private val engine: TdlEngine) {

    private val stopped = atomic(initial = false)
    private val updatesFlow: Flow<TdApi.Update>
    private val clientId = engine.createClientId()

    init {
        updatesFlow = engine
            .getUpdates(clientId)
            .filterIsInstance<TdApi.Update>()
            .onStart { emit(ServiceUpdate.Start) }
            .transform { update -> transformUpdates(update) }
            .takeWhile { update -> !checkStopped(update) }
            .filter { it !is ServiceUpdate }
    }

    fun <T1 : TdApi.Update, T2> getUpdates(clazz: KClass<T1>, transform: (T1) -> T2): Flow<T2> {
        return updatesFlow
            .filterIsInstance(clazz)
            .map(transform)
    }

    suspend fun <T1 : TdApi.Object, T2> send(function: TdApi.Function<T1>, transform: (T1) -> T2): TdlResult<T2> {
        val result = engine.send(clientId, function)
        when {
            result is TdApi.Error -> return TdlResult.Failure(result.code, result.message)
            else -> {
                @Suppress("UNCHECKED_CAST")
                val transformed = transform.invoke(result as T1)
                return TdlResult.Success(transformed)
            }
        }
    }

    private suspend fun FlowCollector<TdApi.Update>.transformUpdates(update: TdApi.Update) {
        emit(update)

        val closed = checkClosed(update)
        if (closed) {
            emit(ServiceUpdate.Stop)
        }
    }

    private fun checkClosed(update: TdApi.Update): Boolean {
        if (update !is TdApi.UpdateAuthorizationState) {
            return false
        }

        return update.authorizationState is TdApi.AuthorizationStateClosed
    }

    private fun checkStopped(update: TdApi.Update): Boolean {
        return stopped.updateAndGet { alreadyStopped ->
            if (alreadyStopped) {
                return@updateAndGet true
            }

            return@updateAndGet update == ServiceUpdate.Stop
        }
    }

    private sealed class ServiceUpdate : TdApi.Update() {

        override fun getConstructor(): Int {
            return 0
        }

        object Start : ServiceUpdate()

        object Stop : ServiceUpdate()

    }

}