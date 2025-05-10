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
 * Describes a photo.
 *
 * @property hasStickers True, if stickers were added to the photo. The list of corresponding sticker sets can be received using getAttachedStickerSets.
 * @property minithumbnail Photo minithumbnail; may be null.
 * @property sizes Available variants of the photo, in different sizes.
 */
public class PhotoDto public constructor(
    public val hasStickers: Boolean,
    public val minithumbnail: MinithumbnailDto?,
    public val sizes: Array<PhotoSizeDto>,
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
        other as PhotoDto
        if (other.hasStickers != hasStickers) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        return other.sizes.contentDeepEquals(sizes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + hasStickers.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + sizes.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PhotoDto")
            append("(")
            append("hasStickers=")
            append(hasStickers)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("sizes=")
            sizes
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
