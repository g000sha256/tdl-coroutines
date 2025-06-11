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
 * Contains information about an effect added to a message.
 *
 * @property id Unique identifier of the effect.
 * @property staticIcon Static icon for the effect in WEBP format; may be null if none.
 * @property emoji Emoji corresponding to the effect that can be used if static icon isn't available.
 * @property isPremium True, if Telegram Premium subscription is required to use the effect.
 * @property type Type of the effect.
 */
public class MessageEffect public constructor(
    public val id: Long,
    public val staticIcon: Sticker?,
    public val emoji: String,
    public val isPremium: Boolean,
    public val type: MessageEffectType,
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
        other as MessageEffect
        if (other.id != id) {
            return false
        }
        if (other.staticIcon != staticIcon) {
            return false
        }
        if (other.emoji != emoji) {
            return false
        }
        if (other.isPremium != isPremium) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + staticIcon.hashCode()
        hashCode = 31 * hashCode + emoji.hashCode()
        hashCode = 31 * hashCode + isPremium.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageEffect")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("staticIcon=")
            append(staticIcon)
            append(", ")
            append("emoji=")
            append(emoji)
            append(", ")
            append("isPremium=")
            append(isPremium)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
