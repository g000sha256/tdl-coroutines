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
 * A message with an HTML widget.
 *
 * @property width Width of the widget; 0 if the widget must occupy the whole width of the message bubble.
 * @property height Height of the widget; 0 if the height of the widget isn't fixed.
 * @property html HTML code of the widget.
 * @property publicData Public data of the widget.
 * @property chatData Data of the widget, which is specific to the chat.
 * @property widgetId Identifier of the shared widget; 0 if the widget isn't shared.
 * @property caption Widget caption.
 * @property showCaptionAboveMedia True, if the caption must be shown above the widget; otherwise, the caption must be shown below the widget.
 * @property isCopy True, if the message is a copy of the widget.
 * @property canSendQueries True, if the widget can send queries to the bot.
 * @property canSendBackgroundQueries True, if the widget can send queries to the bot in the background.
 */
public class MessageWidget public constructor(
    public val width: Int,
    public val height: Int,
    public val html: String,
    public val publicData: String,
    public val chatData: String,
    public val widgetId: Long,
    public val caption: FormattedText,
    public val showCaptionAboveMedia: Boolean,
    public val isCopy: Boolean,
    public val canSendQueries: Boolean,
    public val canSendBackgroundQueries: Boolean,
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
        other as MessageWidget
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.html != html) {
            return false
        }
        if (other.publicData != publicData) {
            return false
        }
        if (other.chatData != chatData) {
            return false
        }
        if (other.widgetId != widgetId) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        if (other.isCopy != isCopy) {
            return false
        }
        if (other.canSendQueries != canSendQueries) {
            return false
        }
        return other.canSendBackgroundQueries == canSendBackgroundQueries
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + html.hashCode()
        hashCode = 31 * hashCode + publicData.hashCode()
        hashCode = 31 * hashCode + chatData.hashCode()
        hashCode = 31 * hashCode + widgetId.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + isCopy.hashCode()
        hashCode = 31 * hashCode + canSendQueries.hashCode()
        hashCode = 31 * hashCode + canSendBackgroundQueries.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageWidget")
            append("(")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("html=")
            append(html)
            append(", ")
            append("publicData=")
            append(publicData)
            append(", ")
            append("chatData=")
            append(chatData)
            append(", ")
            append("widgetId=")
            append(widgetId)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("isCopy=")
            append(isCopy)
            append(", ")
            append("canSendQueries=")
            append(canSendQueries)
            append(", ")
            append("canSendBackgroundQueries=")
            append(canSendBackgroundQueries)
            append(")")
        }
    }
}
