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
 * A photo message.
 *
 * @property photo Message content; may be null.
 * @property caption Photo caption.
 * @property isSecret True, if the photo is secret.
 * @property isPinned True, if the message is a pinned message with the specified content.
 */
public class PushMessageContentPhoto public constructor(
    public val photo: Photo?,
    public val caption: String,
    public val isSecret: Boolean,
    public val isPinned: Boolean,
) : PushMessageContent() {
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
        other as PushMessageContentPhoto
        if (other.photo != photo) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.isSecret != isSecret) {
            return false
        }
        return other.isPinned == isPinned
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + isSecret.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PushMessageContentPhoto")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("isSecret=")
            append(isSecret)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(")")
        }
    }
}
