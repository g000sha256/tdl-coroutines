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
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "addQuickReplyShortcutInlineQueryResultMessage")
@Serializable
internal class AddQuickReplyShortcutInlineQueryResultMessage internal constructor(
    @SerialName(value = "shortcut_name")
    internal val shortcutName: String,
    @SerialName(value = "reply_to_message_id")
    internal val replyToMessageId: Long,
    @SerialName(value = "query_id")
    internal val queryId: Long,
    @SerialName(value = "result_id")
    internal val resultId: String,
    @SerialName(value = "hide_via_bot")
    internal val hideViaBot: Boolean,
) : Function()
