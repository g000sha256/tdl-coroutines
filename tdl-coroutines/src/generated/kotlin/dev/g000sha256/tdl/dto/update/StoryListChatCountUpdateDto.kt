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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.StoryListDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Number of chats in a story list has changed.
 *
 * @property storyList The story list.
 * @property chatCount Approximate total number of chats with active stories in the list.
 */
public class StoryListChatCountUpdateDto public constructor(
    public val storyList: StoryListDto,
    public val chatCount: Int,
) : UpdateDto() {
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
        other as StoryListChatCountUpdateDto
        if (other.storyList != storyList) {
            return false
        }
        return other.chatCount == chatCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyList.hashCode()
        hashCode = 31 * hashCode + chatCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryListChatCountUpdateDto")
            append("(")
            append("storyList=")
            append(storyList)
            append(", ")
            append("chatCount=")
            append(chatCount)
            append(")")
        }
    }
}
