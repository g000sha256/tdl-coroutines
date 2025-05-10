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
 * This class is an abstract base class.
 * Contains information about the origin of a story that was reposted.
 */
public sealed class StoryOriginDto private constructor() {
    /**
     * The original story was a public story that was posted by a known chat.
     *
     * @property chatId Identifier of the chat that posted original story.
     * @property storyId Story identifier of the original story.
     */
    public class PublicStory public constructor(
        public val chatId: Long,
        public val storyId: Int,
    ) : StoryOriginDto() {
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
            other as PublicStory
            if (other.chatId != chatId) {
                return false
            }
            return other.storyId == storyId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryOriginDto.PublicStory")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("storyId=")
                append(storyId)
                append(")")
            }
        }
    }

    /**
     * The original story was posted by an unknown user.
     *
     * @property posterName Name of the user or the chat that posted the story.
     */
    public class HiddenUser public constructor(
        public val posterName: String,
    ) : StoryOriginDto() {
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
            other as HiddenUser
            return other.posterName == posterName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + posterName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryOriginDto.HiddenUser")
                append("(")
                append("posterName=")
                append(posterName)
                append(")")
            }
        }
    }
}
