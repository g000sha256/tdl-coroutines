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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a chat or user profile photo.
 *
 * @property id Unique photo identifier.
 * @property addedDate Point in time (Unix timestamp) when the photo has been added.
 * @property minithumbnail Photo minithumbnail; may be null.
 * @property sizes Available variants of the photo in JPEG format, in different size.
 * @property animation A big (up to 1280x1280) animated variant of the photo in MPEG4 format; may be null.
 * @property smallAnimation A small (160x160) animated variant of the photo in MPEG4 format; may be null even the big animation is available.
 * @property sticker Sticker-based version of the chat photo; may be null.
 */
public class ChatPhoto public constructor(
    public val id: Long,
    public val addedDate: Int,
    public val minithumbnail: Minithumbnail?,
    public val sizes: Array<PhotoSize>,
    public val animation: AnimatedChatPhoto?,
    public val smallAnimation: AnimatedChatPhoto?,
    public val sticker: ChatPhotoSticker?,
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
        other as ChatPhoto
        if (other.id != id) {
            return false
        }
        if (other.addedDate != addedDate) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        val sizesEquals = other.sizes.contentDeepEquals(sizes)
        if (!sizesEquals) {
            return false
        }
        if (other.animation != animation) {
            return false
        }
        if (other.smallAnimation != smallAnimation) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + addedDate.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + sizes.contentDeepHashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + smallAnimation.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatPhoto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("addedDate=")
            append(addedDate)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("sizes=")
            sizes
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("animation=")
            append(animation)
            append(", ")
            append("smallAnimation=")
            append(smallAnimation)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
