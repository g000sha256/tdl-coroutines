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
 * A media timestamp.
 *
 * @property mediaTimestamp Timestamp from which a video/audio/video note/voice note/story playing must start, in seconds. The media can be in the content or the link preview of the current message, or in the same places in the replied message.
 */
public class TextEntityTypeMediaTimestamp public constructor(
    public val mediaTimestamp: Int,
) : TextEntityType() {
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
        other as TextEntityTypeMediaTimestamp
        return other.mediaTimestamp == mediaTimestamp
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + mediaTimestamp.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextEntityTypeMediaTimestamp")
            append("(")
            append("mediaTimestamp=")
            append(mediaTimestamp)
            append(")")
        }
    }
}
