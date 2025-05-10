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
 * Describes reset state of an email address.
 */
public sealed class EmailAddressResetStateDto private constructor() {
    /**
     * Email address can be reset after the given period. Call resetAuthenticationEmailAddress to reset it and allow the user to authorize with a code sent to the user's phone number.
     *
     * @property waitPeriod Time required to wait before the email address can be reset; 0 if the user is subscribed to Telegram Premium.
     */
    public class Available public constructor(
        public val waitPeriod: Int,
    ) : EmailAddressResetStateDto() {
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
            other as Available
            return other.waitPeriod == waitPeriod
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + waitPeriod.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("EmailAddressResetStateDto.Available")
                append("(")
                append("waitPeriod=")
                append(waitPeriod)
                append(")")
            }
        }
    }

    /**
     * Email address reset has already been requested. Call resetAuthenticationEmailAddress to check whether immediate reset is possible.
     *
     * @property resetIn Left time before the email address will be reset, in seconds. updateAuthorizationState is not sent when this field changes.
     */
    public class Pending public constructor(
        public val resetIn: Int,
    ) : EmailAddressResetStateDto() {
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
            return other.resetIn == resetIn
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + resetIn.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("EmailAddressResetStateDto.Pending")
                append("(")
                append("resetIn=")
                append(resetIn)
                append(")")
            }
        }
    }
}
