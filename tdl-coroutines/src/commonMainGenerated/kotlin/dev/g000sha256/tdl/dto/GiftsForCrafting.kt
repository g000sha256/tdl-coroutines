/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
import kotlin.String

/**
 * Represents a list of gifts received by a user or a chat.
 *
 * @property totalCount The total number of received gifts.
 * @property gifts The list of gifts.
 * @property attributePersistenceProbabilities The 4 objects that describe probabilities of the crafted gift to have the backdrop or symbol of one of the original gifts for the cases when 1, 2, 3 or 4 gifts are used in the craft correspondingly.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class GiftsForCrafting public constructor(
    public val totalCount: Int,
    public val gifts: Array<ReceivedGift>,
    public val attributePersistenceProbabilities: Array<AttributeCraftPersistenceProbability>,
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
        other as GiftsForCrafting
        if (other.totalCount != totalCount) {
            return false
        }
        val giftsEquals = other.gifts.contentDeepEquals(gifts)
        if (!giftsEquals) {
            return false
        }
        val attributePersistenceProbabilitiesEquals = other.attributePersistenceProbabilities.contentDeepEquals(attributePersistenceProbabilities)
        if (!attributePersistenceProbabilitiesEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + gifts.contentDeepHashCode()
        hashCode = 31 * hashCode + attributePersistenceProbabilities.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftsForCrafting")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("gifts=")
            gifts
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("attributePersistenceProbabilities=")
            attributePersistenceProbabilities
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
