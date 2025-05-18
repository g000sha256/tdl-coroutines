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
 * Describes a forum topic.
 *
 * @property info Basic information about the topic.
 * @property lastMessage Last message in the topic; may be null if unknown.
 * @property order A parameter used to determine order of the topic in the topic list. Topics must be sorted by the order in descending order.
 * @property isPinned True, if the topic is pinned in the topic list.
 * @property unreadCount Number of unread messages in the topic.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @property unreadMentionCount Number of unread messages with a mention/reply in the topic.
 * @property unreadReactionCount Number of messages with unread reactions in the topic.
 * @property notificationSettings Notification settings for the topic.
 * @property draftMessage A draft of a message in the topic; may be null if none.
 */
public class ForumTopic public constructor(
    public val info: ForumTopicInfo,
    public val lastMessage: Message?,
    public val order: Long,
    public val isPinned: Boolean,
    public val unreadCount: Int,
    public val lastReadInboxMessageId: Long,
    public val lastReadOutboxMessageId: Long,
    public val unreadMentionCount: Int,
    public val unreadReactionCount: Int,
    public val notificationSettings: ChatNotificationSettings,
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
        other as ForumTopic
        if (other.info != info) {
            return false
        }
        if (other.lastMessage != lastMessage) {
            return false
        }
        if (other.order != order) {
            return false
        }
        if (other.isPinned != isPinned) {
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
        if (other.unreadMentionCount != unreadMentionCount) {
            return false
        }
        if (other.unreadReactionCount != unreadReactionCount) {
            return false
        }
        if (other.notificationSettings != notificationSettings) {
            return false
        }
        return other.draftMessage == draftMessage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + info.hashCode()
        hashCode = 31 * hashCode + lastMessage.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + unreadCount.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
        hashCode = 31 * hashCode + unreadMentionCount.hashCode()
        hashCode = 31 * hashCode + unreadReactionCount.hashCode()
        hashCode = 31 * hashCode + notificationSettings.hashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ForumTopic")
            append("(")
            append("info=")
            append(info)
            append(", ")
            append("lastMessage=")
            append(lastMessage)
            append(", ")
            append("order=")
            append(order)
            append(", ")
            append("isPinned=")
            append(isPinned)
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
            append("unreadMentionCount=")
            append(unreadMentionCount)
            append(", ")
            append("unreadReactionCount=")
            append(unreadReactionCount)
            append(", ")
            append("notificationSettings=")
            append(notificationSettings)
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(")")
        }
    }
}
