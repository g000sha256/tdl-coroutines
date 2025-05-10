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
 * Contains the type of Telegram Passport element.
 */
public sealed class PassportElementTypeDto private constructor() {
    /**
     * A Telegram Passport element containing the user's personal details.
     */
    public class PersonalDetails public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.PersonalDetails()"
        }
    }

    /**
     * A Telegram Passport element containing the user's passport.
     */
    public class Passport public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.Passport()"
        }
    }

    /**
     * A Telegram Passport element containing the user's driver license.
     */
    public class DriverLicense public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.DriverLicense()"
        }
    }

    /**
     * A Telegram Passport element containing the user's identity card.
     */
    public class IdentityCard public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.IdentityCard()"
        }
    }

    /**
     * A Telegram Passport element containing the user's internal passport.
     */
    public class InternalPassport public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.InternalPassport()"
        }
    }

    /**
     * A Telegram Passport element containing the user's address.
     */
    public class Address public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.Address()"
        }
    }

    /**
     * A Telegram Passport element containing the user's utility bill.
     */
    public class UtilityBill public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.UtilityBill()"
        }
    }

    /**
     * A Telegram Passport element containing the user's bank statement.
     */
    public class BankStatement public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.BankStatement()"
        }
    }

    /**
     * A Telegram Passport element containing the user's rental agreement.
     */
    public class RentalAgreement public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.RentalAgreement()"
        }
    }

    /**
     * A Telegram Passport element containing the registration page of the user's passport.
     */
    public class PassportRegistration public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.PassportRegistration()"
        }
    }

    /**
     * A Telegram Passport element containing the user's temporary registration.
     */
    public class TemporaryRegistration public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.TemporaryRegistration()"
        }
    }

    /**
     * A Telegram Passport element containing the user's phone number.
     */
    public class PhoneNumber public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.PhoneNumber()"
        }
    }

    /**
     * A Telegram Passport element containing the user's email address.
     */
    public class EmailAddress public constructor() : PassportElementTypeDto() {
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
            return "PassportElementTypeDto.EmailAddress()"
        }
    }
}
