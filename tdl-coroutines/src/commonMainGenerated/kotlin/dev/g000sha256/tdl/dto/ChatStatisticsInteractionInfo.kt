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
 * Contains statistics about interactions with a message sent in the chat or a story posted on behalf of the chat.
 *
 * @property objectType Type of the object.
 * @property viewCount Number of times the object was viewed.
 * @property forwardCount Number of times the object was forwarded.
 * @property reactionCount Number of times reactions were added to the object.
 */
public class ChatStatisticsInteractionInfo public constructor(
    public val objectType: ChatStatisticsObjectType,
    public val viewCount: Int,
    public val forwardCount: Int,
    public val reactionCount: Int,
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
        other as ChatStatisticsInteractionInfo
        if (other.objectType != objectType) {
            return false
        }
        if (other.viewCount != viewCount) {
            return false
        }
        if (other.forwardCount != forwardCount) {
            return false
        }
        return other.reactionCount == reactionCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + objectType.hashCode()
        hashCode = 31 * hashCode + viewCount.hashCode()
        hashCode = 31 * hashCode + forwardCount.hashCode()
        hashCode = 31 * hashCode + reactionCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatStatisticsInteractionInfo")
            append("(")
            append("objectType=")
            append(objectType)
            append(", ")
            append("viewCount=")
            append(viewCount)
            append(", ")
            append("forwardCount=")
            append(forwardCount)
            append(", ")
            append("reactionCount=")
            append(reactionCount)
            append(")")
        }
    }
}
