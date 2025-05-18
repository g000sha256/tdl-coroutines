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
 * Contains information about an active affiliate program.
 *
 * @property parameters Parameters of the affiliate program.
 * @property endDate Point in time (Unix timestamp) when the affiliate program will be closed; 0 if the affiliate program isn't scheduled to be closed. If positive, then the program can't be connected using connectAffiliateProgram, but active connections will work until the date.
 * @property dailyRevenuePerUserAmount The amount of daily revenue per user in Telegram Stars of the bot that created the affiliate program.
 */
public class AffiliateProgramInfo public constructor(
    public val parameters: AffiliateProgramParameters,
    public val endDate: Int,
    public val dailyRevenuePerUserAmount: StarAmount,
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
        other as AffiliateProgramInfo
        if (other.parameters != parameters) {
            return false
        }
        if (other.endDate != endDate) {
            return false
        }
        return other.dailyRevenuePerUserAmount == dailyRevenuePerUserAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + parameters.hashCode()
        hashCode = 31 * hashCode + endDate.hashCode()
        hashCode = 31 * hashCode + dailyRevenuePerUserAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AffiliateProgramInfo")
            append("(")
            append("parameters=")
            append(parameters)
            append(", ")
            append("endDate=")
            append(endDate)
            append(", ")
            append("dailyRevenuePerUserAmount=")
            append(dailyRevenuePerUserAmount)
            append(")")
        }
    }
}
