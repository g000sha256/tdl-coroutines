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
import kotlin.LongArray
import kotlin.String

/**
 * The list of available message effects has changed.
 *
 * @property reactionEffectIds The new list of available message effects from emoji reactions.
 * @property stickerEffectIds The new list of available message effects from Premium stickers.
 */
public class UpdateAvailableMessageEffects public constructor(
    public val reactionEffectIds: LongArray,
    public val stickerEffectIds: LongArray,
) : Update() {
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
        other as UpdateAvailableMessageEffects
        val reactionEffectIdsEquals = other.reactionEffectIds.contentEquals(reactionEffectIds)
        if (!reactionEffectIdsEquals) {
            return false
        }
        return other.stickerEffectIds.contentEquals(stickerEffectIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + reactionEffectIds.contentHashCode()
        hashCode = 31 * hashCode + stickerEffectIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateAvailableMessageEffects")
            append("(")
            append("reactionEffectIds=")
            reactionEffectIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("stickerEffectIds=")
            stickerEffectIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
