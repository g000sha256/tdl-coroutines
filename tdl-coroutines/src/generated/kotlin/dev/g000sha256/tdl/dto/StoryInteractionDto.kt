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
 * Represents interaction with a story.
 *
 * @property actorId Identifier of the user or chat that made the interaction.
 * @property interactionDate Approximate point in time (Unix timestamp) when the interaction happened.
 * @property blockList Block list to which the actor is added; may be null if none or for chat stories.
 * @property type Type of the interaction.
 */
public class StoryInteractionDto public constructor(
    public val actorId: MessageSenderDto,
    public val interactionDate: Int,
    public val blockList: BlockListDto?,
    public val type: StoryInteractionTypeDto,
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
        other as StoryInteractionDto
        if (other.actorId != actorId) {
            return false
        }
        if (other.interactionDate != interactionDate) {
            return false
        }
        if (other.blockList != blockList) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + actorId.hashCode()
        hashCode = 31 * hashCode + interactionDate.hashCode()
        hashCode = 31 * hashCode + blockList.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryInteractionDto")
            append("(")
            append("actorId=")
            append(actorId)
            append(", ")
            append("interactionDate=")
            append(interactionDate)
            append(", ")
            append("blockList=")
            append(blockList)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
