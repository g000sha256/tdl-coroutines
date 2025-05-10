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
 * Describes a forum topic icon.
 *
 * @property color Color of the topic icon in RGB format.
 * @property customEmojiId Unique identifier of the custom emoji shown on the topic icon; 0 if none.
 */
public class ForumTopicIconDto public constructor(
    public val color: Int,
    public val customEmojiId: Long,
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
        other as ForumTopicIconDto
        if (other.color != color) {
            return false
        }
        return other.customEmojiId == customEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + color.hashCode()
        hashCode = 31 * hashCode + customEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ForumTopicIconDto")
            append("(")
            append("color=")
            append(color)
            append(", ")
            append("customEmojiId=")
            append(customEmojiId)
            append(")")
        }
    }
}
