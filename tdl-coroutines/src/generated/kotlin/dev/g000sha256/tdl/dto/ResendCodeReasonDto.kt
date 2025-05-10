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
 * Describes the reason why a code needs to be re-sent.
 */
public sealed class ResendCodeReasonDto private constructor() {
    /**
     * The user requested to resend the code.
     */
    public class UserRequest public constructor() : ResendCodeReasonDto() {
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
            return "ResendCodeReasonDto.UserRequest()"
        }
    }

    /**
     * The code is re-sent, because device verification has failed.
     *
     * @property errorMessage Cause of the verification failure, for example, PLAYSERVICESNOTAVAILABLE, APNSRECEIVETIMEOUT, or APNSINITFAILED.
     */
    public class VerificationFailed public constructor(
        public val errorMessage: String,
    ) : ResendCodeReasonDto() {
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
            other as VerificationFailed
            return other.errorMessage == errorMessage
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + errorMessage.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ResendCodeReasonDto.VerificationFailed")
                append("(")
                append("errorMessage=")
                append(errorMessage)
                append(")")
            }
        }
    }
}
