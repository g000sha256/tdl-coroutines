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
 * Incoming messages were read or the number of unread messages has been changed.
 *
 * @property chatId Chat identifier.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property unreadCount The number of unread messages left in the chat.
 */
public class UpdateChatReadInbox public constructor(
    public val chatId: Long,
    public val lastReadInboxMessageId: Long,
    public val unreadCount: Int,
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
        other as UpdateChatReadInbox
        if (other.chatId != chatId) {
            return false
        }
        if (other.lastReadInboxMessageId != lastReadInboxMessageId) {
            return false
        }
        return other.unreadCount == unreadCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + unreadCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatReadInbox")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("lastReadInboxMessageId=")
            append(lastReadInboxMessageId)
            append(", ")
            append("unreadCount=")
            append(unreadCount)
            append(")")
        }
    }
}
