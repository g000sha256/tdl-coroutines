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
 * Describes an item of a list page block to be sent.
 *
 * @property blocks Item blocks.
 * @property hasCheckbox True, if the item has a checkbox.
 * @property isChecked True, if the item is checked.
 * @property value Value of the item; pass 0 for unordered lists.
 * @property type Type of the item numbering type; must be one of &quot;a&quot; for a lowercase letter, &quot;A&quot; for an uppercase letter, &quot;i&quot; for lowercase Roman numerals, &quot;I&quot; for uppercase Roman numerals, &quot;1&quot; for decimal numbers, or empty for unordered lists.
 */
public class InputPageBlockListItem public constructor(
    public val blocks: Array<InputPageBlock>,
    public val hasCheckbox: Boolean,
    public val isChecked: Boolean,
    public val value: Int,
    public val type: String,
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
        other as InputPageBlockListItem
        val blocksEquals = other.blocks.contentDeepEquals(blocks)
        if (!blocksEquals) {
            return false
        }
        if (other.hasCheckbox != hasCheckbox) {
            return false
        }
        if (other.isChecked != isChecked) {
            return false
        }
        if (other.value != value) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + blocks.contentDeepHashCode()
        hashCode = 31 * hashCode + hasCheckbox.hashCode()
        hashCode = 31 * hashCode + isChecked.hashCode()
        hashCode = 31 * hashCode + value.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPageBlockListItem")
            append("(")
            append("blocks=")
            blocks
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("hasCheckbox=")
            append(hasCheckbox)
            append(", ")
            append("isChecked=")
            append(isChecked)
            append(", ")
            append("value=")
            append(value)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
