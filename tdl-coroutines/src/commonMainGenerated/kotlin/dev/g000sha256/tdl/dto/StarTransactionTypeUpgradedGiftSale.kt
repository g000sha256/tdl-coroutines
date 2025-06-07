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
 * The transaction is a sale of an upgraded gift; for regular users only.
 *
 * @property userId Identifier of the user that bought the gift.
 * @property gift The gift.
 * @property affiliate Information about commission received by Telegram from the transaction.
 */
@SerialName(value = "starTransactionTypeUpgradedGiftSale")
@Serializable
public class StarTransactionTypeUpgradedGiftSale public constructor(
    @SerialName(value = "user_id")
    public val userId: Long,
    @SerialName(value = "gift")
    public val gift: UpgradedGift,
    @SerialName(value = "affiliate")
    public val affiliate: AffiliateInfo,
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
        other as StarTransactionTypeUpgradedGiftSale
        if (other.userId != userId) {
            return false
        }
        if (other.gift != gift) {
            return false
        }
        return other.affiliate == affiliate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + affiliate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeUpgradedGiftSale")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("gift=")
            append(gift)
            append(", ")
            append("affiliate=")
            append(affiliate)
            append(")")
        }
    }
}
