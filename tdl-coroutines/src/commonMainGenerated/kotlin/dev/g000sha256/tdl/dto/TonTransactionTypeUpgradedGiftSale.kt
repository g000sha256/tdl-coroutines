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
 * The transaction is a sale of an upgraded gift.
 *
 * @property userId Identifier of the user who bought the gift.
 * @property gift The gift.
 * @property commissionPerMille The number of Toncoins received by the Telegram for each 1000 Toncoins received by the seller of the gift.
 * @property commissionToncoinAmount The Toncoin amount that was received by the Telegram; in the smallest units of the currency.
 * @property viaOffer True, if the gift was sold through a purchase offer.
 */
public class TonTransactionTypeUpgradedGiftSale public constructor(
    public val userId: Long,
    public val gift: UpgradedGift,
    public val commissionPerMille: Int,
    public val commissionToncoinAmount: Long,
    public val viaOffer: Boolean,
) : TonTransactionType() {
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
        other as TonTransactionTypeUpgradedGiftSale
        if (other.userId != userId) {
            return false
        }
        if (other.gift != gift) {
            return false
        }
        if (other.commissionPerMille != commissionPerMille) {
            return false
        }
        if (other.commissionToncoinAmount != commissionToncoinAmount) {
            return false
        }
        return other.viaOffer == viaOffer
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        hashCode = 31 * hashCode + commissionToncoinAmount.hashCode()
        hashCode = 31 * hashCode + viaOffer.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonTransactionTypeUpgradedGiftSale")
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
            append("commissionToncoinAmount=")
            append(commissionToncoinAmount)
            append(", ")
            append("viaOffer=")
            append(viaOffer)
            append(")")
        }
    }
}
