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
 * The link is a link to a live story group call.
 *
 * @property storyPosterChatId The identifier of the chat that posted the story.
 * @property storyId Story identifier.
 */
public class LinkPreviewTypeLiveStory public constructor(
    public val storyPosterChatId: Long,
    public val storyId: Int,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeLiveStory
        if (other.storyPosterChatId != storyPosterChatId) {
            return false
        }
        return other.storyId == storyId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyPosterChatId.hashCode()
        hashCode = 31 * hashCode + storyId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeLiveStory")
            append("(")
            append("storyPosterChatId=")
            append(storyPosterChatId)
            append(", ")
            append("storyId=")
            append(storyId)
            append(")")
        }
    }
}
