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
 * Contains information about a business chat link.
 *
 * @property chatId Identifier of the private chat that created the link.
 * @property text Message draft text that must be added to the input field.
 */
public class BusinessChatLinkInfoDto public constructor(
    public val chatId: Long,
    public val text: FormattedTextDto,
) {
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
        other as BusinessChatLinkInfoDto
        if (other.chatId != chatId) {
            return false
        }
        return other.text == text
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessChatLinkInfoDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("text=")
            append(text)
            append(")")
        }
    }
}
