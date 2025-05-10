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
 * This class is an abstract base class.
 * Describes type of emoji effect.
 */
public sealed class MessageEffectTypeDto private constructor() {
    /**
     * An effect from an emoji reaction.
     *
     * @property selectAnimation Select animation for the effect in TGS format.
     * @property effectAnimation Effect animation for the effect in TGS format.
     */
    public class EmojiReaction public constructor(
        public val selectAnimation: StickerDto,
        public val effectAnimation: StickerDto,
    ) : MessageEffectTypeDto() {
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
            other as EmojiReaction
            if (other.selectAnimation != selectAnimation) {
                return false
            }
            return other.effectAnimation == effectAnimation
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + selectAnimation.hashCode()
            hashCode = 31 * hashCode + effectAnimation.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageEffectTypeDto.EmojiReaction")
                append("(")
                append("selectAnimation=")
                append(selectAnimation)
                append(", ")
                append("effectAnimation=")
                append(effectAnimation)
                append(")")
            }
        }
    }

    /**
     * An effect from a premium sticker.
     *
     * @property sticker The premium sticker. The effect can be found at sticker.fullType.premiumAnimation.
     */
    public class PremiumSticker public constructor(
        public val sticker: StickerDto,
    ) : MessageEffectTypeDto() {
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
            other as PremiumSticker
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageEffectTypeDto.PremiumSticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }
}
