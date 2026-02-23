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
import kotlin.Long
import kotlin.String

/**
 * Represents a single button in a bot keyboard.
 *
 * @property text Text of the button.
 * @property iconCustomEmojiId Identifier of the custom emoji that must be shown on the button; 0 if none.
 * @property style Style of the button.
 * @property type Type of the button.
 */
public class KeyboardButton public constructor(
    public val text: String,
    public val iconCustomEmojiId: Long,
    public val style: ButtonStyle,
    public val type: KeyboardButtonType,
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
        other as KeyboardButton
        if (other.text != text) {
            return false
        }
        if (other.iconCustomEmojiId != iconCustomEmojiId) {
            return false
        }
        if (other.style != style) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + iconCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + style.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("KeyboardButton")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("iconCustomEmojiId=")
            append(iconCustomEmojiId)
            append(", ")
            append("style=")
            append(style)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
