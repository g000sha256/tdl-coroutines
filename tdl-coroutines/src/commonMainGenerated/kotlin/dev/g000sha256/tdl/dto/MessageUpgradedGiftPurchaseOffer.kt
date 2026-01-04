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
import kotlin.String

/**
 * An offer to purchase an upgraded gift was sent or received.
 *
 * @property gift The gift.
 * @property state State of the offer.
 * @property price The proposed price.
 * @property expirationDate Point in time (Unix timestamp) when the offer will expire or has expired.
 */
public class MessageUpgradedGiftPurchaseOffer public constructor(
    public val gift: UpgradedGift,
    public val state: GiftPurchaseOfferState,
    public val price: GiftResalePrice,
    public val expirationDate: Int,
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
        other as MessageUpgradedGiftPurchaseOffer
        if (other.gift != gift) {
            return false
        }
        if (other.state != state) {
            return false
        }
        if (other.price != price) {
            return false
        }
        return other.expirationDate == expirationDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + price.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageUpgradedGiftPurchaseOffer")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("price=")
            append(price)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(")")
        }
    }
}
