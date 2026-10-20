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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * Represents result of cryptocurrency transfer from the current user's TON wallet.
 *
 * @property isGasless True, if the transfer is gasless.
 * @property msgHash Unique identifier of the sent message; use getTonWalletTransactionByMsgHash to poll information about the transaction.
 * @property transaction The completed transaction; may be null if the transaction is still pending.
 */
public class TonWalletTransferResult public constructor(
    public val isGasless: Boolean,
    public val msgHash: ByteArray,
    public val transaction: TonWalletTransaction?,
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
        other as TonWalletTransferResult
        if (other.isGasless != isGasless) {
            return false
        }
        val msgHashEquals = other.msgHash.contentEquals(msgHash)
        if (!msgHashEquals) {
            return false
        }
        return other.transaction == transaction
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isGasless.hashCode()
        hashCode = 31 * hashCode + msgHash.contentHashCode()
        hashCode = 31 * hashCode + transaction.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletTransferResult")
            append("(")
            append("isGasless=")
            append(isGasless)
            append(", ")
            append("msgHash=")
            msgHash
                .contentToString()
                .also { append(it) }
            append(", ")
            append("transaction=")
            append(transaction)
            append(")")
        }
    }
}
