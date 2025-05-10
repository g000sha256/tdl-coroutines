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
 * Provides information about the method by which an authentication code is delivered to the user.
 */
public sealed class AuthenticationCodeTypeDto private constructor() {
    /**
     * A digit-only authentication code is delivered via a private Telegram message, which can be viewed from another active session.
     *
     * @property length Length of the code.
     */
    public class TelegramMessage public constructor(
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as TelegramMessage
            return other.length == length
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.TelegramMessage")
                append("(")
                append("length=")
                append(length)
                append(")")
            }
        }
    }

    /**
     * A digit-only authentication code is delivered via an SMS message to the specified phone number; non-official applications may not receive this type of code.
     *
     * @property length Length of the code.
     */
    public class Sms public constructor(
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as Sms
            return other.length == length
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.Sms")
                append("(")
                append("length=")
                append(length)
                append(")")
            }
        }
    }

    /**
     * An authentication code is a word delivered via an SMS message to the specified phone number; non-official applications may not receive this type of code.
     *
     * @property firstLetter The first letters of the word if known.
     */
    public class SmsWord public constructor(
        public val firstLetter: String,
    ) : AuthenticationCodeTypeDto() {
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
            other as SmsWord
            return other.firstLetter == firstLetter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + firstLetter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.SmsWord")
                append("(")
                append("firstLetter=")
                append(firstLetter)
                append(")")
            }
        }
    }

    /**
     * An authentication code is a phrase from multiple words delivered via an SMS message to the specified phone number; non-official applications may not receive this type of code.
     *
     * @property firstWord The first word of the phrase if known.
     */
    public class SmsPhrase public constructor(
        public val firstWord: String,
    ) : AuthenticationCodeTypeDto() {
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
            other as SmsPhrase
            return other.firstWord == firstWord
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + firstWord.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.SmsPhrase")
                append("(")
                append("firstWord=")
                append(firstWord)
                append(")")
            }
        }
    }

    /**
     * A digit-only authentication code is delivered via a phone call to the specified phone number.
     *
     * @property length Length of the code.
     */
    public class Call public constructor(
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as Call
            return other.length == length
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.Call")
                append("(")
                append("length=")
                append(length)
                append(")")
            }
        }
    }

    /**
     * An authentication code is delivered by an immediately canceled call to the specified phone number. The phone number that calls is the code that must be entered automatically.
     *
     * @property pattern Pattern of the phone number from which the call will be made.
     */
    public class FlashCall public constructor(
        public val pattern: String,
    ) : AuthenticationCodeTypeDto() {
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
            other as FlashCall
            return other.pattern == pattern
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + pattern.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.FlashCall")
                append("(")
                append("pattern=")
                append(pattern)
                append(")")
            }
        }
    }

    /**
     * An authentication code is delivered by an immediately canceled call to the specified phone number. The last digits of the phone number that calls are the code that must be entered manually by the user.
     *
     * @property phoneNumberPrefix Prefix of the phone number from which the call will be made.
     * @property length Number of digits in the code, excluding the prefix.
     */
    public class MissedCall public constructor(
        public val phoneNumberPrefix: String,
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as MissedCall
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
                append("AuthenticationCodeTypeDto.MissedCall")
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

    /**
     * A digit-only authentication code is delivered to https://fragment.com. The user must be logged in there via a wallet owning the phone number's NFT.
     *
     * @property url URL to open to receive the code.
     * @property length Length of the code.
     */
    public class Fragment public constructor(
        public val url: String,
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as Fragment
            if (other.url != url) {
                return false
            }
            return other.length == length
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.Fragment")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("length=")
                append(length)
                append(")")
            }
        }
    }

    /**
     * A digit-only authentication code is delivered via Firebase Authentication to the official Android application.
     *
     * @property deviceVerificationParameters Parameters to be used for device verification.
     * @property length Length of the code.
     */
    public class FirebaseAndroid public constructor(
        public val deviceVerificationParameters: FirebaseDeviceVerificationParametersDto,
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as FirebaseAndroid
            if (other.deviceVerificationParameters != deviceVerificationParameters) {
                return false
            }
            return other.length == length
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + deviceVerificationParameters.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("AuthenticationCodeTypeDto.FirebaseAndroid")
                append("(")
                append("deviceVerificationParameters=")
                append(deviceVerificationParameters)
                append(", ")
                append("length=")
                append(length)
                append(")")
            }
        }
    }

    /**
     * A digit-only authentication code is delivered via Firebase Authentication to the official iOS application.
     *
     * @property receipt Receipt of successful application token validation to compare with receipt from push notification.
     * @property pushTimeout Time after the next authentication method is expected to be used if verification push notification isn't received, in seconds.
     * @property length Length of the code.
     */
    public class FirebaseIos public constructor(
        public val receipt: String,
        public val pushTimeout: Int,
        public val length: Int,
    ) : AuthenticationCodeTypeDto() {
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
            other as FirebaseIos
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
                append("AuthenticationCodeTypeDto.FirebaseIos")
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
}
