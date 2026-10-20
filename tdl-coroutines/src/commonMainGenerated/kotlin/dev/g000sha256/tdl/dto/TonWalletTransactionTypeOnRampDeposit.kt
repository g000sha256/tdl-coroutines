/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * The transaction is a deposit from an on-ramp provider.
 *
 * @property amount The amount of received cryptocurrency, in the smallest units of the cryptocurrency.
 * @property providerName Name of the on-ramp provider.
 */
public class TonWalletTransactionTypeOnRampDeposit public constructor(
    public val amount: Long,
    public val providerName: String,
) : TonWalletTransactionType() {
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
        other as TonWalletTransactionTypeOnRampDeposit
        if (other.amount != amount) {
            return false
        }
        return other.providerName == providerName
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + providerName.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletTransactionTypeOnRampDeposit")
            append("(")
            append("amount=")
            append(amount)
            append(", ")
            append("providerName=")
            append(providerName)
            append(")")
        }
    }
}
