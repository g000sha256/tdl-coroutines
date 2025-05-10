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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.ChatListDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Number of unread messages in a chat list has changed. This update is sent only if the message database is used.
 *
 * @property chatList The chat list with changed number of unread messages.
 * @property unreadCount Total number of unread messages.
 * @property unreadUnmutedCount Total number of unread messages in unmuted chats.
 */
public class UnreadMessageCountUpdateDto public constructor(
    public val chatList: ChatListDto,
    public val unreadCount: Int,
    public val unreadUnmutedCount: Int,
) : UpdateDto() {
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
        other as UnreadMessageCountUpdateDto
        if (other.chatList != chatList) {
            return false
        }
        if (other.unreadCount != unreadCount) {
            return false
        }
        return other.unreadUnmutedCount == unreadUnmutedCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatList.hashCode()
        hashCode = 31 * hashCode + unreadCount.hashCode()
        hashCode = 31 * hashCode + unreadUnmutedCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UnreadMessageCountUpdateDto")
            append("(")
            append("chatList=")
            append(chatList)
            append(", ")
            append("unreadCount=")
            append(unreadCount)
            append(", ")
            append("unreadUnmutedCount=")
            append(unreadUnmutedCount)
            append(")")
        }
    }
}
