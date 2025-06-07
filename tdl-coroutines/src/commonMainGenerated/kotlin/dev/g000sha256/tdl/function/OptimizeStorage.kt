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

import dev.g000sha256.tdl.dto.FileType
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "optimizeStorage")
@Serializable
internal class OptimizeStorage internal constructor(
    @SerialName(value = "size")
    internal val size: Long,
    @SerialName(value = "ttl")
    internal val ttl: Int,
    @SerialName(value = "count")
    internal val count: Int,
    @SerialName(value = "immunity_delay")
    internal val immunityDelay: Int,
    @SerialName(value = "file_types")
    internal val fileTypes: Array<FileType>,
    @SerialName(value = "chat_ids")
    internal val chatIds: LongArray,
    @SerialName(value = "exclude_chat_ids")
    internal val excludeChatIds: LongArray,
    @SerialName(value = "return_deleted_file_statistics")
    internal val returnDeletedFileStatistics: Boolean,
    @SerialName(value = "chat_limit")
    internal val chatLimit: Int,
) : Function()
