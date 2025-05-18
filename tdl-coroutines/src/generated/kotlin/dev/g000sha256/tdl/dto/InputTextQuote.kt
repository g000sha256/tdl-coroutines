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
 * Describes manually chosen quote from another message.
 *
 * @property text Text of the quote; 0-getOption(&quot;message_reply_quote_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed to be kept and must be kept in the quote.
 * @property position Quote position in the original message in UTF-16 code units.
 */
public class InputTextQuote public constructor(
    public val text: FormattedText,
    public val position: Int,
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
        other as InputTextQuote
        if (other.text != text) {
            return false
        }
        return other.position == position
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + position.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputTextQuote")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("position=")
            append(position)
            append(")")
        }
    }
}
