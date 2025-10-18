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
 * Contains examples of possible upgraded gifts for the given regular gift.
 *
 * @property models Examples of possible models that can be chosen for the gift after upgrade.
 * @property symbols Examples of possible symbols that can be chosen for the gift after upgrade.
 * @property backdrops Examples of possible backdrops that can be chosen for the gift after upgrade.
 * @property prices Examples of price for gift upgrade from the maximum price to the minimum price.
 * @property nextPrices Next changes for the price for gift upgrade with more granularity than in prices.
 */
public class GiftUpgradePreview public constructor(
    public val models: Array<UpgradedGiftModel>,
    public val symbols: Array<UpgradedGiftSymbol>,
    public val backdrops: Array<UpgradedGiftBackdrop>,
    public val prices: Array<GiftUpgradePrice>,
    public val nextPrices: Array<GiftUpgradePrice>,
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
        other as GiftUpgradePreview
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
        val pricesEquals = other.prices.contentDeepEquals(prices)
        if (!pricesEquals) {
            return false
        }
        return other.nextPrices.contentDeepEquals(nextPrices)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + models.contentDeepHashCode()
        hashCode = 31 * hashCode + symbols.contentDeepHashCode()
        hashCode = 31 * hashCode + backdrops.contentDeepHashCode()
        hashCode = 31 * hashCode + prices.contentDeepHashCode()
        hashCode = 31 * hashCode + nextPrices.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftUpgradePreview")
            append("(")
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
            append("prices=")
            prices
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextPrices=")
            nextPrices
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
