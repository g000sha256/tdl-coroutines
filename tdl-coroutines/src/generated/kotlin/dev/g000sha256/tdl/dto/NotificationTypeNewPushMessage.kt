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
 * New message was received through a push notification.
 *
 * @property messageId The message identifier. The message will not be available in the chat history, but the identifier can be used in viewMessages, or as a message to be replied in the same chat.
 * @property senderId Identifier of the sender of the message. Corresponding user or chat may be inaccessible.
 * @property senderName Name of the sender.
 * @property isOutgoing True, if the message is outgoing.
 * @property content Push message content.
 */
public class NotificationTypeNewPushMessage public constructor(
    public val messageId: Long,
    public val senderId: MessageSender,
    public val senderName: String,
    public val isOutgoing: Boolean,
    public val content: PushMessageContent,
) : NotificationType() {
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
        other as NotificationTypeNewPushMessage
        if (other.messageId != messageId) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.senderName != senderName) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        return other.content == content
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + senderName.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NotificationTypeNewPushMessage")
            append("(")
            append("messageId=")
            append(messageId)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("senderName=")
            append(senderName)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("content=")
            append(content)
            append(")")
        }
    }
}
