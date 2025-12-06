/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
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
 * The transaction is a receiving of a paid group call reaction; for regular users and channel chats only.
 *
 * @property senderId Identifier of the sender of the reaction.
 * @property commissionPerMille The number of Telegram Stars received by the Telegram for each 1000 Telegram Stars paid for reaction sending.
 * @property commissionStarAmount The amount of Telegram Stars that were received by Telegram; can be negative for refunds.
 */
public class StarTransactionTypePaidGroupCallReactionReceive public constructor(
    public val senderId: MessageSender,
    public val commissionPerMille: Int,
    public val commissionStarAmount: StarAmount,
) : StarTransactionType() {
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
        other as StarTransactionTypePaidGroupCallReactionReceive
        if (other.senderId != senderId) {
            return false
        }
        if (other.commissionPerMille != commissionPerMille) {
            return false
        }
        return other.commissionStarAmount == commissionStarAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        hashCode = 31 * hashCode + commissionStarAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypePaidGroupCallReactionReceive")
            append("(")
            append("senderId=")
            append(senderId)
            append(", ")
            append("commissionPerMille=")
            append(commissionPerMille)
            append(", ")
            append("commissionStarAmount=")
            append(commissionStarAmount)
            append(")")
        }
    }
}
