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
 * A digit-only authentication code is delivered via Firebase Authentication to the official iOS application.
 *
 * @property receipt Receipt of successful application token validation to compare with receipt from push notification.
 * @property pushTimeout Time after the next authentication method is expected to be used if verification push notification isn't received, in seconds.
 * @property length Length of the code.
 */
public class AuthenticationCodeTypeFirebaseIos public constructor(
    public val receipt: String,
    public val pushTimeout: Int,
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
        other as AuthenticationCodeTypeFirebaseIos
        if (other.receipt != receipt) {
            return false
        }
        if (other.pushTimeout != pushTimeout) {
            return false
        }
        return other.length == length
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + receipt.hashCode()
        hashCode = 31 * hashCode + pushTimeout.hashCode()
        hashCode = 31 * hashCode + length.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthenticationCodeTypeFirebaseIos")
            append("(")
            append("receipt=")
            append(receipt)
            append(", ")
            append("pushTimeout=")
            append(pushTimeout)
            append(", ")
            append("length=")
            append(length)
            append(")")
        }
    }
}
