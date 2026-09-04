/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * The list of welcome messages of a chat has changed.
 *
 * @property chatId The identifier of the chat.
 * @property messages The new list of welcome messages of the chat in the order from the first to the last sent.
 */
public class UpdateChatWelcomeMessages public constructor(
    public val chatId: Long,
    public val messages: Array<WelcomeMessage>,
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
        other as UpdateChatWelcomeMessages
        if (other.chatId != chatId) {
            return false
        }
        return other.messages.contentDeepEquals(messages)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messages.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatWelcomeMessages")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messages=")
            messages
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
