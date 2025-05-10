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
 * Represents a cell of a table.
 *
 * @property text Cell text; may be null. If the text is null, then the cell must be invisible.
 * @property isHeader True, if it is a header cell.
 * @property colspan The number of columns the cell spans.
 * @property rowspan The number of rows the cell spans.
 * @property align Horizontal cell content alignment.
 * @property valign Vertical cell content alignment.
 */
public class PageBlockTableCellDto public constructor(
    public val text: RichTextDto?,
    public val isHeader: Boolean,
    public val colspan: Int,
    public val rowspan: Int,
    public val align: PageBlockHorizontalAlignmentDto,
    public val valign: PageBlockVerticalAlignmentDto,
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
        other as PageBlockTableCellDto
        if (other.text != text) {
            return false
        }
        if (other.isHeader != isHeader) {
            return false
        }
        if (other.colspan != colspan) {
            return false
        }
        if (other.rowspan != rowspan) {
            return false
        }
        if (other.align != align) {
            return false
        }
        return other.valign == valign
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + isHeader.hashCode()
        hashCode = 31 * hashCode + colspan.hashCode()
        hashCode = 31 * hashCode + rowspan.hashCode()
        hashCode = 31 * hashCode + align.hashCode()
        hashCode = 31 * hashCode + valign.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockTableCellDto")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("isHeader=")
            append(isHeader)
            append(", ")
            append("colspan=")
            append(colspan)
            append(", ")
            append("rowspan=")
            append(rowspan)
            append(", ")
            append("align=")
            append(align)
            append(", ")
            append("valign=")
            append(valign)
            append(")")
        }
    }
}
