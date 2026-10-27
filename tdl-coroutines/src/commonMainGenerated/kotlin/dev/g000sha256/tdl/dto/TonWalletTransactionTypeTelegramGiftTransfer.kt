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
import kotlin.String

/**
 * A Telegram gift was minted as a TON NFT or was transferred from Telegram to the wallet or back; peer details aren't available for the transaction.
 *
 * @property nft The minted or transferred NFT.
 * @property isOutgoing True, if the transfer is from the wallet to Telegram.
 * @property isSaved True, if the gift was displayed on the current user's profile page before or after the transfer.
 */
public class TonWalletTransactionTypeTelegramGiftTransfer public constructor(
    public val nft: TonNft,
    public val isOutgoing: Boolean,
    public val isSaved: Boolean,
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
        other as TonWalletTransactionTypeTelegramGiftTransfer
        if (other.nft != nft) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        return other.isSaved == isSaved
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + nft.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + isSaved.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletTransactionTypeTelegramGiftTransfer")
            append("(")
            append("nft=")
            append(nft)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("isSaved=")
            append(isSaved)
            append(")")
        }
    }
}
