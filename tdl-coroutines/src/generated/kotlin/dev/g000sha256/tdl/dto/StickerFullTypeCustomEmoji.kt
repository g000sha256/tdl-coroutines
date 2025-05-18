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
import kotlin.Long
import kotlin.String

/**
 * The sticker is a custom emoji to be used inside message text and caption. Currently, only Telegram Premium users can use custom emoji.
 *
 * @property customEmojiId Identifier of the custom emoji.
 * @property needsRepainting True, if the sticker must be repainted to a text color in messages, the color of the Telegram Premium badge in emoji status, white color on chat photos, or another appropriate color in other places.
 */
public class StickerFullTypeCustomEmoji public constructor(
    public val customEmojiId: Long,
    public val needsRepainting: Boolean,
) : StickerFullType() {
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
        other as StickerFullTypeCustomEmoji
        if (other.customEmojiId != customEmojiId) {
            return false
        }
        return other.needsRepainting == needsRepainting
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + customEmojiId.hashCode()
        hashCode = 31 * hashCode + needsRepainting.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StickerFullTypeCustomEmoji")
            append("(")
            append("customEmojiId=")
            append(customEmojiId)
            append(", ")
            append("needsRepainting=")
            append(needsRepainting)
            append(")")
        }
    }
}
