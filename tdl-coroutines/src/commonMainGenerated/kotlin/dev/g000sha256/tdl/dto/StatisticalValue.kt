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
 * A value with information about its recent changes.
 *
 * @property value The current value.
 * @property previousValue The value for the previous day.
 * @property growthRatePercentage The growth rate of the value, as a percentage.
 */
public class StatisticalValue public constructor(
    public val value: Double,
    public val previousValue: Double,
    public val growthRatePercentage: Double,
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
        other as StatisticalValue
        if (other.value != value) {
            return false
        }
        if (other.previousValue != previousValue) {
            return false
        }
        return other.growthRatePercentage == growthRatePercentage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + value.hashCode()
        hashCode = 31 * hashCode + previousValue.hashCode()
        hashCode = 31 * hashCode + growthRatePercentage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StatisticalValue")
            append("(")
            append("value=")
            append(value)
            append(", ")
            append("previousValue=")
            append(previousValue)
            append(", ")
            append("growthRatePercentage=")
            append(growthRatePercentage)
            append(")")
        }
    }
}
