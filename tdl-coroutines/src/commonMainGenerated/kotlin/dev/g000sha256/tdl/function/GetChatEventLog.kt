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

import dev.g000sha256.tdl.dto.ChatEventLogFilters
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getChatEventLog")
@Serializable
internal class GetChatEventLog internal constructor(
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "query")
    internal val query: String,
    @SerialName(value = "from_event_id")
    internal val fromEventId: Long,
    @SerialName(value = "limit")
    internal val limit: Int,
    @SerialName(value = "filters")
    internal val filters: ChatEventLogFilters?,
    @SerialName(value = "user_ids")
    internal val userIds: LongArray,
) : Function()
