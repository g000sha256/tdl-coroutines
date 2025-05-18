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
 * The chat accent color or background custom emoji were changed.
 *
 * @property oldAccentColorId Previous identifier of chat accent color.
 * @property oldBackgroundCustomEmojiId Previous identifier of the custom emoji; 0 if none.
 * @property newAccentColorId New identifier of chat accent color.
 * @property newBackgroundCustomEmojiId New identifier of the custom emoji; 0 if none.
 */
public class ChatEventAccentColorChanged public constructor(
    public val oldAccentColorId: Int,
    public val oldBackgroundCustomEmojiId: Long,
    public val newAccentColorId: Int,
    public val newBackgroundCustomEmojiId: Long,
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
        other as ChatEventAccentColorChanged
        if (other.oldAccentColorId != oldAccentColorId) {
            return false
        }
        if (other.oldBackgroundCustomEmojiId != oldBackgroundCustomEmojiId) {
            return false
        }
        if (other.newAccentColorId != newAccentColorId) {
            return false
        }
        return other.newBackgroundCustomEmojiId == newBackgroundCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldAccentColorId.hashCode()
        hashCode = 31 * hashCode + oldBackgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + newAccentColorId.hashCode()
        hashCode = 31 * hashCode + newBackgroundCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventAccentColorChanged")
            append("(")
            append("oldAccentColorId=")
            append(oldAccentColorId)
            append(", ")
            append("oldBackgroundCustomEmojiId=")
            append(oldBackgroundCustomEmojiId)
            append(", ")
            append("newAccentColorId=")
            append(newAccentColorId)
            append(", ")
            append("newBackgroundCustomEmojiId=")
            append(newBackgroundCustomEmojiId)
            append(")")
        }
    }
}
