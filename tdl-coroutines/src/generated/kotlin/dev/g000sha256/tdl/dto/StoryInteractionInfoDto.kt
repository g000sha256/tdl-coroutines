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
import kotlin.LongArray
import kotlin.String

/**
 * Contains information about interactions with a story.
 *
 * @property viewCount Number of times the story was viewed.
 * @property forwardCount Number of times the story was forwarded; 0 if none or unknown.
 * @property reactionCount Number of reactions added to the story; 0 if none or unknown.
 * @property recentViewerUserIds Identifiers of at most 3 recent viewers of the story.
 */
public class StoryInteractionInfoDto public constructor(
    public val viewCount: Int,
    public val forwardCount: Int,
    public val reactionCount: Int,
    public val recentViewerUserIds: LongArray,
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
        other as StoryInteractionInfoDto
        if (other.viewCount != viewCount) {
            return false
        }
        if (other.forwardCount != forwardCount) {
            return false
        }
        if (other.reactionCount != reactionCount) {
            return false
        }
        return other.recentViewerUserIds.contentEquals(recentViewerUserIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + viewCount.hashCode()
        hashCode = 31 * hashCode + forwardCount.hashCode()
        hashCode = 31 * hashCode + reactionCount.hashCode()
        hashCode = 31 * hashCode + recentViewerUserIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryInteractionInfoDto")
            append("(")
            append("viewCount=")
            append(viewCount)
            append(", ")
            append("forwardCount=")
            append(forwardCount)
            append(", ")
            append("reactionCount=")
            append(reactionCount)
            append(", ")
            append("recentViewerUserIds=")
            recentViewerUserIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
