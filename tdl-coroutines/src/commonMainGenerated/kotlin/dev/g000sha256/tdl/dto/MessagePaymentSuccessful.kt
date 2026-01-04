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
 * A payment has been sent to a bot or a business account.
 *
 * @property invoiceChatId Identifier of the chat, containing the corresponding invoice message.
 * @property invoiceMessageId Identifier of the message with the corresponding invoice; may be 0 or an identifier of a deleted message.
 * @property currency Currency for the price of the product.
 * @property totalAmount Total price for the product, in the smallest units of the currency.
 * @property subscriptionUntilDate Point in time (Unix timestamp) when the subscription will expire; 0 if unknown or the payment isn't recurring.
 * @property isRecurring True, if this is a recurring payment.
 * @property isFirstRecurring True, if this is the first recurring payment.
 * @property invoiceName Name of the invoice; may be empty if unknown.
 */
public class MessagePaymentSuccessful public constructor(
    public val invoiceChatId: Long,
    public val invoiceMessageId: Long,
    public val currency: String,
    public val totalAmount: Long,
    public val subscriptionUntilDate: Int,
    public val isRecurring: Boolean,
    public val isFirstRecurring: Boolean,
    public val invoiceName: String,
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
        other as MessagePaymentSuccessful
        if (other.invoiceChatId != invoiceChatId) {
            return false
        }
        if (other.invoiceMessageId != invoiceMessageId) {
            return false
        }
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
        return other.invoiceName == invoiceName
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + invoiceChatId.hashCode()
        hashCode = 31 * hashCode + invoiceMessageId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + subscriptionUntilDate.hashCode()
        hashCode = 31 * hashCode + isRecurring.hashCode()
        hashCode = 31 * hashCode + isFirstRecurring.hashCode()
        hashCode = 31 * hashCode + invoiceName.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePaymentSuccessful")
            append("(")
            append("invoiceChatId=")
            append(invoiceChatId)
            append(", ")
            append("invoiceMessageId=")
            append(invoiceMessageId)
            append(", ")
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
            append("invoiceName=")
            append(invoiceName)
            append(")")
        }
    }
}
