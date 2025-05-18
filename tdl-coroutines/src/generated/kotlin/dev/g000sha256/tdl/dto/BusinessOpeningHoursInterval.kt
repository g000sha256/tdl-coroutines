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
 * Describes an interval of time when the business is open.
 *
 * @property startMinute The minute's sequence number in a week, starting on Monday, marking the start of the time interval during which the business is open; 0-7*24*60.
 * @property endMinute The minute's sequence number in a week, starting on Monday, marking the end of the time interval during which the business is open; 1-8*24*60.
 */
public class BusinessOpeningHoursInterval public constructor(
    public val startMinute: Int,
    public val endMinute: Int,
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
        other as BusinessOpeningHoursInterval
        if (other.startMinute != startMinute) {
            return false
        }
        return other.endMinute == endMinute
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + startMinute.hashCode()
        hashCode = 31 * hashCode + endMinute.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessOpeningHoursInterval")
            append("(")
            append("startMinute=")
            append(startMinute)
            append(", ")
            append("endMinute=")
            append(endMinute)
            append(")")
        }
    }
}
