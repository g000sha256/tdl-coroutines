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
 * Describes a message to be replied that is from a different chat or a forum topic; not supported in secret chats.
 *
 * @property chatId The identifier of the chat to which the message to be replied belongs.
 * @property messageId The identifier of the message to be replied in the specified chat. A message can be replied in another chat or forum topic only if messageProperties.canBeRepliedInAnotherChat.
 * @property quote Quote from the message to be replied; pass null if none.
 * @property checklistTaskId Identifier of the checklist task in the message to be replied; pass 0 to reply to the whole message.
 */
public class InputMessageReplyToExternalMessage public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val quote: InputTextQuote?,
    public val checklistTaskId: Int,
) : InputMessageReplyTo() {
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
        other as InputMessageReplyToExternalMessage
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.quote != quote) {
            return false
        }
        return other.checklistTaskId == checklistTaskId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + quote.hashCode()
        hashCode = 31 * hashCode + checklistTaskId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageReplyToExternalMessage")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("quote=")
            append(quote)
            append(", ")
            append("checklistTaskId=")
            append(checklistTaskId)
            append(")")
        }
    }
}
