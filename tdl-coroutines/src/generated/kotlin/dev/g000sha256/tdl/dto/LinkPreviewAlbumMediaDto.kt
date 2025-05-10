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
 * Describes a media from a link preview album.
 */
public sealed class LinkPreviewAlbumMediaDto private constructor() {
    /**
     * The media is a photo.
     *
     * @property photo Photo description.
     */
    public class Photo public constructor(
        public val photo: PhotoDto,
    ) : LinkPreviewAlbumMediaDto() {
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
                append("LinkPreviewAlbumMediaDto.Photo")
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
     * @property video Video description.
     */
    public class Video public constructor(
        public val video: VideoDto,
    ) : LinkPreviewAlbumMediaDto() {
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
            return other.video == video
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewAlbumMediaDto.Video")
                append("(")
                append("video=")
                append(video)
                append(")")
            }
        }
    }
}
