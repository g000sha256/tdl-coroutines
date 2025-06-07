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
 * Represents the current state of 2-step verification.
 *
 * @property hasPassword True, if a 2-step verification password is set.
 * @property passwordHint Hint for the password; may be empty.
 * @property hasRecoveryEmailAddress True, if a recovery email is set.
 * @property hasPassportData True, if some Telegram Passport elements were saved.
 * @property recoveryEmailAddressCodeInfo Information about the recovery email address to which the confirmation email was sent; may be null.
 * @property loginEmailAddressPattern Pattern of the email address set up for logging in.
 * @property pendingResetDate If not 0, point in time (Unix timestamp) after which the 2-step verification password can be reset immediately using resetPassword.
 */
@SerialName(value = "passwordState")
@Serializable
public class PasswordState public constructor(
    @SerialName(value = "has_password")
    public val hasPassword: Boolean,
    @SerialName(value = "password_hint")
    public val passwordHint: String,
    @SerialName(value = "has_recovery_email_address")
    public val hasRecoveryEmailAddress: Boolean,
    @SerialName(value = "has_passport_data")
    public val hasPassportData: Boolean,
    @SerialName(value = "recovery_email_address_code_info")
    public val recoveryEmailAddressCodeInfo: EmailAddressAuthenticationCodeInfo?,
    @SerialName(value = "login_email_address_pattern")
    public val loginEmailAddressPattern: String,
    @SerialName(value = "pending_reset_date")
    public val pendingResetDate: Int,
) : Model() {
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
        other as PasswordState
        if (other.hasPassword != hasPassword) {
            return false
        }
        if (other.passwordHint != passwordHint) {
            return false
        }
        if (other.hasRecoveryEmailAddress != hasRecoveryEmailAddress) {
            return false
        }
        if (other.hasPassportData != hasPassportData) {
            return false
        }
        if (other.recoveryEmailAddressCodeInfo != recoveryEmailAddressCodeInfo) {
            return false
        }
        if (other.loginEmailAddressPattern != loginEmailAddressPattern) {
            return false
        }
        return other.pendingResetDate == pendingResetDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + hasPassword.hashCode()
        hashCode = 31 * hashCode + passwordHint.hashCode()
        hashCode = 31 * hashCode + hasRecoveryEmailAddress.hashCode()
        hashCode = 31 * hashCode + hasPassportData.hashCode()
        hashCode = 31 * hashCode + recoveryEmailAddressCodeInfo.hashCode()
        hashCode = 31 * hashCode + loginEmailAddressPattern.hashCode()
        hashCode = 31 * hashCode + pendingResetDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PasswordState")
            append("(")
            append("hasPassword=")
            append(hasPassword)
            append(", ")
            append("passwordHint=")
            append(passwordHint)
            append(", ")
            append("hasRecoveryEmailAddress=")
            append(hasRecoveryEmailAddress)
            append(", ")
            append("hasPassportData=")
            append(hasPassportData)
            append(", ")
            append("recoveryEmailAddressCodeInfo=")
            append(recoveryEmailAddressCodeInfo)
            append(", ")
            append("loginEmailAddressPattern=")
            append(loginEmailAddressPattern)
            append(", ")
            append("pendingResetDate=")
            append(pendingResetDate)
            append(")")
        }
    }
}
