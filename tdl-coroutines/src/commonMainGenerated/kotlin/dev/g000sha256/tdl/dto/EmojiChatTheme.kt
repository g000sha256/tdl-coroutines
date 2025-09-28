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
 * Describes a chat theme based on an emoji.
 *
 * @property name Theme name.
 * @property lightSettings Theme settings for a light chat theme.
 * @property darkSettings Theme settings for a dark chat theme.
 */
public class EmojiChatTheme public constructor(
    public val name: String,
    public val lightSettings: ThemeSettings,
    public val darkSettings: ThemeSettings,
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
        other as EmojiChatTheme
        if (other.name != name) {
            return false
        }
        if (other.lightSettings != lightSettings) {
            return false
        }
        return other.darkSettings == darkSettings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + lightSettings.hashCode()
        hashCode = 31 * hashCode + darkSettings.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EmojiChatTheme")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("lightSettings=")
            append(lightSettings)
            append(", ")
            append("darkSettings=")
            append(darkSettings)
            append(")")
        }
    }
}
