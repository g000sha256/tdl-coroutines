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
 * A text message.
 *
 * @property text Text of the message.
 * @property linkPreview A link preview attached to the message; may be null.
 * @property linkPreviewOptions Options which were used for generation of the link preview; may be null if default options were used.
 */
public class MessageText public constructor(
    public val text: FormattedText,
    public val linkPreview: LinkPreview?,
    public val linkPreviewOptions: LinkPreviewOptions?,
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
        other as MessageText
        if (other.text != text) {
            return false
        }
        if (other.linkPreview != linkPreview) {
            return false
        }
        return other.linkPreviewOptions == linkPreviewOptions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + linkPreview.hashCode()
        hashCode = 31 * hashCode + linkPreviewOptions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageText")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("linkPreview=")
            append(linkPreview)
            append(", ")
            append("linkPreviewOptions=")
            append(linkPreviewOptions)
            append(")")
        }
    }
}
