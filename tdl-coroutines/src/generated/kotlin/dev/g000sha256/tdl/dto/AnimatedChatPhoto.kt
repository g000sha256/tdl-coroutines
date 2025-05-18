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
 * Animated variant of a chat photo in MPEG4 format.
 *
 * @property length Animation width and height.
 * @property file Information about the animation file.
 * @property mainFrameTimestamp Timestamp of the frame, used as a static chat photo.
 */
public class AnimatedChatPhoto public constructor(
    public val length: Int,
    public val file: File,
    public val mainFrameTimestamp: Double,
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
        other as AnimatedChatPhoto
        if (other.length != length) {
            return false
        }
        if (other.file != file) {
            return false
        }
        return other.mainFrameTimestamp == mainFrameTimestamp
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + length.hashCode()
        hashCode = 31 * hashCode + file.hashCode()
        hashCode = 31 * hashCode + mainFrameTimestamp.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AnimatedChatPhoto")
            append("(")
            append("length=")
            append(length)
            append(", ")
            append("file=")
            append(file)
            append(", ")
            append("mainFrameTimestamp=")
            append(mainFrameTimestamp)
            append(")")
        }
    }
}
