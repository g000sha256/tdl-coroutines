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
 * Describes limits for an on-ramp purchase.
 *
 * @property paymentMethod The payment method to be used.
 * @property baseCurrencyMinAmount The minimum allowed amount of the base currency.
 * @property baseCurrencyMaxAmount The maximum allowed amount of the base currency.
 * @property cryptocurrencyMinAmount The minimum allowed amount of the bought cryptocurrency.
 * @property cryptocurrencyMaxAmount The maximum allowed amount of the bought cryptocurrency.
 */
public class OnRampPaymentLimits public constructor(
    public val paymentMethod: String,
    public val baseCurrencyMinAmount: String,
    public val baseCurrencyMaxAmount: String,
    public val cryptocurrencyMinAmount: String,
    public val cryptocurrencyMaxAmount: String,
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
        other as OnRampPaymentLimits
        if (other.paymentMethod != paymentMethod) {
            return false
        }
        if (other.baseCurrencyMinAmount != baseCurrencyMinAmount) {
            return false
        }
        if (other.baseCurrencyMaxAmount != baseCurrencyMaxAmount) {
            return false
        }
        if (other.cryptocurrencyMinAmount != cryptocurrencyMinAmount) {
            return false
        }
        return other.cryptocurrencyMaxAmount == cryptocurrencyMaxAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + paymentMethod.hashCode()
        hashCode = 31 * hashCode + baseCurrencyMinAmount.hashCode()
        hashCode = 31 * hashCode + baseCurrencyMaxAmount.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyMinAmount.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyMaxAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OnRampPaymentLimits")
            append("(")
            append("paymentMethod=")
            append(paymentMethod)
            append(", ")
            append("baseCurrencyMinAmount=")
            append(baseCurrencyMinAmount)
            append(", ")
            append("baseCurrencyMaxAmount=")
            append(baseCurrencyMaxAmount)
            append(", ")
            append("cryptocurrencyMinAmount=")
            append(cryptocurrencyMinAmount)
            append(", ")
            append("cryptocurrencyMaxAmount=")
            append(cryptocurrencyMaxAmount)
            append(")")
        }
    }
}
