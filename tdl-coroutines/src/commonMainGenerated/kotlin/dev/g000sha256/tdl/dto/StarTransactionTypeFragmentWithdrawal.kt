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
 * The transaction is a withdrawal of earned Telegram Stars to Fragment; for regular users, bots, supergroup and channel chats only.
 *
 * @property withdrawalState State of the withdrawal; may be null for refunds from Fragment.
 */
public class StarTransactionTypeFragmentWithdrawal public constructor(
    public val withdrawalState: RevenueWithdrawalState?,
) : StarTransactionType() {
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
        other as StarTransactionTypeFragmentWithdrawal
        return other.withdrawalState == withdrawalState
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + withdrawalState.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeFragmentWithdrawal")
            append("(")
            append("withdrawalState=")
            append(withdrawalState)
            append(")")
        }
    }
}
