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
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * Contains information about color scheme for user's name, background of empty chat photo, replies to messages and link previews.
 *
 * @property id Unique identifier of the upgraded gift colors.
 * @property modelCustomEmojiId Custom emoji identifier of the model of the upgraded gift.
 * @property symbolCustomEmojiId Custom emoji identifier of the symbol of the upgraded gift.
 * @property lightThemeAccentColor Accent color to use in light themes in RGB format.
 * @property lightThemeColors The list of 1-3 colors in RGB format, describing the accent color, as expected to be shown in light themes.
 * @property darkThemeAccentColor Accent color to use in dark themes in RGB format.
 * @property darkThemeColors The list of 1-3 colors in RGB format, describing the accent color, as expected to be shown in dark themes.
 */
public class UpgradedGiftColors public constructor(
    public val id: Long,
    public val modelCustomEmojiId: Long,
    public val symbolCustomEmojiId: Long,
    public val lightThemeAccentColor: Int,
    public val lightThemeColors: IntArray,
    public val darkThemeAccentColor: Int,
    public val darkThemeColors: IntArray,
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
        other as UpgradedGiftColors
        if (other.id != id) {
            return false
        }
        if (other.modelCustomEmojiId != modelCustomEmojiId) {
            return false
        }
        if (other.symbolCustomEmojiId != symbolCustomEmojiId) {
            return false
        }
        if (other.lightThemeAccentColor != lightThemeAccentColor) {
            return false
        }
        val lightThemeColorsEquals = other.lightThemeColors.contentEquals(lightThemeColors)
        if (!lightThemeColorsEquals) {
            return false
        }
        if (other.darkThemeAccentColor != darkThemeAccentColor) {
            return false
        }
        return other.darkThemeColors.contentEquals(darkThemeColors)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + modelCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + symbolCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + lightThemeAccentColor.hashCode()
        hashCode = 31 * hashCode + lightThemeColors.contentHashCode()
        hashCode = 31 * hashCode + darkThemeAccentColor.hashCode()
        hashCode = 31 * hashCode + darkThemeColors.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftColors")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("modelCustomEmojiId=")
            append(modelCustomEmojiId)
            append(", ")
            append("symbolCustomEmojiId=")
            append(symbolCustomEmojiId)
            append(", ")
            append("lightThemeAccentColor=")
            append(lightThemeAccentColor)
            append(", ")
            append("lightThemeColors=")
            lightThemeColors
                .contentToString()
                .also { append(it) }
            append(", ")
            append("darkThemeAccentColor=")
            append(darkThemeAccentColor)
            append(", ")
            append("darkThemeColors=")
            darkThemeColors
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
