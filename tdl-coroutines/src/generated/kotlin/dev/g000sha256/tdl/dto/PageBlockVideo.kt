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
 * A video.
 *
 * @property video Video file; may be null.
 * @property caption Video caption.
 * @property needAutoplay True, if the video must be played automatically.
 * @property isLooped True, if the video must be looped.
 */
public class PageBlockVideo public constructor(
    public val video: Video?,
    public val caption: PageBlockCaption,
    public val needAutoplay: Boolean,
    public val isLooped: Boolean,
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
        other as PageBlockVideo
        if (other.video != video) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.needAutoplay != needAutoplay) {
            return false
        }
        return other.isLooped == isLooped
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + needAutoplay.hashCode()
        hashCode = 31 * hashCode + isLooped.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockVideo")
            append("(")
            append("video=")
            append(video)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("needAutoplay=")
            append(needAutoplay)
            append(", ")
            append("isLooped=")
            append(isLooped)
            append(")")
        }
    }
}
