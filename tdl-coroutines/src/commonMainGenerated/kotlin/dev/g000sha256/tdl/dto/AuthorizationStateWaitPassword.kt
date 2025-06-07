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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The user has been authorized, but needs to enter a 2-step verification password to start using the application. Call checkAuthenticationPassword to provide the password, or requestAuthenticationPasswordRecovery to recover the password, or deleteAccount to delete the account after a week.
 *
 * @property passwordHint Hint for the password; may be empty.
 * @property hasRecoveryEmailAddress True, if a recovery email address has been set up.
 * @property hasPassportData True, if some Telegram Passport elements were saved.
 * @property recoveryEmailAddressPattern Pattern of the email address to which the recovery email was sent; empty until a recovery email has been sent.
 */
@SerialName(value = "authorizationStateWaitPassword")
@Serializable
public class AuthorizationStateWaitPassword public constructor(
    @SerialName(value = "password_hint")
    public val passwordHint: String,
    @SerialName(value = "has_recovery_email_address")
    public val hasRecoveryEmailAddress: Boolean,
    @SerialName(value = "has_passport_data")
    public val hasPassportData: Boolean,
    @SerialName(value = "recovery_email_address_pattern")
    public val recoveryEmailAddressPattern: String,
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
        other as AuthorizationStateWaitPassword
        if (other.passwordHint != passwordHint) {
            return false
        }
        if (other.hasRecoveryEmailAddress != hasRecoveryEmailAddress) {
            return false
        }
        if (other.hasPassportData != hasPassportData) {
            return false
        }
        return other.recoveryEmailAddressPattern == recoveryEmailAddressPattern
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + passwordHint.hashCode()
        hashCode = 31 * hashCode + hasRecoveryEmailAddress.hashCode()
        hashCode = 31 * hashCode + hasPassportData.hashCode()
        hashCode = 31 * hashCode + recoveryEmailAddressPattern.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthorizationStateWaitPassword")
            append("(")
            append("passwordHint=")
            append(passwordHint)
            append(", ")
            append("hasRecoveryEmailAddress=")
            append(hasRecoveryEmailAddress)
            append(", ")
            append("hasPassportData=")
            append(hasPassportData)
            append(", ")
            append("recoveryEmailAddressPattern=")
            append(recoveryEmailAddressPattern)
            append(")")
        }
    }
}
