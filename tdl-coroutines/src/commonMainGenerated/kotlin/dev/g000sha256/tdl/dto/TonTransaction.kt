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
 * Represents a transaction changing the amount of owned Toncoins.
 *
 * @property id Unique identifier of the transaction.
 * @property tonAmount The amount of added owned Toncoins; negative for outgoing transactions.
 * @property isRefund True, if the transaction is a refund of a previous transaction.
 * @property date Point in time (Unix timestamp) when the transaction was completed.
 * @property type Type of the transaction.
 */
public class TonTransaction public constructor(
    public val id: String,
    public val tonAmount: Long,
    public val isRefund: Boolean,
    public val date: Int,
    public val type: TonTransactionType,
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
        other as TonTransaction
        if (other.id != id) {
            return false
        }
        if (other.tonAmount != tonAmount) {
            return false
        }
        if (other.isRefund != isRefund) {
            return false
        }
        if (other.date != date) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + tonAmount.hashCode()
        hashCode = 31 * hashCode + isRefund.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonTransaction")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("tonAmount=")
            append(tonAmount)
            append(", ")
            append("isRefund=")
            append(isRefund)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
