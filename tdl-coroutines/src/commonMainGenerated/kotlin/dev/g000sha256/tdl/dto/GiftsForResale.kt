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
 * Describes gifts available for resale.
 *
 * @property totalCount Total number of gifts found.
 * @property gifts The gifts.
 * @property models Available models; for searchGiftsForResale requests without offset and attributes only.
 * @property symbols Available symbols; for searchGiftsForResale requests without offset and attributes only.
 * @property backdrops Available backdrops; for searchGiftsForResale requests without offset and attributes only.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class GiftsForResale public constructor(
    public val totalCount: Int,
    public val gifts: Array<GiftForResale>,
    public val models: Array<UpgradedGiftModelCount>,
    public val symbols: Array<UpgradedGiftSymbolCount>,
    public val backdrops: Array<UpgradedGiftBackdropCount>,
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
        other as GiftsForResale
        if (other.totalCount != totalCount) {
            return false
        }
        val giftsEquals = other.gifts.contentDeepEquals(gifts)
        if (!giftsEquals) {
            return false
        }
        val modelsEquals = other.models.contentDeepEquals(models)
        if (!modelsEquals) {
            return false
        }
        val symbolsEquals = other.symbols.contentDeepEquals(symbols)
        if (!symbolsEquals) {
            return false
        }
        val backdropsEquals = other.backdrops.contentDeepEquals(backdrops)
        if (!backdropsEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + gifts.contentDeepHashCode()
        hashCode = 31 * hashCode + models.contentDeepHashCode()
        hashCode = 31 * hashCode + symbols.contentDeepHashCode()
        hashCode = 31 * hashCode + backdrops.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftsForResale")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("gifts=")
            gifts
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("models=")
            models
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("symbols=")
            symbols
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("backdrops=")
            backdrops
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
