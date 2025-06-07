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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about a reaction to a message.
 *
 * @property type Type of the reaction.
 * @property totalCount Number of times the reaction was added.
 * @property isChosen True, if the reaction is chosen by the current user.
 * @property usedSenderId Identifier of the message sender used by the current user to add the reaction; may be null if unknown or the reaction isn't chosen.
 * @property recentSenderIds Identifiers of at most 3 recent message senders, added the reaction; available in private, basic group and supergroup chats.
 */
@SerialName(value = "messageReaction")
@Serializable
public class MessageReaction public constructor(
    @SerialName(value = "type")
    public val type: ReactionType,
    @SerialName(value = "total_count")
    public val totalCount: Int,
    @SerialName(value = "is_chosen")
    public val isChosen: Boolean,
    @SerialName(value = "used_sender_id")
    public val usedSenderId: MessageSender?,
    @SerialName(value = "recent_sender_ids")
    public val recentSenderIds: Array<MessageSender>,
) : Model() {
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
        other as MessageReaction
        if (other.type != type) {
            return false
        }
        if (other.totalCount != totalCount) {
            return false
        }
        if (other.isChosen != isChosen) {
            return false
        }
        if (other.usedSenderId != usedSenderId) {
            return false
        }
        return other.recentSenderIds.contentDeepEquals(recentSenderIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + isChosen.hashCode()
        hashCode = 31 * hashCode + usedSenderId.hashCode()
        hashCode = 31 * hashCode + recentSenderIds.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageReaction")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("isChosen=")
            append(isChosen)
            append(", ")
            append("usedSenderId=")
            append(usedSenderId)
            append(", ")
            append("recentSenderIds=")
            recentSenderIds
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
