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
 * A message with paid media.
 *
 * @property starCount Number of Telegram Stars needed to buy access to the media in the message.
 * @property media Information about the media.
 * @property caption Media caption.
 * @property showCaptionAboveMedia True, if the caption must be shown above the media; otherwise, the caption must be shown below the media.
 */
public class MessagePaidMedia public constructor(
    public val starCount: Long,
    public val media: Array<PaidMedia>,
    public val caption: FormattedText,
    public val showCaptionAboveMedia: Boolean,
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
        other as MessagePaidMedia
        if (other.starCount != starCount) {
            return false
        }
        val mediaEquals = other.media.contentDeepEquals(media)
        if (!mediaEquals) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        return other.showCaptionAboveMedia == showCaptionAboveMedia
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + media.contentDeepHashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePaidMedia")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("media=")
            media
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(")")
        }
    }
}
