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
 * Describes a bid in an auction.
 *
 * @property starCount The number of Telegram Stars that were put in the bid.
 * @property bidDate Point in time (Unix timestamp) when the bid was made.
 * @property position Position of the bid in the list of all bids.
 */
public class AuctionBid public constructor(
    public val starCount: Long,
    public val bidDate: Int,
    public val position: Int,
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
        other as AuctionBid
        if (other.starCount != starCount) {
            return false
        }
        if (other.bidDate != bidDate) {
            return false
        }
        return other.position == position
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + bidDate.hashCode()
        hashCode = 31 * hashCode + position.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuctionBid")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("bidDate=")
            append(bidDate)
            append(", ")
            append("position=")
            append(position)
            append(")")
        }
    }
}
