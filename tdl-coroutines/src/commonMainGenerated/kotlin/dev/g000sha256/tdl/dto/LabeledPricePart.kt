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
import kotlin.Long
import kotlin.String

/**
 * Portion of the price of a product (e.g., &quot;delivery cost&quot;, &quot;tax amount&quot;).
 *
 * @property label Label for this portion of the product price.
 * @property amount Currency amount in the smallest units of the currency.
 */
public class LabeledPricePart public constructor(
    public val label: String,
    public val amount: Long,
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
        other as LabeledPricePart
        if (other.label != label) {
            return false
        }
        return other.amount == amount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + label.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LabeledPricePart")
            append("(")
            append("label=")
            append(label)
            append(", ")
            append("amount=")
            append(amount)
            append(")")
        }
    }
}
