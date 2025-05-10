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
import kotlin.String

/**
 * Contains information about supported accent color for user/chat name, background of empty chat photo, replies to messages and link previews.
 *
 * @property id Accent color identifier.
 * @property builtInAccentColorId Identifier of a built-in color to use in places, where only one color is needed; 0-6.
 * @property lightThemeColors The list of 1-3 colors in RGB format, describing the accent color, as expected to be shown in light themes.
 * @property darkThemeColors The list of 1-3 colors in RGB format, describing the accent color, as expected to be shown in dark themes.
 * @property minChannelChatBoostLevel The minimum chat boost level required to use the color in a channel chat.
 */
public class AccentColorDto public constructor(
    public val id: Int,
    public val builtInAccentColorId: Int,
    public val lightThemeColors: IntArray,
    public val darkThemeColors: IntArray,
    public val minChannelChatBoostLevel: Int,
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
        other as AccentColorDto
        if (other.id != id) {
            return false
        }
        if (other.builtInAccentColorId != builtInAccentColorId) {
            return false
        }
        val lightThemeColorsEquals = other.lightThemeColors.contentEquals(lightThemeColors)
        if (!lightThemeColorsEquals) {
            return false
        }
        val darkThemeColorsEquals = other.darkThemeColors.contentEquals(darkThemeColors)
        if (!darkThemeColorsEquals) {
            return false
        }
        return other.minChannelChatBoostLevel == minChannelChatBoostLevel
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + builtInAccentColorId.hashCode()
        hashCode = 31 * hashCode + lightThemeColors.contentHashCode()
        hashCode = 31 * hashCode + darkThemeColors.contentHashCode()
        hashCode = 31 * hashCode + minChannelChatBoostLevel.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AccentColorDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("builtInAccentColorId=")
            append(builtInAccentColorId)
            append(", ")
            append("lightThemeColors=")
            lightThemeColors
                .contentToString()
                .also { append(it) }
            append(", ")
            append("darkThemeColors=")
            darkThemeColors
                .contentToString()
                .also { append(it) }
            append(", ")
            append("minChannelChatBoostLevel=")
            append(minChannelChatBoostLevel)
            append(")")
        }
    }
}
