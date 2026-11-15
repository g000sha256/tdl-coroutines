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
 * Describes a TON wallet of the user, who is used in a widget query.
 *
 * @property address Address of the wallet.
 * @property gramAmount Balance of the wallet, in the smallest units of the cryptocurrency.
 * @property publicKey Public key of the wallet; may be empty if unknown.
 * @property stateInit Serialized StateInit of the wallet contract; must be empty if and only if publicKey is empty.
 */
public class WidgetQueryWallet public constructor(
    public val address: String,
    public val gramAmount: Long,
    public val publicKey: ByteArray,
    public val stateInit: ByteArray,
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
        other as WidgetQueryWallet
        if (other.address != address) {
            return false
        }
        if (other.gramAmount != gramAmount) {
            return false
        }
        val publicKeyEquals = other.publicKey.contentEquals(publicKey)
        if (!publicKeyEquals) {
            return false
        }
        return other.stateInit.contentEquals(stateInit)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + address.hashCode()
        hashCode = 31 * hashCode + gramAmount.hashCode()
        hashCode = 31 * hashCode + publicKey.contentHashCode()
        hashCode = 31 * hashCode + stateInit.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("WidgetQueryWallet")
            append("(")
            append("address=")
            append(address)
            append(", ")
            append("gramAmount=")
            append(gramAmount)
            append(", ")
            append("publicKey=")
            publicKey
                .contentToString()
                .also { append(it) }
            append(", ")
            append("stateInit=")
            stateInit
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
