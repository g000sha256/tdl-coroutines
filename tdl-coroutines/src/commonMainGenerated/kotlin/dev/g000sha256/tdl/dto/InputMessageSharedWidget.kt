/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
import kotlin.Long
import kotlin.String

/**
 * A message with an existing shared widget; for bots only.
 *
 * @property widgetId Identifier of the shared widget.
 * @property chatData Data of the widget, which is specific to the chat.
 * @property caption Widget caption; pass null to use an empty caption; 0-getOption(&quot;message&#95;caption&#95;length&#95;max&quot;) characters.
 * @property showCaptionAboveMedia True, if the caption must be shown above the widget; otherwise, the caption must be shown below the widget.
 */
public class InputMessageSharedWidget public constructor(
    public val widgetId: Long,
    public val chatData: String,
    public val caption: FormattedText?,
    public val showCaptionAboveMedia: Boolean,
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
        other as InputMessageSharedWidget
        if (other.widgetId != widgetId) {
            return false
        }
        if (other.chatData != chatData) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        return other.showCaptionAboveMedia == showCaptionAboveMedia
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + widgetId.hashCode()
        hashCode = 31 * hashCode + chatData.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageSharedWidget")
            append("(")
            append("widgetId=")
            append(widgetId)
            append(", ")
            append("chatData=")
            append(chatData)
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
