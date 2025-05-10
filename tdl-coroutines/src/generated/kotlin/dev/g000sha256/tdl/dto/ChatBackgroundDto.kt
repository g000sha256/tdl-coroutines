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
 * Describes a background set for a specific chat.
 *
 * @property background The background.
 * @property darkThemeDimming Dimming of the background in dark themes, as a percentage; 0-100. Applied only to Wallpaper and Fill types of background.
 */
public class ChatBackgroundDto public constructor(
    public val background: BackgroundDto,
    public val darkThemeDimming: Int,
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
        other as ChatBackgroundDto
        if (other.background != background) {
            return false
        }
        return other.darkThemeDimming == darkThemeDimming
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        hashCode = 31 * hashCode + darkThemeDimming.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBackgroundDto")
            append("(")
            append("background=")
            append(background)
            append(", ")
            append("darkThemeDimming=")
            append(darkThemeDimming)
            append(")")
        }
    }
}
