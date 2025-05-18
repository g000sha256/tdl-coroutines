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
 * Information about the authentication code that was sent.
 *
 * @property phoneNumber A phone number that is being authenticated.
 * @property type The way the code was sent to the user.
 * @property nextType The way the next code will be sent to the user; may be null.
 * @property timeout Timeout before the code can be re-sent, in seconds.
 */
public class AuthenticationCodeInfo public constructor(
    public val phoneNumber: String,
    public val type: AuthenticationCodeType,
    public val nextType: AuthenticationCodeType?,
    public val timeout: Int,
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
        other as AuthenticationCodeInfo
        if (other.phoneNumber != phoneNumber) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.nextType != nextType) {
            return false
        }
        return other.timeout == timeout
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + phoneNumber.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + nextType.hashCode()
        hashCode = 31 * hashCode + timeout.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthenticationCodeInfo")
            append("(")
            append("phoneNumber=")
            append(phoneNumber)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("nextType=")
            append(nextType)
            append(", ")
            append("timeout=")
            append(timeout)
            append(")")
        }
    }
}
