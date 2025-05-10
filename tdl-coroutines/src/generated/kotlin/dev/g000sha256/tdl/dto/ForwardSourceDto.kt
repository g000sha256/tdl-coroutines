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
 * Contains information about the last message from which a new message was forwarded last time.
 *
 * @property chatId Identifier of the chat to which the message that was forwarded belonged; may be 0 if unknown.
 * @property messageId Identifier of the message; may be 0 if unknown.
 * @property senderId Identifier of the sender of the message; may be null if unknown or the new message was forwarded not to Saved Messages.
 * @property senderName Name of the sender of the message if the sender is hidden by their privacy settings.
 * @property date Point in time (Unix timestamp) when the message is sent; 0 if unknown.
 * @property isOutgoing True, if the message that was forwarded is outgoing; always false if sender is unknown.
 */
public class ForwardSourceDto public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val senderId: MessageSenderDto?,
    public val senderName: String,
    public val date: Int,
    public val isOutgoing: Boolean,
) {
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
        other as ForwardSourceDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.senderName != senderName) {
            return false
        }
        if (other.date != date) {
            return false
        }
        return other.isOutgoing == isOutgoing
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + senderName.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ForwardSourceDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("senderName=")
            append(senderName)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(")")
        }
    }
}
