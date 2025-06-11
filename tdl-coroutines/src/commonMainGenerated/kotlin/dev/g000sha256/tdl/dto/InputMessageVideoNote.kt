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
 * @property videoNote Video note to be sent. The video is expected to be encoded to MPEG4 format with H.264 codec and have no data outside of the visible circle.
 * @property thumbnail Video thumbnail; may be null if empty; pass null to skip thumbnail uploading.
 * @property duration Duration of the video, in seconds; 0-60.
 * @property length Video width and height; must be positive and not greater than 640.
 * @property selfDestructType Video note self-destruct type; may be null if none; pass null if none; private chats only.
 */
public class InputMessageVideoNote public constructor(
    public val videoNote: InputFile,
    public val thumbnail: InputThumbnail?,
    public val duration: Int,
    public val length: Int,
    public val selfDestructType: MessageSelfDestructType?,
) : InputMessageContent() {
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
        other as InputMessageVideoNote
        if (other.videoNote != videoNote) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.length != length) {
            return false
        }
        return other.selfDestructType == selfDestructType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + videoNote.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + length.hashCode()
        hashCode = 31 * hashCode + selfDestructType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageVideoNote")
            append("(")
            append("videoNote=")
            append(videoNote)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("length=")
            append(length)
            append(", ")
            append("selfDestructType=")
            append(selfDestructType)
            append(")")
        }
    }
}
