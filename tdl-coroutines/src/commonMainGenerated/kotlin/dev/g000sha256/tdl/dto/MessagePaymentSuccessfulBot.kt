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
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A payment has been received by the bot or the business account.
 *
 * @property currency Currency for price of the product.
 * @property totalAmount Total price for the product, in the smallest units of the currency.
 * @property subscriptionUntilDate Point in time (Unix timestamp) when the subscription will expire; 0 if unknown or the payment isn't recurring.
 * @property isRecurring True, if this is a recurring payment.
 * @property isFirstRecurring True, if this is the first recurring payment.
 * @property invoicePayload Invoice payload.
 * @property shippingOptionId Identifier of the shipping option chosen by the user; may be empty if not applicable; for bots only.
 * @property orderInfo Information about the order; may be null; for bots only.
 * @property telegramPaymentChargeId Telegram payment identifier.
 * @property providerPaymentChargeId Provider payment identifier.
 */
public class MessagePaymentSuccessfulBot public constructor(
    public val currency: String,
    public val totalAmount: Long,
    public val subscriptionUntilDate: Int,
    public val isRecurring: Boolean,
    public val isFirstRecurring: Boolean,
    public val invoicePayload: ByteArray,
    public val shippingOptionId: String,
    public val orderInfo: OrderInfo?,
    public val telegramPaymentChargeId: String,
    public val providerPaymentChargeId: String,
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
        other as MessagePaymentSuccessfulBot
        if (other.currency != currency) {
            return false
        }
        if (other.totalAmount != totalAmount) {
            return false
        }
        if (other.subscriptionUntilDate != subscriptionUntilDate) {
            return false
        }
        if (other.isRecurring != isRecurring) {
            return false
        }
        if (other.isFirstRecurring != isFirstRecurring) {
            return false
        }
        val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
        if (!invoicePayloadEquals) {
            return false
        }
        if (other.shippingOptionId != shippingOptionId) {
            return false
        }
        if (other.orderInfo != orderInfo) {
            return false
        }
        if (other.telegramPaymentChargeId != telegramPaymentChargeId) {
            return false
        }
        return other.providerPaymentChargeId == providerPaymentChargeId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + subscriptionUntilDate.hashCode()
        hashCode = 31 * hashCode + isRecurring.hashCode()
        hashCode = 31 * hashCode + isFirstRecurring.hashCode()
        hashCode = 31 * hashCode + invoicePayload.contentHashCode()
        hashCode = 31 * hashCode + shippingOptionId.hashCode()
        hashCode = 31 * hashCode + orderInfo.hashCode()
        hashCode = 31 * hashCode + telegramPaymentChargeId.hashCode()
        hashCode = 31 * hashCode + providerPaymentChargeId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePaymentSuccessfulBot")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("totalAmount=")
            append(totalAmount)
            append(", ")
            append("subscriptionUntilDate=")
            append(subscriptionUntilDate)
            append(", ")
            append("isRecurring=")
            append(isRecurring)
            append(", ")
            append("isFirstRecurring=")
            append(isFirstRecurring)
            append(", ")
            append("invoicePayload=")
            invoicePayload
                .contentToString()
                .also { append(it) }
            append(", ")
            append("shippingOptionId=")
            append(shippingOptionId)
            append(", ")
            append("orderInfo=")
            append(orderInfo)
            append(", ")
            append("telegramPaymentChargeId=")
            append(telegramPaymentChargeId)
            append(", ")
            append("providerPaymentChargeId=")
            append(providerPaymentChargeId)
            append(")")
        }
    }
}
