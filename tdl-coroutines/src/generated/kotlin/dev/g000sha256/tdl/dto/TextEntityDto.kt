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
 * Represents a part of the text that needs to be formatted in some unusual way.
 *
 * @property offset Offset of the entity, in UTF-16 code units.
 * @property length Length of the entity, in UTF-16 code units.
 * @property type Type of the entity.
 */
public class TextEntityDto public constructor(
    public val offset: Int,
    public val length: Int,
    public val type: TextEntityTypeDto,
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
        other as TextEntityDto
        if (other.offset != offset) {
            return false
        }
        if (other.length != length) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + offset.hashCode()
        hashCode = 31 * hashCode + length.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextEntityDto")
            append("(")
            append("offset=")
            append(offset)
            append(", ")
            append("length=")
            append(length)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
