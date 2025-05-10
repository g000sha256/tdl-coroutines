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

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String

/**
 * The list of recently used stickers was updated.
 *
 * @property isAttached True, if the list of stickers attached to photo or video files was updated; otherwise, the list of sent stickers is updated.
 * @property stickerIds The new list of file identifiers of recently used stickers.
 */
public class RecentStickersUpdateDto public constructor(
    public val isAttached: Boolean,
    public val stickerIds: IntArray,
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
        other as RecentStickersUpdateDto
        if (other.isAttached != isAttached) {
            return false
        }
        return other.stickerIds.contentEquals(stickerIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isAttached.hashCode()
        hashCode = 31 * hashCode + stickerIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("RecentStickersUpdateDto")
            append("(")
            append("isAttached=")
            append(isAttached)
            append(", ")
            append("stickerIds=")
            stickerIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
