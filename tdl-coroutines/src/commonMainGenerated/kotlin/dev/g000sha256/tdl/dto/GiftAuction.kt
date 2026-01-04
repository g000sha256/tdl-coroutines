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
 * Describes an auction on which a gift can be purchased.
 *
 * @property id Identifier of the auction.
 * @property giftsPerRound Number of gifts distributed in each round.
 * @property startDate Point in time (Unix timestamp) when the auction will start.
 */
public class GiftAuction public constructor(
    public val id: String,
    public val giftsPerRound: Int,
    public val startDate: Int,
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
        other as GiftAuction
        if (other.id != id) {
            return false
        }
        if (other.giftsPerRound != giftsPerRound) {
            return false
        }
        return other.startDate == startDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + giftsPerRound.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftAuction")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("giftsPerRound=")
            append(giftsPerRound)
            append(", ")
            append("startDate=")
            append(startDate)
            append(")")
        }
    }
}
