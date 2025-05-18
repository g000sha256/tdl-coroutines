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
 * The number of online group members has changed. This update with non-zero number of online group members is sent only for currently opened chats. There is no guarantee that it is sent just after the number of online users has changed.
 *
 * @property chatId Identifier of the chat.
 * @property onlineMemberCount New number of online members in the chat, or 0 if unknown.
 */
public class UpdateChatOnlineMemberCount public constructor(
    public val chatId: Long,
    public val onlineMemberCount: Int,
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
        other as UpdateChatOnlineMemberCount
        if (other.chatId != chatId) {
            return false
        }
        return other.onlineMemberCount == onlineMemberCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + onlineMemberCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatOnlineMemberCount")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("onlineMemberCount=")
            append(onlineMemberCount)
            append(")")
        }
    }
}
