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
 * Contains basic information about a story.
 *
 * @property storyId Unique story identifier among stories of the chat.
 * @property date Point in time (Unix timestamp) when the story was published.
 * @property isForCloseFriends True, if the story is available only to close friends.
 * @property isLive True, if the story is a live story.
 */
public class StoryInfo public constructor(
    public val storyId: Int,
    public val date: Int,
    public val isForCloseFriends: Boolean,
    public val isLive: Boolean,
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
        other as StoryInfo
        if (other.storyId != storyId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.isForCloseFriends != isForCloseFriends) {
            return false
        }
        return other.isLive == isLive
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + isForCloseFriends.hashCode()
        hashCode = 31 * hashCode + isLive.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryInfo")
            append("(")
            append("storyId=")
            append(storyId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("isForCloseFriends=")
            append(isForCloseFriends)
            append(", ")
            append("isLive=")
            append(isLive)
            append(")")
        }
    }
}
