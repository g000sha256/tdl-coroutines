/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * The transaction is a sale of an upgraded gift; relevant for regular users only.
 *
 * @property userId Identifier of the user who bought the gift.
 * @property gift The gift.
 * @property commissionPerMille The number of Telegram Stars received by the Telegram for each 1000 Telegram Stars received by the seller of the gift.
 * @property commissionStarAmount The Telegram Star amount that was received by Telegram; can be negative for refunds.
 * @property viaOffer True, if the gift was sold through a purchase offer.
 */
public class StarTransactionTypeUpgradedGiftSale public constructor(
    public val userId: Long,
    public val gift: UpgradedGift,
    public val commissionPerMille: Int,
    public val commissionStarAmount: StarAmount,
    public val viaOffer: Boolean,
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
        if (other.commissionPerMille != commissionPerMille) {
            return false
        }
        if (other.commissionStarAmount != commissionStarAmount) {
            return false
        }
        return other.viaOffer == viaOffer
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        hashCode = 31 * hashCode + commissionStarAmount.hashCode()
        hashCode = 31 * hashCode + viaOffer.hashCode()
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
            append("commissionPerMille=")
            append(commissionPerMille)
            append(", ")
            append("commissionStarAmount=")
            append(commissionStarAmount)
            append(", ")
            append("viaOffer=")
            append(viaOffer)
            append(")")
        }
    }
}
