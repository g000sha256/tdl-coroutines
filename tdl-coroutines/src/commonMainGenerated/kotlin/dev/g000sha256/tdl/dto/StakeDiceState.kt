/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * @property stakeGramAmount The amount of TON Grams staked in the previous roll; in the smallest units of the currency.
 * @property suggestedStakeGramAmounts The amounts of Grams that are suggested to be staked; in the smallest units of the currency.
 * @property currentStreak The number of rolled sixes towards the streak; 0-2.
 * @property prizePerMille The number of Grams received by the user for each 1000 Grams staked if the dice outcome is 1-6 correspondingly; may be empty if the stake dice can't be sent by the current user.
 * @property streakPrizePerMille The number of Grams received by the user for each 1000 Grams staked if the dice outcome is 6 three times in a row with the same stake.
 */
public class StakeDiceState public constructor(
    public val stateHash: String,
    public val stakeGramAmount: Long,
    public val suggestedStakeGramAmounts: LongArray,
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
        if (other.stakeGramAmount != stakeGramAmount) {
            return false
        }
        val suggestedStakeGramAmountsEquals = other.suggestedStakeGramAmounts.contentEquals(suggestedStakeGramAmounts)
        if (!suggestedStakeGramAmountsEquals) {
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
        hashCode = 31 * hashCode + stakeGramAmount.hashCode()
        hashCode = 31 * hashCode + suggestedStakeGramAmounts.contentHashCode()
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
            append("stakeGramAmount=")
            append(stakeGramAmount)
            append(", ")
            append("suggestedStakeGramAmounts=")
            suggestedStakeGramAmounts
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
