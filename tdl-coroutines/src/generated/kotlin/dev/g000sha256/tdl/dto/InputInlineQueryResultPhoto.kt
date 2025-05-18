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
 * Represents link to a JPEG image.
 *
 * @property id Unique identifier of the query result.
 * @property title Title of the result, if known.
 * @property description A short description of the result, if known.
 * @property thumbnailUrl URL of the photo thumbnail, if it exists.
 * @property photoUrl The URL of the JPEG photo (photo size must not exceed 5MB).
 * @property photoWidth Width of the photo.
 * @property photoHeight Height of the photo.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessagePhoto, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
public class InputInlineQueryResultPhoto public constructor(
    public val id: String,
    public val title: String,
    public val description: String,
    public val thumbnailUrl: String,
    public val photoUrl: String,
    public val photoWidth: Int,
    public val photoHeight: Int,
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
        other as InputInlineQueryResultPhoto
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.thumbnailUrl != thumbnailUrl) {
            return false
        }
        if (other.photoUrl != photoUrl) {
            return false
        }
        if (other.photoWidth != photoWidth) {
            return false
        }
        if (other.photoHeight != photoHeight) {
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
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + thumbnailUrl.hashCode()
        hashCode = 31 * hashCode + photoUrl.hashCode()
        hashCode = 31 * hashCode + photoWidth.hashCode()
        hashCode = 31 * hashCode + photoHeight.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultPhoto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("thumbnailUrl=")
            append(thumbnailUrl)
            append(", ")
            append("photoUrl=")
            append(photoUrl)
            append(", ")
            append("photoWidth=")
            append(photoWidth)
            append(", ")
            append("photoHeight=")
            append(photoHeight)
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
