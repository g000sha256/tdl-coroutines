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
 * Represents a link to an MP3 audio file.
 *
 * @property id Unique identifier of the query result.
 * @property title Title of the audio file.
 * @property performer Performer of the audio file.
 * @property audioUrl The URL of the audio file.
 * @property audioDuration Audio file duration, in seconds.
 * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
 * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageAudio, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
 */
public class InputInlineQueryResultAudio public constructor(
    public val id: String,
    public val title: String,
    public val performer: String,
    public val audioUrl: String,
    public val audioDuration: Int,
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
        other as InputInlineQueryResultAudio
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.performer != performer) {
            return false
        }
        if (other.audioUrl != audioUrl) {
            return false
        }
        if (other.audioDuration != audioDuration) {
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
        hashCode = 31 * hashCode + performer.hashCode()
        hashCode = 31 * hashCode + audioUrl.hashCode()
        hashCode = 31 * hashCode + audioDuration.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        hashCode = 31 * hashCode + inputMessageContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputInlineQueryResultAudio")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("performer=")
            append(performer)
            append(", ")
            append("audioUrl=")
            append(audioUrl)
            append(", ")
            append("audioDuration=")
            append(audioDuration)
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
