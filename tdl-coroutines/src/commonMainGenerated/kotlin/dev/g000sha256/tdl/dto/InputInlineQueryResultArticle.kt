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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a link to an article or web page.
 *
 * @property id Unique identifier of the query result.
 * @property url URL of the result, if it exists.
 * @property title Title of the result.
 * @property description A short description of the result.
 * @property thumbnailUrl URL of the result thumbnail, if it exists.
 * @property thumbnailWidth Thumbnail width, if known.
 * @property thumbnailHeight Thumbnail height, if known.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
@SerialName(value = "inputInlineQueryResultArticle")
@Serializable
public class InputInlineQueryResultArticle public constructor(
    @SerialName(value = "id")
    public val id: String,
    @SerialName(value = "url")
    public val url: String,
    @SerialName(value = "title")
    public val title: String,
    @SerialName(value = "description")
    public val description: String,
    @SerialName(value = "thumbnail_url")
    public val thumbnailUrl: String,
    @SerialName(value = "thumbnail_width")
    public val thumbnailWidth: Int,
    @SerialName(value = "thumbnail_height")
    public val thumbnailHeight: Int,
    @SerialName(value = "reply_markup")
    public val replyMarkup: ReplyMarkup?,
    @SerialName(value = "input_message_content")
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
        other as InputInlineQueryResultArticle
        if (other.id != id) {
            return false
        }
        if (other.url != url) {
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
        if (other.thumbnailWidth != thumbnailWidth) {
            return false
        }
        if (other.thumbnailHeight != thumbnailHeight) {
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
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + thumbnailUrl.hashCode()
        hashCode = 31 * hashCode + thumbnailWidth.hashCode()
        hashCode = 31 * hashCode + thumbnailHeight.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultArticle")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("url=")
            append(url)
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
            append("thumbnailWidth=")
            append(thumbnailWidth)
            append(", ")
            append("thumbnailHeight=")
            append(thumbnailHeight)
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
