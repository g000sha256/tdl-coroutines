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
import kotlin.IntArray
import kotlin.String

/**
 * A video story.
 *
 * @property video Video to be sent. The video size must be 720x1280. The video must be streamable and stored in MPEG4 format, after encoding with H.265 codec and key frames added each second.
 * @property addedStickerFileIds File identifiers of the stickers added to the video, if applicable.
 * @property duration Precise duration of the video, in seconds; 0-60.
 * @property coverFrameTimestamp Timestamp of the frame, which will be used as video thumbnail.
 * @property isAnimation True, if the video has no sound.
 */
public class InputStoryContentVideo public constructor(
    public val video: InputFile,
    public val addedStickerFileIds: IntArray,
    public val duration: Double,
    public val coverFrameTimestamp: Double,
    public val isAnimation: Boolean,
) : InputStoryContent() {
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
        other as InputStoryContentVideo
        if (other.video != video) {
            return false
        }
        val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
        if (!addedStickerFileIdsEquals) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.coverFrameTimestamp != coverFrameTimestamp) {
            return false
        }
        return other.isAnimation == isAnimation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + coverFrameTimestamp.hashCode()
        hashCode = 31 * hashCode + isAnimation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputStoryContentVideo")
            append("(")
            append("video=")
            append(video)
            append(", ")
            append("addedStickerFileIds=")
            addedStickerFileIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("coverFrameTimestamp=")
            append(coverFrameTimestamp)
            append(", ")
            append("isAnimation=")
            append(isAnimation)
            append(")")
        }
    }
}
