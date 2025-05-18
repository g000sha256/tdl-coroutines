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
 * The user creating a Telegram Star giveaway.
 *
 * @property parameters Giveaway parameters.
 * @property currency ISO 4217 currency code of the payment currency.
 * @property amount Paid amount, in the smallest units of the currency.
 * @property winnerCount The number of users to receive Telegram Stars.
 * @property starCount The number of Telegram Stars to be distributed through the giveaway.
 */
public class StorePaymentPurposeStarGiveaway public constructor(
    public val parameters: GiveawayParameters,
    public val currency: String,
    public val amount: Long,
    public val winnerCount: Int,
    public val starCount: Long,
) : StorePaymentPurpose() {
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
        other as StorePaymentPurposeStarGiveaway
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
        return other.starCount == starCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + parameters.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorePaymentPurposeStarGiveaway")
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
            append("starCount=")
            append(starCount)
            append(")")
        }
    }
}
