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
 * The date and time must be shown as absolute timestamps.
 *
 * @property timePrecision The precision with which hours, minutes and seconds are shown.
 * @property datePrecision The precision with which the date is shown.
 * @property showDayOfWeek True, if the day of week must be shown.
 */
public class DateTimeFormattingTypeAbsolute public constructor(
    public val timePrecision: DateTimePartPrecision,
    public val datePrecision: DateTimePartPrecision,
    public val showDayOfWeek: Boolean,
) : DateTimeFormattingType() {
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
        other as DateTimeFormattingTypeAbsolute
        if (other.timePrecision != timePrecision) {
            return false
        }
        if (other.datePrecision != datePrecision) {
            return false
        }
        return other.showDayOfWeek == showDayOfWeek
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + timePrecision.hashCode()
        hashCode = 31 * hashCode + datePrecision.hashCode()
        hashCode = 31 * hashCode + showDayOfWeek.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("DateTimeFormattingTypeAbsolute")
            append("(")
            append("timePrecision=")
            append(timePrecision)
            append(", ")
            append("datePrecision=")
            append(datePrecision)
            append(", ")
            append("showDayOfWeek=")
            append(showDayOfWeek)
            append(")")
        }
    }
}
