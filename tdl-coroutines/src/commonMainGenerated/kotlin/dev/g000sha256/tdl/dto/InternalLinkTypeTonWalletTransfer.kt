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
 * The link is a link for sending Grams from the user's TON wallet.
 *
 * @property receiver Chosen receiver of the transfer; may be null if none.
 * @property gramAmount The pre-filled amount of TON Grams to send; in the smallest units of the cryptocurrency.
 */
public class InternalLinkTypeTonWalletTransfer public constructor(
    public val `receiver`: TonWalletTransferReceiver?,
    public val gramAmount: Long,
) : InternalLinkType() {
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
        other as InternalLinkTypeTonWalletTransfer
        if (other.receiver != receiver) {
            return false
        }
        return other.gramAmount == gramAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + receiver.hashCode()
        hashCode = 31 * hashCode + gramAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeTonWalletTransfer")
            append("(")
            append("receiver=")
            append(receiver)
            append(", ")
            append("gramAmount=")
            append(gramAmount)
            append(")")
        }
    }
}
