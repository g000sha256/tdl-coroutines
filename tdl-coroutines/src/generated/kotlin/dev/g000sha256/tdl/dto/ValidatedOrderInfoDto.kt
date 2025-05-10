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
 * Contains a temporary identifier of validated order information, which is stored for one hour, and the available shipping options.
 *
 * @property orderInfoId Temporary identifier of the order information.
 * @property shippingOptions Available shipping options.
 */
public class ValidatedOrderInfoDto public constructor(
    public val orderInfoId: String,
    public val shippingOptions: Array<ShippingOptionDto>,
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
        other as ValidatedOrderInfoDto
        if (other.orderInfoId != orderInfoId) {
            return false
        }
        return other.shippingOptions.contentDeepEquals(shippingOptions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + orderInfoId.hashCode()
        hashCode = 31 * hashCode + shippingOptions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ValidatedOrderInfoDto")
            append("(")
            append("orderInfoId=")
            append(orderInfoId)
            append(", ")
            append("shippingOptions=")
            shippingOptions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
