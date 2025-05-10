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
import kotlin.IntArray
import kotlin.String

/**
 * Represents a list of stories.
 *
 * @property totalCount Approximate total number of stories found.
 * @property stories The list of stories.
 * @property pinnedStoryIds Identifiers of the pinned stories; returned only in getChatPostedToChatPageStories with fromStoryId == 0.
 */
public class StoriesDto public constructor(
    public val totalCount: Int,
    public val stories: Array<StoryDto>,
    public val pinnedStoryIds: IntArray,
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
        other as StoriesDto
        if (other.totalCount != totalCount) {
            return false
        }
        val storiesEquals = other.stories.contentDeepEquals(stories)
        if (!storiesEquals) {
            return false
        }
        return other.pinnedStoryIds.contentEquals(pinnedStoryIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + stories.contentDeepHashCode()
        hashCode = 31 * hashCode + pinnedStoryIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoriesDto")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("stories=")
            stories
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("pinnedStoryIds=")
            pinnedStoryIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
