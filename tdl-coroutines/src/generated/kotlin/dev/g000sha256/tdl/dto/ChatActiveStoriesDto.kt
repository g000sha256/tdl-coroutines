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
import kotlin.Long
import kotlin.String

/**
 * Describes active stories posted by a chat.
 *
 * @property chatId Identifier of the chat that posted the stories.
 * @property list Identifier of the story list in which the stories are shown; may be null if the stories aren't shown in a story list.
 * @property order A parameter used to determine order of the stories in the story list; 0 if the stories doesn't need to be shown in the story list. Stories must be sorted by the pair (order, storyPosterChatId) in descending order.
 * @property maxReadStoryId Identifier of the last read active story.
 * @property stories Basic information about the stories; use getStory to get full information about the stories. The stories are in chronological order (i.e., in order of increasing story identifiers).
 */
public class ChatActiveStoriesDto public constructor(
    public val chatId: Long,
    public val list: StoryListDto?,
    public val order: Long,
    public val maxReadStoryId: Int,
    public val stories: Array<StoryInfoDto>,
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
        other as ChatActiveStoriesDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.list != list) {
            return false
        }
        if (other.order != order) {
            return false
        }
        if (other.maxReadStoryId != maxReadStoryId) {
            return false
        }
        return other.stories.contentDeepEquals(stories)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + list.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        hashCode = 31 * hashCode + maxReadStoryId.hashCode()
        hashCode = 31 * hashCode + stories.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatActiveStoriesDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("list=")
            append(list)
            append(", ")
            append("order=")
            append(order)
            append(", ")
            append("maxReadStoryId=")
            append(maxReadStoryId)
            append(", ")
            append("stories=")
            stories
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
