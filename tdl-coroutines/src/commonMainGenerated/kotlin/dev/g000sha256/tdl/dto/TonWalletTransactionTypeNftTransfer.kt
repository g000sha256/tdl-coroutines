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
 * A transfer of a TON NFT to or from the wallet.
 *
 * @property nft The transferred NFT.
 * @property isOutgoing True, if the transfer is outgoing.
 * @property comment Comment added to the transaction.
 * @property isCommentEncrypted True, if the comment is encrypted and must be decrypted using the user's private key.
 */
public class TonWalletTransactionTypeNftTransfer public constructor(
    public val nft: TonNft,
    public val isOutgoing: Boolean,
    public val comment: String,
    public val isCommentEncrypted: Boolean,
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
        other as TonWalletTransactionTypeNftTransfer
        if (other.nft != nft) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        if (other.comment != comment) {
            return false
        }
        return other.isCommentEncrypted == isCommentEncrypted
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + nft.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + comment.hashCode()
        hashCode = 31 * hashCode + isCommentEncrypted.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletTransactionTypeNftTransfer")
            append("(")
            append("nft=")
            append(nft)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("comment=")
            append(comment)
            append(", ")
            append("isCommentEncrypted=")
            append(isCommentEncrypted)
            append(")")
        }
    }
}
