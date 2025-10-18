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

package dev.g000sha256.tdl.dto

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A new pending text message was received in a chat with a bot. The message must be shown in the chat for at most getOption(&quot;pending_text_message_period&quot;) seconds, replace any other pending message with the same draftId, and be deleted whenever any incoming message from the bot in the message thread is received.
 *
 * @property chatId Chat identifier.
 * @property forumTopicId The forum topic identifier in which the message will be sent; 0 if none.
 * @property draftId Unique identifier of the message draft within the message thread.
 * @property text Text of the pending message.
 */
public class UpdatePendingTextMessage public constructor(
    public val chatId: Long,
    public val forumTopicId: Int,
    public val draftId: Long,
    public val text: FormattedText,
) : Update() {
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other == null) {
            return false
        }
        if (other::class != this::class) {
            return false
        }
        other as UpdatePendingTextMessage
        if (other.chatId != chatId) {
            return false
        }
        if (other.forumTopicId != forumTopicId) {
            return false
        }
        if (other.draftId != draftId) {
            return false
        }
        return other.text == text
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + forumTopicId.hashCode()
        hashCode = 31 * hashCode + draftId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdatePendingTextMessage")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("forumTopicId=")
            append(forumTopicId)
            append(", ")
            append("draftId=")
            append(draftId)
            append(", ")
            append("text=")
            append(text)
            append(")")
        }
    }
}
