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
 * This class is an abstract base class.
 * Describes type of paid media to sent.
 */
public sealed class InputPaidMediaTypeDto private constructor() {
    /**
     * The media is a photo. The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total. Width and height ratio must be at most 20.
     */
    public class Photo public constructor() : InputPaidMediaTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "InputPaidMediaTypeDto.Photo()"
        }
    }

    /**
     * The media is a video.
     *
     * @property cover Cover of the video; pass null to skip cover uploading.
     * @property startTimestamp Timestamp from which the video playing must start, in seconds.
     * @property duration Duration of the video, in seconds.
     * @property supportsStreaming True, if the video is expected to be streamed.
     */
    public class Video public constructor(
        public val cover: InputFileDto?,
        public val startTimestamp: Int,
        public val duration: Int,
        public val supportsStreaming: Boolean,
    ) : InputPaidMediaTypeDto() {
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
            if (other.cover != cover) {
                return false
            }
            if (other.startTimestamp != startTimestamp) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            return other.supportsStreaming == supportsStreaming
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            hashCode = 31 * hashCode + startTimestamp.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + supportsStreaming.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPaidMediaTypeDto.Video")
                append("(")
                append("cover=")
                append(cover)
                append(", ")
                append("startTimestamp=")
                append(startTimestamp)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("supportsStreaming=")
                append(supportsStreaming)
                append(")")
            }
        }
    }
}
