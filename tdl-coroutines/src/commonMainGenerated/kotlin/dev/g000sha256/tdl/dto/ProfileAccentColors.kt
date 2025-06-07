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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about supported accent colors for user profile photo background in RGB format.
 *
 * @property paletteColors The list of 1-2 colors in RGB format, describing the colors, as expected to be shown in the color palette settings.
 * @property backgroundColors The list of 1-2 colors in RGB format, describing the colors, as expected to be used for the profile photo background.
 * @property storyColors The list of 2 colors in RGB format, describing the colors of the gradient to be used for the unread active story indicator around profile photo.
 */
@SerialName(value = "profileAccentColors")
@Serializable
public class ProfileAccentColors public constructor(
    @SerialName(value = "palette_colors")
    public val paletteColors: IntArray,
    @SerialName(value = "background_colors")
    public val backgroundColors: IntArray,
    @SerialName(value = "story_colors")
    public val storyColors: IntArray,
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
        other as ProfileAccentColors
        val paletteColorsEquals = other.paletteColors.contentEquals(paletteColors)
        if (!paletteColorsEquals) {
            return false
        }
        val backgroundColorsEquals = other.backgroundColors.contentEquals(backgroundColors)
        if (!backgroundColorsEquals) {
            return false
        }
        return other.storyColors.contentEquals(storyColors)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + paletteColors.contentHashCode()
        hashCode = 31 * hashCode + backgroundColors.contentHashCode()
        hashCode = 31 * hashCode + storyColors.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ProfileAccentColors")
            append("(")
            append("paletteColors=")
            paletteColors
                .contentToString()
                .also { append(it) }
            append(", ")
            append("backgroundColors=")
            backgroundColors
                .contentToString()
                .also { append(it) }
            append(", ")
            append("storyColors=")
            storyColors
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
