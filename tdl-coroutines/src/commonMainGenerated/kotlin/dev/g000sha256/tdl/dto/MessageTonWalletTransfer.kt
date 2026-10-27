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
import kotlin.Long
import kotlin.String

/**
 * Represents a transfer with the TON wallet of the current user.
 *
 * @property senderUserId Sender of the transfer; 0 if unknown.
 * @property transactionId Unique identifier of the transaction; may be empty if the transfer isn't sent yet. Use getTonWalletTransaction to get additional information about the transaction.
 * @property peerAddress Address in the TON blockchain of the transaction peer.
 * @property amount The amount of received cryptocurrency, in the smallest units of the cryptocurrency; negative for outgoing transactions.
 * @property comment Comment added to the transaction.
 * @property isCommentEncrypted True, if the comment is encrypted and must be decrypted using the receiver's or sender's private key.
 */
public class MessageTonWalletTransfer public constructor(
    public val senderUserId: Long,
    public val transactionId: String,
    public val peerAddress: String,
    public val amount: Long,
    public val comment: String,
    public val isCommentEncrypted: Boolean,
) : MessageContent() {
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
        other as MessageTonWalletTransfer
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.transactionId != transactionId) {
            return false
        }
        if (other.peerAddress != peerAddress) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        if (other.comment != comment) {
            return false
        }
        return other.isCommentEncrypted == isCommentEncrypted
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + transactionId.hashCode()
        hashCode = 31 * hashCode + peerAddress.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + comment.hashCode()
        hashCode = 31 * hashCode + isCommentEncrypted.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageTonWalletTransfer")
            append("(")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("transactionId=")
            append(transactionId)
            append(", ")
            append("peerAddress=")
            append(peerAddress)
            append(", ")
            append("amount=")
            append(amount)
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
