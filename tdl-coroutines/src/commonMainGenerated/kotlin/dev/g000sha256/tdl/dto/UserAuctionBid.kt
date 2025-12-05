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
 * Describes a bid of the current user in an auction.
 *
 * @property starCount The number of Telegram Stars that were put in the bid.
 * @property bidDate Point in time (Unix timestamp) when the bid was made.
 * @property nextBidStarCount The minimum number of Telegram Stars that can be put for the next bid.
 * @property ownerId Identifier of the user or the chat that will receive the auctioned item. If the auction is opened in context of another user or chat, then a warning is supposed to be shown to the current user.
 * @property wasReturned True, if the bid was returned to the user, because it was outbid and can't win anymore.
 */
public class UserAuctionBid public constructor(
    public val starCount: Long,
    public val bidDate: Int,
    public val nextBidStarCount: Long,
    public val ownerId: MessageSender,
    public val wasReturned: Boolean,
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
        other as UserAuctionBid
        if (other.starCount != starCount) {
            return false
        }
        if (other.bidDate != bidDate) {
            return false
        }
        if (other.nextBidStarCount != nextBidStarCount) {
            return false
        }
        if (other.ownerId != ownerId) {
            return false
        }
        return other.wasReturned == wasReturned
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + bidDate.hashCode()
        hashCode = 31 * hashCode + nextBidStarCount.hashCode()
        hashCode = 31 * hashCode + ownerId.hashCode()
        hashCode = 31 * hashCode + wasReturned.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserAuctionBid")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("bidDate=")
            append(bidDate)
            append(", ")
            append("nextBidStarCount=")
            append(nextBidStarCount)
            append(", ")
            append("ownerId=")
            append(ownerId)
            append(", ")
            append("wasReturned=")
            append(wasReturned)
            append(")")
        }
    }
}
