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
 * A Telegram Premium gift code was created for the user.
 *
 * @property creatorId Identifier of a chat or a user who created the gift code; may be null if unknown.
 * @property text Message added to the gift.
 * @property isFromGiveaway True, if the gift code was created for a giveaway.
 * @property isUnclaimed True, if the winner for the corresponding Telegram Premium subscription wasn't chosen.
 * @property currency Currency for the paid amount; empty if unknown.
 * @property amount The paid amount, in the smallest units of the currency; 0 if unknown.
 * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none or unknown.
 * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if unknown.
 * @property monthCount Number of months the Telegram Premium subscription will be active after code activation; 0 if the number of months isn't integer.
 * @property dayCount Number of days the Telegram Premium subscription will be active after code activation.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 * @property code The gift code.
 */
public class MessagePremiumGiftCode public constructor(
    public val creatorId: MessageSender?,
    public val text: FormattedText,
    public val isFromGiveaway: Boolean,
    public val isUnclaimed: Boolean,
    public val currency: String,
    public val amount: Long,
    public val cryptocurrency: String,
    public val cryptocurrencyAmount: Long,
    public val monthCount: Int,
    public val dayCount: Int,
    public val sticker: Sticker?,
    public val code: String,
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
        other as MessagePremiumGiftCode
        if (other.creatorId != creatorId) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.isFromGiveaway != isFromGiveaway) {
            return false
        }
        if (other.isUnclaimed != isUnclaimed) {
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
        if (other.sticker != sticker) {
            return false
        }
        return other.code == code
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + creatorId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + isFromGiveaway.hashCode()
        hashCode = 31 * hashCode + isUnclaimed.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + dayCount.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + code.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePremiumGiftCode")
            append("(")
            append("creatorId=")
            append(creatorId)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("isFromGiveaway=")
            append(isFromGiveaway)
            append(", ")
            append("isUnclaimed=")
            append(isUnclaimed)
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
            append(", ")
            append("code=")
            append(code)
            append(")")
        }
    }
}
