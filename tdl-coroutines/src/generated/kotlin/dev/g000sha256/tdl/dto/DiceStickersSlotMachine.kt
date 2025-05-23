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
 * Animated stickers to be combined into a slot machine.
 *
 * @property background The animated sticker with the slot machine background. The background animation must start playing after all reel animations finish.
 * @property lever The animated sticker with the lever animation. The lever animation must play once in the initial dice state.
 * @property leftReel The animated sticker with the left reel.
 * @property centerReel The animated sticker with the center reel.
 * @property rightReel The animated sticker with the right reel.
 */
public class DiceStickersSlotMachine public constructor(
    public val background: Sticker,
    public val lever: Sticker,
    public val leftReel: Sticker,
    public val centerReel: Sticker,
    public val rightReel: Sticker,
) : DiceStickers() {
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
        other as DiceStickersSlotMachine
        if (other.background != background) {
            return false
        }
        if (other.lever != lever) {
            return false
        }
        if (other.leftReel != leftReel) {
            return false
        }
        if (other.centerReel != centerReel) {
            return false
        }
        return other.rightReel == rightReel
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        hashCode = 31 * hashCode + lever.hashCode()
        hashCode = 31 * hashCode + leftReel.hashCode()
        hashCode = 31 * hashCode + centerReel.hashCode()
        hashCode = 31 * hashCode + rightReel.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("DiceStickersSlotMachine")
            append("(")
            append("background=")
            append(background)
            append(", ")
            append("lever=")
            append(lever)
            append(", ")
            append("leftReel=")
            append(leftReel)
            append(", ")
            append("centerReel=")
            append(centerReel)
            append(", ")
            append("rightReel=")
            append(rightReel)
            append(")")
        }
    }
}
