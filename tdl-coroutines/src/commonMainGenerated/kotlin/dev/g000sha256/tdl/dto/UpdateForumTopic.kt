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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about a topic in a forum chat was changed.
 *
 * @property chatId Chat identifier.
 * @property messageThreadId Message thread identifier of the topic.
 * @property isPinned True, if the topic is pinned in the topic list.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @property notificationSettings Notification settings for the topic.
 */
@SerialName(value = "updateForumTopic")
@Serializable
public class UpdateForumTopic public constructor(
    @SerialName(value = "chat_id")
    public val chatId: Long,
    @SerialName(value = "message_thread_id")
    public val messageThreadId: Long,
    @SerialName(value = "is_pinned")
    public val isPinned: Boolean,
    @SerialName(value = "last_read_inbox_message_id")
    public val lastReadInboxMessageId: Long,
    @SerialName(value = "last_read_outbox_message_id")
    public val lastReadOutboxMessageId: Long,
    @SerialName(value = "notification_settings")
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
        return other.notificationSettings == notificationSettings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageThreadId.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
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
            append("notificationSettings=")
            append(notificationSettings)
            append(")")
        }
    }
}
