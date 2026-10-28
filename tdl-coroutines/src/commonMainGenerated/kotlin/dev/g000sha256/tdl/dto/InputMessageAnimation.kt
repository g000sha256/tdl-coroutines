/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * An animation message (GIF-style).
 *
 * @property animation The animation to be sent.
 * @property caption Animation caption; pass null to use an empty caption; 0-getOption(&quot;message&#95;caption&#95;length&#95;max&quot;) characters.
 * @property showCaptionAboveMedia True, if the caption must be shown above the animation; otherwise, the caption must be shown below the animation; not supported in secret chats.
 * @property hasSpoiler True, if the animation preview must be covered by a spoiler animation; not supported in secret chats.
 */
public class InputMessageAnimation public constructor(
    public val animation: InputAnimation,
    public val caption: FormattedText?,
    public val showCaptionAboveMedia: Boolean,
    public val hasSpoiler: Boolean,
) : InputMessageContent() {
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
        other as InputMessageAnimation
        if (other.animation != animation) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        return other.hasSpoiler == hasSpoiler
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + hasSpoiler.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageAnimation")
            append("(")
            append("animation=")
            append(animation)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("hasSpoiler=")
            append(hasSpoiler)
            append(")")
        }
    }
}
