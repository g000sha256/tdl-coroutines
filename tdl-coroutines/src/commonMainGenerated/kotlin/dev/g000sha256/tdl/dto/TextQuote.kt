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
 * Describes manually or automatically chosen quote from another message.
 *
 * @property text Text of the quote. Only Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, and DateTime entities can be present in the text. May be empty if the quote was chosen from a rich message.
 * @property richTexts Rich text of the quote if it was chosen from a rich message; empty if the quote wasn't chosen from a rich message. Only richTextPlain, richTextBold, richTextItalic, richTextUnderline, richTextStrikethrough, richTextSpoiler, richTextSubscript, richTextSuperscript, richTextDateTime, richTextCustomEmoji, richTextMathematicalExpression, and richTexts can be present in the texts.
 * @property position Approximate quote position in the original message in UTF-16 code units as specified by the message sender. For quotes from rich messages, it is the position in the text formed by joining plain texts of all quotable texts of the message, separated by line feeds.
 * @property isManual True, if the quote was manually chosen by the message sender.
 */
public class TextQuote public constructor(
    public val text: FormattedText,
    public val richTexts: Array<RichText>,
    public val position: Int,
    public val isManual: Boolean,
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
        other as TextQuote
        if (other.text != text) {
            return false
        }
        val richTextsEquals = other.richTexts.contentDeepEquals(richTexts)
        if (!richTextsEquals) {
            return false
        }
        if (other.position != position) {
            return false
        }
        return other.isManual == isManual
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + richTexts.contentDeepHashCode()
        hashCode = 31 * hashCode + position.hashCode()
        hashCode = 31 * hashCode + isManual.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextQuote")
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
            append(", ")
            append("isManual=")
            append(isManual)
            append(")")
        }
    }
}
