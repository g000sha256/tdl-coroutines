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
 * The list of unread reactions added to a message was changed.
 *
 * @property chatId Chat identifier.
 * @property messageId Message identifier.
 * @property unreadReactions The new list of unread reactions.
 * @property unreadReactionCount The new number of messages with unread reactions left in the chat.
 */
public class UpdateMessageUnreadReactions public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val unreadReactions: Array<UnreadReaction>,
    public val unreadReactionCount: Int,
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
        other as UpdateMessageUnreadReactions
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        val unreadReactionsEquals = other.unreadReactions.contentDeepEquals(unreadReactions)
        if (!unreadReactionsEquals) {
            return false
        }
        return other.unreadReactionCount == unreadReactionCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + unreadReactions.contentDeepHashCode()
        hashCode = 31 * hashCode + unreadReactionCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateMessageUnreadReactions")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("unreadReactions=")
            unreadReactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("unreadReactionCount=")
            append(unreadReactionCount)
            append(")")
        }
    }
}
