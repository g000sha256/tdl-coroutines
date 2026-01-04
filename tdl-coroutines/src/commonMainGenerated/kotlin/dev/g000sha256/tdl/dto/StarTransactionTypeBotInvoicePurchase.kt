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
 * The transaction is a purchase of a product from a bot or a business account by the current user; relevant for regular users only.
 *
 * @property userId Identifier of the bot or the business account user that created the invoice.
 * @property productInfo Information about the bought product.
 */
public class StarTransactionTypeBotInvoicePurchase public constructor(
    public val userId: Long,
    public val productInfo: ProductInfo,
) : StarTransactionType() {
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
        other as StarTransactionTypeBotInvoicePurchase
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
            append("StarTransactionTypeBotInvoicePurchase")
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
