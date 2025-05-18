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
 * An authentication code is delivered by an immediately canceled call to the specified phone number. The last digits of the phone number that calls are the code that must be entered manually by the user.
 *
 * @property phoneNumberPrefix Prefix of the phone number from which the call will be made.
 * @property length Number of digits in the code, excluding the prefix.
 */
public class AuthenticationCodeTypeMissedCall public constructor(
    public val phoneNumberPrefix: String,
    public val length: Int,
) : AuthenticationCodeType() {
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
        other as AuthenticationCodeTypeMissedCall
        if (other.phoneNumberPrefix != phoneNumberPrefix) {
            return false
        }
        return other.length == length
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + phoneNumberPrefix.hashCode()
        hashCode = 31 * hashCode + length.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthenticationCodeTypeMissedCall")
            append("(")
            append("phoneNumberPrefix=")
            append(phoneNumberPrefix)
            append(", ")
            append("length=")
            append(length)
            append(")")
        }
    }
}
