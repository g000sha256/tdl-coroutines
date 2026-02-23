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
import kotlin.String

/**
 * Describes a model of an upgraded gift.
 *
 * @property name Name of the model.
 * @property sticker The sticker representing the upgraded gift.
 * @property rarity The rarity of the model.
 * @property isCrafted True, if the model can be obtained only through gift crafting.
 */
public class UpgradedGiftModel public constructor(
    public val name: String,
    public val sticker: Sticker,
    public val rarity: UpgradedGiftAttributeRarity,
    public val isCrafted: Boolean,
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
        other as UpgradedGiftModel
        if (other.name != name) {
            return false
        }
        if (other.sticker != sticker) {
            return false
        }
        if (other.rarity != rarity) {
            return false
        }
        return other.isCrafted == isCrafted
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + rarity.hashCode()
        hashCode = 31 * hashCode + isCrafted.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftModel")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("sticker=")
            append(sticker)
            append(", ")
            append("rarity=")
            append(rarity)
            append(", ")
            append("isCrafted=")
            append(isCrafted)
            append(")")
        }
    }
}
