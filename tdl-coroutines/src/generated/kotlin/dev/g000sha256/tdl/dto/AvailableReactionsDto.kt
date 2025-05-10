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
import kotlin.String

/**
 * Represents a list of reactions that can be added to a message.
 *
 * @property topReactions List of reactions to be shown at the top.
 * @property recentReactions List of recently used reactions.
 * @property popularReactions List of popular reactions.
 * @property allowCustomEmoji True, if any custom emoji reaction can be added by Telegram Premium subscribers.
 * @property areTags True, if the reactions will be tags and the message can be found by them.
 * @property unavailabilityReason The reason why the current user can't add reactions to the message, despite some other users can; may be null if none.
 */
public class AvailableReactionsDto public constructor(
    public val topReactions: Array<AvailableReactionDto>,
    public val recentReactions: Array<AvailableReactionDto>,
    public val popularReactions: Array<AvailableReactionDto>,
    public val allowCustomEmoji: Boolean,
    public val areTags: Boolean,
    public val unavailabilityReason: ReactionUnavailabilityReasonDto?,
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
        other as AvailableReactionsDto
        val topReactionsEquals = other.topReactions.contentDeepEquals(topReactions)
        if (!topReactionsEquals) {
            return false
        }
        val recentReactionsEquals = other.recentReactions.contentDeepEquals(recentReactions)
        if (!recentReactionsEquals) {
            return false
        }
        val popularReactionsEquals = other.popularReactions.contentDeepEquals(popularReactions)
        if (!popularReactionsEquals) {
            return false
        }
        if (other.allowCustomEmoji != allowCustomEmoji) {
            return false
        }
        if (other.areTags != areTags) {
            return false
        }
        return other.unavailabilityReason == unavailabilityReason
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + topReactions.contentDeepHashCode()
        hashCode = 31 * hashCode + recentReactions.contentDeepHashCode()
        hashCode = 31 * hashCode + popularReactions.contentDeepHashCode()
        hashCode = 31 * hashCode + allowCustomEmoji.hashCode()
        hashCode = 31 * hashCode + areTags.hashCode()
        hashCode = 31 * hashCode + unavailabilityReason.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AvailableReactionsDto")
            append("(")
            append("topReactions=")
            topReactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("recentReactions=")
            recentReactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("popularReactions=")
            popularReactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("allowCustomEmoji=")
            append(allowCustomEmoji)
            append(", ")
            append("areTags=")
            append(areTags)
            append(", ")
            append("unavailabilityReason=")
            append(unavailabilityReason)
            append(")")
        }
    }
}
