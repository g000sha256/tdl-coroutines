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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Contains information about replies to a message.
 *
 * @property replyCount Number of times the message was directly or indirectly replied.
 * @property recentReplierIds Identifiers of at most 3 recent repliers to the message; available in channels with a discussion supergroup. The users and chats are expected to be inaccessible: only their photo and name will be available.
 * @property lastReadInboxMessageId Identifier of the last read incoming reply to the message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing reply to the message.
 * @property lastMessageId Identifier of the last reply to the message.
 */
public class MessageReplyInfoDto public constructor(
    public val replyCount: Int,
    public val recentReplierIds: Array<MessageSenderDto>,
    public val lastReadInboxMessageId: Long,
    public val lastReadOutboxMessageId: Long,
    public val lastMessageId: Long,
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
        other as MessageReplyInfoDto
        if (other.replyCount != replyCount) {
            return false
        }
        val recentReplierIdsEquals = other.recentReplierIds.contentDeepEquals(recentReplierIds)
        if (!recentReplierIdsEquals) {
            return false
        }
        if (other.lastReadInboxMessageId != lastReadInboxMessageId) {
            return false
        }
        if (other.lastReadOutboxMessageId != lastReadOutboxMessageId) {
            return false
        }
        return other.lastMessageId == lastMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + replyCount.hashCode()
        hashCode = 31 * hashCode + recentReplierIds.contentDeepHashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageReplyInfoDto")
            append("(")
            append("replyCount=")
            append(replyCount)
            append(", ")
            append("recentReplierIds=")
            recentReplierIds
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("lastReadInboxMessageId=")
            append(lastReadInboxMessageId)
            append(", ")
            append("lastReadOutboxMessageId=")
            append(lastReadOutboxMessageId)
            append(", ")
            append("lastMessageId=")
            append(lastMessageId)
            append(")")
        }
    }
}
