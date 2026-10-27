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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a TON wallet card, which is shown on the profile page of a user to everyone.
 *
 * @property address Address of the wallet.
 * @property gramAmount Balance of the wallet, in the smallest units of the cryptocurrency; may be slightly outdated.
 * @property stickers Stickers placed on the card.
 * @property backgroundNftAddress Address of the NFT of one of the stickers, whose colors must be used for the card background; may be empty if the default background must be used.
 */
public class TonWalletCard public constructor(
    public val address: String,
    public val gramAmount: Long,
    public val stickers: Array<TonWalletCardSticker>,
    public val backgroundNftAddress: String,
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
        other as TonWalletCard
        if (other.address != address) {
            return false
        }
        if (other.gramAmount != gramAmount) {
            return false
        }
        val stickersEquals = other.stickers.contentDeepEquals(stickers)
        if (!stickersEquals) {
            return false
        }
        return other.backgroundNftAddress == backgroundNftAddress
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + address.hashCode()
        hashCode = 31 * hashCode + gramAmount.hashCode()
        hashCode = 31 * hashCode + stickers.contentDeepHashCode()
        hashCode = 31 * hashCode + backgroundNftAddress.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletCard")
            append("(")
            append("address=")
            append(address)
            append(", ")
            append("gramAmount=")
            append(gramAmount)
            append(", ")
            append("stickers=")
            stickers
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("backgroundNftAddress=")
            append(backgroundNftAddress)
            append(")")
        }
    }
}
