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
 * Contains information about supported accent colors for user profile photo background in RGB format.
 *
 * @property paletteColors The list of 1-2 colors in RGB format, describing the colors, as expected to be shown in the color palette settings.
 * @property backgroundColors The list of 1-2 colors in RGB format, describing the colors, as expected to be used for the profile photo background.
 * @property storyColors The list of 2 colors in RGB format, describing the colors of the gradient to be used for the unread active story indicator around profile photo.
 */
public class ProfileAccentColorsDto public constructor(
    public val paletteColors: IntArray,
    public val backgroundColors: IntArray,
    public val storyColors: IntArray,
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
        other as ProfileAccentColorsDto
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
            append("ProfileAccentColorsDto")
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
