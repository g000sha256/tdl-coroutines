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
 * Contains information about a finished auction.
 *
 * @property startDate Point in time (Unix timestamp) when the auction started.
 * @property endDate Point in time (Unix timestamp) when the auction will be ended.
 * @property averagePrice Average price of bought items in Telegram Stars.
 * @property acquiredItemCount The number of items that were purchased by the current user on the auciton.
 */
public class AuctionStateFinished public constructor(
    public val startDate: Int,
    public val endDate: Int,
    public val averagePrice: Long,
    public val acquiredItemCount: Int,
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
        other as AuctionStateFinished
        if (other.startDate != startDate) {
            return false
        }
        if (other.endDate != endDate) {
            return false
        }
        if (other.averagePrice != averagePrice) {
            return false
        }
        return other.acquiredItemCount == acquiredItemCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        hashCode = 31 * hashCode + endDate.hashCode()
        hashCode = 31 * hashCode + averagePrice.hashCode()
        hashCode = 31 * hashCode + acquiredItemCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuctionStateFinished")
            append("(")
            append("startDate=")
            append(startDate)
            append(", ")
            append("endDate=")
            append(endDate)
            append(", ")
            append("averagePrice=")
            append(averagePrice)
            append(", ")
            append("acquiredItemCount=")
            append(acquiredItemCount)
            append(")")
        }
    }
}
