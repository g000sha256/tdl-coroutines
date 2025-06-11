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
 * The default chat reply markup was changed. Can occur because new messages with reply markup were received or because an old reply markup was hidden by the user.
 *
 * @property chatId Chat identifier.
 * @property replyMarkupMessageId Identifier of the message from which reply markup needs to be used; 0 if there is no default custom reply markup in the chat.
 */
public class UpdateChatReplyMarkup public constructor(
    public val chatId: Long,
    public val replyMarkupMessageId: Long,
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
        other as UpdateChatReplyMarkup
        if (other.chatId != chatId) {
            return false
        }
        return other.replyMarkupMessageId == replyMarkupMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + replyMarkupMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatReplyMarkup")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("replyMarkupMessageId=")
            append(replyMarkupMessageId)
            append(")")
        }
    }
}
