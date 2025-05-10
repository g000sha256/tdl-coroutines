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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * Thumbnail image of a very poor quality and low resolution.
 *
 * @property width Thumbnail width, usually doesn't exceed 40.
 * @property height Thumbnail height, usually doesn't exceed 40.
 * @property data The thumbnail in JPEG format.
 */
public class MinithumbnailDto public constructor(
    public val width: Int,
    public val height: Int,
    public val data: ByteArray,
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
        other as MinithumbnailDto
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        return other.data.contentEquals(data)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + data.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MinithumbnailDto")
            append("(")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("data=")
            data
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
