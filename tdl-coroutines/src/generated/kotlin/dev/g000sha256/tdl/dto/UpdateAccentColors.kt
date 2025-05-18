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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String

/**
 * The list of supported accent colors has changed.
 *
 * @property colors Information about supported colors; colors with identifiers 0 (red), 1 (orange), 2 (purple/violet), 3 (green), 4 (cyan), 5 (blue), 6 (pink) must always be supported and aren't included in the list. The exact colors for the accent colors with identifiers 0-6 must be taken from the app theme.
 * @property availableAccentColorIds The list of accent color identifiers, which can be set through setAccentColor and setChatAccentColor. The colors must be shown in the specified order.
 */
public class UpdateAccentColors public constructor(
    public val colors: Array<AccentColor>,
    public val availableAccentColorIds: IntArray,
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
        other as UpdateAccentColors
        val colorsEquals = other.colors.contentDeepEquals(colors)
        if (!colorsEquals) {
            return false
        }
        return other.availableAccentColorIds.contentEquals(availableAccentColorIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + colors.contentDeepHashCode()
        hashCode = 31 * hashCode + availableAccentColorIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateAccentColors")
            append("(")
            append("colors=")
            colors
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("availableAccentColorIds=")
            availableAccentColorIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
