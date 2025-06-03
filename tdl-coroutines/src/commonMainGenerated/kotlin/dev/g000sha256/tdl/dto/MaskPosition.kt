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
 * Position on a photo where a mask is placed.
 *
 * @property point Part of the face, relative to which the mask is placed.
 * @property xShift Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. (For example, -1.0 will place the mask just to the left of the default mask position.)
 * @property yShift Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. (For example, 1.0 will place the mask just below the default mask position.)
 * @property scale Mask scaling coefficient. (For example, 2.0 means a doubled size.)
 */
public class MaskPosition public constructor(
    public val point: MaskPoint,
    public val xShift: Double,
    public val yShift: Double,
    public val scale: Double,
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
        other as MaskPosition
        if (other.point != point) {
            return false
        }
        if (other.xShift != xShift) {
            return false
        }
        if (other.yShift != yShift) {
            return false
        }
        return other.scale == scale
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + point.hashCode()
        hashCode = 31 * hashCode + xShift.hashCode()
        hashCode = 31 * hashCode + yShift.hashCode()
        hashCode = 31 * hashCode + scale.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MaskPosition")
            append("(")
            append("point=")
            append(point)
            append(", ")
            append("xShift=")
            append(xShift)
            append(", ")
            append("yShift=")
            append(yShift)
            append(", ")
            append("scale=")
            append(scale)
            append(")")
        }
    }
}
