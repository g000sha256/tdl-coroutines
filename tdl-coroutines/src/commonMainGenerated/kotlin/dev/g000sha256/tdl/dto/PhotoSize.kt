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
import kotlin.IntArray
import kotlin.String

/**
 * Describes an image in JPEG format.
 *
 * @property type Image type (see https://core.telegram.org/constructor/photoSize).
 * @property photo Information about the image file.
 * @property width Image width.
 * @property height Image height.
 * @property progressiveSizes Sizes of progressive JPEG file prefixes, which can be used to preliminarily show the image; in bytes.
 */
public class PhotoSize public constructor(
    public val type: String,
    public val photo: File,
    public val width: Int,
    public val height: Int,
    public val progressiveSizes: IntArray,
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
        other as PhotoSize
        if (other.type != type) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        return other.progressiveSizes.contentEquals(progressiveSizes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + progressiveSizes.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PhotoSize")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("progressiveSizes=")
            progressiveSizes
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
