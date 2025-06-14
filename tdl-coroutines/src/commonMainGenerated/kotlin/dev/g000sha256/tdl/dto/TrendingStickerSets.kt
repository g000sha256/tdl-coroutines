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
import kotlin.String

/**
 * Represents a list of trending sticker sets.
 *
 * @property totalCount Approximate total number of trending sticker sets.
 * @property sets List of trending sticker sets.
 * @property isPremium True, if the list contains sticker sets with premium stickers.
 */
public class TrendingStickerSets public constructor(
    public val totalCount: Int,
    public val sets: Array<StickerSetInfo>,
    public val isPremium: Boolean,
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
        other as TrendingStickerSets
        if (other.totalCount != totalCount) {
            return false
        }
        val setsEquals = other.sets.contentDeepEquals(sets)
        if (!setsEquals) {
            return false
        }
        return other.isPremium == isPremium
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + sets.contentDeepHashCode()
        hashCode = 31 * hashCode + isPremium.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TrendingStickerSets")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("sets=")
            sets
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isPremium=")
            append(isPremium)
            append(")")
        }
    }
}
