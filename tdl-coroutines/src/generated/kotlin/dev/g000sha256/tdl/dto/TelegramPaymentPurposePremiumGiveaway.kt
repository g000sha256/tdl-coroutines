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
 * The user creating a Telegram Premium giveaway.
 *
 * @property parameters Giveaway parameters.
 * @property currency ISO 4217 currency code of the payment currency.
 * @property amount Paid amount, in the smallest units of the currency.
 * @property winnerCount Number of users which will be able to activate the gift codes.
 * @property monthCount Number of months the Telegram Premium subscription will be active for the users.
 */
public class TelegramPaymentPurposePremiumGiveaway public constructor(
    public val parameters: GiveawayParameters,
    public val currency: String,
    public val amount: Long,
    public val winnerCount: Int,
    public val monthCount: Int,
) : TelegramPaymentPurpose() {
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
        other as TelegramPaymentPurposePremiumGiveaway
        if (other.parameters != parameters) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        return other.monthCount == monthCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + parameters.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TelegramPaymentPurposePremiumGiveaway")
            append("(")
            append("parameters=")
            append(parameters)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(")")
        }
    }
}
