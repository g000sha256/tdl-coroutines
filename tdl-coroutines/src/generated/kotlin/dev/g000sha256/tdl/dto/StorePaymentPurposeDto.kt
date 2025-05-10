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
 * This class is an abstract base class.
 * Describes a purpose of an in-store payment.
 */
public sealed class StorePaymentPurposeDto private constructor() {
    /**
     * The user subscribing to Telegram Premium.
     *
     * @property isRestore Pass true if this is a restore of a Telegram Premium purchase; only for App Store.
     * @property isUpgrade Pass true if this is an upgrade from a monthly subscription to early subscription; only for App Store.
     */
    public class PremiumSubscription public constructor(
        public val isRestore: Boolean,
        public val isUpgrade: Boolean,
    ) : StorePaymentPurposeDto() {
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
            other as PremiumSubscription
            if (other.isRestore != isRestore) {
                return false
            }
            return other.isUpgrade == isUpgrade
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isRestore.hashCode()
            hashCode = 31 * hashCode + isUpgrade.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StorePaymentPurposeDto.PremiumSubscription")
                append("(")
                append("isRestore=")
                append(isRestore)
                append(", ")
                append("isUpgrade=")
                append(isUpgrade)
                append(")")
            }
        }
    }

    /**
     * The user gifting Telegram Premium to another user.
     *
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property userId Identifiers of the user which will receive Telegram Premium.
     * @property text Text to show along with the gift codes; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
     */
    public class PremiumGift public constructor(
        public val currency: String,
        public val amount: Long,
        public val userId: Long,
        public val text: FormattedTextDto,
    ) : StorePaymentPurposeDto() {
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
            other as PremiumGift
            if (other.currency != currency) {
                return false
            }
            if (other.amount != amount) {
                return false
            }
            if (other.userId != userId) {
                return false
            }
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StorePaymentPurposeDto.PremiumGift")
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
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * The user boosting a chat by creating Telegram Premium gift codes for other users.
     *
     * @property boostedChatId Identifier of the supergroup or channel chat, which will be automatically boosted by the users for duration of the Premium subscription and which is administered by the user.
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property userIds Identifiers of the users which can activate the gift codes.
     * @property text Text to show along with the gift codes; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
     */
    public class PremiumGiftCodes public constructor(
        public val boostedChatId: Long,
        public val currency: String,
        public val amount: Long,
        public val userIds: LongArray,
        public val text: FormattedTextDto,
    ) : StorePaymentPurposeDto() {
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
            other as PremiumGiftCodes
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
                append("StorePaymentPurposeDto.PremiumGiftCodes")
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

    /**
     * The user creating a Telegram Premium giveaway.
     *
     * @property parameters Giveaway parameters.
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     */
    public class PremiumGiveaway public constructor(
        public val parameters: GiveawayParametersDto,
        public val currency: String,
        public val amount: Long,
    ) : StorePaymentPurposeDto() {
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
            other as PremiumGiveaway
            if (other.parameters != parameters) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            return other.amount == amount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + parameters.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StorePaymentPurposeDto.PremiumGiveaway")
                append("(")
                append("parameters=")
                append(parameters)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("amount=")
                append(amount)
                append(")")
            }
        }
    }

    /**
     * The user creating a Telegram Star giveaway.
     *
     * @property parameters Giveaway parameters.
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property winnerCount The number of users to receive Telegram Stars.
     * @property starCount The number of Telegram Stars to be distributed through the giveaway.
     */
    public class StarGiveaway public constructor(
        public val parameters: GiveawayParametersDto,
        public val currency: String,
        public val amount: Long,
        public val winnerCount: Int,
        public val starCount: Long,
    ) : StorePaymentPurposeDto() {
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
            other as StarGiveaway
            if (other.parameters != parameters) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.amount != amount) {
                return false
            }
            if (other.winnerCount != winnerCount) {
                return false
            }
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + parameters.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StorePaymentPurposeDto.StarGiveaway")
                append("(")
                append("parameters=")
                append(parameters)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("amount=")
                append(amount)
                append(", ")
                append("winnerCount=")
                append(winnerCount)
                append(", ")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }

    /**
     * The user buying Telegram Stars.
     *
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property starCount Number of bought Telegram Stars.
     */
    public class Stars public constructor(
        public val currency: String,
        public val amount: Long,
        public val starCount: Long,
    ) : StorePaymentPurposeDto() {
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
            other as Stars
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
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StorePaymentPurposeDto.Stars")
                append("(")
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

    /**
     * The user buying Telegram Stars for other users.
     *
     * @property userId Identifier of the user to which Telegram Stars are gifted.
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property starCount Number of bought Telegram Stars.
     */
    public class GiftedStars public constructor(
        public val userId: Long,
        public val currency: String,
        public val amount: Long,
        public val starCount: Long,
    ) : StorePaymentPurposeDto() {
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
            other as GiftedStars
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
                append("StorePaymentPurposeDto.GiftedStars")
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
}
