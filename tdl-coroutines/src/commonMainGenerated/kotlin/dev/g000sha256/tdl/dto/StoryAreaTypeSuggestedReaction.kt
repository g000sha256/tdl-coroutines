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
 * An area pointing to a suggested reaction. App needs to show a clickable reaction on the area and call setStoryReaction when the are is clicked.
 *
 * @property reactionType Type of the reaction.
 * @property totalCount Number of times the reaction was added.
 * @property isDark True, if reaction has a dark background.
 * @property isFlipped True, if reaction corner is flipped.
 */
public class StoryAreaTypeSuggestedReaction public constructor(
    public val reactionType: ReactionType,
    public val totalCount: Int,
    public val isDark: Boolean,
    public val isFlipped: Boolean,
) : StoryAreaType() {
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
        other as StoryAreaTypeSuggestedReaction
        if (other.reactionType != reactionType) {
            return false
        }
        if (other.totalCount != totalCount) {
            return false
        }
        if (other.isDark != isDark) {
            return false
        }
        return other.isFlipped == isFlipped
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + reactionType.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + isDark.hashCode()
        hashCode = 31 * hashCode + isFlipped.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryAreaTypeSuggestedReaction")
            append("(")
            append("reactionType=")
            append(reactionType)
            append(", ")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("isDark=")
            append(isDark)
            append(", ")
            append("isFlipped=")
            append(isFlipped)
            append(")")
        }
    }
}
