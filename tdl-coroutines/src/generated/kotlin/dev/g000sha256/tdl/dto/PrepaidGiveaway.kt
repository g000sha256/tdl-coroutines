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
 * Describes a prepaid giveaway.
 *
 * @property id Unique identifier of the prepaid giveaway.
 * @property winnerCount Number of users which will receive giveaway prize.
 * @property prize Prize of the giveaway.
 * @property boostCount The number of boosts received by the chat from the giveaway; for Telegram Star giveaways only.
 * @property paymentDate Point in time (Unix timestamp) when the giveaway was paid.
 */
public class PrepaidGiveaway public constructor(
    public val id: Long,
    public val winnerCount: Int,
    public val prize: GiveawayPrize,
    public val boostCount: Int,
    public val paymentDate: Int,
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
        other as PrepaidGiveaway
        if (other.id != id) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.prize != prize) {
            return false
        }
        if (other.boostCount != boostCount) {
            return false
        }
        return other.paymentDate == paymentDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + prize.hashCode()
        hashCode = 31 * hashCode + boostCount.hashCode()
        hashCode = 31 * hashCode + paymentDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PrepaidGiveaway")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("prize=")
            append(prize)
            append(", ")
            append("boostCount=")
            append(boostCount)
            append(", ")
            append("paymentDate=")
            append(paymentDate)
            append(")")
        }
    }
}
