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

import dev.g000sha256.tdl.dto.MessageReactionDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Reactions added to a message with anonymous reactions have changed; for bots only.
 *
 * @property chatId Chat identifier.
 * @property messageId Message identifier.
 * @property date Point in time (Unix timestamp) when the reactions were changed.
 * @property reactions The list of reactions added to the message.
 */
public class MessageReactionsUpdateDto public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val date: Int,
    public val reactions: Array<MessageReactionDto>,
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
        other as MessageReactionsUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        return other.reactions.contentDeepEquals(reactions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + reactions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageReactionsUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("reactions=")
            reactions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
