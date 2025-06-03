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
 * A message with paid media; can be used only in channel chats with supergroupFullInfo.hasPaidMediaAllowed.
 *
 * @property starCount The number of Telegram Stars that must be paid to see the media; 1-getOption(&quot;paid_media_message_star_count_max&quot;).
 * @property paidMedia The content of the paid media.
 * @property caption Message caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 * @property showCaptionAboveMedia True, if the caption must be shown above the media; otherwise, the caption must be shown below the media; not supported in secret chats.
 * @property payload Bot-provided data for the paid media; bots only.
 */
public class InputMessagePaidMedia public constructor(
    public val starCount: Long,
    public val paidMedia: Array<InputPaidMedia>,
    public val caption: FormattedText?,
    public val showCaptionAboveMedia: Boolean,
    public val payload: String,
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
        other as InputMessagePaidMedia
        if (other.starCount != starCount) {
            return false
        }
        val paidMediaEquals = other.paidMedia.contentDeepEquals(paidMedia)
        if (!paidMediaEquals) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        return other.payload == payload
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + paidMedia.contentDeepHashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessagePaidMedia")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("paidMedia=")
            paidMedia
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("payload=")
            append(payload)
            append(")")
        }
    }
}
