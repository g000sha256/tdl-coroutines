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
import kotlin.LongArray
import kotlin.String

/**
 * Contains information about an ongoing or scheduled auction.
 *
 * @property startDate Point in time (Unix timestamp) when the auction started or will start.
 * @property endDate Point in time (Unix timestamp) when the auction will be ended.
 * @property minBid The minimum possible bid in the auction in Telegram Stars.
 * @property bidLevels A sparse list of bids that were made in the auction.
 * @property topBidderUserIds User identifiers of at most 3 users with the biggest bids.
 * @property rounds Rounds of the auction in which their duration or extension rules are changed.
 * @property currentRoundEndDate Point in time (Unix timestamp) when the current round will end.
 * @property currentRoundNumber 1-based number of the current round.
 * @property totalRoundCount The total number of rounds.
 * @property distributedItemCount The number of items that were purchased on the auction by all users.
 * @property leftItemCount The number of items that have to be distributed on the auction.
 * @property acquiredItemCount The number of items that were purchased by the current user on the auction.
 * @property userBid Bid of the current user in the auction; may be null if none.
 */
public class AuctionStateActive public constructor(
    public val startDate: Int,
    public val endDate: Int,
    public val minBid: Long,
    public val bidLevels: Array<AuctionBid>,
    public val topBidderUserIds: LongArray,
    public val rounds: Array<AuctionRound>,
    public val currentRoundEndDate: Int,
    public val currentRoundNumber: Int,
    public val totalRoundCount: Int,
    public val distributedItemCount: Int,
    public val leftItemCount: Int,
    public val acquiredItemCount: Int,
    public val userBid: UserAuctionBid?,
) : AuctionState() {
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
        other as AuctionStateActive
        if (other.startDate != startDate) {
            return false
        }
        if (other.endDate != endDate) {
            return false
        }
        if (other.minBid != minBid) {
            return false
        }
        val bidLevelsEquals = other.bidLevels.contentDeepEquals(bidLevels)
        if (!bidLevelsEquals) {
            return false
        }
        val topBidderUserIdsEquals = other.topBidderUserIds.contentEquals(topBidderUserIds)
        if (!topBidderUserIdsEquals) {
            return false
        }
        val roundsEquals = other.rounds.contentDeepEquals(rounds)
        if (!roundsEquals) {
            return false
        }
        if (other.currentRoundEndDate != currentRoundEndDate) {
            return false
        }
        if (other.currentRoundNumber != currentRoundNumber) {
            return false
        }
        if (other.totalRoundCount != totalRoundCount) {
            return false
        }
        if (other.distributedItemCount != distributedItemCount) {
            return false
        }
        if (other.leftItemCount != leftItemCount) {
            return false
        }
        if (other.acquiredItemCount != acquiredItemCount) {
            return false
        }
        return other.userBid == userBid
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        hashCode = 31 * hashCode + endDate.hashCode()
        hashCode = 31 * hashCode + minBid.hashCode()
        hashCode = 31 * hashCode + bidLevels.contentDeepHashCode()
        hashCode = 31 * hashCode + topBidderUserIds.contentHashCode()
        hashCode = 31 * hashCode + rounds.contentDeepHashCode()
        hashCode = 31 * hashCode + currentRoundEndDate.hashCode()
        hashCode = 31 * hashCode + currentRoundNumber.hashCode()
        hashCode = 31 * hashCode + totalRoundCount.hashCode()
        hashCode = 31 * hashCode + distributedItemCount.hashCode()
        hashCode = 31 * hashCode + leftItemCount.hashCode()
        hashCode = 31 * hashCode + acquiredItemCount.hashCode()
        hashCode = 31 * hashCode + userBid.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuctionStateActive")
            append("(")
            append("startDate=")
            append(startDate)
            append(", ")
            append("endDate=")
            append(endDate)
            append(", ")
            append("minBid=")
            append(minBid)
            append(", ")
            append("bidLevels=")
            bidLevels
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("topBidderUserIds=")
            topBidderUserIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("rounds=")
            rounds
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("currentRoundEndDate=")
            append(currentRoundEndDate)
            append(", ")
            append("currentRoundNumber=")
            append(currentRoundNumber)
            append(", ")
            append("totalRoundCount=")
            append(totalRoundCount)
            append(", ")
            append("distributedItemCount=")
            append(distributedItemCount)
            append(", ")
            append("leftItemCount=")
            append(leftItemCount)
            append(", ")
            append("acquiredItemCount=")
            append(acquiredItemCount)
            append(", ")
            append("userBid=")
            append(userBid)
            append(")")
        }
    }
}
