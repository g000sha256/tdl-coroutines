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
 * Contains an inline keyboard layout.
 *
 * @property rows A list of rows of inline keyboard buttons.
 * @property forceReply True, if a reply to the message must be forced when the message is received.
 */
public class ReplyMarkupInlineKeyboard public constructor(
    public val rows: Array<Array<InlineKeyboardButton>>,
    public val forceReply: Boolean,
) : ReplyMarkup() {
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
        other as ReplyMarkupInlineKeyboard
        val rowsEquals = other.rows.contentDeepEquals(rows)
        if (!rowsEquals) {
            return false
        }
        return other.forceReply == forceReply
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + rows.contentDeepHashCode()
        hashCode = 31 * hashCode + forceReply.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReplyMarkupInlineKeyboard")
            append("(")
            append("rows=")
            rows
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("forceReply=")
            append(forceReply)
            append(")")
        }
    }
}
