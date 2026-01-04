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
import kotlin.String

/**
 * Describes a round of an auction.
 *
 * @property number 1-based number of the round.
 * @property duration Duration of the round, in seconds.
 * @property extendTime The number of seconds for which the round will be extended if there are changes in the top winners.
 * @property topWinnerCount The number of top winners who trigger round extension if changed.
 */
public class AuctionRound public constructor(
    public val number: Int,
    public val duration: Int,
    public val extendTime: Int,
    public val topWinnerCount: Int,
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
        other as AuctionRound
        if (other.number != number) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.extendTime != extendTime) {
            return false
        }
        return other.topWinnerCount == topWinnerCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + number.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + extendTime.hashCode()
        hashCode = 31 * hashCode + topWinnerCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuctionRound")
            append("(")
            append("number=")
            append(number)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("extendTime=")
            append(extendTime)
            append(", ")
            append("topWinnerCount=")
            append(topWinnerCount)
            append(")")
        }
    }
}
