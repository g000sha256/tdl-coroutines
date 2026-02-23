/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * Toncoins were gifted to a user.
 *
 * @property gifterUserId The identifier of a user who gifted Toncoins; 0 if the gift was anonymous or is outgoing.
 * @property receiverUserId The identifier of a user who received Toncoins; 0 if the gift is incoming.
 * @property tonAmount The received Toncoin amount, in the smallest units of the cryptocurrency.
 * @property transactionId Identifier of the transaction for Toncoin credit; for receiver only.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 */
public class MessageGiftedTon public constructor(
    public val gifterUserId: Long,
    public val receiverUserId: Long,
    public val tonAmount: Long,
    public val transactionId: String,
    public val sticker: Sticker?,
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
        other as MessageGiftedTon
        if (other.gifterUserId != gifterUserId) {
            return false
        }
        if (other.receiverUserId != receiverUserId) {
            return false
        }
        if (other.tonAmount != tonAmount) {
            return false
        }
        if (other.transactionId != transactionId) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gifterUserId.hashCode()
        hashCode = 31 * hashCode + receiverUserId.hashCode()
        hashCode = 31 * hashCode + tonAmount.hashCode()
        hashCode = 31 * hashCode + transactionId.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiftedTon")
            append("(")
            append("gifterUserId=")
            append(gifterUserId)
            append(", ")
            append("receiverUserId=")
            append(receiverUserId)
            append(", ")
            append("tonAmount=")
            append(tonAmount)
            append(", ")
            append("transactionId=")
            append(transactionId)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
