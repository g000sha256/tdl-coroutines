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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * Describes position of a clickable rectangle area on a story media.
 *
 * @property xPercentage The abscissa of the rectangle's center, as a percentage of the media width.
 * @property yPercentage The ordinate of the rectangle's center, as a percentage of the media height.
 * @property widthPercentage The width of the rectangle, as a percentage of the media width.
 * @property heightPercentage The height of the rectangle, as a percentage of the media height.
 * @property rotationAngle Clockwise rotation angle of the rectangle, in degrees; 0-360.
 * @property cornerRadiusPercentage The radius of the rectangle corner rounding, as a percentage of the media width.
 */
public class StoryAreaPosition public constructor(
    public val xPercentage: Double,
    public val yPercentage: Double,
    public val widthPercentage: Double,
    public val heightPercentage: Double,
    public val rotationAngle: Double,
    public val cornerRadiusPercentage: Double,
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
        other as StoryAreaPosition
        if (other.xPercentage != xPercentage) {
            return false
        }
        if (other.yPercentage != yPercentage) {
            return false
        }
        if (other.widthPercentage != widthPercentage) {
            return false
        }
        if (other.heightPercentage != heightPercentage) {
            return false
        }
        if (other.rotationAngle != rotationAngle) {
            return false
        }
        return other.cornerRadiusPercentage == cornerRadiusPercentage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + xPercentage.hashCode()
        hashCode = 31 * hashCode + yPercentage.hashCode()
        hashCode = 31 * hashCode + widthPercentage.hashCode()
        hashCode = 31 * hashCode + heightPercentage.hashCode()
        hashCode = 31 * hashCode + rotationAngle.hashCode()
        hashCode = 31 * hashCode + cornerRadiusPercentage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryAreaPosition")
            append("(")
            append("xPercentage=")
            append(xPercentage)
            append(", ")
            append("yPercentage=")
            append(yPercentage)
            append(", ")
            append("widthPercentage=")
            append(widthPercentage)
            append(", ")
            append("heightPercentage=")
            append(heightPercentage)
            append(", ")
            append("rotationAngle=")
            append(rotationAngle)
            append(", ")
            append("cornerRadiusPercentage=")
            append(cornerRadiusPercentage)
            append(")")
        }
    }
}
