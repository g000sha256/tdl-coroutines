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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A message with an invoice from a bot. Use getInternalLink with internalLinkTypeBotStart to share the invoice.
 *
 * @property productInfo Information about the product.
 * @property currency Currency for the product price.
 * @property totalAmount Product total price in the smallest units of the currency.
 * @property startParameter Unique invoice bot startParameter to be passed to getInternalLink.
 * @property isTest True, if the invoice is a test invoice.
 * @property needShippingAddress True, if the shipping address must be specified.
 * @property receiptMessageId The identifier of the message with the receipt, after the product has been purchased.
 * @property paidMedia Extended media attached to the invoice; may be null if none.
 * @property paidMediaCaption Extended media caption; may be null if none.
 */
@SerialName(value = "messageInvoice")
@Serializable
public class MessageInvoice public constructor(
    @SerialName(value = "product_info")
    public val productInfo: ProductInfo,
    @SerialName(value = "currency")
    public val currency: String,
    @SerialName(value = "total_amount")
    public val totalAmount: Long,
    @SerialName(value = "start_parameter")
    public val startParameter: String,
    @SerialName(value = "is_test")
    public val isTest: Boolean,
    @SerialName(value = "need_shipping_address")
    public val needShippingAddress: Boolean,
    @SerialName(value = "receipt_message_id")
    public val receiptMessageId: Long,
    @SerialName(value = "paid_media")
    public val paidMedia: PaidMedia?,
    @SerialName(value = "paid_media_caption")
    public val paidMediaCaption: FormattedText?,
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
        other as MessageInvoice
        if (other.productInfo != productInfo) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.totalAmount != totalAmount) {
            return false
        }
        if (other.startParameter != startParameter) {
            return false
        }
        if (other.isTest != isTest) {
            return false
        }
        if (other.needShippingAddress != needShippingAddress) {
            return false
        }
        if (other.receiptMessageId != receiptMessageId) {
            return false
        }
        if (other.paidMedia != paidMedia) {
            return false
        }
        return other.paidMediaCaption == paidMediaCaption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + productInfo.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + startParameter.hashCode()
        hashCode = 31 * hashCode + isTest.hashCode()
        hashCode = 31 * hashCode + needShippingAddress.hashCode()
        hashCode = 31 * hashCode + receiptMessageId.hashCode()
        hashCode = 31 * hashCode + paidMedia.hashCode()
        hashCode = 31 * hashCode + paidMediaCaption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageInvoice")
            append("(")
            append("productInfo=")
            append(productInfo)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("totalAmount=")
            append(totalAmount)
            append(", ")
            append("startParameter=")
            append(startParameter)
            append(", ")
            append("isTest=")
            append(isTest)
            append(", ")
            append("needShippingAddress=")
            append(needShippingAddress)
            append(", ")
            append("receiptMessageId=")
            append(receiptMessageId)
            append(", ")
            append("paidMedia=")
            append(paidMedia)
            append(", ")
            append("paidMediaCaption=")
            append(paidMediaCaption)
            append(")")
        }
    }
}
