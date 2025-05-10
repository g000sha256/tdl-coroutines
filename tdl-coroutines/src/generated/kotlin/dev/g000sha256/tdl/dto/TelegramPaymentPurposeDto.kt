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
 * Describes a purpose of a payment toward Telegram.
 */
public sealed class TelegramPaymentPurposeDto private constructor() {
    /**
     * The user gifting Telegram Premium to another user.
     *
     * @property currency ISO 4217 currency code of the payment currency, or &quot;XTR&quot; for payments in Telegram Stars.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property userId Identifier of the user which will receive Telegram Premium.
     * @property monthCount Number of months the Telegram Premium subscription will be active for the user.
     * @property text Text to show to the user receiving Telegram Premium; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
     */
    public class PremiumGift public constructor(
        public val currency: String,
        public val amount: Long,
        public val userId: Long,
        public val monthCount: Int,
        public val text: FormattedTextDto,
    ) : TelegramPaymentPurposeDto() {
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
                append("TelegramPaymentPurposeDto.PremiumGift")
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

    /**
     * The user boosting a chat by creating Telegram Premium gift codes for other users.
     *
     * @property boostedChatId Identifier of the supergroup or channel chat, which will be automatically boosted by the users for duration of the Premium subscription and which is administered by the user.
     * @property currency ISO 4217 currency code of the payment currency.
     * @property amount Paid amount, in the smallest units of the currency.
     * @property userIds Identifiers of the users which can activate the gift codes.
     * @property monthCount Number of months the Telegram Premium subscription will be active for the users.
     * @property text Text to show along with the gift codes; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
     */
    public class PremiumGiftCodes public constructor(
        public val boostedChatId: Long,
        public val currency: String,
        public val amount: Long,
        public val userIds: LongArray,
        public val monthCount: Int,
        public val text: FormattedTextDto,
    ) : TelegramPaymentPurposeDto() {
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
            if (other.monthCount != monthCount) {
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
            hashCode = 31 * hashCode + monthCount.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TelegramPaymentPurposeDto.PremiumGiftCodes")
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
                append("monthCount=")
                append(monthCount)
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
     * @property winnerCount Number of users which will be able to activate the gift codes.
     * @property monthCount Number of months the Telegram Premium subscription will be active for the users.
     */
    public class PremiumGiveaway public constructor(
        public val parameters: GiveawayParametersDto,
        public val currency: String,
        public val amount: Long,
        public val winnerCount: Int,
        public val monthCount: Int,
    ) : TelegramPaymentPurposeDto() {
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
            if (other.amount != amount) {
                return false
            }
            if (other.winnerCount != winnerCount) {
                return false
            }
            return other.monthCount == monthCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + parameters.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TelegramPaymentPurposeDto.PremiumGiveaway")
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
                append("monthCount=")
                append(monthCount)
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
    ) : TelegramPaymentPurposeDto() {
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
                append("TelegramPaymentPurposeDto.Stars")
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
    ) : TelegramPaymentPurposeDto() {
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
                append("TelegramPaymentPurposeDto.GiftedStars")
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
    ) : TelegramPaymentPurposeDto() {
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
                append("TelegramPaymentPurposeDto.StarGiveaway")
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
     * The user joins a chat and subscribes to regular payments in Telegram Stars.
     *
     * @property inviteLink Invite link to use.
     */
    public class JoinChat public constructor(
        public val inviteLink: String,
    ) : TelegramPaymentPurposeDto() {
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
            other as JoinChat
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TelegramPaymentPurposeDto.JoinChat")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }
}
