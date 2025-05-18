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
 * A photo message.
 *
 * @property photo The photo.
 * @property caption Photo caption.
 * @property showCaptionAboveMedia True, if the caption must be shown above the photo; otherwise, the caption must be shown below the photo.
 * @property hasSpoiler True, if the photo preview must be covered by a spoiler animation.
 * @property isSecret True, if the photo must be blurred and must be shown only while tapped.
 */
public class MessagePhoto public constructor(
    public val photo: Photo,
    public val caption: FormattedText,
    public val showCaptionAboveMedia: Boolean,
    public val hasSpoiler: Boolean,
    public val isSecret: Boolean,
) : MessageContent() {
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
        other as MessagePhoto
        if (other.photo != photo) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        if (other.hasSpoiler != hasSpoiler) {
            return false
        }
        return other.isSecret == isSecret
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + hasSpoiler.hashCode()
        hashCode = 31 * hashCode + isSecret.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePhoto")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("hasSpoiler=")
            append(hasSpoiler)
            append(", ")
            append("isSecret=")
            append(isSecret)
            append(")")
        }
    }
}
