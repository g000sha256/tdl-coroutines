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
 * The user buying Telegram Stars for other users.
 *
 * @property userId Identifier of the user to which Telegram Stars are gifted.
 * @property currency ISO 4217 currency code of the payment currency.
 * @property amount Paid amount, in the smallest units of the currency.
 * @property starCount Number of bought Telegram Stars.
 */
public class StorePaymentPurposeGiftedStars public constructor(
    public val userId: Long,
    public val currency: String,
    public val amount: Long,
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
        other as StorePaymentPurposeGiftedStars
        if (other.userId != userId) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        return other.starCount == starCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorePaymentPurposeGiftedStars")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("starCount=")
            append(starCount)
            append(")")
        }
    }
}
