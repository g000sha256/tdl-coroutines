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
 * Send away messages only in the specified time span.
 *
 * @property startDate Point in time (Unix timestamp) when the away messages will start to be sent.
 * @property endDate Point in time (Unix timestamp) when the away messages will stop to be sent.
 */
public class BusinessAwayMessageScheduleCustom public constructor(
    public val startDate: Int,
    public val endDate: Int,
) : BusinessAwayMessageSchedule() {
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
        other as BusinessAwayMessageScheduleCustom
        if (other.startDate != startDate) {
            return false
        }
        return other.endDate == endDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        hashCode = 31 * hashCode + endDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessAwayMessageScheduleCustom")
            append("(")
            append("startDate=")
            append(startDate)
            append(", ")
            append("endDate=")
            append(endDate)
            append(")")
        }
    }
}
