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
 * Chat accent colors have changed.
 *
 * @property chatId Chat identifier.
 * @property accentColorId The new chat accent color identifier.
 * @property backgroundCustomEmojiId The new identifier of a custom emoji to be shown on the reply header and link preview background; 0 if none.
 * @property profileAccentColorId The new chat profile accent color identifier; -1 if none.
 * @property profileBackgroundCustomEmojiId The new identifier of a custom emoji to be shown on the profile background; 0 if none.
 */
public class UpdateChatAccentColors public constructor(
    public val chatId: Long,
    public val accentColorId: Int,
    public val backgroundCustomEmojiId: Long,
    public val profileAccentColorId: Int,
    public val profileBackgroundCustomEmojiId: Long,
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
        other as UpdateChatAccentColors
        if (other.chatId != chatId) {
            return false
        }
        if (other.accentColorId != accentColorId) {
            return false
        }
        if (other.backgroundCustomEmojiId != backgroundCustomEmojiId) {
            return false
        }
        if (other.profileAccentColorId != profileAccentColorId) {
            return false
        }
        return other.profileBackgroundCustomEmojiId == profileBackgroundCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + backgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + profileAccentColorId.hashCode()
        hashCode = 31 * hashCode + profileBackgroundCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatAccentColors")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("accentColorId=")
            append(accentColorId)
            append(", ")
            append("backgroundCustomEmojiId=")
            append(backgroundCustomEmojiId)
            append(", ")
            append("profileAccentColorId=")
            append(profileAccentColorId)
            append(", ")
            append("profileBackgroundCustomEmojiId=")
            append(profileBackgroundCustomEmojiId)
            append(")")
        }
    }
}
