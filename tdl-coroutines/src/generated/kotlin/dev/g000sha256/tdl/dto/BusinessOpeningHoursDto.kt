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
import kotlin.String

/**
 * Describes opening hours of a business.
 *
 * @property timeZoneId Unique time zone identifier.
 * @property openingHours Intervals of the time when the business is open.
 */
public class BusinessOpeningHoursDto public constructor(
    public val timeZoneId: String,
    public val openingHours: Array<BusinessOpeningHoursIntervalDto>,
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
        other as BusinessOpeningHoursDto
        if (other.timeZoneId != timeZoneId) {
            return false
        }
        return other.openingHours.contentDeepEquals(openingHours)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + timeZoneId.hashCode()
        hashCode = 31 * hashCode + openingHours.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessOpeningHoursDto")
            append("(")
            append("timeZoneId=")
            append(timeZoneId)
            append(", ")
            append("openingHours=")
            openingHours
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
