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
 * A new incoming shipping query; for bots only. Only for invoices with flexible price.
 *
 * @property id Unique query identifier.
 * @property senderUserId Identifier of the user who sent the query.
 * @property invoicePayload Invoice payload.
 * @property shippingAddress User shipping address.
 */
public class UpdateNewShippingQuery public constructor(
    public val id: Long,
    public val senderUserId: Long,
    public val invoicePayload: String,
    public val shippingAddress: Address,
) : Update() {
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
        other as UpdateNewShippingQuery
        if (other.id != id) {
            return false
        }
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.invoicePayload != invoicePayload) {
            return false
        }
        return other.shippingAddress == shippingAddress
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + invoicePayload.hashCode()
        hashCode = 31 * hashCode + shippingAddress.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewShippingQuery")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("invoicePayload=")
            append(invoicePayload)
            append(", ")
            append("shippingAddress=")
            append(shippingAddress)
            append(")")
        }
    }
}
