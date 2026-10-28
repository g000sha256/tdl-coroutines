/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
import kotlin.String

/**
 * Describes manually chosen quote from another message.
 *
 * @property text Text of the quote; 0-getOption(&quot;message&#95;reply&#95;quote&#95;length&#95;max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, and DateTime entities are allowed to be kept and must be kept in the quote. Ignored if richTexts are non-empty.
 * @property richTexts Quote from a rich message; pass an empty array if the quote isn't chosen from a rich message. Must contain one element for each quoted text of the message in the order of their appearance. The first and the last elements can contain only a part of the corresponding text; all other elements must contain the whole text. Formatting of the quoted parts must be kept. Mathematical expressions must be quoted entirely. Buttons in pageBlockButtonRow, anchors and dividers can't be quoted. There can be up to 32 quoted texts with total length up to getOption(&quot;message&#95;reply&#95;quote&#95;length&#95;max&quot;) characters.
 * @property position Quote position in the original message in UTF-16 code units. For quotes from rich messages, it is the position in the text formed by joining plain texts of all quotable texts of the message, separated by line feeds.
 */
public class InputTextQuote public constructor(
    public val text: FormattedText,
    public val richTexts: Array<RichText>,
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
        val richTextsEquals = other.richTexts.contentDeepEquals(richTexts)
        if (!richTextsEquals) {
            return false
        }
        return other.position == position
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + richTexts.contentDeepHashCode()
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
            append("richTexts=")
            richTexts
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("position=")
            append(position)
            append(")")
        }
    }
}
