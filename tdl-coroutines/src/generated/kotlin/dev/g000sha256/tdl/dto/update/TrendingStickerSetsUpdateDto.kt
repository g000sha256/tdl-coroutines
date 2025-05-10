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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.StickerTypeDto
import dev.g000sha256.tdl.dto.TrendingStickerSetsDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The list of trending sticker sets was updated or some of them were viewed.
 *
 * @property stickerType Type of the affected stickers.
 * @property stickerSets The prefix of the list of trending sticker sets with the newest trending sticker sets.
 */
public class TrendingStickerSetsUpdateDto public constructor(
    public val stickerType: StickerTypeDto,
    public val stickerSets: TrendingStickerSetsDto,
) : UpdateDto() {
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
        other as TrendingStickerSetsUpdateDto
        if (other.stickerType != stickerType) {
            return false
        }
        return other.stickerSets == stickerSets
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + stickerType.hashCode()
        hashCode = 31 * hashCode + stickerSets.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TrendingStickerSetsUpdateDto")
            append("(")
            append("stickerType=")
            append(stickerType)
            append(", ")
            append("stickerSets=")
            append(stickerSets)
            append(")")
        }
    }
}
