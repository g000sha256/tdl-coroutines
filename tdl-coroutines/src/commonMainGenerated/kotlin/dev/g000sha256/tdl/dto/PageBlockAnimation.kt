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
 * An animation.
 *
 * @property animation Animation file; may be null.
 * @property caption Animation caption.
 * @property needAutoplay True, if the animation must be played automatically.
 */
public class PageBlockAnimation public constructor(
    public val animation: Animation?,
    public val caption: PageBlockCaption,
    public val needAutoplay: Boolean,
) : PageBlock() {
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
        other as PageBlockAnimation
        if (other.animation != animation) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        return other.needAutoplay == needAutoplay
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + needAutoplay.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockAnimation")
            append("(")
            append("animation=")
            append(animation)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("needAutoplay=")
            append(needAutoplay)
            append(")")
        }
    }
}
