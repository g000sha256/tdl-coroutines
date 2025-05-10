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
 * Describes a paid media.
 */
public sealed class PaidMediaDto private constructor() {
    /**
     * The media is hidden until the invoice is paid.
     *
     * @property width Media width; 0 if unknown.
     * @property height Media height; 0 if unknown.
     * @property duration Media duration, in seconds; 0 if unknown.
     * @property minithumbnail Media minithumbnail; may be null.
     */
    public class Preview public constructor(
        public val width: Int,
        public val height: Int,
        public val duration: Int,
        public val minithumbnail: MinithumbnailDto?,
    ) : PaidMediaDto() {
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
            other as Preview
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            return other.minithumbnail == minithumbnail
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + minithumbnail.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaidMediaDto.Preview")
                append("(")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("minithumbnail=")
                append(minithumbnail)
                append(")")
            }
        }
    }

    /**
     * The media is a photo.
     *
     * @property photo The photo.
     */
    public class Photo public constructor(
        public val photo: PhotoDto,
    ) : PaidMediaDto() {
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
            other as Photo
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaidMediaDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The media is a video.
     *
     * @property video The video.
     * @property cover Cover of the video; may be null if none.
     * @property startTimestamp Timestamp from which the video playing must start, in seconds.
     */
    public class Video public constructor(
        public val video: VideoDto,
        public val cover: PhotoDto?,
        public val startTimestamp: Int,
    ) : PaidMediaDto() {
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
            if (other.video != video) {
                return false
            }
            if (other.cover != cover) {
                return false
            }
            return other.startTimestamp == startTimestamp
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            hashCode = 31 * hashCode + startTimestamp.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaidMediaDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("cover=")
                append(cover)
                append(", ")
                append("startTimestamp=")
                append(startTimestamp)
                append(")")
            }
        }
    }

    /**
     * The media is unsupported.
     */
    public class Unsupported public constructor() : PaidMediaDto() {
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
            return "PaidMediaDto.Unsupported()"
        }
    }
}
