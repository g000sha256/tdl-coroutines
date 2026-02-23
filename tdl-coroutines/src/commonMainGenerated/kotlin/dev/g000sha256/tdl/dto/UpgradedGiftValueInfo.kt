/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * Contains information about value of an upgraded gift.
 *
 * @property currency ISO 4217 currency code of the currency in which the prices are represented.
 * @property value Estimated value of the gift; in the smallest units of the currency.
 * @property isValueAverage True, if the value is calculated as average value of similar sold gifts. Otherwise, it is based on the sale price of the gift.
 * @property initialSaleDate Point in time (Unix timestamp) when the corresponding regular gift was originally purchased.
 * @property initialSaleStarCount The Telegram Star amount that was paid for the gift.
 * @property initialSalePrice Initial price of the gift; in the smallest units of the currency.
 * @property lastSaleDate Point in time (Unix timestamp) when the upgraded gift was purchased last time; 0 if never.
 * @property lastSalePrice Last purchase price of the gift; in the smallest units of the currency; 0 if the gift has never been resold.
 * @property isLastSaleOnFragment True, if the last sale was completed on Fragment.
 * @property minimumPrice The current minimum price of gifts upgraded from the same gift; in the smallest units of the currency; 0 if there are no such gifts.
 * @property averageSalePrice The average sale price in the last month of gifts upgraded from the same gift; in the smallest units of the currency; 0 if there were no such sales.
 * @property telegramListedGiftCount Number of gifts upgraded from the same gift being resold on Telegram.
 * @property fragmentListedGiftCount Number of gifts upgraded from the same gift being resold on Fragment.
 * @property fragmentUrl The HTTPS link to the Fragment for the gift; may be empty if there are no such gifts being sold on Fragment.
 */
public class UpgradedGiftValueInfo public constructor(
    public val currency: String,
    public val value: Long,
    public val isValueAverage: Boolean,
    public val initialSaleDate: Int,
    public val initialSaleStarCount: Long,
    public val initialSalePrice: Long,
    public val lastSaleDate: Int,
    public val lastSalePrice: Long,
    public val isLastSaleOnFragment: Boolean,
    public val minimumPrice: Long,
    public val averageSalePrice: Long,
    public val telegramListedGiftCount: Int,
    public val fragmentListedGiftCount: Int,
    public val fragmentUrl: String,
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
        other as UpgradedGiftValueInfo
        if (other.currency != currency) {
            return false
        }
        if (other.value != value) {
            return false
        }
        if (other.isValueAverage != isValueAverage) {
            return false
        }
        if (other.initialSaleDate != initialSaleDate) {
            return false
        }
        if (other.initialSaleStarCount != initialSaleStarCount) {
            return false
        }
        if (other.initialSalePrice != initialSalePrice) {
            return false
        }
        if (other.lastSaleDate != lastSaleDate) {
            return false
        }
        if (other.lastSalePrice != lastSalePrice) {
            return false
        }
        if (other.isLastSaleOnFragment != isLastSaleOnFragment) {
            return false
        }
        if (other.minimumPrice != minimumPrice) {
            return false
        }
        if (other.averageSalePrice != averageSalePrice) {
            return false
        }
        if (other.telegramListedGiftCount != telegramListedGiftCount) {
            return false
        }
        if (other.fragmentListedGiftCount != fragmentListedGiftCount) {
            return false
        }
        return other.fragmentUrl == fragmentUrl
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + value.hashCode()
        hashCode = 31 * hashCode + isValueAverage.hashCode()
        hashCode = 31 * hashCode + initialSaleDate.hashCode()
        hashCode = 31 * hashCode + initialSaleStarCount.hashCode()
        hashCode = 31 * hashCode + initialSalePrice.hashCode()
        hashCode = 31 * hashCode + lastSaleDate.hashCode()
        hashCode = 31 * hashCode + lastSalePrice.hashCode()
        hashCode = 31 * hashCode + isLastSaleOnFragment.hashCode()
        hashCode = 31 * hashCode + minimumPrice.hashCode()
        hashCode = 31 * hashCode + averageSalePrice.hashCode()
        hashCode = 31 * hashCode + telegramListedGiftCount.hashCode()
        hashCode = 31 * hashCode + fragmentListedGiftCount.hashCode()
        hashCode = 31 * hashCode + fragmentUrl.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftValueInfo")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("value=")
            append(value)
            append(", ")
            append("isValueAverage=")
            append(isValueAverage)
            append(", ")
            append("initialSaleDate=")
            append(initialSaleDate)
            append(", ")
            append("initialSaleStarCount=")
            append(initialSaleStarCount)
            append(", ")
            append("initialSalePrice=")
            append(initialSalePrice)
            append(", ")
            append("lastSaleDate=")
            append(lastSaleDate)
            append(", ")
            append("lastSalePrice=")
            append(lastSalePrice)
            append(", ")
            append("isLastSaleOnFragment=")
            append(isLastSaleOnFragment)
            append(", ")
            append("minimumPrice=")
            append(minimumPrice)
            append(", ")
            append("averageSalePrice=")
            append(averageSalePrice)
            append(", ")
            append("telegramListedGiftCount=")
            append(telegramListedGiftCount)
            append(", ")
            append("fragmentListedGiftCount=")
            append(fragmentListedGiftCount)
            append(", ")
            append("fragmentUrl=")
            append(fragmentUrl)
            append(")")
        }
    }
}
