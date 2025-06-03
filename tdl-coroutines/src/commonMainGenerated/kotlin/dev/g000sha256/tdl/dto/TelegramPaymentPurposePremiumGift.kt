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
 * The user gifting Telegram Premium to another user.
 *
 * @property currency ISO 4217 currency code of the payment currency, or &quot;XTR&quot; for payments in Telegram Stars.
 * @property amount Paid amount, in the smallest units of the currency.
 * @property userId Identifier of the user which will receive Telegram Premium.
 * @property monthCount Number of months the Telegram Premium subscription will be active for the user.
 * @property text Text to show to the user receiving Telegram Premium; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
 */
public class TelegramPaymentPurposePremiumGift public constructor(
    public val currency: String,
    public val amount: Long,
    public val userId: Long,
    public val monthCount: Int,
    public val text: FormattedText,
) : TelegramPaymentPurpose() {
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
        other as TelegramPaymentPurposePremiumGift
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.userId != userId) {
            return false
        }
        if (other.monthCount != monthCount) {
            return false
        }
        return other.text == text
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TelegramPaymentPurposePremiumGift")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("userId=")
            append(userId)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(", ")
            append("text=")
            append(text)
            append(")")
        }
    }
}
