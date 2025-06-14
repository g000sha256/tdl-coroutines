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

internal val serviceLocator by lazy { TdlServiceLocator() }

internal class TdlServiceLocator {

    private val coroutineScope by lazy { TdlCoroutineScope() }
    private val engine by lazy { TdlEngine(coroutineScope, native) }
    private val mapper by lazy { TdlMapper() }
    private val native by lazy { TdlNative() }

    private val repository: TdlRepository
        get() = TdlRepository(engine)

    fun createClient(): TdlClient {
        return TdlClientImpl(mapper, repository)
    }

}
