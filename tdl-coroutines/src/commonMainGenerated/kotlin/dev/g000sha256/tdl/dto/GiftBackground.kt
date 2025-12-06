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
 * Describes background of a gift.
 *
 * @property centerColor Center color in RGB format.
 * @property edgeColor Edge color in RGB format.
 * @property textColor Text color in RGB format.
 */
public class GiftBackground public constructor(
    public val centerColor: Int,
    public val edgeColor: Int,
    public val textColor: Int,
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
        other as GiftBackground
        if (other.centerColor != centerColor) {
            return false
        }
        if (other.edgeColor != edgeColor) {
            return false
        }
        return other.textColor == textColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + centerColor.hashCode()
        hashCode = 31 * hashCode + edgeColor.hashCode()
        hashCode = 31 * hashCode + textColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftBackground")
            append("(")
            append("centerColor=")
            append(centerColor)
            append(", ")
            append("edgeColor=")
            append(edgeColor)
            append(", ")
            append("textColor=")
            append(textColor)
            append(")")
        }
    }
}
