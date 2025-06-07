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
import kotlin.LongArray
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A giveaway with public winners has been completed for the chat.
 *
 * @property boostedChatId Identifier of the supergroup or channel chat, which was automatically boosted by the winners of the giveaway.
 * @property giveawayMessageId Identifier of the message with the giveaway in the boosted chat.
 * @property additionalChatCount Number of other chats that participated in the giveaway.
 * @property actualWinnersSelectionDate Point in time (Unix timestamp) when the winners were selected. May be bigger than winners selection date specified in parameters of the giveaway.
 * @property onlyNewMembers True, if only new members of the chats were eligible for the giveaway.
 * @property wasRefunded True, if the giveaway was canceled and was fully refunded.
 * @property prize Prize of the giveaway.
 * @property prizeDescription Additional description of the giveaway prize.
 * @property winnerCount Total number of winners in the giveaway.
 * @property winnerUserIds Up to 100 user identifiers of the winners of the giveaway.
 * @property unclaimedPrizeCount Number of undistributed prizes; for Telegram Premium giveaways only.
 */
@SerialName(value = "messageGiveawayWinners")
@Serializable
public class MessageGiveawayWinners public constructor(
    @SerialName(value = "boosted_chat_id")
    public val boostedChatId: Long,
    @SerialName(value = "giveaway_message_id")
    public val giveawayMessageId: Long,
    @SerialName(value = "additional_chat_count")
    public val additionalChatCount: Int,
    @SerialName(value = "actual_winners_selection_date")
    public val actualWinnersSelectionDate: Int,
    @SerialName(value = "only_new_members")
    public val onlyNewMembers: Boolean,
    @SerialName(value = "was_refunded")
    public val wasRefunded: Boolean,
    @SerialName(value = "prize")
    public val prize: GiveawayPrize,
    @SerialName(value = "prize_description")
    public val prizeDescription: String,
    @SerialName(value = "winner_count")
    public val winnerCount: Int,
    @SerialName(value = "winner_user_ids")
    public val winnerUserIds: LongArray,
    @SerialName(value = "unclaimed_prize_count")
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
        other as MessageGiveawayWinners
        if (other.boostedChatId != boostedChatId) {
            return false
        }
        if (other.giveawayMessageId != giveawayMessageId) {
            return false
        }
        if (other.additionalChatCount != additionalChatCount) {
            return false
        }
        if (other.actualWinnersSelectionDate != actualWinnersSelectionDate) {
            return false
        }
        if (other.onlyNewMembers != onlyNewMembers) {
            return false
        }
        if (other.wasRefunded != wasRefunded) {
            return false
        }
        if (other.prize != prize) {
            return false
        }
        if (other.prizeDescription != prizeDescription) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        val winnerUserIdsEquals = other.winnerUserIds.contentEquals(winnerUserIds)
        if (!winnerUserIdsEquals) {
            return false
        }
        return other.unclaimedPrizeCount == unclaimedPrizeCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + boostedChatId.hashCode()
        hashCode = 31 * hashCode + giveawayMessageId.hashCode()
        hashCode = 31 * hashCode + additionalChatCount.hashCode()
        hashCode = 31 * hashCode + actualWinnersSelectionDate.hashCode()
        hashCode = 31 * hashCode + onlyNewMembers.hashCode()
        hashCode = 31 * hashCode + wasRefunded.hashCode()
        hashCode = 31 * hashCode + prize.hashCode()
        hashCode = 31 * hashCode + prizeDescription.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + winnerUserIds.contentHashCode()
        hashCode = 31 * hashCode + unclaimedPrizeCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiveawayWinners")
            append("(")
            append("boostedChatId=")
            append(boostedChatId)
            append(", ")
            append("giveawayMessageId=")
            append(giveawayMessageId)
            append(", ")
            append("additionalChatCount=")
            append(additionalChatCount)
            append(", ")
            append("actualWinnersSelectionDate=")
            append(actualWinnersSelectionDate)
            append(", ")
            append("onlyNewMembers=")
            append(onlyNewMembers)
            append(", ")
            append("wasRefunded=")
            append(wasRefunded)
            append(", ")
            append("prize=")
            append(prize)
            append(", ")
            append("prizeDescription=")
            append(prizeDescription)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("winnerUserIds=")
            winnerUserIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("unclaimedPrizeCount=")
            append(unclaimedPrizeCount)
            append(")")
        }
    }
}
