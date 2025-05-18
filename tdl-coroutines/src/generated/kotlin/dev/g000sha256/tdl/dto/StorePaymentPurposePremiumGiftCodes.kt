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
import kotlin.LongArray
import kotlin.String

/**
 * The user boosting a chat by creating Telegram Premium gift codes for other users.
 *
 * @property boostedChatId Identifier of the supergroup or channel chat, which will be automatically boosted by the users for duration of the Premium subscription and which is administered by the user.
 * @property currency ISO 4217 currency code of the payment currency.
 * @property amount Paid amount, in the smallest units of the currency.
 * @property userIds Identifiers of the users which can activate the gift codes.
 * @property text Text to show along with the gift codes; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
 */
public class StorePaymentPurposePremiumGiftCodes public constructor(
    public val boostedChatId: Long,
    public val currency: String,
    public val amount: Long,
    public val userIds: LongArray,
    public val text: FormattedText,
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
        other as StorePaymentPurposePremiumGiftCodes
        if (other.boostedChatId != boostedChatId) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        val userIdsEquals = other.userIds.contentEquals(userIds)
        if (!userIdsEquals) {
            return false
        }
        return other.text == text
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + boostedChatId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + userIds.contentHashCode()
        hashCode = 31 * hashCode + text.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorePaymentPurposePremiumGiftCodes")
            append("(")
            append("boostedChatId=")
            append(boostedChatId)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("userIds=")
            userIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("text=")
            append(text)
            append(")")
        }
    }
}
