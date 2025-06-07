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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "setTdlibParameters")
@Serializable
internal class SetTdlibParameters internal constructor(
    @SerialName(value = "use_test_dc")
    internal val useTestDc: Boolean,
    @SerialName(value = "database_directory")
    internal val databaseDirectory: String,
    @SerialName(value = "files_directory")
    internal val filesDirectory: String,
    @SerialName(value = "database_encryption_key")
    internal val databaseEncryptionKey: ByteArray,
    @SerialName(value = "use_file_database")
    internal val useFileDatabase: Boolean,
    @SerialName(value = "use_chat_info_database")
    internal val useChatInfoDatabase: Boolean,
    @SerialName(value = "use_message_database")
    internal val useMessageDatabase: Boolean,
    @SerialName(value = "use_secret_chats")
    internal val useSecretChats: Boolean,
    @SerialName(value = "api_id")
    internal val apiId: Int,
    @SerialName(value = "api_hash")
    internal val apiHash: String,
    @SerialName(value = "system_language_code")
    internal val systemLanguageCode: String,
    @SerialName(value = "device_model")
    internal val deviceModel: String,
    @SerialName(value = "system_version")
    internal val systemVersion: String,
    @SerialName(value = "application_version")
    internal val applicationVersion: String,
) : Function()
