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
 * Contains information about a message thread.
 *
 * @property chatId Identifier of the chat to which the message thread belongs.
 * @property messageThreadId Message thread identifier, unique within the chat.
 * @property replyInfo Information about the message thread; may be null for forum topic threads.
 * @property unreadMessageCount Approximate number of unread messages in the message thread.
 * @property messages The messages from which the thread starts. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId).
 * @property draftMessage A draft of a message in the message thread; may be null if none.
 */
public class MessageThreadInfoDto public constructor(
    public val chatId: Long,
    public val messageThreadId: Long,
    public val replyInfo: MessageReplyInfoDto?,
    public val unreadMessageCount: Int,
    public val messages: Array<MessageDto>,
    public val draftMessage: DraftMessageDto?,
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
        other as MessageThreadInfoDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageThreadId != messageThreadId) {
            return false
        }
        if (other.replyInfo != replyInfo) {
            return false
        }
        if (other.unreadMessageCount != unreadMessageCount) {
            return false
        }
        val messagesEquals = other.messages.contentDeepEquals(messages)
        if (!messagesEquals) {
            return false
        }
        return other.draftMessage == draftMessage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageThreadId.hashCode()
        hashCode = 31 * hashCode + replyInfo.hashCode()
        hashCode = 31 * hashCode + unreadMessageCount.hashCode()
        hashCode = 31 * hashCode + messages.contentDeepHashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageThreadInfoDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageThreadId=")
            append(messageThreadId)
            append(", ")
            append("replyInfo=")
            append(replyInfo)
            append(", ")
            append("unreadMessageCount=")
            append(unreadMessageCount)
            append(", ")
            append("messages=")
            messages
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(")")
        }
    }
}
