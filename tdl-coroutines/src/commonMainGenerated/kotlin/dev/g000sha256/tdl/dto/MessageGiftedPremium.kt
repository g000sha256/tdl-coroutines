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
 * Telegram Premium was gifted to a user.
 *
 * @property gifterUserId The identifier of a user that gifted Telegram Premium; 0 if the gift was anonymous or is outgoing.
 * @property receiverUserId The identifier of a user that received Telegram Premium; 0 if the gift is incoming.
 * @property text Message added to the gifted Telegram Premium by the sender.
 * @property currency Currency for the paid amount.
 * @property amount The paid amount, in the smallest units of the currency.
 * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none.
 * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if none.
 * @property monthCount Number of months the Telegram Premium subscription will be active after code activation; 0 if the number of months isn't integer.
 * @property dayCount Number of days the Telegram Premium subscription will be active.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 */
public class MessageGiftedPremium public constructor(
    public val gifterUserId: Long,
    public val receiverUserId: Long,
    public val text: FormattedText,
    public val currency: String,
    public val amount: Long,
    public val cryptocurrency: String,
    public val cryptocurrencyAmount: Long,
    public val monthCount: Int,
    public val dayCount: Int,
    public val sticker: Sticker?,
) : MessageContent() {
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
        other as MessageGiftedPremium
        if (other.gifterUserId != gifterUserId) {
            return false
        }
        if (other.receiverUserId != receiverUserId) {
            return false
        }
        if (other.text != text) {
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
        if (other.monthCount != monthCount) {
            return false
        }
        if (other.dayCount != dayCount) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gifterUserId.hashCode()
        hashCode = 31 * hashCode + receiverUserId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + dayCount.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiftedPremium")
            append("(")
            append("gifterUserId=")
            append(gifterUserId)
            append(", ")
            append("receiverUserId=")
            append(receiverUserId)
            append(", ")
            append("text=")
            append(text)
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
            append("monthCount=")
            append(monthCount)
            append(", ")
            append("dayCount=")
            append(dayCount)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
