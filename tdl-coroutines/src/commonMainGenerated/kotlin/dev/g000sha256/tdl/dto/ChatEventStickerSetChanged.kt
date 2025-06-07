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
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The supergroup sticker set was changed.
 *
 * @property oldStickerSetId Previous identifier of the chat sticker set; 0 if none.
 * @property newStickerSetId New identifier of the chat sticker set; 0 if none.
 */
@SerialName(value = "chatEventStickerSetChanged")
@Serializable
public class ChatEventStickerSetChanged public constructor(
    @SerialName(value = "old_sticker_set_id")
    public val oldStickerSetId: Long,
    @SerialName(value = "new_sticker_set_id")
    public val newStickerSetId: Long,
) : ChatEventAction() {
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
        other as ChatEventStickerSetChanged
        if (other.oldStickerSetId != oldStickerSetId) {
            return false
        }
        return other.newStickerSetId == newStickerSetId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldStickerSetId.hashCode()
        hashCode = 31 * hashCode + newStickerSetId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventStickerSetChanged")
            append("(")
            append("oldStickerSetId=")
            append(oldStickerSetId)
            append(", ")
            append("newStickerSetId=")
            append(newStickerSetId)
            append(")")
        }
    }
}
