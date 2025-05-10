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
 * Describes a symbol shown on the pattern of an upgraded gift.
 *
 * @property name Name of the symbol.
 * @property sticker The sticker representing the symbol.
 * @property rarityPerMille The number of upgraded gifts that receive this symbol for each 1000 gifts upgraded.
 */
public class UpgradedGiftSymbolDto public constructor(
    public val name: String,
    public val sticker: StickerDto,
    public val rarityPerMille: Int,
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
        other as UpgradedGiftSymbolDto
        if (other.name != name) {
            return false
        }
        if (other.sticker != sticker) {
            return false
        }
        return other.rarityPerMille == rarityPerMille
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + rarityPerMille.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftSymbolDto")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("sticker=")
            append(sticker)
            append(", ")
            append("rarityPerMille=")
            append(rarityPerMille)
            append(")")
        }
    }
}
