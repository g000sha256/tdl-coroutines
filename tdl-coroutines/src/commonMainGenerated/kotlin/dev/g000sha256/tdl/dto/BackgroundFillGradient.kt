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
 * Describes a gradient fill of a background.
 *
 * @property topColor A top color of the background in the RGB format.
 * @property bottomColor A bottom color of the background in the RGB format.
 * @property rotationAngle Clockwise rotation angle of the gradient, in degrees; 0-359. Must always be divisible by 45.
 */
public class BackgroundFillGradient public constructor(
    public val topColor: Int,
    public val bottomColor: Int,
    public val rotationAngle: Int,
) : BackgroundFill() {
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
        other as BackgroundFillGradient
        if (other.topColor != topColor) {
            return false
        }
        if (other.bottomColor != bottomColor) {
            return false
        }
        return other.rotationAngle == rotationAngle
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + topColor.hashCode()
        hashCode = 31 * hashCode + bottomColor.hashCode()
        hashCode = 31 * hashCode + rotationAngle.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BackgroundFillGradient")
            append("(")
            append("topColor=")
            append(topColor)
            append(", ")
            append("bottomColor=")
            append(bottomColor)
            append(", ")
            append("rotationAngle=")
            append(rotationAngle)
            append(")")
        }
    }
}
