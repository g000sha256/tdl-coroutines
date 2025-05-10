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
 * Represents the current authorization state of the TDLib client.
 */
public sealed class AuthorizationStateDto private constructor() {
    /**
     * Initialization parameters are needed. Call setTdlibParameters to provide them.
     */
    public class WaitTdlibParameters public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.WaitTdlibParameters()"
        }
    }

    /**
     * TDLib needs the user's phone number to authorize. Call setAuthenticationPhoneNumber to provide the phone number, or use requestQrCodeAuthentication or checkAuthenticationBotToken for other authentication options.
     */
    public class WaitPhoneNumber public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.WaitPhoneNumber()"
        }
    }

    /**
     * The user must buy Telegram Premium as an in-store purchase to log in. Call checkAuthenticationPremiumPurchase and then setAuthenticationPremiumPurchaseTransaction.
     *
     * @property storeProductId Identifier of the store product that must be bought.
     */
    public class WaitPremiumPurchase public constructor(
        public val storeProductId: String,
    ) : AuthorizationStateDto() {
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
            other as WaitPremiumPurchase
            return other.storeProductId == storeProductId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storeProductId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthorizationStateDto.WaitPremiumPurchase")
                append("(")
                append("storeProductId=")
                append(storeProductId)
                append(")")
            }
        }
    }

    /**
     * TDLib needs the user's email address to authorize. Call setAuthenticationEmailAddress to provide the email address, or directly call checkAuthenticationEmailCode with Apple ID/Google ID token if allowed.
     *
     * @property allowAppleId True, if authorization through Apple ID is allowed.
     * @property allowGoogleId True, if authorization through Google ID is allowed.
     */
    public class WaitEmailAddress public constructor(
        public val allowAppleId: Boolean,
        public val allowGoogleId: Boolean,
    ) : AuthorizationStateDto() {
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
            other as WaitEmailAddress
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
                append("AuthorizationStateDto.WaitEmailAddress")
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

    /**
     * TDLib needs the user's authentication code sent to an email address to authorize. Call checkAuthenticationEmailCode to provide the code.
     *
     * @property allowAppleId True, if authorization through Apple ID is allowed.
     * @property allowGoogleId True, if authorization through Google ID is allowed.
     * @property codeInfo Information about the sent authentication code.
     * @property emailAddressResetState Reset state of the email address; may be null if the email address can't be reset.
     */
    public class WaitEmailCode public constructor(
        public val allowAppleId: Boolean,
        public val allowGoogleId: Boolean,
        public val codeInfo: EmailAddressAuthenticationCodeInfoDto,
        public val emailAddressResetState: EmailAddressResetStateDto?,
    ) : AuthorizationStateDto() {
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
            other as WaitEmailCode
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
                append("AuthorizationStateDto.WaitEmailCode")
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

    /**
     * TDLib needs the user's authentication code to authorize. Call checkAuthenticationCode to check the code.
     *
     * @property codeInfo Information about the authorization code that was sent.
     */
    public class WaitCode public constructor(
        public val codeInfo: AuthenticationCodeInfoDto,
    ) : AuthorizationStateDto() {
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
            other as WaitCode
            return other.codeInfo == codeInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + codeInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthorizationStateDto.WaitCode")
                append("(")
                append("codeInfo=")
                append(codeInfo)
                append(")")
            }
        }
    }

    /**
     * The user needs to confirm authorization on another logged in device by scanning a QR code with the provided link.
     *
     * @property link A tg:// URL for the QR code. The link will be updated frequently.
     */
    public class WaitOtherDeviceConfirmation public constructor(
        public val link: String,
    ) : AuthorizationStateDto() {
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
            other as WaitOtherDeviceConfirmation
            return other.link == link
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + link.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthorizationStateDto.WaitOtherDeviceConfirmation")
                append("(")
                append("link=")
                append(link)
                append(")")
            }
        }
    }

    /**
     * The user is unregistered and need to accept terms of service and enter their first name and last name to finish registration. Call registerUser to accept the terms of service and provide the data.
     *
     * @property termsOfService Telegram terms of service.
     */
    public class WaitRegistration public constructor(
        public val termsOfService: TermsOfServiceDto,
    ) : AuthorizationStateDto() {
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
            other as WaitRegistration
            return other.termsOfService == termsOfService
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + termsOfService.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthorizationStateDto.WaitRegistration")
                append("(")
                append("termsOfService=")
                append(termsOfService)
                append(")")
            }
        }
    }

    /**
     * The user has been authorized, but needs to enter a 2-step verification password to start using the application. Call checkAuthenticationPassword to provide the password, or requestAuthenticationPasswordRecovery to recover the password, or deleteAccount to delete the account after a week.
     *
     * @property passwordHint Hint for the password; may be empty.
     * @property hasRecoveryEmailAddress True, if a recovery email address has been set up.
     * @property hasPassportData True, if some Telegram Passport elements were saved.
     * @property recoveryEmailAddressPattern Pattern of the email address to which the recovery email was sent; empty until a recovery email has been sent.
     */
    public class WaitPassword public constructor(
        public val passwordHint: String,
        public val hasRecoveryEmailAddress: Boolean,
        public val hasPassportData: Boolean,
        public val recoveryEmailAddressPattern: String,
    ) : AuthorizationStateDto() {
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
            other as WaitPassword
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
                append("AuthorizationStateDto.WaitPassword")
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

    /**
     * The user has been successfully authorized. TDLib is now ready to answer general requests.
     */
    public class Ready public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.Ready()"
        }
    }

    /**
     * The user is currently logging out.
     */
    public class LoggingOut public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.LoggingOut()"
        }
    }

    /**
     * TDLib is closing, all subsequent queries will be answered with the error 500. Note that closing TDLib can take a while. All resources will be freed only after authorizationStateClosed has been received.
     */
    public class Closing public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.Closing()"
        }
    }

    /**
     * TDLib client is in its final state. All databases are closed and all resources are released. No other updates will be received after this. All queries will be responded to with error code 500. To continue working, one must create a new instance of the TDLib client.
     */
    public class Closed public constructor() : AuthorizationStateDto() {
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
            return "AuthorizationStateDto.Closed()"
        }
    }
}
