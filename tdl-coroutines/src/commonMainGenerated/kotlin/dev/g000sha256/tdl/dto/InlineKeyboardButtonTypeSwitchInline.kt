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
import kotlin.String

/**
 * A button that forces an inline query to the bot to be inserted in the input field.
 *
 * @property query Inline query to be sent to the bot.
 * @property targetChat Target chat from which to send the inline query.
 */
public class InlineKeyboardButtonTypeSwitchInline public constructor(
    public val query: String,
    public val targetChat: TargetChat,
) : InlineKeyboardButtonType() {
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
        other as InlineKeyboardButtonTypeSwitchInline
        if (other.query != query) {
            return false
        }
        return other.targetChat == targetChat
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + query.hashCode()
        hashCode = 31 * hashCode + targetChat.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineKeyboardButtonTypeSwitchInline")
            append("(")
            append("query=")
            append(query)
            append(", ")
            append("targetChat=")
            append(targetChat)
            append(")")
        }
    }
}
