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
 * Describes theme settings.
 *
 * @property accentColor Theme accent color in ARGB format.
 * @property background The background to be used in chats; may be null.
 * @property outgoingMessageFill The fill to be used as a background for outgoing messages.
 * @property animateOutgoingMessageFill If true, the freeform gradient fill needs to be animated on every sent message.
 * @property outgoingMessageAccentColor Accent color of outgoing messages in ARGB format.
 */
public class ThemeSettingsDto public constructor(
    public val accentColor: Int,
    public val background: BackgroundDto?,
    public val outgoingMessageFill: BackgroundFillDto,
    public val animateOutgoingMessageFill: Boolean,
    public val outgoingMessageAccentColor: Int,
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
        other as ThemeSettingsDto
        if (other.accentColor != accentColor) {
            return false
        }
        if (other.background != background) {
            return false
        }
        if (other.outgoingMessageFill != outgoingMessageFill) {
            return false
        }
        if (other.animateOutgoingMessageFill != animateOutgoingMessageFill) {
            return false
        }
        return other.outgoingMessageAccentColor == outgoingMessageAccentColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + accentColor.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        hashCode = 31 * hashCode + outgoingMessageFill.hashCode()
        hashCode = 31 * hashCode + animateOutgoingMessageFill.hashCode()
        hashCode = 31 * hashCode + outgoingMessageAccentColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ThemeSettingsDto")
            append("(")
            append("accentColor=")
            append(accentColor)
            append(", ")
            append("background=")
            append(background)
            append(", ")
            append("outgoingMessageFill=")
            append(outgoingMessageFill)
            append(", ")
            append("animateOutgoingMessageFill=")
            append(animateOutgoingMessageFill)
            append(", ")
            append("outgoingMessageAccentColor=")
            append(outgoingMessageAccentColor)
            append(")")
        }
    }
}
