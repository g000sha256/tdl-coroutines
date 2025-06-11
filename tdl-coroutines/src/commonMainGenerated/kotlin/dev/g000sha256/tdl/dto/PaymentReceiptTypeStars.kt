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
import kotlin.Long
import kotlin.String

/**
 * The payment was done using Telegram Stars.
 *
 * @property starCount Number of Telegram Stars that were paid.
 * @property transactionId Unique identifier of the transaction that can be used to dispute it.
 */
public class PaymentReceiptTypeStars public constructor(
    public val starCount: Long,
    public val transactionId: String,
) : PaymentReceiptType() {
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
        other as PaymentReceiptTypeStars
        if (other.starCount != starCount) {
            return false
        }
        return other.transactionId == transactionId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + transactionId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PaymentReceiptTypeStars")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("transactionId=")
            append(transactionId)
            append(")")
        }
    }
}
