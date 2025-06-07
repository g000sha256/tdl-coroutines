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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a video file posted as a story.
 *
 * @property duration Duration of the video, in seconds.
 * @property width Video width.
 * @property height Video height.
 * @property hasStickers True, if stickers were added to the video. The list of corresponding sticker sets can be received using getAttachedStickerSets.
 * @property isAnimation True, if the video has no sound.
 * @property minithumbnail Video minithumbnail; may be null.
 * @property thumbnail Video thumbnail in JPEG or MPEG4 format; may be null.
 * @property preloadPrefixSize Size of file prefix, which is expected to be preloaded, in bytes.
 * @property coverFrameTimestamp Timestamp of the frame used as video thumbnail.
 * @property video File containing the video.
 */
@SerialName(value = "storyVideo")
@Serializable
public class StoryVideo public constructor(
    @SerialName(value = "duration")
    public val duration: Double,
    @SerialName(value = "width")
    public val width: Int,
    @SerialName(value = "height")
    public val height: Int,
    @SerialName(value = "has_stickers")
    public val hasStickers: Boolean,
    @SerialName(value = "is_animation")
    public val isAnimation: Boolean,
    @SerialName(value = "minithumbnail")
    public val minithumbnail: Minithumbnail?,
    @SerialName(value = "thumbnail")
    public val thumbnail: Thumbnail?,
    @SerialName(value = "preload_prefix_size")
    public val preloadPrefixSize: Int,
    @SerialName(value = "cover_frame_timestamp")
    public val coverFrameTimestamp: Double,
    @SerialName(value = "video")
    public val video: File,
) : Model() {
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
        other as StoryVideo
        if (other.duration != duration) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.hasStickers != hasStickers) {
            return false
        }
        if (other.isAnimation != isAnimation) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.preloadPrefixSize != preloadPrefixSize) {
            return false
        }
        if (other.coverFrameTimestamp != coverFrameTimestamp) {
            return false
        }
        return other.video == video
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + hasStickers.hashCode()
        hashCode = 31 * hashCode + isAnimation.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + preloadPrefixSize.hashCode()
        hashCode = 31 * hashCode + coverFrameTimestamp.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryVideo")
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
            append("hasStickers=")
            append(hasStickers)
            append(", ")
            append("isAnimation=")
            append(isAnimation)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("preloadPrefixSize=")
            append(preloadPrefixSize)
            append(", ")
            append("coverFrameTimestamp=")
            append(coverFrameTimestamp)
            append(", ")
            append("video=")
            append(video)
            append(")")
        }
    }
}
