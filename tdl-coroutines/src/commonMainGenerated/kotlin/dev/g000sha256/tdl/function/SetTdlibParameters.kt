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

package dev.g000sha256.tdl.function

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

internal class SetTdlibParameters internal constructor(
    internal val useTestDc: Boolean,
    internal val databaseDirectory: String,
    internal val filesDirectory: String,
    internal val databaseEncryptionKey: ByteArray,
    internal val useFileDatabase: Boolean,
    internal val useChatInfoDatabase: Boolean,
    internal val useMessageDatabase: Boolean,
    internal val useSecretChats: Boolean,
    internal val apiId: Int,
    internal val apiHash: String,
    internal val systemLanguageCode: String,
    internal val deviceModel: String,
    internal val systemVersion: String,
    internal val applicationVersion: String,
)
