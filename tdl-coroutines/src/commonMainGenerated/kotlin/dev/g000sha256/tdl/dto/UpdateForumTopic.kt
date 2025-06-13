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
 * Information about a topic in a forum chat was changed.
 *
 * @property chatId Chat identifier.
 * @property messageThreadId Message thread identifier of the topic.
 * @property isPinned True, if the topic is pinned in the topic list.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @property unreadMentionCount Number of unread messages with a mention/reply in the topic.
 * @property unreadReactionCount Number of messages with unread reactions in the topic.
 * @property notificationSettings Notification settings for the topic.
 */
public class UpdateForumTopic public constructor(
    public val chatId: Long,
    public val messageThreadId: Long,
    public val isPinned: Boolean,
    public val lastReadInboxMessageId: Long,
    public val lastReadOutboxMessageId: Long,
    public val unreadMentionCount: Int,
    public val unreadReactionCount: Int,
    public val notificationSettings: ChatNotificationSettings,
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
        other as UpdateForumTopic
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageThreadId != messageThreadId) {
            return false
        }
        if (other.isPinned != isPinned) {
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
        return other.notificationSettings == notificationSettings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageThreadId.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
        hashCode = 31 * hashCode + unreadMentionCount.hashCode()
        hashCode = 31 * hashCode + unreadReactionCount.hashCode()
        hashCode = 31 * hashCode + notificationSettings.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateForumTopic")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageThreadId=")
            append(messageThreadId)
            append(", ")
            append("isPinned=")
            append(isPinned)
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
            append(")")
        }
    }
}
