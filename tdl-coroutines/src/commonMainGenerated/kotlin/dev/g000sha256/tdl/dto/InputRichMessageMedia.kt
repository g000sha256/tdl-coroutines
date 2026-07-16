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
import kotlin.String

/**
 * Describes a media to be used in a sent rich message.
 *
 * @property id Unique identifier of the media; 1-64 base64url characters.
 * @property media The media to send. Must be one of the following types: inputMessageAnimation, inputMessageAudio, inputMessagePhoto, inputMessageVideo, or inputMessageVoiceNote.
 */
public class InputRichMessageMedia public constructor(
    public val id: String,
    public val media: InputMessageContent,
) {
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
        other as InputRichMessageMedia
        if (other.id != id) {
            return false
        }
        return other.media == media
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + media.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputRichMessageMedia")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("media=")
            append(media)
            append(")")
        }
    }
}
