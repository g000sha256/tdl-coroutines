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
 * Describes settings for a business account start page.
 *
 * @property title Title text of the start page.
 * @property message Message text of the start page.
 * @property sticker Greeting sticker of the start page; may be null if none.
 */
public class BusinessStartPageDto public constructor(
    public val title: String,
    public val message: String,
    public val sticker: StickerDto?,
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
        other as BusinessStartPageDto
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
            append("BusinessStartPageDto")
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
