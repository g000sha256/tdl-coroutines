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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about supported accent color for user profile photo background.
 *
 * @property id Profile accent color identifier.
 * @property lightThemeColors Accent colors expected to be used in light themes.
 * @property darkThemeColors Accent colors expected to be used in dark themes.
 * @property minSupergroupChatBoostLevel The minimum chat boost level required to use the color in a supergroup chat.
 * @property minChannelChatBoostLevel The minimum chat boost level required to use the color in a channel chat.
 */
@SerialName(value = "profileAccentColor")
@Serializable
public class ProfileAccentColor public constructor(
    @SerialName(value = "id")
    public val id: Int,
    @SerialName(value = "light_theme_colors")
    public val lightThemeColors: ProfileAccentColors,
    @SerialName(value = "dark_theme_colors")
    public val darkThemeColors: ProfileAccentColors,
    @SerialName(value = "min_supergroup_chat_boost_level")
    public val minSupergroupChatBoostLevel: Int,
    @SerialName(value = "min_channel_chat_boost_level")
    public val minChannelChatBoostLevel: Int,
) : Model() {
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
        other as ProfileAccentColor
        if (other.id != id) {
            return false
        }
        if (other.lightThemeColors != lightThemeColors) {
            return false
        }
        if (other.darkThemeColors != darkThemeColors) {
            return false
        }
        if (other.minSupergroupChatBoostLevel != minSupergroupChatBoostLevel) {
            return false
        }
        return other.minChannelChatBoostLevel == minChannelChatBoostLevel
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + lightThemeColors.hashCode()
        hashCode = 31 * hashCode + darkThemeColors.hashCode()
        hashCode = 31 * hashCode + minSupergroupChatBoostLevel.hashCode()
        hashCode = 31 * hashCode + minChannelChatBoostLevel.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ProfileAccentColor")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("lightThemeColors=")
            append(lightThemeColors)
            append(", ")
            append("darkThemeColors=")
            append(darkThemeColors)
            append(", ")
            append("minSupergroupChatBoostLevel=")
            append(minSupergroupChatBoostLevel)
            append(", ")
            append("minChannelChatBoostLevel=")
            append(minChannelChatBoostLevel)
            append(")")
        }
    }
}
