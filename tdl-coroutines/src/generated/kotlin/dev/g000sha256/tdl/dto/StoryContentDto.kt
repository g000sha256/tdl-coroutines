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
 * Contains the content of a story.
 */
public sealed class StoryContentDto private constructor() {
    /**
     * A photo story.
     *
     * @property photo The photo.
     */
    public class Photo public constructor(
        public val photo: PhotoDto,
    ) : StoryContentDto() {
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
                append("StoryContentDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * A video story.
     *
     * @property video The video in MPEG4 format.
     * @property alternativeVideo Alternative version of the video in MPEG4 format, encoded with H.264 codec; may be null.
     */
    public class Video public constructor(
        public val video: StoryVideoDto,
        public val alternativeVideo: StoryVideoDto?,
    ) : StoryContentDto() {
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
            return other.alternativeVideo == alternativeVideo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + alternativeVideo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryContentDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("alternativeVideo=")
                append(alternativeVideo)
                append(")")
            }
        }
    }

    /**
     * A story content that is not supported in the current TDLib version.
     */
    public class Unsupported public constructor() : StoryContentDto() {
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
            return "StoryContentDto.Unsupported()"
        }
    }
}
