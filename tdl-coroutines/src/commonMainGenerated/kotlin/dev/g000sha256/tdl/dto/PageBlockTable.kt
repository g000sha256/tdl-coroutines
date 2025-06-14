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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A table.
 *
 * @property caption Table caption.
 * @property cells Table cells.
 * @property isBordered True, if the table is bordered.
 * @property isStriped True, if the table is striped.
 */
public class PageBlockTable public constructor(
    public val caption: RichText,
    public val cells: Array<Array<PageBlockTableCell>>,
    public val isBordered: Boolean,
    public val isStriped: Boolean,
) : PageBlock() {
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
        other as PageBlockTable
        if (other.caption != caption) {
            return false
        }
        val cellsEquals = other.cells.contentDeepEquals(cells)
        if (!cellsEquals) {
            return false
        }
        if (other.isBordered != isBordered) {
            return false
        }
        return other.isStriped == isStriped
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + cells.contentDeepHashCode()
        hashCode = 31 * hashCode + isBordered.hashCode()
        hashCode = 31 * hashCode + isStriped.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockTable")
            append("(")
            append("caption=")
            append(caption)
            append(", ")
            append("cells=")
            cells
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isBordered=")
            append(isBordered)
            append(", ")
            append("isStriped=")
            append(isStriped)
            append(")")
        }
    }
}
