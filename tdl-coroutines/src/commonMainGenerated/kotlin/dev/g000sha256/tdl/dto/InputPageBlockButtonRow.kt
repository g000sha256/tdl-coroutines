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
import kotlin.String

/**
 * A list of buttons shown in a row.
 *
 * @property buttons The buttons.
 * @property align Horizontal alignment of the buttons; pass null if the buttons must be shown full-width.
 */
public class InputPageBlockButtonRow public constructor(
    public val buttons: Array<InlineButton>,
    public val align: PageBlockHorizontalAlignment?,
) : InputPageBlock() {
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
        other as InputPageBlockButtonRow
        val buttonsEquals = other.buttons.contentDeepEquals(buttons)
        if (!buttonsEquals) {
            return false
        }
        return other.align == align
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + buttons.contentDeepHashCode()
        hashCode = 31 * hashCode + align.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPageBlockButtonRow")
            append("(")
            append("buttons=")
            buttons
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("align=")
            append(align)
            append(")")
        }
    }
}
