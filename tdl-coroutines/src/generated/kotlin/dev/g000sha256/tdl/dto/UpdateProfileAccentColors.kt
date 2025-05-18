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
 * The list of supported accent colors for user profiles has changed.
 *
 * @property colors Information about supported colors.
 * @property availableAccentColorIds The list of accent color identifiers, which can be set through setProfileAccentColor and setChatProfileAccentColor. The colors must be shown in the specified order.
 */
public class UpdateProfileAccentColors public constructor(
    public val colors: Array<ProfileAccentColor>,
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
        other as UpdateProfileAccentColors
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
            append("UpdateProfileAccentColors")
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
