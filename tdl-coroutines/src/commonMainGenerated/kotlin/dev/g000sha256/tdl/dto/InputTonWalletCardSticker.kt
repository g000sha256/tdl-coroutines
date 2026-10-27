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
 * Describes a sticker to be placed on the TON wallet card of the current user.
 *
 * @property position Position of the sticker on the card.
 * @property nftAddress Address of an NFT owned by the wallet, which is an upgraded gift; use getTonWalletNfts to get the list of owned NFTs.
 */
public class InputTonWalletCardSticker public constructor(
    public val position: AreaPosition,
    public val nftAddress: String,
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
        other as InputTonWalletCardSticker
        if (other.position != position) {
            return false
        }
        return other.nftAddress == nftAddress
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + position.hashCode()
        hashCode = 31 * hashCode + nftAddress.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputTonWalletCardSticker")
            append("(")
            append("position=")
            append(position)
            append(", ")
            append("nftAddress=")
            append(nftAddress)
            append(")")
        }
    }
}
