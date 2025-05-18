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
 * An animation message (GIF-style).
 *
 * @property animation Animation file to be sent.
 * @property thumbnail Animation thumbnail; pass null to skip thumbnail uploading.
 * @property addedStickerFileIds File identifiers of the stickers added to the animation, if applicable.
 * @property duration Duration of the animation, in seconds.
 * @property width Width of the animation; may be replaced by the server.
 * @property height Height of the animation; may be replaced by the server.
 * @property caption Animation caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 * @property showCaptionAboveMedia True, if the caption must be shown above the animation; otherwise, the caption must be shown below the animation; not supported in secret chats.
 * @property hasSpoiler True, if the animation preview must be covered by a spoiler animation; not supported in secret chats.
 */
public class InputMessageAnimation public constructor(
    public val animation: InputFile,
    public val thumbnail: InputThumbnail?,
    public val addedStickerFileIds: IntArray,
    public val duration: Int,
    public val width: Int,
    public val height: Int,
    public val caption: FormattedText?,
    public val showCaptionAboveMedia: Boolean,
    public val hasSpoiler: Boolean,
) : InputMessageContent() {
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
        other as InputMessageAnimation
        if (other.animation != animation) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
        if (!addedStickerFileIdsEquals) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        return other.hasSpoiler == hasSpoiler
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + hasSpoiler.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageAnimation")
            append("(")
            append("animation=")
            append(animation)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("addedStickerFileIds=")
            addedStickerFileIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("hasSpoiler=")
            append(hasSpoiler)
            append(")")
        }
    }
}
