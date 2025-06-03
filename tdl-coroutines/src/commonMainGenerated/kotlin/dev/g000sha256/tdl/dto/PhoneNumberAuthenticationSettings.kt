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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains settings for the authentication of the user's phone number.
 *
 * @property allowFlashCall Pass true if the authentication code may be sent via a flash call to the specified phone number.
 * @property allowMissedCall Pass true if the authentication code may be sent via a missed call to the specified phone number.
 * @property isCurrentPhoneNumber Pass true if the authenticated phone number is used on the current device.
 * @property hasUnknownPhoneNumber Pass true if there is a SIM card in the current device, but it is not possible to check whether phone number matches.
 * @property allowSmsRetrieverApi For official applications only. True, if the application can use Android SMS Retriever API (requires Google Play Services &gt;= 10.2) to automatically receive the authentication code from the SMS. See https://developers.google.com/identity/sms-retriever/ for more details.
 * @property firebaseAuthenticationSettings For official Android and iOS applications only; pass null otherwise. Settings for Firebase Authentication.
 * @property authenticationTokens List of up to 20 authentication tokens, recently received in updateOption(&quot;authentication_token&quot;) in previously logged out sessions; for setAuthenticationPhoneNumber only.
 */
public class PhoneNumberAuthenticationSettings public constructor(
    public val allowFlashCall: Boolean,
    public val allowMissedCall: Boolean,
    public val isCurrentPhoneNumber: Boolean,
    public val hasUnknownPhoneNumber: Boolean,
    public val allowSmsRetrieverApi: Boolean,
    public val firebaseAuthenticationSettings: FirebaseAuthenticationSettings?,
    public val authenticationTokens: Array<String>,
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
        other as PhoneNumberAuthenticationSettings
        if (other.allowFlashCall != allowFlashCall) {
            return false
        }
        if (other.allowMissedCall != allowMissedCall) {
            return false
        }
        if (other.isCurrentPhoneNumber != isCurrentPhoneNumber) {
            return false
        }
        if (other.hasUnknownPhoneNumber != hasUnknownPhoneNumber) {
            return false
        }
        if (other.allowSmsRetrieverApi != allowSmsRetrieverApi) {
            return false
        }
        if (other.firebaseAuthenticationSettings != firebaseAuthenticationSettings) {
            return false
        }
        return other.authenticationTokens.contentDeepEquals(authenticationTokens)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + allowFlashCall.hashCode()
        hashCode = 31 * hashCode + allowMissedCall.hashCode()
        hashCode = 31 * hashCode + isCurrentPhoneNumber.hashCode()
        hashCode = 31 * hashCode + hasUnknownPhoneNumber.hashCode()
        hashCode = 31 * hashCode + allowSmsRetrieverApi.hashCode()
        hashCode = 31 * hashCode + firebaseAuthenticationSettings.hashCode()
        hashCode = 31 * hashCode + authenticationTokens.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PhoneNumberAuthenticationSettings")
            append("(")
            append("allowFlashCall=")
            append(allowFlashCall)
            append(", ")
            append("allowMissedCall=")
            append(allowMissedCall)
            append(", ")
            append("isCurrentPhoneNumber=")
            append(isCurrentPhoneNumber)
            append(", ")
            append("hasUnknownPhoneNumber=")
            append(hasUnknownPhoneNumber)
            append(", ")
            append("allowSmsRetrieverApi=")
            append(allowSmsRetrieverApi)
            append(", ")
            append("firebaseAuthenticationSettings=")
            append(firebaseAuthenticationSettings)
            append(", ")
            append("authenticationTokens=")
            authenticationTokens
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
