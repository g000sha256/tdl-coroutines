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
 * Describes an option for buying Telegram Premium to a user.
 *
 * @property currency ISO 4217 currency code for Telegram Premium subscription payment.
 * @property amount The amount to pay, in the smallest units of the currency.
 * @property discountPercentage The discount associated with this option, as a percentage.
 * @property monthCount Number of months the Telegram Premium subscription will be active. Use getPremiumInfoSticker to get the sticker to be used as representation of the Telegram Premium subscription.
 * @property storeProductId Identifier of the store product associated with the option.
 * @property paymentLink An internal link to be opened for buying Telegram Premium to the user if store payment isn't possible; may be null if direct payment isn't available.
 */
public class PremiumPaymentOptionDto public constructor(
    public val currency: String,
    public val amount: Long,
    public val discountPercentage: Int,
    public val monthCount: Int,
    public val storeProductId: String,
    public val paymentLink: InternalLinkTypeDto?,
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
        other as PremiumPaymentOptionDto
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.discountPercentage != discountPercentage) {
            return false
        }
        if (other.monthCount != monthCount) {
            return false
        }
        if (other.storeProductId != storeProductId) {
            return false
        }
        return other.paymentLink == paymentLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + discountPercentage.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + storeProductId.hashCode()
        hashCode = 31 * hashCode + paymentLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumPaymentOptionDto")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("discountPercentage=")
            append(discountPercentage)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(", ")
            append("storeProductId=")
            append(storeProductId)
            append(", ")
            append("paymentLink=")
            append(paymentLink)
            append(")")
        }
    }
}
