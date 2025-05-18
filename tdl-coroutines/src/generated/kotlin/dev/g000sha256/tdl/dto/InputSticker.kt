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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A sticker to be added to a sticker set.
 *
 * @property sticker File with the sticker; must fit in a 512x512 square. For WEBP stickers the file must be in WEBP or PNG format, which will be converted to WEBP server-side. See https://core.telegram.org/animated_stickers#technical-requirements for technical requirements.
 * @property format Format of the sticker.
 * @property emojis String with 1-20 emoji corresponding to the sticker.
 * @property maskPosition Position where the mask is placed; pass null if not specified.
 * @property keywords List of up to 20 keywords with total length up to 64 characters, which can be used to find the sticker.
 */
public class InputSticker public constructor(
    public val sticker: InputFile,
    public val format: StickerFormat,
    public val emojis: String,
    public val maskPosition: MaskPosition?,
    public val keywords: Array<String>,
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
        other as InputSticker
        if (other.sticker != sticker) {
            return false
        }
        if (other.format != format) {
            return false
        }
        if (other.emojis != emojis) {
            return false
        }
        if (other.maskPosition != maskPosition) {
            return false
        }
        return other.keywords.contentDeepEquals(keywords)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + format.hashCode()
        hashCode = 31 * hashCode + emojis.hashCode()
        hashCode = 31 * hashCode + maskPosition.hashCode()
        hashCode = 31 * hashCode + keywords.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputSticker")
            append("(")
            append("sticker=")
            append(sticker)
            append(", ")
            append("format=")
            append(format)
            append(", ")
            append("emojis=")
            append(emojis)
            append(", ")
            append("maskPosition=")
            append(maskPosition)
            append(", ")
            append("keywords=")
            keywords
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
