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
 * Describes a video file.
 *
 * @property duration Duration of the video, in seconds; as defined by the sender.
 * @property width Video width; as defined by the sender.
 * @property height Video height; as defined by the sender.
 * @property fileName Original name of the file; as defined by the sender.
 * @property mimeType MIME type of the file; as defined by the sender.
 * @property hasStickers True, if stickers were added to the video. The list of corresponding sticker sets can be received using getAttachedStickerSets.
 * @property supportsStreaming True, if the video is expected to be streamed.
 * @property minithumbnail Video minithumbnail; may be null.
 * @property thumbnail Video thumbnail in JPEG or MPEG4 format; as defined by the sender; may be null.
 * @property video File containing the video.
 */
public class Video public constructor(
    public val duration: Int,
    public val width: Int,
    public val height: Int,
    public val fileName: String,
    public val mimeType: String,
    public val hasStickers: Boolean,
    public val supportsStreaming: Boolean,
    public val minithumbnail: Minithumbnail?,
    public val thumbnail: Thumbnail?,
    public val video: File,
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
        other as Video
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
        if (other.supportsStreaming != supportsStreaming) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        return other.video == video
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + fileName.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + hasStickers.hashCode()
        hashCode = 31 * hashCode + supportsStreaming.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Video")
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
            append("supportsStreaming=")
            append(supportsStreaming)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("video=")
            append(video)
            append(")")
        }
    }
}
