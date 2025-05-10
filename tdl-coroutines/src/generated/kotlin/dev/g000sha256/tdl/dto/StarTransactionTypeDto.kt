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
import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes type of transaction with Telegram Stars.
 */
public sealed class StarTransactionTypeDto private constructor() {
    /**
     * The transaction is a deposit of Telegram Stars from the Premium bot; for regular users only.
     */
    public class PremiumBotDeposit public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.PremiumBotDeposit()"
        }
    }

    /**
     * The transaction is a deposit of Telegram Stars from App Store; for regular users only.
     */
    public class AppStoreDeposit public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.AppStoreDeposit()"
        }
    }

    /**
     * The transaction is a deposit of Telegram Stars from Google Play; for regular users only.
     */
    public class GooglePlayDeposit public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.GooglePlayDeposit()"
        }
    }

    /**
     * The transaction is a deposit of Telegram Stars from Fragment; for regular users and bots only.
     */
    public class FragmentDeposit public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.FragmentDeposit()"
        }
    }

    /**
     * The transaction is a deposit of Telegram Stars by another user; for regular users only.
     *
     * @property userId Identifier of the user that gifted Telegram Stars; 0 if the user was anonymous.
     * @property sticker The sticker to be shown in the transaction information; may be null if unknown.
     */
    public class UserDeposit public constructor(
        public val userId: Long,
        public val sticker: StickerDto?,
    ) : StarTransactionTypeDto() {
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
            other as UserDeposit
            if (other.userId != userId) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.UserDeposit")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * The transaction is a deposit of Telegram Stars from a giveaway; for regular users only.
     *
     * @property chatId Identifier of a supergroup or a channel chat that created the giveaway.
     * @property giveawayMessageId Identifier of the message with the giveaway; can be 0 or an identifier of a deleted message.
     */
    public class GiveawayDeposit public constructor(
        public val chatId: Long,
        public val giveawayMessageId: Long,
    ) : StarTransactionTypeDto() {
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
            other as GiveawayDeposit
            if (other.chatId != chatId) {
                return false
            }
            return other.giveawayMessageId == giveawayMessageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + giveawayMessageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.GiveawayDeposit")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("giveawayMessageId=")
                append(giveawayMessageId)
                append(")")
            }
        }
    }

    /**
     * The transaction is a withdrawal of earned Telegram Stars to Fragment; for regular users, bots, supergroup and channel chats only.
     *
     * @property withdrawalState State of the withdrawal; may be null for refunds from Fragment.
     */
    public class FragmentWithdrawal public constructor(
        public val withdrawalState: RevenueWithdrawalStateDto?,
    ) : StarTransactionTypeDto() {
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
            other as FragmentWithdrawal
            return other.withdrawalState == withdrawalState
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + withdrawalState.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.FragmentWithdrawal")
                append("(")
                append("withdrawalState=")
                append(withdrawalState)
                append(")")
            }
        }
    }

    /**
     * The transaction is a withdrawal of earned Telegram Stars to Telegram Ad platform; for bots and channel chats only.
     */
    public class TelegramAdsWithdrawal public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.TelegramAdsWithdrawal()"
        }
    }

    /**
     * The transaction is a payment for Telegram API usage; for bots only.
     *
     * @property requestCount The number of billed requests.
     */
    public class TelegramApiUsage public constructor(
        public val requestCount: Int,
    ) : StarTransactionTypeDto() {
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
            other as TelegramApiUsage
            return other.requestCount == requestCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + requestCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.TelegramApiUsage")
                append("(")
                append("requestCount=")
                append(requestCount)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of paid media from a bot or a business account by the current user; for regular users only.
     *
     * @property userId Identifier of the bot or the business account user that sent the paid media.
     * @property media The bought media if the transaction wasn't refunded.
     */
    public class BotPaidMediaPurchase public constructor(
        public val userId: Long,
        public val media: Array<PaidMediaDto>,
    ) : StarTransactionTypeDto() {
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
            other as BotPaidMediaPurchase
            if (other.userId != userId) {
                return false
            }
            return other.media.contentDeepEquals(media)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotPaidMediaPurchase")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of paid media by the bot or a business account managed by the bot; for bots only.
     *
     * @property userId Identifier of the user that bought the media.
     * @property media The bought media.
     * @property payload Bot-provided payload.
     * @property affiliate Information about the affiliate which received commission from the transaction; may be null if none.
     */
    public class BotPaidMediaSale public constructor(
        public val userId: Long,
        public val media: Array<PaidMediaDto>,
        public val payload: String,
        public val affiliate: AffiliateInfoDto?,
    ) : StarTransactionTypeDto() {
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
            other as BotPaidMediaSale
            if (other.userId != userId) {
                return false
            }
            val mediaEquals = other.media.contentDeepEquals(media)
            if (!mediaEquals) {
                return false
            }
            if (other.payload != payload) {
                return false
            }
            return other.affiliate == affiliate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            hashCode = 31 * hashCode + payload.hashCode()
            hashCode = 31 * hashCode + affiliate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotPaidMediaSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("payload=")
                append(payload)
                append(", ")
                append("affiliate=")
                append(affiliate)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of paid media from a channel by the current user; for regular users only.
     *
     * @property chatId Identifier of the channel chat that sent the paid media.
     * @property messageId Identifier of the corresponding message with paid media; can be 0 or an identifier of a deleted message.
     * @property media The bought media if the transaction wasn't refunded.
     */
    public class ChannelPaidMediaPurchase public constructor(
        public val chatId: Long,
        public val messageId: Long,
        public val media: Array<PaidMediaDto>,
    ) : StarTransactionTypeDto() {
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
            other as ChannelPaidMediaPurchase
            if (other.chatId != chatId) {
                return false
            }
            if (other.messageId != messageId) {
                return false
            }
            return other.media.contentDeepEquals(media)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelPaidMediaPurchase")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(", ")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of paid media by the channel chat; for channel chats only.
     *
     * @property userId Identifier of the user that bought the media.
     * @property messageId Identifier of the corresponding message with paid media; can be 0 or an identifier of a deleted message.
     * @property media The bought media.
     */
    public class ChannelPaidMediaSale public constructor(
        public val userId: Long,
        public val messageId: Long,
        public val media: Array<PaidMediaDto>,
    ) : StarTransactionTypeDto() {
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
            other as ChannelPaidMediaSale
            if (other.userId != userId) {
                return false
            }
            if (other.messageId != messageId) {
                return false
            }
            return other.media.contentDeepEquals(media)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelPaidMediaSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(", ")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of a product from a bot or a business account by the current user; for regular users only.
     *
     * @property userId Identifier of the bot or the business account user that created the invoice.
     * @property productInfo Information about the bought product.
     */
    public class BotInvoicePurchase public constructor(
        public val userId: Long,
        public val productInfo: ProductInfoDto,
    ) : StarTransactionTypeDto() {
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
            other as BotInvoicePurchase
            if (other.userId != userId) {
                return false
            }
            return other.productInfo == productInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + productInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotInvoicePurchase")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("productInfo=")
                append(productInfo)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of a product by the bot; for bots only.
     *
     * @property userId Identifier of the user that bought the product.
     * @property productInfo Information about the bought product.
     * @property invoicePayload Invoice payload.
     * @property affiliate Information about the affiliate which received commission from the transaction; may be null if none.
     */
    public class BotInvoiceSale public constructor(
        public val userId: Long,
        public val productInfo: ProductInfoDto,
        public val invoicePayload: ByteArray,
        public val affiliate: AffiliateInfoDto?,
    ) : StarTransactionTypeDto() {
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
            other as BotInvoiceSale
            if (other.userId != userId) {
                return false
            }
            if (other.productInfo != productInfo) {
                return false
            }
            val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
            if (!invoicePayloadEquals) {
                return false
            }
            return other.affiliate == affiliate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + productInfo.hashCode()
            hashCode = 31 * hashCode + invoicePayload.contentHashCode()
            hashCode = 31 * hashCode + affiliate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotInvoiceSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("productInfo=")
                append(productInfo)
                append(", ")
                append("invoicePayload=")
                invoicePayload
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("affiliate=")
                append(affiliate)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of a subscription from a bot or a business account by the current user; for regular users only.
     *
     * @property userId Identifier of the bot or the business account user that created the subscription link.
     * @property subscriptionPeriod The number of seconds between consecutive Telegram Star debitings.
     * @property productInfo Information about the bought subscription.
     */
    public class BotSubscriptionPurchase public constructor(
        public val userId: Long,
        public val subscriptionPeriod: Int,
        public val productInfo: ProductInfoDto,
    ) : StarTransactionTypeDto() {
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
            other as BotSubscriptionPurchase
            if (other.userId != userId) {
                return false
            }
            if (other.subscriptionPeriod != subscriptionPeriod) {
                return false
            }
            return other.productInfo == productInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + subscriptionPeriod.hashCode()
            hashCode = 31 * hashCode + productInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotSubscriptionPurchase")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("subscriptionPeriod=")
                append(subscriptionPeriod)
                append(", ")
                append("productInfo=")
                append(productInfo)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of a subscription by the bot; for bots only.
     *
     * @property userId Identifier of the user that bought the subscription.
     * @property subscriptionPeriod The number of seconds between consecutive Telegram Star debitings.
     * @property productInfo Information about the bought subscription.
     * @property invoicePayload Invoice payload.
     * @property affiliate Information about the affiliate which received commission from the transaction; may be null if none.
     */
    public class BotSubscriptionSale public constructor(
        public val userId: Long,
        public val subscriptionPeriod: Int,
        public val productInfo: ProductInfoDto,
        public val invoicePayload: ByteArray,
        public val affiliate: AffiliateInfoDto?,
    ) : StarTransactionTypeDto() {
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
            other as BotSubscriptionSale
            if (other.userId != userId) {
                return false
            }
            if (other.subscriptionPeriod != subscriptionPeriod) {
                return false
            }
            if (other.productInfo != productInfo) {
                return false
            }
            val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
            if (!invoicePayloadEquals) {
                return false
            }
            return other.affiliate == affiliate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + subscriptionPeriod.hashCode()
            hashCode = 31 * hashCode + productInfo.hashCode()
            hashCode = 31 * hashCode + invoicePayload.contentHashCode()
            hashCode = 31 * hashCode + affiliate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BotSubscriptionSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("subscriptionPeriod=")
                append(subscriptionPeriod)
                append(", ")
                append("productInfo=")
                append(productInfo)
                append(", ")
                append("invoicePayload=")
                invoicePayload
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("affiliate=")
                append(affiliate)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of a subscription to a channel chat by the current user; for regular users only.
     *
     * @property chatId Identifier of the channel chat that created the subscription.
     * @property subscriptionPeriod The number of seconds between consecutive Telegram Star debitings.
     */
    public class ChannelSubscriptionPurchase public constructor(
        public val chatId: Long,
        public val subscriptionPeriod: Int,
    ) : StarTransactionTypeDto() {
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
            other as ChannelSubscriptionPurchase
            if (other.chatId != chatId) {
                return false
            }
            return other.subscriptionPeriod == subscriptionPeriod
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + subscriptionPeriod.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelSubscriptionPurchase")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("subscriptionPeriod=")
                append(subscriptionPeriod)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of a subscription by the channel chat; for channel chats only.
     *
     * @property userId Identifier of the user that bought the subscription.
     * @property subscriptionPeriod The number of seconds between consecutive Telegram Star debitings.
     */
    public class ChannelSubscriptionSale public constructor(
        public val userId: Long,
        public val subscriptionPeriod: Int,
    ) : StarTransactionTypeDto() {
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
            other as ChannelSubscriptionSale
            if (other.userId != userId) {
                return false
            }
            return other.subscriptionPeriod == subscriptionPeriod
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + subscriptionPeriod.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelSubscriptionSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("subscriptionPeriod=")
                append(subscriptionPeriod)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of a regular gift; for regular users and bots only.
     *
     * @property ownerId Identifier of the user or the channel that received the gift.
     * @property gift The gift.
     */
    public class GiftPurchase public constructor(
        public val ownerId: MessageSenderDto,
        public val gift: GiftDto,
    ) : StarTransactionTypeDto() {
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
            other as GiftPurchase
            if (other.ownerId != ownerId) {
                return false
            }
            return other.gift == gift
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + ownerId.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.GiftPurchase")
                append("(")
                append("ownerId=")
                append(ownerId)
                append(", ")
                append("gift=")
                append(gift)
                append(")")
            }
        }
    }

    /**
     * The transaction is a transfer of an upgraded gift; for regular users only.
     *
     * @property ownerId Identifier of the user or the channel that received the gift.
     * @property gift The gift.
     */
    public class GiftTransfer public constructor(
        public val ownerId: MessageSenderDto,
        public val gift: UpgradedGiftDto,
    ) : StarTransactionTypeDto() {
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
            other as GiftTransfer
            if (other.ownerId != ownerId) {
                return false
            }
            return other.gift == gift
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + ownerId.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.GiftTransfer")
                append("(")
                append("ownerId=")
                append(ownerId)
                append(", ")
                append("gift=")
                append(gift)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sale of a received gift; for regular users and channel chats only.
     *
     * @property userId Identifier of the user that sent the gift.
     * @property gift The gift.
     */
    public class GiftSale public constructor(
        public val userId: Long,
        public val gift: GiftDto,
    ) : StarTransactionTypeDto() {
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
            other as GiftSale
            if (other.userId != userId) {
                return false
            }
            return other.gift == gift
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.GiftSale")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("gift=")
                append(gift)
                append(")")
            }
        }
    }

    /**
     * The transaction is an upgrade of a gift; for regular users only.
     *
     * @property userId Identifier of the user that initially sent the gift.
     * @property gift The upgraded gift.
     */
    public class GiftUpgrade public constructor(
        public val userId: Long,
        public val gift: UpgradedGiftDto,
    ) : StarTransactionTypeDto() {
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
            other as GiftUpgrade
            if (other.userId != userId) {
                return false
            }
            return other.gift == gift
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.GiftUpgrade")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("gift=")
                append(gift)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sending of a paid reaction to a message in a channel chat by the current user; for regular users only.
     *
     * @property chatId Identifier of the channel chat.
     * @property messageId Identifier of the reacted message; can be 0 or an identifier of a deleted message.
     */
    public class ChannelPaidReactionSend public constructor(
        public val chatId: Long,
        public val messageId: Long,
    ) : StarTransactionTypeDto() {
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
            other as ChannelPaidReactionSend
            if (other.chatId != chatId) {
                return false
            }
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelPaidReactionSend")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * The transaction is a receiving of a paid reaction to a message by the channel chat; for channel chats only.
     *
     * @property userId Identifier of the user that added the paid reaction.
     * @property messageId Identifier of the reacted message; can be 0 or an identifier of a deleted message.
     */
    public class ChannelPaidReactionReceive public constructor(
        public val userId: Long,
        public val messageId: Long,
    ) : StarTransactionTypeDto() {
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
            other as ChannelPaidReactionReceive
            if (other.userId != userId) {
                return false
            }
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.ChannelPaidReactionReceive")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * The transaction is a receiving of a commission from an affiliate program; for regular users, bots and channel chats only.
     *
     * @property chatId Identifier of the chat that created the affiliate program.
     * @property commissionPerMille The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the program owner.
     */
    public class AffiliateProgramCommission public constructor(
        public val chatId: Long,
        public val commissionPerMille: Int,
    ) : StarTransactionTypeDto() {
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
            other as AffiliateProgramCommission
            if (other.chatId != chatId) {
                return false
            }
            return other.commissionPerMille == commissionPerMille
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + commissionPerMille.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.AffiliateProgramCommission")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("commissionPerMille=")
                append(commissionPerMille)
                append(")")
            }
        }
    }

    /**
     * The transaction is a sending of a paid message; for regular users only.
     *
     * @property chatId Identifier of the chat that received the payment.
     * @property messageCount Number of sent paid messages.
     */
    public class PaidMessageSend public constructor(
        public val chatId: Long,
        public val messageCount: Int,
    ) : StarTransactionTypeDto() {
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
            other as PaidMessageSend
            if (other.chatId != chatId) {
                return false
            }
            return other.messageCount == messageCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.PaidMessageSend")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageCount=")
                append(messageCount)
                append(")")
            }
        }
    }

    /**
     * The transaction is a receiving of a paid message; for regular users and supergroup chats only.
     *
     * @property senderId Identifier of the sender of the message.
     * @property messageCount Number of received paid messages.
     * @property commissionPerMille The number of Telegram Stars received by the Telegram for each 1000 Telegram Stars paid for message sending.
     * @property commissionStarAmount The amount of Telegram Stars that were received by Telegram; can be negative for refunds.
     */
    public class PaidMessageReceive public constructor(
        public val senderId: MessageSenderDto,
        public val messageCount: Int,
        public val commissionPerMille: Int,
        public val commissionStarAmount: StarAmountDto,
    ) : StarTransactionTypeDto() {
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
            other as PaidMessageReceive
            if (other.senderId != senderId) {
                return false
            }
            if (other.messageCount != messageCount) {
                return false
            }
            if (other.commissionPerMille != commissionPerMille) {
                return false
            }
            return other.commissionStarAmount == commissionStarAmount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + senderId.hashCode()
            hashCode = 31 * hashCode + messageCount.hashCode()
            hashCode = 31 * hashCode + commissionPerMille.hashCode()
            hashCode = 31 * hashCode + commissionStarAmount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.PaidMessageReceive")
                append("(")
                append("senderId=")
                append(senderId)
                append(", ")
                append("messageCount=")
                append(messageCount)
                append(", ")
                append("commissionPerMille=")
                append(commissionPerMille)
                append(", ")
                append("commissionStarAmount=")
                append(commissionStarAmount)
                append(")")
            }
        }
    }

    /**
     * The transaction is a purchase of Telegram Premium subscription; for regular users and bots only.
     *
     * @property userId Identifier of the user that received the Telegram Premium subscription.
     * @property monthCount Number of months the Telegram Premium subscription will be active.
     * @property sticker A sticker to be shown in the transaction information; may be null if unknown.
     */
    public class PremiumPurchase public constructor(
        public val userId: Long,
        public val monthCount: Int,
        public val sticker: StickerDto?,
    ) : StarTransactionTypeDto() {
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
            other as PremiumPurchase
            if (other.userId != userId) {
                return false
            }
            if (other.monthCount != monthCount) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.PremiumPurchase")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("monthCount=")
                append(monthCount)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * The transaction is a transfer of Telegram Stars to a business bot; for regular users only.
     *
     * @property userId Identifier of the bot that received Telegram Stars.
     */
    public class BusinessBotTransferSend public constructor(
        public val userId: Long,
    ) : StarTransactionTypeDto() {
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
            other as BusinessBotTransferSend
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BusinessBotTransferSend")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * The transaction is a transfer of Telegram Stars from a business account; for bots only.
     *
     * @property userId Identifier of the user that sent Telegram Stars.
     */
    public class BusinessBotTransferReceive public constructor(
        public val userId: Long,
    ) : StarTransactionTypeDto() {
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
            other as BusinessBotTransferReceive
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarTransactionTypeDto.BusinessBotTransferReceive")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * The transaction is a transaction of an unsupported type.
     */
    public class Unsupported public constructor() : StarTransactionTypeDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "StarTransactionTypeDto.Unsupported()"
        }
    }
}
