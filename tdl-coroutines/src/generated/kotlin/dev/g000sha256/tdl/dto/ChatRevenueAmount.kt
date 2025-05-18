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
 * Contains information about revenue earned from sponsored messages in a chat.
 *
 * @property cryptocurrency Cryptocurrency in which revenue is calculated.
 * @property totalAmount Total amount of the cryptocurrency earned, in the smallest units of the cryptocurrency.
 * @property balanceAmount Amount of the cryptocurrency that isn't withdrawn yet, in the smallest units of the cryptocurrency.
 * @property availableAmount Amount of the cryptocurrency available for withdrawal, in the smallest units of the cryptocurrency.
 * @property withdrawalEnabled True, if Telegram Stars can be withdrawn now or later.
 */
public class ChatRevenueAmount public constructor(
    public val cryptocurrency: String,
    public val totalAmount: Long,
    public val balanceAmount: Long,
    public val availableAmount: Long,
    public val withdrawalEnabled: Boolean,
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
        other as ChatRevenueAmount
        if (other.cryptocurrency != cryptocurrency) {
            return false
        }
        if (other.totalAmount != totalAmount) {
            return false
        }
        if (other.balanceAmount != balanceAmount) {
            return false
        }
        if (other.availableAmount != availableAmount) {
            return false
        }
        return other.withdrawalEnabled == withdrawalEnabled
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + balanceAmount.hashCode()
        hashCode = 31 * hashCode + availableAmount.hashCode()
        hashCode = 31 * hashCode + withdrawalEnabled.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatRevenueAmount")
            append("(")
            append("cryptocurrency=")
            append(cryptocurrency)
            append(", ")
            append("totalAmount=")
            append(totalAmount)
            append(", ")
            append("balanceAmount=")
            append(balanceAmount)
            append(", ")
            append("availableAmount=")
            append(availableAmount)
            append(", ")
            append("withdrawalEnabled=")
            append(withdrawalEnabled)
            append(")")
        }
    }
}
