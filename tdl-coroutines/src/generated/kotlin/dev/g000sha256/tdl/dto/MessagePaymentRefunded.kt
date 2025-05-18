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
 * A payment has been refunded.
 *
 * @property ownerId Identifier of the previous owner of the Telegram Stars that refunds them.
 * @property currency Currency for the price of the product.
 * @property totalAmount Total price for the product, in the smallest units of the currency.
 * @property invoicePayload Invoice payload; only for bots.
 * @property telegramPaymentChargeId Telegram payment identifier.
 * @property providerPaymentChargeId Provider payment identifier.
 */
public class MessagePaymentRefunded public constructor(
    public val ownerId: MessageSender,
    public val currency: String,
    public val totalAmount: Long,
    public val invoicePayload: ByteArray,
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
        other as MessagePaymentRefunded
        if (other.ownerId != ownerId) {
            return false
        }
        if (other.currency != currency) {
            return false
        }
        if (other.totalAmount != totalAmount) {
            return false
        }
        val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
        if (!invoicePayloadEquals) {
            return false
        }
        if (other.telegramPaymentChargeId != telegramPaymentChargeId) {
            return false
        }
        return other.providerPaymentChargeId == providerPaymentChargeId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + ownerId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + invoicePayload.contentHashCode()
        hashCode = 31 * hashCode + telegramPaymentChargeId.hashCode()
        hashCode = 31 * hashCode + providerPaymentChargeId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePaymentRefunded")
            append("(")
            append("ownerId=")
            append(ownerId)
            append(", ")
            append("currency=")
            append(currency)
            append(", ")
            append("totalAmount=")
            append(totalAmount)
            append(", ")
            append("invoicePayload=")
            invoicePayload
                .contentToString()
                .also { append(it) }
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
