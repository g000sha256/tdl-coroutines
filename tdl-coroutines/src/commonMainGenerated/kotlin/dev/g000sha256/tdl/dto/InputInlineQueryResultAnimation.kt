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
 * Represents a link to an animated GIF or an animated (i.e., without sound) H.264/MPEG-4 AVC video.
 *
 * @property id Unique identifier of the query result.
 * @property title Title of the query result.
 * @property thumbnailUrl URL of the result thumbnail (JPEG, GIF, or MPEG4), if it exists.
 * @property thumbnailMimeType MIME type of the video thumbnail. If non-empty, must be one of &quot;image/jpeg&quot;, &quot;image/gif&quot; and &quot;video/mp4&quot;.
 * @property videoUrl The URL of the video file (file size must not exceed 1MB).
 * @property videoMimeType MIME type of the video file. Must be one of &quot;image/gif&quot; and &quot;video/mp4&quot;.
 * @property videoDuration Duration of the video, in seconds.
 * @property videoWidth Width of the video.
 * @property videoHeight Height of the video.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageAnimation, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
public class InputInlineQueryResultAnimation public constructor(
    public val id: String,
    public val title: String,
    public val thumbnailUrl: String,
    public val thumbnailMimeType: String,
    public val videoUrl: String,
    public val videoMimeType: String,
    public val videoDuration: Int,
    public val videoWidth: Int,
    public val videoHeight: Int,
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
        other as InputInlineQueryResultAnimation
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.thumbnailUrl != thumbnailUrl) {
            return false
        }
        if (other.thumbnailMimeType != thumbnailMimeType) {
            return false
        }
        if (other.videoUrl != videoUrl) {
            return false
        }
        if (other.videoMimeType != videoMimeType) {
            return false
        }
        if (other.videoDuration != videoDuration) {
            return false
        }
        if (other.videoWidth != videoWidth) {
            return false
        }
        if (other.videoHeight != videoHeight) {
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
        hashCode = 31 * hashCode + thumbnailUrl.hashCode()
        hashCode = 31 * hashCode + thumbnailMimeType.hashCode()
        hashCode = 31 * hashCode + videoUrl.hashCode()
        hashCode = 31 * hashCode + videoMimeType.hashCode()
        hashCode = 31 * hashCode + videoDuration.hashCode()
        hashCode = 31 * hashCode + videoWidth.hashCode()
        hashCode = 31 * hashCode + videoHeight.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultAnimation")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("thumbnailUrl=")
            append(thumbnailUrl)
            append(", ")
            append("thumbnailMimeType=")
            append(thumbnailMimeType)
            append(", ")
            append("videoUrl=")
            append(videoUrl)
            append(", ")
            append("videoMimeType=")
            append(videoMimeType)
            append(", ")
            append("videoDuration=")
            append(videoDuration)
            append(", ")
            append("videoWidth=")
            append(videoWidth)
            append(", ")
            append("videoHeight=")
            append(videoHeight)
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
