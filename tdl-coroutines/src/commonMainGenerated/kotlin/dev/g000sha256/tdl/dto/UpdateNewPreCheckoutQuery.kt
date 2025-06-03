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
 * A new incoming pre-checkout query; for bots only. Contains full information about a checkout.
 *
 * @property id Unique query identifier.
 * @property senderUserId Identifier of the user who sent the query.
 * @property currency Currency for the product price.
 * @property totalAmount Total price for the product, in the smallest units of the currency.
 * @property invoicePayload Invoice payload.
 * @property shippingOptionId Identifier of a shipping option chosen by the user; may be empty if not applicable.
 * @property orderInfo Information about the order; may be null.
 */
public class UpdateNewPreCheckoutQuery public constructor(
    public val id: Long,
    public val senderUserId: Long,
    public val currency: String,
    public val totalAmount: Long,
    public val invoicePayload: ByteArray,
    public val shippingOptionId: String,
    public val orderInfo: OrderInfo?,
) : Update() {
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
        other as UpdateNewPreCheckoutQuery
        if (other.id != id) {
            return false
        }
        if (other.senderUserId != senderUserId) {
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
        if (other.shippingOptionId != shippingOptionId) {
            return false
        }
        return other.orderInfo == orderInfo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + totalAmount.hashCode()
        hashCode = 31 * hashCode + invoicePayload.contentHashCode()
        hashCode = 31 * hashCode + shippingOptionId.hashCode()
        hashCode = 31 * hashCode + orderInfo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewPreCheckoutQuery")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
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
            append("shippingOptionId=")
            append(shippingOptionId)
            append(", ")
            append("orderInfo=")
            append(orderInfo)
            append(")")
        }
    }
}
