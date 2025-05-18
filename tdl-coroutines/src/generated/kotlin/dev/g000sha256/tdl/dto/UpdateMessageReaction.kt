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
import kotlin.Long
import kotlin.String

/**
 * User changed its reactions on a message with public reactions; for bots only.
 *
 * @property chatId Chat identifier.
 * @property messageId Message identifier.
 * @property actorId Identifier of the user or chat that changed reactions.
 * @property date Point in time (Unix timestamp) when the reactions were changed.
 * @property oldReactionTypes Old list of chosen reactions.
 * @property newReactionTypes New list of chosen reactions.
 */
public class UpdateMessageReaction public constructor(
    public val chatId: Long,
    public val messageId: Long,
    public val actorId: MessageSender,
    public val date: Int,
    public val oldReactionTypes: Array<ReactionType>,
    public val newReactionTypes: Array<ReactionType>,
) : Update() {
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
        other as UpdateMessageReaction
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.actorId != actorId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        val oldReactionTypesEquals = other.oldReactionTypes.contentDeepEquals(oldReactionTypes)
        if (!oldReactionTypesEquals) {
            return false
        }
        return other.newReactionTypes.contentDeepEquals(newReactionTypes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + actorId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + oldReactionTypes.contentDeepHashCode()
        hashCode = 31 * hashCode + newReactionTypes.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateMessageReaction")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("actorId=")
            append(actorId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("oldReactionTypes=")
            oldReactionTypes
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("newReactionTypes=")
            newReactionTypes
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
