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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * A detailed statistics about revenue earned from sponsored messages in a chat.
 *
 * @property revenueByHourGraph A graph containing amount of revenue in a given hour.
 * @property revenueGraph A graph containing amount of revenue.
 * @property revenueAmount Amount of earned revenue.
 * @property usdRate Current conversion rate of the cryptocurrency in which revenue is calculated to USD.
 */
public class ChatRevenueStatistics public constructor(
    public val revenueByHourGraph: StatisticalGraph,
    public val revenueGraph: StatisticalGraph,
    public val revenueAmount: ChatRevenueAmount,
    public val usdRate: Double,
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
        other as ChatRevenueStatistics
        if (other.revenueByHourGraph != revenueByHourGraph) {
            return false
        }
        if (other.revenueGraph != revenueGraph) {
            return false
        }
        if (other.revenueAmount != revenueAmount) {
            return false
        }
        return other.usdRate == usdRate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + revenueByHourGraph.hashCode()
        hashCode = 31 * hashCode + revenueGraph.hashCode()
        hashCode = 31 * hashCode + revenueAmount.hashCode()
        hashCode = 31 * hashCode + usdRate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatRevenueStatistics")
            append("(")
            append("revenueByHourGraph=")
            append(revenueByHourGraph)
            append(", ")
            append("revenueGraph=")
            append(revenueGraph)
            append(", ")
            append("revenueAmount=")
            append(revenueAmount)
            append(", ")
            append("usdRate=")
            append(usdRate)
            append(")")
        }
    }
}
