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
 * A document message (general file).
 *
 * @property document Document to be sent.
 * @property thumbnail Document thumbnail; pass null to skip thumbnail uploading.
 * @property disableContentTypeDetection Pass true to disable automatic file type detection and send the document as a file. Always true for files sent to secret chats.
 * @property caption Document caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 */
public class InputMessageDocument public constructor(
    public val document: InputFile,
    public val thumbnail: InputThumbnail?,
    public val disableContentTypeDetection: Boolean,
    public val caption: FormattedText?,
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
        other as InputMessageDocument
        if (other.document != document) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.disableContentTypeDetection != disableContentTypeDetection) {
            return false
        }
        return other.caption == caption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + document.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + disableContentTypeDetection.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageDocument")
            append("(")
            append("document=")
            append(document)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("disableContentTypeDetection=")
            append(disableContentTypeDetection)
            append(", ")
            append("caption=")
            append(caption)
            append(")")
        }
    }
}
