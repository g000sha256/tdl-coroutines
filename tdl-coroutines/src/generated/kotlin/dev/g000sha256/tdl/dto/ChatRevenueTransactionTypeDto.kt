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
 * This class is an abstract base class.
 * Describes type of transaction for revenue earned from sponsored messages in a chat.
 */
public sealed class ChatRevenueTransactionTypeDto private constructor() {
    /**
     * Describes earnings from sponsored messages in a chat in some time frame.
     *
     * @property startDate Point in time (Unix timestamp) when the earnings started.
     * @property endDate Point in time (Unix timestamp) when the earnings ended.
     */
    public class Earnings public constructor(
        public val startDate: Int,
        public val endDate: Int,
    ) : ChatRevenueTransactionTypeDto() {
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
            other as Earnings
            if (other.startDate != startDate) {
                return false
            }
            return other.endDate == endDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + startDate.hashCode()
            hashCode = 31 * hashCode + endDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatRevenueTransactionTypeDto.Earnings")
                append("(")
                append("startDate=")
                append(startDate)
                append(", ")
                append("endDate=")
                append(endDate)
                append(")")
            }
        }
    }

    /**
     * Describes a withdrawal of earnings.
     *
     * @property withdrawalDate Point in time (Unix timestamp) when the earnings withdrawal started.
     * @property provider Name of the payment provider.
     * @property state State of the withdrawal.
     */
    public class Withdrawal public constructor(
        public val withdrawalDate: Int,
        public val provider: String,
        public val state: RevenueWithdrawalStateDto,
    ) : ChatRevenueTransactionTypeDto() {
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
            other as Withdrawal
            if (other.withdrawalDate != withdrawalDate) {
                return false
            }
            if (other.provider != provider) {
                return false
            }
            return other.state == state
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + withdrawalDate.hashCode()
            hashCode = 31 * hashCode + provider.hashCode()
            hashCode = 31 * hashCode + state.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatRevenueTransactionTypeDto.Withdrawal")
                append("(")
                append("withdrawalDate=")
                append(withdrawalDate)
                append(", ")
                append("provider=")
                append(provider)
                append(", ")
                append("state=")
                append(state)
                append(")")
            }
        }
    }

    /**
     * Describes a refund for failed withdrawal of earnings.
     *
     * @property refundDate Point in time (Unix timestamp) when the transaction was refunded.
     * @property provider Name of the payment provider.
     */
    public class Refund public constructor(
        public val refundDate: Int,
        public val provider: String,
    ) : ChatRevenueTransactionTypeDto() {
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
            other as Refund
            if (other.refundDate != refundDate) {
                return false
            }
            return other.provider == provider
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + refundDate.hashCode()
            hashCode = 31 * hashCode + provider.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatRevenueTransactionTypeDto.Refund")
                append("(")
                append("refundDate=")
                append(refundDate)
                append(", ")
                append("provider=")
                append(provider)
                append(")")
            }
        }
    }
}
