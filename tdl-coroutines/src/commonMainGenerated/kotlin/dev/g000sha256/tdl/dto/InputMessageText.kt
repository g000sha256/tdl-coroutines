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
 * A text message.
 *
 * @property text Formatted text to be sent; 0-getOption(&quot;message_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, BlockQuote, ExpandableBlockQuote, Code, Pre, PreCode, TextUrl and MentionName entities are allowed to be specified manually.
 * @property linkPreviewOptions Options to be used for generation of a link preview; may be null if none; pass null to use default link preview options.
 * @property clearDraft True, if a chat message draft must be deleted.
 */
@SerialName(value = "inputMessageText")
@Serializable
public class InputMessageText public constructor(
    @SerialName(value = "text")
    public val text: FormattedText,
    @SerialName(value = "link_preview_options")
    public val linkPreviewOptions: LinkPreviewOptions?,
    @SerialName(value = "clear_draft")
    public val clearDraft: Boolean,
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
        other as InputMessageText
        if (other.text != text) {
            return false
        }
        if (other.linkPreviewOptions != linkPreviewOptions) {
            return false
        }
        return other.clearDraft == clearDraft
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + linkPreviewOptions.hashCode()
        hashCode = 31 * hashCode + clearDraft.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageText")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("linkPreviewOptions=")
            append(linkPreviewOptions)
            append(", ")
            append("clearDraft=")
            append(clearDraft)
            append(")")
        }
    }
}
