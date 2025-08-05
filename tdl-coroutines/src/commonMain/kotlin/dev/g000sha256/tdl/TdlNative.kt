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

import org.drinkless.tdlib.JsonClient

internal class TdlNative {

    private val jsonClient = JsonClient()

    fun createClientId(): Int {
        return jsonClient.createClientId()
    }

    fun send(clientId: Int, request: String) {
        jsonClient.send(clientId = clientId, request = request)
    }

    fun receive(timeoutInSeconds: Double): String {
        return jsonClient.receive(timeoutInSeconds = timeoutInSeconds)
    }

}
