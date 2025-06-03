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
 * TDLib needs the user's email address to authorize. Call setAuthenticationEmailAddress to provide the email address, or directly call checkAuthenticationEmailCode with Apple ID/Google ID token if allowed.
 *
 * @property allowAppleId True, if authorization through Apple ID is allowed.
 * @property allowGoogleId True, if authorization through Google ID is allowed.
 */
public class AuthorizationStateWaitEmailAddress public constructor(
    public val allowAppleId: Boolean,
    public val allowGoogleId: Boolean,
) : AuthorizationState() {
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
        other as AuthorizationStateWaitEmailAddress
        if (other.allowAppleId != allowAppleId) {
            return false
        }
        return other.allowGoogleId == allowGoogleId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + allowAppleId.hashCode()
        hashCode = 31 * hashCode + allowGoogleId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthorizationStateWaitEmailAddress")
            append("(")
            append("allowAppleId=")
            append(allowAppleId)
            append(", ")
            append("allowGoogleId=")
            append(allowGoogleId)
            append(")")
        }
    }
}
