/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * Describes a message replied by a given message.
 *
 * @property chatId The identifier of the chat to which the message belongs; may be 0 if the replied message is in unknown chat.
 * @property messageId The identifier of the message; may be 0 if the replied message is in unknown chat.
 * @property quote Chosen quote from the replied message; may be null if none.
 * @property checklistTaskId Identifier of the checklist task in the original message that was replied; 0 if none.
 * @property origin Information about origin of the message if the message was from another chat or topic; may be null for messages from the same chat.
 * @property originSendDate Point in time (Unix timestamp) when the message was sent if the message was from another chat or topic; 0 for messages from the same chat.
 * @property content Media content of the message if the message was from another chat or topic; may be null for messages from the same chat and messages without media. Can be only one of the following types: messageAnimation, messageAudio, messageChecklist, messageContact, messageDice, messageDocument, messageGame, messageGiveaway, messageGiveawayWinners, messageInvoice, messageLocation, messagePaidMedia, messagePhoto, messagePoll, messageStakeDice, messageSticker, messageStory, messageText (for link preview), messageVenue, messageVideo, messageVideoNote, or messageVoiceNote.
 */
public class MessageReplyToMessage public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val quote: TextQuote?,
    public val checklistTaskId: Int,
    public val origin: MessageOrigin?,
    public val originSendDate: Int,
    public val content: MessageContent?,
) : MessageReplyTo() {
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
        other as MessageReplyToMessage
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.quote != quote) {
            return false
        }
        if (other.checklistTaskId != checklistTaskId) {
            return false
        }
        if (other.origin != origin) {
            return false
        }
        if (other.originSendDate != originSendDate) {
            return false
        }
        return other.content == content
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + quote.hashCode()
        hashCode = 31 * hashCode + checklistTaskId.hashCode()
        hashCode = 31 * hashCode + origin.hashCode()
        hashCode = 31 * hashCode + originSendDate.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageReplyToMessage")
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
            append(", ")
            append("origin=")
            append(origin)
            append(", ")
            append("originSendDate=")
            append(originSendDate)
            append(", ")
            append("content=")
            append(content)
            append(")")
        }
    }
}
