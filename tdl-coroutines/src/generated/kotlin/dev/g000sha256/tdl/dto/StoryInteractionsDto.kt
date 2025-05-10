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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents a list of interactions with a story.
 *
 * @property totalCount Approximate total number of interactions found.
 * @property totalForwardCount Approximate total number of found forwards and reposts; always 0 for chat stories.
 * @property totalReactionCount Approximate total number of found reactions; always 0 for chat stories.
 * @property interactions List of story interactions.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class StoryInteractionsDto public constructor(
    public val totalCount: Int,
    public val totalForwardCount: Int,
    public val totalReactionCount: Int,
    public val interactions: Array<StoryInteractionDto>,
    public val nextOffset: String,
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
        other as StoryInteractionsDto
        if (other.totalCount != totalCount) {
            return false
        }
        if (other.totalForwardCount != totalForwardCount) {
            return false
        }
        if (other.totalReactionCount != totalReactionCount) {
            return false
        }
        val interactionsEquals = other.interactions.contentDeepEquals(interactions)
        if (!interactionsEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + totalForwardCount.hashCode()
        hashCode = 31 * hashCode + totalReactionCount.hashCode()
        hashCode = 31 * hashCode + interactions.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryInteractionsDto")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("totalForwardCount=")
            append(totalForwardCount)
            append(", ")
            append("totalReactionCount=")
            append(totalReactionCount)
            append(", ")
            append("interactions=")
            interactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
