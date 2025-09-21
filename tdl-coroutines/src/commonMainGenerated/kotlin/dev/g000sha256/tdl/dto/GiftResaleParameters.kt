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
 * Describes parameters of a unique gift available for resale.
 *
 * @property starCount Resale price of the gift in Telegram Stars.
 * @property toncoinCentCount Resale price of the gift in 1/100 of Toncoin.
 * @property toncoinOnly True, if the gift can be bought only using Toncoins.
 */
public class GiftResaleParameters public constructor(
    public val starCount: Long,
    public val toncoinCentCount: Long,
    public val toncoinOnly: Boolean,
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
        other as GiftResaleParameters
        if (other.starCount != starCount) {
            return false
        }
        if (other.toncoinCentCount != toncoinCentCount) {
            return false
        }
        return other.toncoinOnly == toncoinOnly
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + toncoinCentCount.hashCode()
        hashCode = 31 * hashCode + toncoinOnly.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftResaleParameters")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("toncoinCentCount=")
            append(toncoinCentCount)
            append(", ")
            append("toncoinOnly=")
            append(toncoinOnly)
            append(")")
        }
    }
}
