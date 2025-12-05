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
 * Represents a message sent in a group call.
 *
 * @property messageId Unique message identifier within the group call.
 * @property senderId Identifier of the sender of the message.
 * @property date Point in time (Unix timestamp) when the message was sent.
 * @property text Text of the message. If empty, then the message is a paid reaction in a live story.
 * @property paidMessageStarCount The number of Telegram Stars that were paid to send the message; for live stories only.
 * @property isFromOwner True, if the message is sent by the owner of the call and must be treated as a message of the maximum level; for live stories only.
 * @property canBeDeleted True, if the message can be deleted by the current user; for live stories only.
 */
public class GroupCallMessage public constructor(
    public val messageId: Int,
    public val senderId: MessageSender,
    public val date: Int,
    public val text: FormattedText,
    public val paidMessageStarCount: Long,
    public val isFromOwner: Boolean,
    public val canBeDeleted: Boolean,
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
        other as GroupCallMessage
        if (other.messageId != messageId) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.isFromOwner != isFromOwner) {
            return false
        }
        return other.canBeDeleted == canBeDeleted
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + isFromOwner.hashCode()
        hashCode = 31 * hashCode + canBeDeleted.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallMessage")
            append("(")
            append("messageId=")
            append(messageId)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("isFromOwner=")
            append(isFromOwner)
            append(", ")
            append("canBeDeleted=")
            append(canBeDeleted)
            append(")")
        }
    }
}
