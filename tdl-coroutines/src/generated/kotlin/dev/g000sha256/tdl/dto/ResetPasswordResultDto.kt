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
 * Represents result of 2-step verification password reset.
 */
public sealed class ResetPasswordResultDto private constructor() {
    /**
     * The password was reset.
     */
    public class Ok public constructor() : ResetPasswordResultDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ResetPasswordResultDto.Ok()"
        }
    }

    /**
     * The password reset request is pending.
     *
     * @property pendingResetDate Point in time (Unix timestamp) after which the password can be reset immediately using resetPassword.
     */
    public class Pending public constructor(
        public val pendingResetDate: Int,
    ) : ResetPasswordResultDto() {
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
            other as Pending
            return other.pendingResetDate == pendingResetDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + pendingResetDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ResetPasswordResultDto.Pending")
                append("(")
                append("pendingResetDate=")
                append(pendingResetDate)
                append(")")
            }
        }
    }

    /**
     * The password reset request was declined.
     *
     * @property retryDate Point in time (Unix timestamp) when the password reset can be retried.
     */
    public class Declined public constructor(
        public val retryDate: Int,
    ) : ResetPasswordResultDto() {
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
            other as Declined
            return other.retryDate == retryDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + retryDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ResetPasswordResultDto.Declined")
                append("(")
                append("retryDate=")
                append(retryDate)
                append(")")
            }
        }
    }
}
