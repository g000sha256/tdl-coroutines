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
 * Describes state of the wallet of the current user in the TON blockchain.
 *
 * @property address Address of the wallet; may be empty if none.
 * @property publicKey Public key of the wallet; may be empty if none.
 * @property gramAmount The total amount of owned TON Grams, in the smallest units of the cryptocurrency.
 * @property isBeingCreated True, if the wallet is being created.
 * @property isBackupEnabled True, if backup for the wallet key is enabled.
 * @property canEnableBackup True, if the user can enable backup for the wallet key.
 * @property canExportPhrase True, if the wallet key can be exported using getTonWalletSecretPhrase.
 */
public class TonWalletState public constructor(
    public val address: String,
    public val publicKey: ByteArray,
    public val gramAmount: Long,
    public val isBeingCreated: Boolean,
    public val isBackupEnabled: Boolean,
    public val canEnableBackup: Boolean,
    public val canExportPhrase: Boolean,
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
        other as TonWalletState
        if (other.address != address) {
            return false
        }
        val publicKeyEquals = other.publicKey.contentEquals(publicKey)
        if (!publicKeyEquals) {
            return false
        }
        if (other.gramAmount != gramAmount) {
            return false
        }
        if (other.isBeingCreated != isBeingCreated) {
            return false
        }
        if (other.isBackupEnabled != isBackupEnabled) {
            return false
        }
        if (other.canEnableBackup != canEnableBackup) {
            return false
        }
        return other.canExportPhrase == canExportPhrase
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + address.hashCode()
        hashCode = 31 * hashCode + publicKey.contentHashCode()
        hashCode = 31 * hashCode + gramAmount.hashCode()
        hashCode = 31 * hashCode + isBeingCreated.hashCode()
        hashCode = 31 * hashCode + isBackupEnabled.hashCode()
        hashCode = 31 * hashCode + canEnableBackup.hashCode()
        hashCode = 31 * hashCode + canExportPhrase.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletState")
            append("(")
            append("address=")
            append(address)
            append(", ")
            append("publicKey=")
            publicKey
                .contentToString()
                .also { append(it) }
            append(", ")
            append("gramAmount=")
            append(gramAmount)
            append(", ")
            append("isBeingCreated=")
            append(isBeingCreated)
            append(", ")
            append("isBackupEnabled=")
            append(isBackupEnabled)
            append(", ")
            append("canEnableBackup=")
            append(canEnableBackup)
            append(", ")
            append("canExportPhrase=")
            append(canExportPhrase)
            append(")")
        }
    }
}
