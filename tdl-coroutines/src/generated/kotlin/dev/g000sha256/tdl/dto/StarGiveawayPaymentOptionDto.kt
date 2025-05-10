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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes an option for creating of Telegram Star giveaway. Use telegramPaymentPurposeStarGiveaway for out-of-store payments.
 *
 * @property currency ISO 4217 currency code for the payment.
 * @property amount The amount to pay, in the smallest units of the currency.
 * @property starCount Number of Telegram Stars that will be distributed among winners.
 * @property storeProductId Identifier of the store product associated with the option; may be empty if none.
 * @property yearlyBoostCount Number of times the chat will be boosted for one year if the option is chosen.
 * @property winnerOptions Allowed options for the number of giveaway winners.
 * @property isDefault True, if the option must be chosen by default.
 * @property isAdditional True, if the option must be shown only in the full list of payment options.
 */
public class StarGiveawayPaymentOptionDto public constructor(
    public val currency: String,
    public val amount: Long,
    public val starCount: Long,
    public val storeProductId: String,
    public val yearlyBoostCount: Int,
    public val winnerOptions: Array<StarGiveawayWinnerOptionDto>,
    public val isDefault: Boolean,
    public val isAdditional: Boolean,
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
        other as StarGiveawayPaymentOptionDto
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        if (other.storeProductId != storeProductId) {
            return false
        }
        if (other.yearlyBoostCount != yearlyBoostCount) {
            return false
        }
        val winnerOptionsEquals = other.winnerOptions.contentDeepEquals(winnerOptions)
        if (!winnerOptionsEquals) {
            return false
        }
        if (other.isDefault != isDefault) {
            return false
        }
        return other.isAdditional == isAdditional
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + storeProductId.hashCode()
        hashCode = 31 * hashCode + yearlyBoostCount.hashCode()
        hashCode = 31 * hashCode + winnerOptions.contentDeepHashCode()
        hashCode = 31 * hashCode + isDefault.hashCode()
        hashCode = 31 * hashCode + isAdditional.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarGiveawayPaymentOptionDto")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("storeProductId=")
            append(storeProductId)
            append(", ")
            append("yearlyBoostCount=")
            append(yearlyBoostCount)
            append(", ")
            append("winnerOptions=")
            winnerOptions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isDefault=")
            append(isDefault)
            append(", ")
            append("isAdditional=")
            append(isAdditional)
            append(")")
        }
    }
}
