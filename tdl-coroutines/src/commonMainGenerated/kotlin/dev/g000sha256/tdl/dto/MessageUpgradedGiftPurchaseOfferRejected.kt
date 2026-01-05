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
 * An offer to purchase a gift was rejected or expired.
 *
 * @property gift The gift.
 * @property price The proposed price.
 * @property offerMessageId Identifier of the message with purchase offer which was rejected or expired; may be 0 or an identifier of a deleted message.
 * @property wasExpired True, if the offer has expired; otherwise, the offer was explicitly rejected.
 */
public class MessageUpgradedGiftPurchaseOfferRejected public constructor(
    public val gift: UpgradedGift,
    public val price: GiftResalePrice,
    public val offerMessageId: Long,
    public val wasExpired: Boolean,
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
        other as MessageUpgradedGiftPurchaseOfferRejected
        if (other.gift != gift) {
            return false
        }
        if (other.price != price) {
            return false
        }
        if (other.offerMessageId != offerMessageId) {
            return false
        }
        return other.wasExpired == wasExpired
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + price.hashCode()
        hashCode = 31 * hashCode + offerMessageId.hashCode()
        hashCode = 31 * hashCode + wasExpired.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageUpgradedGiftPurchaseOfferRejected")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("price=")
            append(price)
            append(", ")
            append("offerMessageId=")
            append(offerMessageId)
            append(", ")
            append("wasExpired=")
            append(wasExpired)
            append(")")
        }
    }
}
