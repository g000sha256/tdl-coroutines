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
 * The link is a link to a live story. Call searchPublicChat with the given chat username, then getChatActiveStories to get active stories in the chat, then find a live story among active stories of the chat, and then joinLiveStory to join the live story.
 *
 * @property storyPosterUsername Username of the poster of the story.
 */
public class InternalLinkTypeLiveStory public constructor(
    public val storyPosterUsername: String,
) : InternalLinkType() {
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
        other as InternalLinkTypeLiveStory
        return other.storyPosterUsername == storyPosterUsername
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyPosterUsername.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeLiveStory")
            append("(")
            append("storyPosterUsername=")
            append(storyPosterUsername)
            append(")")
        }
    }
}
