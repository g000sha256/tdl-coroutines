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
 * Represents a link to a page containing an embedded video player or a video file.
 *
 * @property id Unique identifier of the query result.
 * @property title Title of the result.
 * @property description A short description of the result, if known.
 * @property thumbnailUrl The URL of the video thumbnail (JPEG), if it exists.
 * @property videoUrl URL of the embedded video player or video file.
 * @property mimeType MIME type of the content of the video URL, only &quot;text/html&quot; or &quot;video/mp4&quot; are currently supported.
 * @property videoWidth Width of the video.
 * @property videoHeight Height of the video.
 * @property videoDuration Video duration, in seconds.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageVideo, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
@SerialName(value = "inputInlineQueryResultVideo")
@Serializable
public class InputInlineQueryResultVideo public constructor(
    @SerialName(value = "id")
    public val id: String,
    @SerialName(value = "title")
    public val title: String,
    @SerialName(value = "description")
    public val description: String,
    @SerialName(value = "thumbnail_url")
    public val thumbnailUrl: String,
    @SerialName(value = "video_url")
    public val videoUrl: String,
    @SerialName(value = "mime_type")
    public val mimeType: String,
    @SerialName(value = "video_width")
    public val videoWidth: Int,
    @SerialName(value = "video_height")
    public val videoHeight: Int,
    @SerialName(value = "video_duration")
    public val videoDuration: Int,
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
        other as InputInlineQueryResultVideo
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
        if (other.videoUrl != videoUrl) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        if (other.videoWidth != videoWidth) {
            return false
        }
        if (other.videoHeight != videoHeight) {
            return false
        }
        if (other.videoDuration != videoDuration) {
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
        hashCode = 31 * hashCode + videoUrl.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + videoWidth.hashCode()
        hashCode = 31 * hashCode + videoHeight.hashCode()
        hashCode = 31 * hashCode + videoDuration.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultVideo")
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
            append("videoUrl=")
            append(videoUrl)
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("videoWidth=")
            append(videoWidth)
            append(", ")
            append("videoHeight=")
            append(videoHeight)
            append(", ")
            append("videoDuration=")
            append(videoDuration)
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
