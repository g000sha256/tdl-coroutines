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
 * Contains a list of reactions added to a message.
 *
 * @property reactions List of added reactions.
 * @property areTags True, if the reactions are tags and Telegram Premium users can filter messages by them.
 * @property paidReactors Information about top users that added the paid reaction.
 * @property canGetAddedReactions True, if the list of added reactions is available using getMessageAddedReactions.
 */
public class MessageReactionsDto public constructor(
    public val reactions: Array<MessageReactionDto>,
    public val areTags: Boolean,
    public val paidReactors: Array<PaidReactorDto>,
    public val canGetAddedReactions: Boolean,
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
        other as MessageReactionsDto
        val reactionsEquals = other.reactions.contentDeepEquals(reactions)
        if (!reactionsEquals) {
            return false
        }
        if (other.areTags != areTags) {
            return false
        }
        val paidReactorsEquals = other.paidReactors.contentDeepEquals(paidReactors)
        if (!paidReactorsEquals) {
            return false
        }
        return other.canGetAddedReactions == canGetAddedReactions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + reactions.contentDeepHashCode()
        hashCode = 31 * hashCode + areTags.hashCode()
        hashCode = 31 * hashCode + paidReactors.contentDeepHashCode()
        hashCode = 31 * hashCode + canGetAddedReactions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageReactionsDto")
            append("(")
            append("reactions=")
            reactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("areTags=")
            append(areTags)
            append(", ")
            append("paidReactors=")
            paidReactors
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("canGetAddedReactions=")
            append(canGetAddedReactions)
            append(")")
        }
    }
}
