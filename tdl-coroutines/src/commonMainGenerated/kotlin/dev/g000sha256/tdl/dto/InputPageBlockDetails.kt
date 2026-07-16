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
 * A collapsible block.
 *
 * @property header Always visible heading for the block.
 * @property blocks Block contents.
 * @property isOpen True, if the block is open by default.
 */
public class InputPageBlockDetails public constructor(
    public val header: RichText,
    public val blocks: Array<InputPageBlock>,
    public val isOpen: Boolean,
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
        other as InputPageBlockDetails
        if (other.header != header) {
            return false
        }
        val blocksEquals = other.blocks.contentDeepEquals(blocks)
        if (!blocksEquals) {
            return false
        }
        return other.isOpen == isOpen
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + header.hashCode()
        hashCode = 31 * hashCode + blocks.contentDeepHashCode()
        hashCode = 31 * hashCode + isOpen.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPageBlockDetails")
            append("(")
            append("header=")
            append(header)
            append(", ")
            append("blocks=")
            blocks
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isOpen=")
            append(isOpen)
            append(")")
        }
    }
}
