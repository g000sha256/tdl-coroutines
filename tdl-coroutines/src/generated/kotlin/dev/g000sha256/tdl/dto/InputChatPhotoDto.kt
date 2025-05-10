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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes a photo to be set as a user profile or chat photo.
 */
public sealed class InputChatPhotoDto private constructor() {
    /**
     * A previously used profile photo of the current user.
     *
     * @property chatPhotoId Identifier of the current user's profile photo to reuse.
     */
    public class Previous public constructor(
        public val chatPhotoId: Long,
    ) : InputChatPhotoDto() {
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
            other as Previous
            return other.chatPhotoId == chatPhotoId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatPhotoId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputChatPhotoDto.Previous")
                append("(")
                append("chatPhotoId=")
                append(chatPhotoId)
                append(")")
            }
        }
    }

    /**
     * A static photo in JPEG format.
     *
     * @property photo Photo to be set as profile photo. Only inputFileLocal and inputFileGenerated are allowed.
     */
    public class Static public constructor(
        public val photo: InputFileDto,
    ) : InputChatPhotoDto() {
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
            other as Static
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputChatPhotoDto.Static")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * An animation in MPEG4 format; must be square, at most 10 seconds long, have width between 160 and 1280 and be at most 2MB in size.
     *
     * @property animation Animation to be set as profile photo. Only inputFileLocal and inputFileGenerated are allowed.
     * @property mainFrameTimestamp Timestamp of the frame, which will be used as static chat photo.
     */
    public class Animation public constructor(
        public val animation: InputFileDto,
        public val mainFrameTimestamp: Double,
    ) : InputChatPhotoDto() {
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
            other as Animation
            if (other.animation != animation) {
                return false
            }
            return other.mainFrameTimestamp == mainFrameTimestamp
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + mainFrameTimestamp.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputChatPhotoDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(", ")
                append("mainFrameTimestamp=")
                append(mainFrameTimestamp)
                append(")")
            }
        }
    }

    /**
     * A sticker on a custom background.
     *
     * @property sticker Information about the sticker.
     */
    public class Sticker public constructor(
        public val sticker: ChatPhotoStickerDto,
    ) : InputChatPhotoDto() {
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
            other as Sticker
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputChatPhotoDto.Sticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }
}
