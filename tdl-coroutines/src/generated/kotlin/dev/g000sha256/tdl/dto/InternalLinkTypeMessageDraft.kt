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
 * The link contains a message draft text. A share screen needs to be shown to the user, then the chosen chat must be opened and the text is added to the input field.
 *
 * @property text Message draft text.
 * @property containsLink True, if the first line of the text contains a link. If true, the input field needs to be focused and the text after the link must be selected.
 */
public class InternalLinkTypeMessageDraft public constructor(
    public val text: FormattedText,
    public val containsLink: Boolean,
) : InternalLinkType() {
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
        other as InternalLinkTypeMessageDraft
        if (other.text != text) {
            return false
        }
        return other.containsLink == containsLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + containsLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeMessageDraft")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("containsLink=")
            append(containsLink)
            append(")")
        }
    }
}
