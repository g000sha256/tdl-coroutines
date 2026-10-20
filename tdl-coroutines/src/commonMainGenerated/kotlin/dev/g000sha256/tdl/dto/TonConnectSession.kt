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
 * Represents a TON Connect session. See https://github.com/ton-blockchain/ton-connect/tree/main/spec for full TON Connect protocol documentation.
 *
 * @property id Unique identifier of the session.
 * @property dappClientId Hex-encoded public X25519 key of the dApp.
 * @property walletClientId Hex-encoded public X25519 key of the current user's application; may be empty if none.
 * @property creationDate Point in time (Unix timestamp) when the session was created.
 * @property manifest Manifest of the dApp.
 * @property nonce Nonce used for the session.
 * @property state Session state.
 */
public class TonConnectSession public constructor(
    public val id: Long,
    public val dappClientId: String,
    public val walletClientId: String,
    public val creationDate: Int,
    public val manifest: TonConnectManifest,
    public val nonce: ByteArray,
    public val state: TonConnectSessionState,
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
        other as TonConnectSession
        if (other.id != id) {
            return false
        }
        if (other.dappClientId != dappClientId) {
            return false
        }
        if (other.walletClientId != walletClientId) {
            return false
        }
        if (other.creationDate != creationDate) {
            return false
        }
        if (other.manifest != manifest) {
            return false
        }
        val nonceEquals = other.nonce.contentEquals(nonce)
        if (!nonceEquals) {
            return false
        }
        return other.state == state
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + dappClientId.hashCode()
        hashCode = 31 * hashCode + walletClientId.hashCode()
        hashCode = 31 * hashCode + creationDate.hashCode()
        hashCode = 31 * hashCode + manifest.hashCode()
        hashCode = 31 * hashCode + nonce.contentHashCode()
        hashCode = 31 * hashCode + state.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonConnectSession")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("dappClientId=")
            append(dappClientId)
            append(", ")
            append("walletClientId=")
            append(walletClientId)
            append(", ")
            append("creationDate=")
            append(creationDate)
            append(", ")
            append("manifest=")
            append(manifest)
            append(", ")
            append("nonce=")
            nonce
                .contentToString()
                .also { append(it) }
            append(", ")
            append("state=")
            append(state)
            append(")")
        }
    }
}
