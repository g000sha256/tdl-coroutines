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
 * This class is an abstract base class.
 * Describes type of emoji status.
 */
public sealed class EmojiStatusTypeDto private constructor() {
    /**
     * A custom emoji set as emoji status.
     *
     * @property customEmojiId Identifier of the custom emoji in stickerFormatTgs format.
     */
    public class CustomEmoji public constructor(
        public val customEmojiId: Long,
    ) : EmojiStatusTypeDto() {
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
            other as CustomEmoji
            return other.customEmojiId == customEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + customEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("EmojiStatusTypeDto.CustomEmoji")
                append("(")
                append("customEmojiId=")
                append(customEmojiId)
                append(")")
            }
        }
    }

    /**
     * An upgraded gift set as emoji status.
     *
     * @property upgradedGiftId Identifier of the upgraded gift.
     * @property giftTitle The title of the upgraded gift.
     * @property giftName Unique name of the upgraded gift that can be used with internalLinkTypeUpgradedGift.
     * @property modelCustomEmojiId Custom emoji identifier of the model of the upgraded gift.
     * @property symbolCustomEmojiId Custom emoji identifier of the symbol of the upgraded gift.
     * @property backdropColors Colors of the backdrop of the upgraded gift.
     */
    public class UpgradedGift public constructor(
        public val upgradedGiftId: Long,
        public val giftTitle: String,
        public val giftName: String,
        public val modelCustomEmojiId: Long,
        public val symbolCustomEmojiId: Long,
        public val backdropColors: UpgradedGiftBackdropColorsDto,
    ) : EmojiStatusTypeDto() {
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
            other as UpgradedGift
            if (other.upgradedGiftId != upgradedGiftId) {
                return false
            }
            if (other.giftTitle != giftTitle) {
                return false
            }
            if (other.giftName != giftName) {
                return false
            }
            if (other.modelCustomEmojiId != modelCustomEmojiId) {
                return false
            }
            if (other.symbolCustomEmojiId != symbolCustomEmojiId) {
                return false
            }
            return other.backdropColors == backdropColors
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + upgradedGiftId.hashCode()
            hashCode = 31 * hashCode + giftTitle.hashCode()
            hashCode = 31 * hashCode + giftName.hashCode()
            hashCode = 31 * hashCode + modelCustomEmojiId.hashCode()
            hashCode = 31 * hashCode + symbolCustomEmojiId.hashCode()
            hashCode = 31 * hashCode + backdropColors.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("EmojiStatusTypeDto.UpgradedGift")
                append("(")
                append("upgradedGiftId=")
                append(upgradedGiftId)
                append(", ")
                append("giftTitle=")
                append(giftTitle)
                append(", ")
                append("giftName=")
                append(giftName)
                append(", ")
                append("modelCustomEmojiId=")
                append(modelCustomEmojiId)
                append(", ")
                append("symbolCustomEmojiId=")
                append(symbolCustomEmojiId)
                append(", ")
                append("backdropColors=")
                append(backdropColors)
                append(")")
            }
        }
    }
}
