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
 * Describes price of a resold gift in Toncoins.
 *
 * @property toncoinCentCount The amount of 1/100 of Toncoin expected to be paid for the gift. Must be in the range getOption(&quot;gift_resale_toncoin_cent_count_min&quot;)-getOption(&quot;gift_resale_toncoin_cent_count_max&quot;).
 */
public class GiftResalePriceTon public constructor(
    public val toncoinCentCount: Long,
) : GiftResalePrice() {
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
        other as GiftResalePriceTon
        return other.toncoinCentCount == toncoinCentCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + toncoinCentCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftResalePriceTon")
            append("(")
            append("toncoinCentCount=")
            append(toncoinCentCount)
            append(")")
        }
    }
}
