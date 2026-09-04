/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Describes an ephemeral content of a regular message, which must be shown instead of the regular content.
 *
 * @property canBeSaved True, if content of the message can be saved locally.
 * @property hasTimestampedMedia True, if media timestamp entities refers to a media in this message as opposed to a media in the replied message.
 * @property content Content of the message.
 * @property replyMarkup Reply markup for the message; may be null if none.
 */
public class EphemeralMessageContent public constructor(
    public val canBeSaved: Boolean,
    public val hasTimestampedMedia: Boolean,
    public val content: MessageContent,
    public val replyMarkup: ReplyMarkup?,
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
        other as EphemeralMessageContent
        if (other.canBeSaved != canBeSaved) {
            return false
        }
        if (other.hasTimestampedMedia != hasTimestampedMedia) {
            return false
        }
        if (other.content != content) {
            return false
        }
        return other.replyMarkup == replyMarkup
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canBeSaved.hashCode()
        hashCode = 31 * hashCode + hasTimestampedMedia.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EphemeralMessageContent")
            append("(")
            append("canBeSaved=")
            append(canBeSaved)
            append(", ")
            append("hasTimestampedMedia=")
            append(hasTimestampedMedia)
            append(", ")
            append("content=")
            append(content)
            append(", ")
            append("replyMarkup=")
            append(replyMarkup)
            append(")")
        }
    }
}
