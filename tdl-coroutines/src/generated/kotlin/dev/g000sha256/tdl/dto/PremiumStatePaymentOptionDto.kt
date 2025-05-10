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
 * Describes an option for buying or upgrading Telegram Premium for self.
 *
 * @property paymentOption Information about the payment option.
 * @property isCurrent True, if this is the currently used Telegram Premium subscription option.
 * @property isUpgrade True, if the payment option can be used to upgrade the existing Telegram Premium subscription.
 * @property lastTransactionId Identifier of the last in-store transaction for the currently used option.
 */
public class PremiumStatePaymentOptionDto public constructor(
    public val paymentOption: PremiumPaymentOptionDto,
    public val isCurrent: Boolean,
    public val isUpgrade: Boolean,
    public val lastTransactionId: String,
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
        other as PremiumStatePaymentOptionDto
        if (other.paymentOption != paymentOption) {
            return false
        }
        if (other.isCurrent != isCurrent) {
            return false
        }
        if (other.isUpgrade != isUpgrade) {
            return false
        }
        return other.lastTransactionId == lastTransactionId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + paymentOption.hashCode()
        hashCode = 31 * hashCode + isCurrent.hashCode()
        hashCode = 31 * hashCode + isUpgrade.hashCode()
        hashCode = 31 * hashCode + lastTransactionId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumStatePaymentOptionDto")
            append("(")
            append("paymentOption=")
            append(paymentOption)
            append(", ")
            append("isCurrent=")
            append(isCurrent)
            append(", ")
            append("isUpgrade=")
            append(isUpgrade)
            append(", ")
            append("lastTransactionId=")
            append(lastTransactionId)
            append(")")
        }
    }
}
