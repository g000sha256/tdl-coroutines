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
 * Describes a storyboard for a video.
 *
 * @property storyboardFile A JPEG file that contains tiled previews of video.
 * @property width Width of a tile.
 * @property height Height of a tile.
 * @property mapFile File that describes mapping of position in the video to a tile in the JPEG file.
 */
public class VideoStoryboard public constructor(
    public val storyboardFile: File,
    public val width: Int,
    public val height: Int,
    public val mapFile: File,
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
        other as VideoStoryboard
        if (other.storyboardFile != storyboardFile) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        return other.mapFile == mapFile
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyboardFile.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + mapFile.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoStoryboard")
            append("(")
            append("storyboardFile=")
            append(storyboardFile)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("mapFile=")
            append(mapFile)
            append(")")
        }
    }
}
