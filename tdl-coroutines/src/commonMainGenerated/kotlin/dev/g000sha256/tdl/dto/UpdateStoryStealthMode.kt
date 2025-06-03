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
 * Story stealth mode settings have changed.
 *
 * @property activeUntilDate Point in time (Unix timestamp) until stealth mode is active; 0 if it is disabled.
 * @property cooldownUntilDate Point in time (Unix timestamp) when stealth mode can be enabled again; 0 if there is no active cooldown.
 */
public class UpdateStoryStealthMode public constructor(
    public val activeUntilDate: Int,
    public val cooldownUntilDate: Int,
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
        other as UpdateStoryStealthMode
        if (other.activeUntilDate != activeUntilDate) {
            return false
        }
        return other.cooldownUntilDate == cooldownUntilDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + activeUntilDate.hashCode()
        hashCode = 31 * hashCode + cooldownUntilDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateStoryStealthMode")
            append("(")
            append("activeUntilDate=")
            append(activeUntilDate)
            append(", ")
            append("cooldownUntilDate=")
            append(cooldownUntilDate)
            append(")")
        }
    }
}
