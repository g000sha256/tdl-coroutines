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
 * This class is an abstract base class.
 * Describes conditions for sending of away messages by a Telegram Business account.
 */
public sealed class BusinessAwayMessageScheduleDto private constructor() {
    /**
     * Send away messages always.
     */
    public class Always public constructor() : BusinessAwayMessageScheduleDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "BusinessAwayMessageScheduleDto.Always()"
        }
    }

    /**
     * Send away messages outside of the business opening hours.
     */
    public class OutsideOfOpeningHours public constructor() : BusinessAwayMessageScheduleDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "BusinessAwayMessageScheduleDto.OutsideOfOpeningHours()"
        }
    }

    /**
     * Send away messages only in the specified time span.
     *
     * @property startDate Point in time (Unix timestamp) when the away messages will start to be sent.
     * @property endDate Point in time (Unix timestamp) when the away messages will stop to be sent.
     */
    public class Custom public constructor(
        public val startDate: Int,
        public val endDate: Int,
    ) : BusinessAwayMessageScheduleDto() {
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
            other as Custom
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
                append("BusinessAwayMessageScheduleDto.Custom")
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
}
