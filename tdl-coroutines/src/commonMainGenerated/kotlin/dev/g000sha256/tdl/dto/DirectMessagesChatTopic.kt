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
 * Contains information about a topic in a channel direct messages chat administered by the current user.
 *
 * @property chatId Identifier of the chat to which the topic belongs.
 * @property id Unique topic identifier.
 * @property senderId Identifier of the user or chat that sends the messages to the topic.
 * @property order A parameter used to determine order of the topic in the topic list. Topics must be sorted by the order in descending order.
 * @property isMarkedAsUnread True, if the forum topic is marked as unread.
 * @property unreadCount Number of unread messages in the chat.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @property unreadReactionCount Number of messages with unread reactions in the chat.
 * @property lastMessage Last message in the topic; may be null if none or unknown.
 * @property draftMessage A draft of a message in the topic; may be null if none.
 */
public class DirectMessagesChatTopic public constructor(
    public val chatId: Long,
    public val id: Long,
    public val senderId: MessageSender,
    public val order: Long,
    public val isMarkedAsUnread: Boolean,
    public val unreadCount: Long,
    public val lastReadInboxMessageId: Long,
    public val lastReadOutboxMessageId: Long,
    public val unreadReactionCount: Long,
    public val lastMessage: Message?,
    public val draftMessage: DraftMessage?,
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
        other as DirectMessagesChatTopic
        if (other.chatId != chatId) {
            return false
        }
        if (other.id != id) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.order != order) {
            return false
        }
        if (other.isMarkedAsUnread != isMarkedAsUnread) {
            return false
        }
        if (other.unreadCount != unreadCount) {
            return false
        }
        if (other.lastReadInboxMessageId != lastReadInboxMessageId) {
            return false
        }
        if (other.lastReadOutboxMessageId != lastReadOutboxMessageId) {
            return false
        }
        if (other.unreadReactionCount != unreadReactionCount) {
            return false
        }
        if (other.lastMessage != lastMessage) {
            return false
        }
        return other.draftMessage == draftMessage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        hashCode = 31 * hashCode + isMarkedAsUnread.hashCode()
        hashCode = 31 * hashCode + unreadCount.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
        hashCode = 31 * hashCode + unreadReactionCount.hashCode()
        hashCode = 31 * hashCode + lastMessage.hashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("DirectMessagesChatTopic")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("id=")
            append(id)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("order=")
            append(order)
            append(", ")
            append("isMarkedAsUnread=")
            append(isMarkedAsUnread)
            append(", ")
            append("unreadCount=")
            append(unreadCount)
            append(", ")
            append("lastReadInboxMessageId=")
            append(lastReadInboxMessageId)
            append(", ")
            append("lastReadOutboxMessageId=")
            append(lastReadOutboxMessageId)
            append(", ")
            append("unreadReactionCount=")
            append(unreadReactionCount)
            append(", ")
            append("lastMessage=")
            append(lastMessage)
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(")")
        }
    }
}
