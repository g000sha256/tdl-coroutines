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
 * The transaction is a purchase of Telegram Premium subscription; for regular users and bots only.
 *
 * @property userId Identifier of the user that received the Telegram Premium subscription.
 * @property monthCount Number of months the Telegram Premium subscription will be active.
 * @property sticker A sticker to be shown in the transaction information; may be null if unknown.
 */
public class StarTransactionTypePremiumPurchase public constructor(
    public val userId: Long,
    public val monthCount: Int,
    public val sticker: Sticker?,
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
        other as StarTransactionTypePremiumPurchase
        if (other.userId != userId) {
            return false
        }
        if (other.monthCount != monthCount) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypePremiumPurchase")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
