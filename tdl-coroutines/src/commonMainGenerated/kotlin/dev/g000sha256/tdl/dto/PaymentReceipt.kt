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
 * Contains information about a successful payment.
 *
 * @property productInfo Information about the product.
 * @property date Point in time (Unix timestamp) when the payment was made.
 * @property sellerBotUserId User identifier of the seller bot.
 * @property type Type of the payment receipt.
 */
public class PaymentReceipt public constructor(
    public val productInfo: ProductInfo,
    public val date: Int,
    public val sellerBotUserId: Long,
    public val type: PaymentReceiptType,
) {
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
        other as PaymentReceipt
        if (other.productInfo != productInfo) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.sellerBotUserId != sellerBotUserId) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + productInfo.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + sellerBotUserId.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PaymentReceipt")
            append("(")
            append("productInfo=")
            append(productInfo)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("sellerBotUserId=")
            append(sellerBotUserId)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
