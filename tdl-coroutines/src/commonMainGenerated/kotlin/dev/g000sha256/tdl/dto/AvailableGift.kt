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
 * Describes a gift that is available for purchase.
 *
 * @property gift The gift.
 * @property resaleCount Number of gifts that are available for resale.
 * @property minResaleStarCount The minimum price for the gifts available for resale in Telegram Star equivalent; 0 if there are no such gifts.
 * @property title The title of the upgraded gift; empty if the gift isn't available for resale.
 */
public class AvailableGift public constructor(
    public val gift: Gift,
    public val resaleCount: Int,
    public val minResaleStarCount: Long,
    public val title: String,
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
        other as AvailableGift
        if (other.gift != gift) {
            return false
        }
        if (other.resaleCount != resaleCount) {
            return false
        }
        if (other.minResaleStarCount != minResaleStarCount) {
            return false
        }
        return other.title == title
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + resaleCount.hashCode()
        hashCode = 31 * hashCode + minResaleStarCount.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AvailableGift")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("resaleCount=")
            append(resaleCount)
            append(", ")
            append("minResaleStarCount=")
            append(minResaleStarCount)
            append(", ")
            append("title=")
            append(title)
            append(")")
        }
    }
}
