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
 * A wallpaper in JPEG format.
 *
 * @property isBlurred True, if the wallpaper must be downscaled to fit in 450x450 square and then box-blurred with radius 12.
 * @property isMoving True, if the background needs to be slightly moved when device is tilted.
 */
public class BackgroundTypeWallpaper public constructor(
    public val isBlurred: Boolean,
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
        other as BackgroundTypeWallpaper
        if (other.isBlurred != isBlurred) {
            return false
        }
        return other.isMoving == isMoving
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isBlurred.hashCode()
        hashCode = 31 * hashCode + isMoving.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BackgroundTypeWallpaper")
            append("(")
            append("isBlurred=")
            append(isBlurred)
            append(", ")
            append("isMoving=")
            append(isMoving)
            append(")")
        }
    }
}
