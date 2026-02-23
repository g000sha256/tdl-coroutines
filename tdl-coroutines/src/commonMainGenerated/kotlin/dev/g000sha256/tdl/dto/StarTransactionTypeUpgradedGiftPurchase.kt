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
 * The transaction is a purchase of an upgraded gift for some user or channel; relevant for regular users only.
 *
 * @property userId Identifier of the user who sold the gift.
 * @property gift The gift.
 */
public class StarTransactionTypeUpgradedGiftPurchase public constructor(
    public val userId: Long,
    public val gift: UpgradedGift,
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
        other as StarTransactionTypeUpgradedGiftPurchase
        if (other.userId != userId) {
            return false
        }
        return other.gift == gift
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeUpgradedGiftPurchase")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("gift=")
            append(gift)
            append(")")
        }
    }
}
