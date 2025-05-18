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
 * Contains parameters of the application theme.
 *
 * @property backgroundColor A color of the background in the RGB format.
 * @property secondaryBackgroundColor A secondary color for the background in the RGB format.
 * @property headerBackgroundColor A color of the header background in the RGB format.
 * @property bottomBarBackgroundColor A color of the bottom bar background in the RGB format.
 * @property sectionBackgroundColor A color of the section background in the RGB format.
 * @property sectionSeparatorColor A color of the section separator in the RGB format.
 * @property textColor A color of text in the RGB format.
 * @property accentTextColor An accent color of the text in the RGB format.
 * @property sectionHeaderTextColor A color of text on the section headers in the RGB format.
 * @property subtitleTextColor A color of the subtitle text in the RGB format.
 * @property destructiveTextColor A color of the text for destructive actions in the RGB format.
 * @property hintColor A color of hints in the RGB format.
 * @property linkColor A color of links in the RGB format.
 * @property buttonColor A color of the buttons in the RGB format.
 * @property buttonTextColor A color of text on the buttons in the RGB format.
 */
public class ThemeParameters public constructor(
    public val backgroundColor: Int,
    public val secondaryBackgroundColor: Int,
    public val headerBackgroundColor: Int,
    public val bottomBarBackgroundColor: Int,
    public val sectionBackgroundColor: Int,
    public val sectionSeparatorColor: Int,
    public val textColor: Int,
    public val accentTextColor: Int,
    public val sectionHeaderTextColor: Int,
    public val subtitleTextColor: Int,
    public val destructiveTextColor: Int,
    public val hintColor: Int,
    public val linkColor: Int,
    public val buttonColor: Int,
    public val buttonTextColor: Int,
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
        other as ThemeParameters
        if (other.backgroundColor != backgroundColor) {
            return false
        }
        if (other.secondaryBackgroundColor != secondaryBackgroundColor) {
            return false
        }
        if (other.headerBackgroundColor != headerBackgroundColor) {
            return false
        }
        if (other.bottomBarBackgroundColor != bottomBarBackgroundColor) {
            return false
        }
        if (other.sectionBackgroundColor != sectionBackgroundColor) {
            return false
        }
        if (other.sectionSeparatorColor != sectionSeparatorColor) {
            return false
        }
        if (other.textColor != textColor) {
            return false
        }
        if (other.accentTextColor != accentTextColor) {
            return false
        }
        if (other.sectionHeaderTextColor != sectionHeaderTextColor) {
            return false
        }
        if (other.subtitleTextColor != subtitleTextColor) {
            return false
        }
        if (other.destructiveTextColor != destructiveTextColor) {
            return false
        }
        if (other.hintColor != hintColor) {
            return false
        }
        if (other.linkColor != linkColor) {
            return false
        }
        if (other.buttonColor != buttonColor) {
            return false
        }
        return other.buttonTextColor == buttonTextColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + backgroundColor.hashCode()
        hashCode = 31 * hashCode + secondaryBackgroundColor.hashCode()
        hashCode = 31 * hashCode + headerBackgroundColor.hashCode()
        hashCode = 31 * hashCode + bottomBarBackgroundColor.hashCode()
        hashCode = 31 * hashCode + sectionBackgroundColor.hashCode()
        hashCode = 31 * hashCode + sectionSeparatorColor.hashCode()
        hashCode = 31 * hashCode + textColor.hashCode()
        hashCode = 31 * hashCode + accentTextColor.hashCode()
        hashCode = 31 * hashCode + sectionHeaderTextColor.hashCode()
        hashCode = 31 * hashCode + subtitleTextColor.hashCode()
        hashCode = 31 * hashCode + destructiveTextColor.hashCode()
        hashCode = 31 * hashCode + hintColor.hashCode()
        hashCode = 31 * hashCode + linkColor.hashCode()
        hashCode = 31 * hashCode + buttonColor.hashCode()
        hashCode = 31 * hashCode + buttonTextColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ThemeParameters")
            append("(")
            append("backgroundColor=")
            append(backgroundColor)
            append(", ")
            append("secondaryBackgroundColor=")
            append(secondaryBackgroundColor)
            append(", ")
            append("headerBackgroundColor=")
            append(headerBackgroundColor)
            append(", ")
            append("bottomBarBackgroundColor=")
            append(bottomBarBackgroundColor)
            append(", ")
            append("sectionBackgroundColor=")
            append(sectionBackgroundColor)
            append(", ")
            append("sectionSeparatorColor=")
            append(sectionSeparatorColor)
            append(", ")
            append("textColor=")
            append(textColor)
            append(", ")
            append("accentTextColor=")
            append(accentTextColor)
            append(", ")
            append("sectionHeaderTextColor=")
            append(sectionHeaderTextColor)
            append(", ")
            append("subtitleTextColor=")
            append(subtitleTextColor)
            append(", ")
            append("destructiveTextColor=")
            append(destructiveTextColor)
            append(", ")
            append("hintColor=")
            append(hintColor)
            append(", ")
            append("linkColor=")
            append(linkColor)
            append(", ")
            append("buttonColor=")
            append(buttonColor)
            append(", ")
            append("buttonTextColor=")
            append(buttonTextColor)
            append(")")
        }
    }
}
