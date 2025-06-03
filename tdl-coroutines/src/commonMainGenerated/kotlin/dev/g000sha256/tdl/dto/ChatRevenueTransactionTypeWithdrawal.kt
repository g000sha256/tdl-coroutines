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
 * Describes a withdrawal of earnings.
 *
 * @property withdrawalDate Point in time (Unix timestamp) when the earnings withdrawal started.
 * @property provider Name of the payment provider.
 * @property state State of the withdrawal.
 */
public class ChatRevenueTransactionTypeWithdrawal public constructor(
    public val withdrawalDate: Int,
    public val provider: String,
    public val state: RevenueWithdrawalState,
) : ChatRevenueTransactionType() {
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
        other as ChatRevenueTransactionTypeWithdrawal
        if (other.withdrawalDate != withdrawalDate) {
            return false
        }
        if (other.provider != provider) {
            return false
        }
        return other.state == state
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + withdrawalDate.hashCode()
        hashCode = 31 * hashCode + provider.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatRevenueTransactionTypeWithdrawal")
            append("(")
            append("withdrawalDate=")
            append(withdrawalDate)
            append(", ")
            append("provider=")
            append(provider)
            append(", ")
            append("state=")
            append(state)
            append(")")
        }
    }
}
