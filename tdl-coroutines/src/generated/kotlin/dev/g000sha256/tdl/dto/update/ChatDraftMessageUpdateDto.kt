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
import dev.g000sha256.tdl.dto.DraftMessageDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A chat draft has changed. Be aware that the update may come in the currently opened chat but with old content of the draft. If the user has changed the content of the draft, this update mustn't be applied.
 *
 * @property chatId Chat identifier.
 * @property draftMessage The new draft message; may be null if none.
 * @property positions The new chat positions in the chat lists.
 */
public class ChatDraftMessageUpdateDto public constructor(
    public val chatId: Long,
    public val draftMessage: DraftMessageDto?,
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
        other as ChatDraftMessageUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.draftMessage != draftMessage) {
            return false
        }
        return other.positions.contentDeepEquals(positions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        hashCode = 31 * hashCode + positions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatDraftMessageUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(", ")
            append("positions=")
            positions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
