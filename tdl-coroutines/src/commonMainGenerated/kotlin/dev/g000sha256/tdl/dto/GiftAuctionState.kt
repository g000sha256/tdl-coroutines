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
 * Represent auction state of a gift.
 *
 * @property gift The gift.
 * @property state Auction state of the gift.
 */
public class GiftAuctionState public constructor(
    public val gift: Gift,
    public val state: AuctionState,
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
        other as GiftAuctionState
        if (other.gift != gift) {
            return false
        }
        return other.state == state
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftAuctionState")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("state=")
            append(state)
            append(")")
        }
    }
}
