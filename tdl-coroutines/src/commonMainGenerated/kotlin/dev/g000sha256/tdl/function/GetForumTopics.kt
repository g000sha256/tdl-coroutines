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

import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getForumTopics")
@Serializable
internal class GetForumTopics internal constructor(
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "query")
    internal val query: String,
    @SerialName(value = "offset_date")
    internal val offsetDate: Int,
    @SerialName(value = "offset_message_id")
    internal val offsetMessageId: Long,
    @SerialName(value = "offset_message_thread_id")
    internal val offsetMessageThreadId: Long,
    @SerialName(value = "limit")
    internal val limit: Int,
) : Function()
