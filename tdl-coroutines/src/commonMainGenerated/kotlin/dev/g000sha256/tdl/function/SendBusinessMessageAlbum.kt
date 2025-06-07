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

import dev.g000sha256.tdl.dto.InputMessageContent
import dev.g000sha256.tdl.dto.InputMessageReplyTo
import kotlin.Array
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "sendBusinessMessageAlbum")
@Serializable
internal class SendBusinessMessageAlbum internal constructor(
    @SerialName(value = "business_connection_id")
    internal val businessConnectionId: String,
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "reply_to")
    internal val replyTo: InputMessageReplyTo?,
    @SerialName(value = "disable_notification")
    internal val disableNotification: Boolean,
    @SerialName(value = "protect_content")
    internal val protectContent: Boolean,
    @SerialName(value = "effect_id")
    internal val effectId: Long,
    @SerialName(value = "input_message_contents")
    internal val inputMessageContents: Array<InputMessageContent>,
) : Function()
