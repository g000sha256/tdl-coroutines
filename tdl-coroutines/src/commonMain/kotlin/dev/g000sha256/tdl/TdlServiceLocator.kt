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

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.serialization.json.Json

internal val serviceLocator by lazy { TdlServiceLocator() }

internal class TdlServiceLocator {

    private val coroutineDispatcherReceiver by lazy { createSingleThreadCoroutineDispatcher(name = "TDL-Receiver-Thread") }
    private val coroutineDispatcherSender by lazy { createSingleThreadCoroutineDispatcher(name = "TDL-Sender-Thread") }
    private val coroutineScope by lazy { createCoroutineScope() }
    private val json by lazy { createJson() }

    private val engine by lazy { createEngine() }
    private val mapper by lazy { TdlMapper() }
    private val native by lazy { TdlNative() }

    private val repository: TdlRepository
        get() = TdlRepository(engine)

    fun createClient(): TdlClient {
        return TdlClientImpl(mapper, repository)
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun createSingleThreadCoroutineDispatcher(name: String): CoroutineDispatcher {
        return newFixedThreadPoolContext(nThreads = 1, name = name)
    }

    private fun createCoroutineScope(): CoroutineScope {
        return object : CoroutineScope {

            override val coroutineContext = Job()

        }
    }

    private fun createEngine(): TdlEngine {
        return TdlEngine(
            coroutineDispatcherReceiver = coroutineDispatcherReceiver,
            coroutineDispatcherSender = coroutineDispatcherSender,
            coroutineScope = coroutineScope,
            parser = json,
            native = native,
        )
    }

    private fun createJson(): Json {
        return Json {
            classDiscriminator = "@type"
            ignoreUnknownKeys = true
        }
    }

}
