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
 * A PNG or TGV (gzipped subset of SVG with MIME type &quot;application/x-tgwallpattern&quot;) pattern to be combined with the background fill chosen by the user.
 *
 * @property fill Fill of the background.
 * @property intensity Intensity of the pattern when it is shown above the filled background; 0-100.
 * @property isInverted True, if the background fill must be applied only to the pattern itself. All other pixels are black in this case. For dark themes only.
 * @property isMoving True, if the background needs to be slightly moved when device is tilted.
 */
public class BackgroundTypePattern public constructor(
    public val fill: BackgroundFill,
    public val intensity: Int,
    public val isInverted: Boolean,
    public val isMoving: Boolean,
) : BackgroundType() {
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
        other as BackgroundTypePattern
        if (other.fill != fill) {
            return false
        }
        if (other.intensity != intensity) {
            return false
        }
        if (other.isInverted != isInverted) {
            return false
        }
        return other.isMoving == isMoving
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fill.hashCode()
        hashCode = 31 * hashCode + intensity.hashCode()
        hashCode = 31 * hashCode + isInverted.hashCode()
        hashCode = 31 * hashCode + isMoving.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BackgroundTypePattern")
            append("(")
            append("fill=")
            append(fill)
            append(", ")
            append("intensity=")
            append(intensity)
            append(", ")
            append("isInverted=")
            append(isInverted)
            append(", ")
            append("isMoving=")
            append(isMoving)
            append(")")
        }
    }
}
