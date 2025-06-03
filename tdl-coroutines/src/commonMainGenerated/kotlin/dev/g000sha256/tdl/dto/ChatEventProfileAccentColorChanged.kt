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

/**
 * The chat's profile accent color or profile background custom emoji were changed.
 *
 * @property oldProfileAccentColorId Previous identifier of chat's profile accent color; -1 if none.
 * @property oldProfileBackgroundCustomEmojiId Previous identifier of the custom emoji; 0 if none.
 * @property newProfileAccentColorId New identifier of chat's profile accent color; -1 if none.
 * @property newProfileBackgroundCustomEmojiId New identifier of the custom emoji; 0 if none.
 */
public class ChatEventProfileAccentColorChanged public constructor(
    public val oldProfileAccentColorId: Int,
    public val oldProfileBackgroundCustomEmojiId: Long,
    public val newProfileAccentColorId: Int,
    public val newProfileBackgroundCustomEmojiId: Long,
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
        other as ChatEventProfileAccentColorChanged
        if (other.oldProfileAccentColorId != oldProfileAccentColorId) {
            return false
        }
        if (other.oldProfileBackgroundCustomEmojiId != oldProfileBackgroundCustomEmojiId) {
            return false
        }
        if (other.newProfileAccentColorId != newProfileAccentColorId) {
            return false
        }
        return other.newProfileBackgroundCustomEmojiId == newProfileBackgroundCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldProfileAccentColorId.hashCode()
        hashCode = 31 * hashCode + oldProfileBackgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + newProfileAccentColorId.hashCode()
        hashCode = 31 * hashCode + newProfileBackgroundCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventProfileAccentColorChanged")
            append("(")
            append("oldProfileAccentColorId=")
            append(oldProfileAccentColorId)
            append(", ")
            append("oldProfileBackgroundCustomEmojiId=")
            append(oldProfileBackgroundCustomEmojiId)
            append(", ")
            append("newProfileAccentColorId=")
            append(newProfileAccentColorId)
            append(", ")
            append("newProfileBackgroundCustomEmojiId=")
            append(newProfileBackgroundCustomEmojiId)
            append(")")
        }
    }
}
