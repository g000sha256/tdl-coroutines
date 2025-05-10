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

import dev.g000sha256.tdl.dto.ChatPositionDto
import dev.g000sha256.tdl.dto.MessageDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * The last message of a chat was changed.
 *
 * @property chatId Chat identifier.
 * @property lastMessage The new last message in the chat; may be null if the last message became unknown. While the last message is unknown, new messages can be added to the chat without corresponding updateNewMessage update.
 * @property positions The new chat positions in the chat lists.
 */
public class ChatLastMessageUpdateDto public constructor(
    public val chatId: Long,
    public val lastMessage: MessageDto?,
    public val positions: Array<ChatPositionDto>,
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
        other as ChatLastMessageUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.lastMessage != lastMessage) {
            return false
        }
        return other.positions.contentDeepEquals(positions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + lastMessage.hashCode()
        hashCode = 31 * hashCode + positions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatLastMessageUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("lastMessage=")
            append(lastMessage)
            append(", ")
            append("positions=")
            positions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
