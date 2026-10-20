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
 * Represents a transaction with the TON wallet of the current user.
 *
 * @property id Unique identifier of the transaction.
 * @property peerAddress Address in the TON blockchain of the transaction peer; may be empty if the transaction isn't a wallet transfer.
 * @property peerUserId Identifier of the other user who participated in the transaction; 0 if unknown.
 * @property peerDomain Identifier of the domain assigned to the peer address; may be empty if none.
 * @property date Point in time (Unix timestamp) when the transaction was completed.
 * @property feeAmount The fee amount paid for the transaction in TON Grams, in the smallest units of the cryptocurrency.
 * @property state State of the transaction.
 * @property type Type of the transaction.
 */
public class TonWalletTransaction public constructor(
    public val id: String,
    public val peerAddress: String,
    public val peerUserId: Long,
    public val peerDomain: String,
    public val date: Int,
    public val feeAmount: Long,
    public val state: TonWalletTransactionState,
    public val type: TonWalletTransactionType,
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
        other as TonWalletTransaction
        if (other.id != id) {
            return false
        }
        if (other.peerAddress != peerAddress) {
            return false
        }
        if (other.peerUserId != peerUserId) {
            return false
        }
        if (other.peerDomain != peerDomain) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.feeAmount != feeAmount) {
            return false
        }
        if (other.state != state) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + peerAddress.hashCode()
        hashCode = 31 * hashCode + peerUserId.hashCode()
        hashCode = 31 * hashCode + peerDomain.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + feeAmount.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletTransaction")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("peerAddress=")
            append(peerAddress)
            append(", ")
            append("peerUserId=")
            append(peerUserId)
            append(", ")
            append("peerDomain=")
            append(peerDomain)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("feeAmount=")
            append(feeAmount)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
