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
 * This class is an abstract base class.
 * Describes type of successful payment.
 */
public sealed class PaymentReceiptTypeDto private constructor() {
    /**
     * The payment was done using a third-party payment provider.
     *
     * @property paymentProviderUserId User identifier of the payment provider bot.
     * @property invoice Information about the invoice.
     * @property orderInfo Order information; may be null.
     * @property shippingOption Chosen shipping option; may be null.
     * @property credentialsTitle Title of the saved credentials chosen by the buyer.
     * @property tipAmount The amount of tip chosen by the buyer in the smallest units of the currency.
     */
    public class Regular public constructor(
        public val paymentProviderUserId: Long,
        public val invoice: InvoiceDto,
        public val orderInfo: OrderInfoDto?,
        public val shippingOption: ShippingOptionDto?,
        public val credentialsTitle: String,
        public val tipAmount: Long,
    ) : PaymentReceiptTypeDto() {
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
            other as Regular
            if (other.paymentProviderUserId != paymentProviderUserId) {
                return false
            }
            if (other.invoice != invoice) {
                return false
            }
            if (other.orderInfo != orderInfo) {
                return false
            }
            if (other.shippingOption != shippingOption) {
                return false
            }
            if (other.credentialsTitle != credentialsTitle) {
                return false
            }
            return other.tipAmount == tipAmount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + paymentProviderUserId.hashCode()
            hashCode = 31 * hashCode + invoice.hashCode()
            hashCode = 31 * hashCode + orderInfo.hashCode()
            hashCode = 31 * hashCode + shippingOption.hashCode()
            hashCode = 31 * hashCode + credentialsTitle.hashCode()
            hashCode = 31 * hashCode + tipAmount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentReceiptTypeDto.Regular")
                append("(")
                append("paymentProviderUserId=")
                append(paymentProviderUserId)
                append(", ")
                append("invoice=")
                append(invoice)
                append(", ")
                append("orderInfo=")
                append(orderInfo)
                append(", ")
                append("shippingOption=")
                append(shippingOption)
                append(", ")
                append("credentialsTitle=")
                append(credentialsTitle)
                append(", ")
                append("tipAmount=")
                append(tipAmount)
                append(")")
            }
        }
    }

    /**
     * The payment was done using Telegram Stars.
     *
     * @property starCount Number of Telegram Stars that were paid.
     * @property transactionId Unique identifier of the transaction that can be used to dispute it.
     */
    public class Stars public constructor(
        public val starCount: Long,
        public val transactionId: String,
    ) : PaymentReceiptTypeDto() {
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
            if (other.starCount != starCount) {
                return false
            }
            return other.transactionId == transactionId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + transactionId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentReceiptTypeDto.Stars")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("transactionId=")
                append(transactionId)
                append(")")
            }
        }
    }
}
