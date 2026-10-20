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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * Describes exchange rate of a currency to USD.
 *
 * @property currency ISO 4217 currency code of the payment currency.
 * @property rate Exchange rate of the currency to USD.
 */
public class CurrencyExchangeRate public constructor(
    public val currency: String,
    public val rate: Double,
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
        other as CurrencyExchangeRate
        if (other.currency != currency) {
            return false
        }
        return other.rate == rate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + rate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CurrencyExchangeRate")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("rate=")
            append(rate)
            append(")")
        }
    }
}
