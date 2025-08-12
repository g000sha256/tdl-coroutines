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
import kotlin.Long
import kotlin.String

/**
 * Contains a list of chat revenue transactions.
 *
 * @property tonAmount The amount of owned Toncoins; in the smallest units of the cryptocurrency.
 * @property transactions List of transactions.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class ChatRevenueTransactions public constructor(
    public val tonAmount: Long,
    public val transactions: Array<ChatRevenueTransaction>,
    public val nextOffset: String,
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
        other as ChatRevenueTransactions
        if (other.tonAmount != tonAmount) {
            return false
        }
        val transactionsEquals = other.transactions.contentDeepEquals(transactions)
        if (!transactionsEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + tonAmount.hashCode()
        hashCode = 31 * hashCode + transactions.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatRevenueTransactions")
            append("(")
            append("tonAmount=")
            append(tonAmount)
            append(", ")
            append("transactions=")
            transactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
