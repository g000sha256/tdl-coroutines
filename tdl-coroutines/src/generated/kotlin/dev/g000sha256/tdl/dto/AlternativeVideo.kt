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
import kotlin.Long
import kotlin.String

/**
 * Describes an alternative re-encoded quality of a video file.
 *
 * @property id Unique identifier of the alternative video, which is used in the HLS file.
 * @property width Video width.
 * @property height Video height.
 * @property codec Codec used for video file encoding, for example, &quot;h264&quot;, &quot;h265&quot;, or &quot;av1&quot;.
 * @property hlsFile HLS file describing the video.
 * @property video File containing the video.
 */
public class AlternativeVideo public constructor(
    public val id: Long,
    public val width: Int,
    public val height: Int,
    public val codec: String,
    public val hlsFile: File,
    public val video: File,
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
        other as AlternativeVideo
        if (other.id != id) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.codec != codec) {
            return false
        }
        if (other.hlsFile != hlsFile) {
            return false
        }
        return other.video == video
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + codec.hashCode()
        hashCode = 31 * hashCode + hlsFile.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AlternativeVideo")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("codec=")
            append(codec)
            append(", ")
            append("hlsFile=")
            append(hlsFile)
            append(", ")
            append("video=")
            append(video)
            append(")")
        }
    }
}
