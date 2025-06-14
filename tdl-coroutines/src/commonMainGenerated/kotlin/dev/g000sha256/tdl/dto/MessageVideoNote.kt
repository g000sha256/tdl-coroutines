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
 * A video note message.
 *
 * @property videoNote The video note description.
 * @property isViewed True, if at least one of the recipients has viewed the video note.
 * @property isSecret True, if the video note thumbnail must be blurred and the video note must be shown only while tapped.
 */
public class MessageVideoNote public constructor(
    public val videoNote: VideoNote,
    public val isViewed: Boolean,
    public val isSecret: Boolean,
) : MessageContent() {
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
        other as MessageVideoNote
        if (other.videoNote != videoNote) {
            return false
        }
        if (other.isViewed != isViewed) {
            return false
        }
        return other.isSecret == isSecret
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + videoNote.hashCode()
        hashCode = 31 * hashCode + isViewed.hashCode()
        hashCode = 31 * hashCode + isSecret.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageVideoNote")
            append("(")
            append("videoNote=")
            append(videoNote)
            append(", ")
            append("isViewed=")
            append(isViewed)
            append(", ")
            append("isSecret=")
            append(isSecret)
            append(")")
        }
    }
}
