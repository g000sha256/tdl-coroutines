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
 * The payment was done using a third-party payment provider.
 *
 * @property paymentProviderUserId User identifier of the payment provider bot.
 * @property invoice Information about the invoice.
 * @property orderInfo Order information; may be null.
 * @property shippingOption Chosen shipping option; may be null.
 * @property credentialsTitle Title of the saved credentials chosen by the buyer.
 * @property tipAmount The amount of tip chosen by the buyer in the smallest units of the currency.
 */
public class PaymentReceiptTypeRegular public constructor(
    public val paymentProviderUserId: Long,
    public val invoice: Invoice,
    public val orderInfo: OrderInfo?,
    public val shippingOption: ShippingOption?,
    public val credentialsTitle: String,
    public val tipAmount: Long,
) : PaymentReceiptType() {
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
        other as PaymentReceiptTypeRegular
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
            append("PaymentReceiptTypeRegular")
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
