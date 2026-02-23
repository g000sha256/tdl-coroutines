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
 * Telegram Stars were gifted to a user.
 *
 * @property gifterUserId The identifier of a user who gifted Telegram Stars; 0 if the gift was anonymous or is outgoing.
 * @property receiverUserId The identifier of a user who received Telegram Stars; 0 if the gift is incoming.
 * @property currency Currency for the paid amount.
 * @property amount The paid amount, in the smallest units of the currency.
 * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none.
 * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if none.
 * @property starCount Number of Telegram Stars that were gifted.
 * @property transactionId Identifier of the transaction for Telegram Stars purchase; for receiver only.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 */
public class MessageGiftedStars public constructor(
    public val gifterUserId: Long,
    public val receiverUserId: Long,
    public val currency: String,
    public val amount: Long,
    public val cryptocurrency: String,
    public val cryptocurrencyAmount: Long,
    public val starCount: Long,
    public val transactionId: String,
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
        other as MessageGiftedStars
        if (other.gifterUserId != gifterUserId) {
            return false
        }
        if (other.receiverUserId != receiverUserId) {
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
        if (other.starCount != starCount) {
            return false
        }
        if (other.transactionId != transactionId) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gifterUserId.hashCode()
        hashCode = 31 * hashCode + receiverUserId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + transactionId.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiftedStars")
            append("(")
            append("gifterUserId=")
            append(gifterUserId)
            append(", ")
            append("receiverUserId=")
            append(receiverUserId)
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
            append("starCount=")
            append(starCount)
            append(", ")
            append("transactionId=")
            append(transactionId)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
