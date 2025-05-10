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
 * Describes a paid media to be sent.
 *
 * @property type Type of the media.
 * @property media Photo or video to be sent.
 * @property thumbnail Media thumbnail; pass null to skip thumbnail uploading.
 * @property addedStickerFileIds File identifiers of the stickers added to the media, if applicable.
 * @property width Media width.
 * @property height Media height.
 */
public class InputPaidMediaDto public constructor(
    public val type: InputPaidMediaTypeDto,
    public val media: InputFileDto,
    public val thumbnail: InputThumbnailDto?,
    public val addedStickerFileIds: IntArray,
    public val width: Int,
    public val height: Int,
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
        other as InputPaidMediaDto
        if (other.type != type) {
            return false
        }
        if (other.media != media) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
        if (!addedStickerFileIdsEquals) {
            return false
        }
        if (other.width != width) {
            return false
        }
        return other.height == height
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + media.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPaidMediaDto")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("media=")
            append(media)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("addedStickerFileIds=")
            addedStickerFileIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(")")
        }
    }
}
