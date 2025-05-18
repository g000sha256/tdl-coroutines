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
 * Represents a date according to the Gregorian calendar.
 *
 * @property day Day of the month; 1-31.
 * @property month Month; 1-12.
 * @property year Year; 1-9999.
 */
public class Date public constructor(
    public val day: Int,
    public val month: Int,
    public val year: Int,
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
        other as Date
        if (other.day != day) {
            return false
        }
        if (other.month != month) {
            return false
        }
        return other.year == year
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + day.hashCode()
        hashCode = 31 * hashCode + month.hashCode()
        hashCode = 31 * hashCode + year.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Date")
            append("(")
            append("day=")
            append(day)
            append(", ")
            append("month=")
            append(month)
            append(", ")
            append("year=")
            append(year)
            append(")")
        }
    }
}
