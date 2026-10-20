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
import kotlin.String

/**
 * Describes a quote for an on-ramp purchase.
 *
 * @property paymentMethod The payment method to be used.
 * @property expirationDate Point in time (Unix timestamp) when the quote will expire.
 * @property baseCurrencyAmount Paid amount of the base currency.
 * @property cryptocurrencyAmount Purchased amount of the cryptocurrency.
 * @property cryptocurrencyPrice The price of the cryptocurrency.
 * @property feeAmount Fee amount.
 * @property extraFeeAmount Extra fee amount.
 * @property networkFeeAmount Network fee amount.
 * @property totalAmount Total paid amount.
 */
public class OnRampPaymentQuote public constructor(
    public val paymentMethod: String,
    public val expirationDate: Int,
    public val baseCurrencyAmount: String,
    public val cryptocurrencyAmount: String,
    public val cryptocurrencyPrice: String,
    public val feeAmount: String,
    public val extraFeeAmount: String,
    public val networkFeeAmount: String,
    public val totalAmount: String,
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
        other as OnRampPaymentQuote
        if (other.paymentMethod != paymentMethod) {
            return false
        }
        if (other.expirationDate != expirationDate) {
            return false
        }
        if (other.baseCurrencyAmount != baseCurrencyAmount) {
            return false
        }
        if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
            return false
        }
        if (other.cryptocurrencyPrice != cryptocurrencyPrice) {
            return false
        }
        if (other.feeAmount != feeAmount) {
            return false
        }
        if (other.extraFeeAmount != extraFeeAmount) {
            return false
        }
        if (other.networkFeeAmount != networkFeeAmount) {
            return false
        }
        return other.totalAmount == totalAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + paymentMethod.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + baseCurrencyAmount.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyPrice.hashCode()
        hashCode = 31 * hashCode + feeAmount.hashCode()
        hashCode = 31 * hashCode + extraFeeAmount.hashCode()
        hashCode = 31 * hashCode + networkFeeAmount.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OnRampPaymentQuote")
            append("(")
            append("paymentMethod=")
            append(paymentMethod)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(", ")
            append("baseCurrencyAmount=")
            append(baseCurrencyAmount)
            append(", ")
            append("cryptocurrencyAmount=")
            append(cryptocurrencyAmount)
            append(", ")
            append("cryptocurrencyPrice=")
            append(cryptocurrencyPrice)
            append(", ")
            append("feeAmount=")
            append(feeAmount)
            append(", ")
            append("extraFeeAmount=")
            append(extraFeeAmount)
            append(", ")
            append("networkFeeAmount=")
            append(networkFeeAmount)
            append(", ")
            append("totalAmount=")
            append(totalAmount)
            append(")")
        }
    }
}
