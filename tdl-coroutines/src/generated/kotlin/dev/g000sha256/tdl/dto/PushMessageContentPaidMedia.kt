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
 * A message with paid media.
 *
 * @property starCount Number of Telegram Stars needed to buy access to the media in the message; 0 for pinned message.
 * @property isPinned True, if the message is a pinned message with the specified content.
 */
public class PushMessageContentPaidMedia public constructor(
    public val starCount: Long,
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
        other as PushMessageContentPaidMedia
        if (other.starCount != starCount) {
            return false
        }
        return other.isPinned == isPinned
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PushMessageContentPaidMedia")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(")")
        }
    }
}
