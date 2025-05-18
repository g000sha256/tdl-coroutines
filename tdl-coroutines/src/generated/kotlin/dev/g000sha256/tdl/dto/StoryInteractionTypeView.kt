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
 * A view of the story.
 *
 * @property chosenReactionType Type of the reaction that was chosen by the viewer; may be null if none.
 */
public class StoryInteractionTypeView public constructor(
    public val chosenReactionType: ReactionType?,
) : StoryInteractionType() {
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
        other as StoryInteractionTypeView
        return other.chosenReactionType == chosenReactionType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chosenReactionType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryInteractionTypeView")
            append("(")
            append("chosenReactionType=")
            append(chosenReactionType)
            append(")")
        }
    }
}
