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
import kotlin.IntArray
import kotlin.Long
import kotlin.LongArray
import kotlin.String

/**
 * Describes state of the stake dice.
 *
 * @property stateHash Hash of the state to use for sending the next dice; may be empty if the stake dice can't be sent by the current user.
 * @property stakeToncoinAmount The amount of Toncoins that was staked in the previous roll; in the smallest units of the currency.
 * @property suggestedStakeToncoinAmounts The amounts of Toncoins that are suggested to be staked; in the smallest units of the currency.
 * @property currentStreak The number of rolled sixes towards the streak; 0-2.
 * @property prizePerMille The number of Toncoins received by the user for each 1000 Toncoins staked if the dice outcome is 1-6 correspondingly; may be empty if the stake dice can't be sent by the current user.
 * @property streakPrizePerMille The number of Toncoins received by the user for each 1000 Toncoins staked if the dice outcome is 6 three times in a row with the same stake.
 */
public class StakeDiceState public constructor(
    public val stateHash: String,
    public val stakeToncoinAmount: Long,
    public val suggestedStakeToncoinAmounts: LongArray,
    public val currentStreak: Int,
    public val prizePerMille: IntArray,
    public val streakPrizePerMille: Int,
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
        other as StakeDiceState
        if (other.stateHash != stateHash) {
            return false
        }
        if (other.stakeToncoinAmount != stakeToncoinAmount) {
            return false
        }
        val suggestedStakeToncoinAmountsEquals = other.suggestedStakeToncoinAmounts.contentEquals(suggestedStakeToncoinAmounts)
        if (!suggestedStakeToncoinAmountsEquals) {
            return false
        }
        if (other.currentStreak != currentStreak) {
            return false
        }
        val prizePerMilleEquals = other.prizePerMille.contentEquals(prizePerMille)
        if (!prizePerMilleEquals) {
            return false
        }
        return other.streakPrizePerMille == streakPrizePerMille
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + stateHash.hashCode()
        hashCode = 31 * hashCode + stakeToncoinAmount.hashCode()
        hashCode = 31 * hashCode + suggestedStakeToncoinAmounts.contentHashCode()
        hashCode = 31 * hashCode + currentStreak.hashCode()
        hashCode = 31 * hashCode + prizePerMille.contentHashCode()
        hashCode = 31 * hashCode + streakPrizePerMille.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StakeDiceState")
            append("(")
            append("stateHash=")
            append(stateHash)
            append(", ")
            append("stakeToncoinAmount=")
            append(stakeToncoinAmount)
            append(", ")
            append("suggestedStakeToncoinAmounts=")
            suggestedStakeToncoinAmounts
                .contentToString()
                .also { append(it) }
            append(", ")
            append("currentStreak=")
            append(currentStreak)
            append(", ")
            append("prizePerMille=")
            prizePerMille
                .contentToString()
                .also { append(it) }
            append(", ")
            append("streakPrizePerMille=")
            append(streakPrizePerMille)
            append(")")
        }
    }
}
