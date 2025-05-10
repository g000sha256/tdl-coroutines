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
 * Describes an animation file. The animation must be encoded in GIF or MPEG4 format.
 *
 * @property duration Duration of the animation, in seconds; as defined by the sender.
 * @property width Width of the animation.
 * @property height Height of the animation.
 * @property fileName Original name of the file; as defined by the sender.
 * @property mimeType MIME type of the file, usually &quot;image/gif&quot; or &quot;video/mp4&quot;.
 * @property hasStickers True, if stickers were added to the animation. The list of corresponding sticker set can be received using getAttachedStickerSets.
 * @property minithumbnail Animation minithumbnail; may be null.
 * @property thumbnail Animation thumbnail in JPEG or MPEG4 format; may be null.
 * @property animation File containing the animation.
 */
public class AnimationDto public constructor(
    public val duration: Int,
    public val width: Int,
    public val height: Int,
    public val fileName: String,
    public val mimeType: String,
    public val hasStickers: Boolean,
    public val minithumbnail: MinithumbnailDto?,
    public val thumbnail: ThumbnailDto?,
    public val animation: FileDto,
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
        other as AnimationDto
        if (other.duration != duration) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.fileName != fileName) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        if (other.hasStickers != hasStickers) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        return other.animation == animation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + fileName.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + hasStickers.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AnimationDto")
            append("(")
            append("duration=")
            append(duration)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("fileName=")
            append(fileName)
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("hasStickers=")
            append(hasStickers)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("animation=")
            append(animation)
            append(")")
        }
    }
}
