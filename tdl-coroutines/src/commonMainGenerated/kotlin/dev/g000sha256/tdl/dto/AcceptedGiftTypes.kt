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
 * Describes gift types that are accepted by a user.
 *
 * @property unlimitedGifts True, if unlimited regular gifts are accepted.
 * @property limitedGifts True, if limited regular gifts are accepted.
 * @property upgradedGifts True, if upgraded gifts and regular gifts that can be upgraded for free are accepted.
 * @property premiumSubscription True, if Telegram Premium subscription is accepted.
 */
public class AcceptedGiftTypes public constructor(
    public val unlimitedGifts: Boolean,
    public val limitedGifts: Boolean,
    public val upgradedGifts: Boolean,
    public val premiumSubscription: Boolean,
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
        other as AcceptedGiftTypes
        if (other.unlimitedGifts != unlimitedGifts) {
            return false
        }
        if (other.limitedGifts != limitedGifts) {
            return false
        }
        if (other.upgradedGifts != upgradedGifts) {
            return false
        }
        return other.premiumSubscription == premiumSubscription
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + unlimitedGifts.hashCode()
        hashCode = 31 * hashCode + limitedGifts.hashCode()
        hashCode = 31 * hashCode + upgradedGifts.hashCode()
        hashCode = 31 * hashCode + premiumSubscription.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AcceptedGiftTypes")
            append("(")
            append("unlimitedGifts=")
            append(unlimitedGifts)
            append(", ")
            append("limitedGifts=")
            append(limitedGifts)
            append(", ")
            append("upgradedGifts=")
            append(upgradedGifts)
            append(", ")
            append("premiumSubscription=")
            append(premiumSubscription)
            append(")")
        }
    }
}
