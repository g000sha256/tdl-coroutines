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
 * Contains information needed to deposit an upgraded gift from the TON wallet of the current user to a Telegram account. The gift must be transferred by an internal message from the wallet to nftAddress with gramAmount attached and with payload as the message body.
 *
 * @property nftAddress Address in TON blockchain to which the message must be sent.
 * @property payload Body of the NFT transfer message.
 * @property gramAmount The amount of TON Grams that must be attached to the message to cover fees, in the smallest units of the cryptocurrency; excess amount will be returned to the wallet.
 */
public class UpgradedGiftDepositInfo public constructor(
    public val nftAddress: String,
    public val payload: ByteArray,
    public val gramAmount: Long,
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
        other as UpgradedGiftDepositInfo
        if (other.nftAddress != nftAddress) {
            return false
        }
        val payloadEquals = other.payload.contentEquals(payload)
        if (!payloadEquals) {
            return false
        }
        return other.gramAmount == gramAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + nftAddress.hashCode()
        hashCode = 31 * hashCode + payload.contentHashCode()
        hashCode = 31 * hashCode + gramAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftDepositInfo")
            append("(")
            append("nftAddress=")
            append(nftAddress)
            append(", ")
            append("payload=")
            payload
                .contentToString()
                .also { append(it) }
            append(", ")
            append("gramAmount=")
            append(gramAmount)
            append(")")
        }
    }
}
