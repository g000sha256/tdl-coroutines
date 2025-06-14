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
 * Represents a link to a WEBP, TGS, or WEBM sticker.
 *
 * @property id Unique identifier of the query result.
 * @property thumbnailUrl URL of the sticker thumbnail, if it exists.
 * @property stickerUrl The URL of the WEBP, TGS, or WEBM sticker (sticker file size must not exceed 5MB).
 * @property stickerWidth Width of the sticker.
 * @property stickerHeight Height of the sticker.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageSticker, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
public class InputInlineQueryResultSticker public constructor(
    public val id: String,
    public val thumbnailUrl: String,
    public val stickerUrl: String,
    public val stickerWidth: Int,
    public val stickerHeight: Int,
    public val replyMarkup: ReplyMarkup?,
    public val inputMessageContent: InputMessageContent,
) : InputInlineQueryResult() {
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
        other as InputInlineQueryResultSticker
        if (other.id != id) {
            return false
        }
        if (other.thumbnailUrl != thumbnailUrl) {
            return false
        }
        if (other.stickerUrl != stickerUrl) {
            return false
        }
        if (other.stickerWidth != stickerWidth) {
            return false
        }
        if (other.stickerHeight != stickerHeight) {
            return false
        }
        if (other.replyMarkup != replyMarkup) {
            return false
        }
        return other.inputMessageContent == inputMessageContent
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + thumbnailUrl.hashCode()
        hashCode = 31 * hashCode + stickerUrl.hashCode()
        hashCode = 31 * hashCode + stickerWidth.hashCode()
        hashCode = 31 * hashCode + stickerHeight.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultSticker")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("thumbnailUrl=")
            append(thumbnailUrl)
            append(", ")
            append("stickerUrl=")
            append(stickerUrl)
            append(", ")
            append("stickerWidth=")
            append(stickerWidth)
            append(", ")
            append("stickerHeight=")
            append(stickerHeight)
            append(", ")
            append("replyMarkup=")
            append(replyMarkup)
            append(", ")
            append("inputMessageContent=")
            append(inputMessageContent)
            append(")")
        }
    }
}
