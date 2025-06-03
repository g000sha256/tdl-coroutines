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
 * The link is a link to an animation player.
 *
 * @property url URL of the external animation player.
 * @property thumbnail Thumbnail of the animation; may be null if unknown.
 * @property duration Duration of the animation, in seconds.
 * @property width Expected width of the embedded player.
 * @property height Expected height of the embedded player.
 */
public class LinkPreviewTypeEmbeddedAnimationPlayer public constructor(
    public val url: String,
    public val thumbnail: Photo?,
    public val duration: Int,
    public val width: Int,
    public val height: Int,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeEmbeddedAnimationPlayer
        if (other.url != url) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.width != width) {
            return false
        }
        return other.height == height
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeEmbeddedAnimationPlayer")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(")")
        }
    }
}
