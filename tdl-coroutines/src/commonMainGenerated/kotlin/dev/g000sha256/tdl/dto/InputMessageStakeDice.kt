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
import kotlin.Long
import kotlin.String

/**
 * A stake dice message.
 *
 * @property stateHash Hash of the stake dice state. The state hash can be used only if it was received recently enough. Otherwise, a new state must be requested using getStakeDiceState.
 * @property stakeToncoinAmount The Toncoin amount that will be staked; in the smallest units of the currency. Must be in the range getOption(&quot;stake_dice_stake_amount_min&quot;)-getOption(&quot;stake_dice_stake_amount_max&quot;).
 * @property clearDraft True, if the chat message draft must be deleted.
 */
public class InputMessageStakeDice public constructor(
    public val stateHash: String,
    public val stakeToncoinAmount: Long,
    public val clearDraft: Boolean,
) : InputMessageContent() {
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
        other as InputMessageStakeDice
        if (other.stateHash != stateHash) {
            return false
        }
        if (other.stakeToncoinAmount != stakeToncoinAmount) {
            return false
        }
        return other.clearDraft == clearDraft
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + stateHash.hashCode()
        hashCode = 31 * hashCode + stakeToncoinAmount.hashCode()
        hashCode = 31 * hashCode + clearDraft.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageStakeDice")
            append("(")
            append("stateHash=")
            append(stateHash)
            append(", ")
            append("stakeToncoinAmount=")
            append(stakeToncoinAmount)
            append(", ")
            append("clearDraft=")
            append(clearDraft)
            append(")")
        }
    }
}
