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
 */
public class GiftUpgradePreviewDto public constructor(
    public val models: Array<UpgradedGiftModelDto>,
    public val symbols: Array<UpgradedGiftSymbolDto>,
    public val backdrops: Array<UpgradedGiftBackdropDto>,
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
        other as GiftUpgradePreviewDto
        val modelsEquals = other.models.contentDeepEquals(models)
        if (!modelsEquals) {
            return false
        }
        val symbolsEquals = other.symbols.contentDeepEquals(symbols)
        if (!symbolsEquals) {
            return false
        }
        return other.backdrops.contentDeepEquals(backdrops)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + models.contentDeepHashCode()
        hashCode = 31 * hashCode + symbols.contentDeepHashCode()
        hashCode = 31 * hashCode + backdrops.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftUpgradePreviewDto")
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
            append(")")
        }
    }
}
