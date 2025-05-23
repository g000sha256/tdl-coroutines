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
 * The default background has changed.
 *
 * @property forDarkTheme True, if default background for dark theme has changed.
 * @property background The new default background; may be null.
 */
public class UpdateDefaultBackground public constructor(
    public val forDarkTheme: Boolean,
    public val background: Background?,
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
        other as UpdateDefaultBackground
        if (other.forDarkTheme != forDarkTheme) {
            return false
        }
        return other.background == background
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + forDarkTheme.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateDefaultBackground")
            append("(")
            append("forDarkTheme=")
            append(forDarkTheme)
            append(", ")
            append("background=")
            append(background)
            append(")")
        }
    }
}
