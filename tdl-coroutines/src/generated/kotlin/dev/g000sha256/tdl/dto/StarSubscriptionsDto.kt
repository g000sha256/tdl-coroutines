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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Represents a list of Telegram Star subscriptions.
 *
 * @property starAmount The amount of owned Telegram Stars.
 * @property subscriptions List of subscriptions for Telegram Stars.
 * @property requiredStarCount The number of Telegram Stars required to buy to extend subscriptions expiring soon.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class StarSubscriptionsDto public constructor(
    public val starAmount: StarAmountDto,
    public val subscriptions: Array<StarSubscriptionDto>,
    public val requiredStarCount: Long,
    public val nextOffset: String,
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
        other as StarSubscriptionsDto
        if (other.starAmount != starAmount) {
            return false
        }
        val subscriptionsEquals = other.subscriptions.contentDeepEquals(subscriptions)
        if (!subscriptionsEquals) {
            return false
        }
        if (other.requiredStarCount != requiredStarCount) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starAmount.hashCode()
        hashCode = 31 * hashCode + subscriptions.contentDeepHashCode()
        hashCode = 31 * hashCode + requiredStarCount.hashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarSubscriptionsDto")
            append("(")
            append("starAmount=")
            append(starAmount)
            append(", ")
            append("subscriptions=")
            subscriptions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("requiredStarCount=")
            append(requiredStarCount)
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
