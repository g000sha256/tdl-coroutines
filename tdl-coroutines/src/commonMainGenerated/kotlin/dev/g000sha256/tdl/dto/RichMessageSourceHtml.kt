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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * An HTML-formatted rich message; for bots only.
 *
 * @property text HTML-formatted text of the message.
 * @property media Media used in the message.
 */
public class RichMessageSourceHtml public constructor(
    public val text: String,
    public val media: Array<InputRichMessageMedia>,
) : RichMessageSource() {
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
        other as RichMessageSourceHtml
        if (other.text != text) {
            return false
        }
        return other.media.contentDeepEquals(media)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + media.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("RichMessageSourceHtml")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("media=")
            media
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
