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
 * Describes an option for creating of Telegram Premium giveaway or manual distribution of Telegram Premium among chat members. Use telegramPaymentPurposePremiumGiftCodes or telegramPaymentPurposePremiumGiveaway for out-of-store payments.
 *
 * @property currency ISO 4217 currency code for Telegram Premium gift code payment.
 * @property amount The amount to pay, in the smallest units of the currency.
 * @property winnerCount Number of users which will be able to activate the gift codes.
 * @property monthCount Number of months the Telegram Premium subscription will be active.
 * @property storeProductId Identifier of the store product associated with the option; may be empty if none.
 * @property storeProductQuantity Number of times the store product must be paid.
 */
public class PremiumGiveawayPaymentOption public constructor(
    public val currency: String,
    public val amount: Long,
    public val winnerCount: Int,
    public val monthCount: Int,
    public val storeProductId: String,
    public val storeProductQuantity: Int,
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
        other as PremiumGiveawayPaymentOption
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.monthCount != monthCount) {
            return false
        }
        if (other.storeProductId != storeProductId) {
            return false
        }
        return other.storeProductQuantity == storeProductQuantity
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + storeProductId.hashCode()
        hashCode = 31 * hashCode + storeProductQuantity.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumGiveawayPaymentOption")
            append("(")
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
            append(", ")
            append("storeProductId=")
            append(storeProductId)
            append(", ")
            append("storeProductQuantity=")
            append(storeProductQuantity)
            append(")")
        }
    }
}
