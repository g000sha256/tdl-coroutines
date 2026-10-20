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
 * A message with a TON wallet transfer.
 *
 * @property senderUserId Sender of the transfer; 0 if unknown.
 * @property amount String representation of the received amount.
 * @property comment Comment added to the transaction if it is public.
 */
public class PushMessageContentTonWalletTransfer public constructor(
    public val senderUserId: Long,
    public val amount: String,
    public val comment: String,
) : PushMessageContent() {
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
        other as PushMessageContentTonWalletTransfer
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.amount != amount) {
            return false
        }
        return other.comment == comment
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + amount.hashCode()
        hashCode = 31 * hashCode + comment.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PushMessageContentTonWalletTransfer")
            append("(")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("amount=")
            append(amount)
            append(", ")
            append("comment=")
            append(comment)
            append(")")
        }
    }
}
