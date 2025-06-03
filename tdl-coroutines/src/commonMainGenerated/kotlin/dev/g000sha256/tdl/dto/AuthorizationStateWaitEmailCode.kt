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
 * TDLib needs the user's authentication code sent to an email address to authorize. Call checkAuthenticationEmailCode to provide the code.
 *
 * @property allowAppleId True, if authorization through Apple ID is allowed.
 * @property allowGoogleId True, if authorization through Google ID is allowed.
 * @property codeInfo Information about the sent authentication code.
 * @property emailAddressResetState Reset state of the email address; may be null if the email address can't be reset.
 */
public class AuthorizationStateWaitEmailCode public constructor(
    public val allowAppleId: Boolean,
    public val allowGoogleId: Boolean,
    public val codeInfo: EmailAddressAuthenticationCodeInfo,
    public val emailAddressResetState: EmailAddressResetState?,
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
        other as AuthorizationStateWaitEmailCode
        if (other.allowAppleId != allowAppleId) {
            return false
        }
        if (other.allowGoogleId != allowGoogleId) {
            return false
        }
        if (other.codeInfo != codeInfo) {
            return false
        }
        return other.emailAddressResetState == emailAddressResetState
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + allowAppleId.hashCode()
        hashCode = 31 * hashCode + allowGoogleId.hashCode()
        hashCode = 31 * hashCode + codeInfo.hashCode()
        hashCode = 31 * hashCode + emailAddressResetState.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthorizationStateWaitEmailCode")
            append("(")
            append("allowAppleId=")
            append(allowAppleId)
            append(", ")
            append("allowGoogleId=")
            append(allowGoogleId)
            append(", ")
            append("codeInfo=")
            append(codeInfo)
            append(", ")
            append("emailAddressResetState=")
            append(emailAddressResetState)
            append(")")
        }
    }
}
