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
 * Describes subscription plan paid in Telegram Stars.
 *
 * @property period The number of seconds between consecutive Telegram Star debiting.
 * @property starCount The Telegram Star amount that must be paid for each period.
 */
public class StarSubscriptionPricing public constructor(
    public val period: Int,
    public val starCount: Long,
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
        other as StarSubscriptionPricing
        if (other.period != period) {
            return false
        }
        return other.starCount == starCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + period.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarSubscriptionPricing")
            append("(")
            append("period=")
            append(period)
            append(", ")
            append("starCount=")
            append(starCount)
            append(")")
        }
    }
}
