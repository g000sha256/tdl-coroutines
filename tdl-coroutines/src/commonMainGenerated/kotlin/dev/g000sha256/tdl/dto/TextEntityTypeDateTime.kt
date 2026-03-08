/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A data and time.
 *
 * @property unixTime Point in time (Unix timestamp) representing the data and time.
 * @property formattingType Date and time formatting type; may be null if none and the original text must not be changed.
 */
public class TextEntityTypeDateTime public constructor(
    public val unixTime: Int,
    public val formattingType: DateTimeFormattingType?,
) : TextEntityType() {
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
        other as TextEntityTypeDateTime
        if (other.unixTime != unixTime) {
            return false
        }
        return other.formattingType == formattingType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + unixTime.hashCode()
        hashCode = 31 * hashCode + formattingType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextEntityTypeDateTime")
            append("(")
            append("unixTime=")
            append(unixTime)
            append(", ")
            append("formattingType=")
            append(formattingType)
            append(")")
        }
    }
}
