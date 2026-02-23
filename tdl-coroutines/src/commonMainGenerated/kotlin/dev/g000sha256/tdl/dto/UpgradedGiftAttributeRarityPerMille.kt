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
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The rarity is represented as the numeric frequence of the model.
 *
 * @property perMille The number of upgraded gifts that receive this attribute for each 1000 gifts upgraded; if 0, then it can be shown as &quot;&lt;0.1%&quot;.
 */
public class UpgradedGiftAttributeRarityPerMille public constructor(
    public val perMille: Int,
) : UpgradedGiftAttributeRarity() {
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
        other as UpgradedGiftAttributeRarityPerMille
        return other.perMille == perMille
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + perMille.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftAttributeRarityPerMille")
            append("(")
            append("perMille=")
            append(perMille)
            append(")")
        }
    }
}
