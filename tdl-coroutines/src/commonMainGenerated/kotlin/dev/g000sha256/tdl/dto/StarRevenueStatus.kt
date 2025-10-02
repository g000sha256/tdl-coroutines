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
 * Contains information about Telegram Stars earned by a user or a chat.
 *
 * @property totalAmount Total amount of Telegram Stars earned.
 * @property currentAmount The amount of Telegram Stars that aren't withdrawn yet.
 * @property availableAmount The amount of Telegram Stars that are available for withdrawal.
 * @property withdrawalEnabled True, if Telegram Stars can be withdrawn now or later.
 * @property nextWithdrawalIn Time left before the next withdrawal can be started, in seconds; 0 if withdrawal can be started now.
 */
public class StarRevenueStatus public constructor(
    public val totalAmount: StarAmount,
    public val currentAmount: StarAmount,
    public val availableAmount: StarAmount,
    public val withdrawalEnabled: Boolean,
    public val nextWithdrawalIn: Int,
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
        other as StarRevenueStatus
        if (other.totalAmount != totalAmount) {
            return false
        }
        if (other.currentAmount != currentAmount) {
            return false
        }
        if (other.availableAmount != availableAmount) {
            return false
        }
        if (other.withdrawalEnabled != withdrawalEnabled) {
            return false
        }
        return other.nextWithdrawalIn == nextWithdrawalIn
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + currentAmount.hashCode()
        hashCode = 31 * hashCode + availableAmount.hashCode()
        hashCode = 31 * hashCode + withdrawalEnabled.hashCode()
        hashCode = 31 * hashCode + nextWithdrawalIn.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarRevenueStatus")
            append("(")
            append("totalAmount=")
            append(totalAmount)
            append(", ")
            append("currentAmount=")
            append(currentAmount)
            append(", ")
            append("availableAmount=")
            append(availableAmount)
            append(", ")
            append("withdrawalEnabled=")
            append(withdrawalEnabled)
            append(", ")
            append("nextWithdrawalIn=")
            append(nextWithdrawalIn)
            append(")")
        }
    }
}
