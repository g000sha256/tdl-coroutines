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
 * Contains a chat revenue transactions.
 *
 * @property cryptocurrency Cryptocurrency in which revenue is calculated.
 * @property cryptocurrencyAmount The withdrawn amount, in the smallest units of the cryptocurrency.
 * @property type Type of the transaction.
 */
public class ChatRevenueTransaction public constructor(
    public val cryptocurrency: String,
    public val cryptocurrencyAmount: Long,
    public val type: ChatRevenueTransactionType,
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
        other as ChatRevenueTransaction
        if (other.cryptocurrency != cryptocurrency) {
            return false
        }
        if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + cryptocurrency.hashCode()
        hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatRevenueTransaction")
            append("(")
            append("cryptocurrency=")
            append(cryptocurrency)
            append(", ")
            append("cryptocurrencyAmount=")
            append(cryptocurrencyAmount)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
