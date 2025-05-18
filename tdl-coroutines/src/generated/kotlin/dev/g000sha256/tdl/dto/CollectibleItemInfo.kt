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
 * Contains information about a collectible item and its last purchase.
 *
 * @property purchaseDate Point in time (Unix timestamp) when the item was purchased.
 * @property currency Currency for the paid amount.
 * @property amount The paid amount, in the smallest units of the currency.
 * @property cryptocurrency Cryptocurrency used to pay for the item.
 * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency.
 * @property url Individual URL for the item on https://fragment.com.
 */
public class CollectibleItemInfo public constructor(
    public val purchaseDate: Int,
    public val currency: String,
    public val amount: Long,
    public val cryptocurrency: String,
    public val cryptocurrencyAmount: Long,
    public val url: String,
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
        other as CollectibleItemInfo
        if (other.purchaseDate != purchaseDate) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.cryptocurrency != cryptocurrency) {
            return false
        }
        if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
            return false
        }
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + purchaseDate.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CollectibleItemInfo")
            append("(")
            append("purchaseDate=")
            append(purchaseDate)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("cryptocurrency=")
            append(cryptocurrency)
            append(", ")
            append("cryptocurrencyAmount=")
            append(cryptocurrencyAmount)
            append(", ")
            append("url=")
            append(url)
            append(")")
        }
    }
}
