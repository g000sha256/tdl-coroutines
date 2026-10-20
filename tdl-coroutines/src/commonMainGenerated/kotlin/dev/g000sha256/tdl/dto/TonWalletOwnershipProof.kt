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
 * Represents a proof of TON wallet ownership.
 *
 * @property publicKey Public key of the wallet.
 * @property timestamp The current UNIX timestamp which was used to create the proof.
 * @property signature The signature prooving the ownership.
 */
public class TonWalletOwnershipProof public constructor(
    public val publicKey: ByteArray,
    public val timestamp: Int,
    public val signature: ByteArray,
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
        other as TonWalletOwnershipProof
        val publicKeyEquals = other.publicKey.contentEquals(publicKey)
        if (!publicKeyEquals) {
            return false
        }
        if (other.timestamp != timestamp) {
            return false
        }
        return other.signature.contentEquals(signature)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + publicKey.contentHashCode()
        hashCode = 31 * hashCode + timestamp.hashCode()
        hashCode = 31 * hashCode + signature.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletOwnershipProof")
            append("(")
            append("publicKey=")
            publicKey
                .contentToString()
                .also { append(it) }
            append(", ")
            append("timestamp=")
            append(timestamp)
            append(", ")
            append("signature=")
            signature
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
