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
 * A giveaway without public winners has been completed for the chat.
 *
 * @property giveawayMessageId Identifier of the message with the giveaway; can be 0 if the message was deleted.
 * @property winnerCount Number of winners in the giveaway.
 * @property isStarGiveaway True, if the giveaway is a Telegram Star giveaway.
 * @property unclaimedPrizeCount Number of undistributed prizes; for Telegram Premium giveaways only.
 */
public class MessageGiveawayCompleted public constructor(
    public val giveawayMessageId: Long,
    public val winnerCount: Int,
    public val isStarGiveaway: Boolean,
    public val unclaimedPrizeCount: Int,
) : MessageContent() {
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
        other as MessageGiveawayCompleted
        if (other.giveawayMessageId != giveawayMessageId) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.isStarGiveaway != isStarGiveaway) {
            return false
        }
        return other.unclaimedPrizeCount == unclaimedPrizeCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + giveawayMessageId.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + isStarGiveaway.hashCode()
        hashCode = 31 * hashCode + unclaimedPrizeCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiveawayCompleted")
            append("(")
            append("giveawayMessageId=")
            append(giveawayMessageId)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("isStarGiveaway=")
            append(isStarGiveaway)
            append(", ")
            append("unclaimedPrizeCount=")
            append(unclaimedPrizeCount)
            append(")")
        }
    }
}
