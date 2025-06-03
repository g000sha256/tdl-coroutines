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
 * Represents a link to a file.
 *
 * @property id Unique identifier of the query result.
 * @property title Title of the resulting file.
 * @property description Short description of the result, if known.
 * @property documentUrl URL of the file.
 * @property mimeType MIME type of the file content; only &quot;application/pdf&quot; and &quot;application/zip&quot; are currently allowed.
 * @property thumbnailUrl The URL of the file thumbnail, if it exists.
 * @property thumbnailWidth Width of the thumbnail.
 * @property thumbnailHeight Height of the thumbnail.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageDocument, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
public class InputInlineQueryResultDocument public constructor(
    public val id: String,
    public val title: String,
    public val description: String,
    public val documentUrl: String,
    public val mimeType: String,
    public val thumbnailUrl: String,
    public val thumbnailWidth: Int,
    public val thumbnailHeight: Int,
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
        other as InputInlineQueryResultDocument
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.documentUrl != documentUrl) {
            return false
        }
        if (other.mimeType != mimeType) {
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
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + documentUrl.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + thumbnailUrl.hashCode()
        hashCode = 31 * hashCode + thumbnailWidth.hashCode()
        hashCode = 31 * hashCode + thumbnailHeight.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultDocument")
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
            append("documentUrl=")
            append(documentUrl)
            append(", ")
            append("mimeType=")
            append(mimeType)
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
