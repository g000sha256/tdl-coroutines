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
import kotlin.Long
import kotlin.String

/**
 * Contains TON wallet address of a user.
 *
 * @property userId Identifier of the user; 0 if unknown.
 * @property walletAddress Address of the user's wallet in the TON blockchain.
 * @property publicKey Public key of the user.
 */
public class UserTonWalletAddress public constructor(
    public val userId: Long,
    public val walletAddress: String,
    public val publicKey: ByteArray,
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
        other as UserTonWalletAddress
        if (other.userId != userId) {
            return false
        }
        if (other.walletAddress != walletAddress) {
            return false
        }
        return other.publicKey.contentEquals(publicKey)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + walletAddress.hashCode()
        hashCode = 31 * hashCode + publicKey.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserTonWalletAddress")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("walletAddress=")
            append(walletAddress)
            append(", ")
            append("publicKey=")
            publicKey
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
