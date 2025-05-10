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

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * The message auto-delete or self-destruct timer setting for a chat was changed.
 *
 * @property chatId Chat identifier.
 * @property messageAutoDeleteTime New value of messageAutoDeleteTime.
 */
public class ChatMessageAutoDeleteTimeUpdateDto public constructor(
    public val chatId: Long,
    public val messageAutoDeleteTime: Int,
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
        other as ChatMessageAutoDeleteTimeUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        return other.messageAutoDeleteTime == messageAutoDeleteTime
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageAutoDeleteTime.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatMessageAutoDeleteTimeUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageAutoDeleteTime=")
            append(messageAutoDeleteTime)
            append(")")
        }
    }
}
