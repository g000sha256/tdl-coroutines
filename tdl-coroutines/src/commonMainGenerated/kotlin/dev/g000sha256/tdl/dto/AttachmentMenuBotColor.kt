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
 * Describes a color to highlight a bot added to attachment menu.
 *
 * @property lightColor Color in the RGB format for light themes.
 * @property darkColor Color in the RGB format for dark themes.
 */
public class AttachmentMenuBotColor public constructor(
    public val lightColor: Int,
    public val darkColor: Int,
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
        other as AttachmentMenuBotColor
        if (other.lightColor != lightColor) {
            return false
        }
        return other.darkColor == darkColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + lightColor.hashCode()
        hashCode = 31 * hashCode + darkColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AttachmentMenuBotColor")
            append("(")
            append("lightColor=")
            append(lightColor)
            append(", ")
            append("darkColor=")
            append(darkColor)
            append(")")
        }
    }
}
