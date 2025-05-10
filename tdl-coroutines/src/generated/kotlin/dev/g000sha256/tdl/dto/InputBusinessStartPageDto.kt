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
 * Describes settings for a business account start page to set.
 *
 * @property title Title text of the start page; 0-getOption(&quot;business_start_page_title_length_max&quot;) characters.
 * @property message Message text of the start page; 0-getOption(&quot;business_start_page_message_length_max&quot;) characters.
 * @property sticker Greeting sticker of the start page; pass null if none. The sticker must belong to a sticker set and must not be a custom emoji.
 */
public class InputBusinessStartPageDto public constructor(
    public val title: String,
    public val message: String,
    public val sticker: InputFileDto?,
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
        other as InputBusinessStartPageDto
        if (other.title != title) {
            return false
        }
        if (other.message != message) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputBusinessStartPageDto")
            append("(")
            append("title=")
            append(title)
            append(", ")
            append("message=")
            append(message)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
