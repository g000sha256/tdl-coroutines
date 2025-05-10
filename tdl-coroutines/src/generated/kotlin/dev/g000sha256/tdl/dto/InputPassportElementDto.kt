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
 * Contains information about a Telegram Passport element to be saved.
 */
public sealed class InputPassportElementDto private constructor() {
    /**
     * A Telegram Passport element to be saved containing the user's personal details.
     *
     * @property personalDetails Personal details of the user.
     */
    public class PersonalDetails public constructor(
        public val personalDetails: PersonalDetailsDto,
    ) : InputPassportElementDto() {
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
            other as PersonalDetails
            return other.personalDetails == personalDetails
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + personalDetails.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.PersonalDetails")
                append("(")
                append("personalDetails=")
                append(personalDetails)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's passport.
     *
     * @property passport The passport to be saved.
     */
    public class Passport public constructor(
        public val passport: InputIdentityDocumentDto,
    ) : InputPassportElementDto() {
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
            other as Passport
            return other.passport == passport
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + passport.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.Passport")
                append("(")
                append("passport=")
                append(passport)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's driver license.
     *
     * @property driverLicense The driver license to be saved.
     */
    public class DriverLicense public constructor(
        public val driverLicense: InputIdentityDocumentDto,
    ) : InputPassportElementDto() {
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
            other as DriverLicense
            return other.driverLicense == driverLicense
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + driverLicense.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.DriverLicense")
                append("(")
                append("driverLicense=")
                append(driverLicense)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's identity card.
     *
     * @property identityCard The identity card to be saved.
     */
    public class IdentityCard public constructor(
        public val identityCard: InputIdentityDocumentDto,
    ) : InputPassportElementDto() {
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
            other as IdentityCard
            return other.identityCard == identityCard
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + identityCard.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.IdentityCard")
                append("(")
                append("identityCard=")
                append(identityCard)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's internal passport.
     *
     * @property internalPassport The internal passport to be saved.
     */
    public class InternalPassport public constructor(
        public val internalPassport: InputIdentityDocumentDto,
    ) : InputPassportElementDto() {
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
            other as InternalPassport
            return other.internalPassport == internalPassport
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + internalPassport.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.InternalPassport")
                append("(")
                append("internalPassport=")
                append(internalPassport)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's address.
     *
     * @property address The address to be saved.
     */
    public class Address public constructor(
        public val address: AddressDto,
    ) : InputPassportElementDto() {
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
            other as Address
            return other.address == address
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + address.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.Address")
                append("(")
                append("address=")
                append(address)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's utility bill.
     *
     * @property utilityBill The utility bill to be saved.
     */
    public class UtilityBill public constructor(
        public val utilityBill: InputPersonalDocumentDto,
    ) : InputPassportElementDto() {
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
            other as UtilityBill
            return other.utilityBill == utilityBill
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + utilityBill.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.UtilityBill")
                append("(")
                append("utilityBill=")
                append(utilityBill)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's bank statement.
     *
     * @property bankStatement The bank statement to be saved.
     */
    public class BankStatement public constructor(
        public val bankStatement: InputPersonalDocumentDto,
    ) : InputPassportElementDto() {
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
            other as BankStatement
            return other.bankStatement == bankStatement
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + bankStatement.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.BankStatement")
                append("(")
                append("bankStatement=")
                append(bankStatement)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's rental agreement.
     *
     * @property rentalAgreement The rental agreement to be saved.
     */
    public class RentalAgreement public constructor(
        public val rentalAgreement: InputPersonalDocumentDto,
    ) : InputPassportElementDto() {
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
            other as RentalAgreement
            return other.rentalAgreement == rentalAgreement
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + rentalAgreement.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.RentalAgreement")
                append("(")
                append("rentalAgreement=")
                append(rentalAgreement)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's passport registration.
     *
     * @property passportRegistration The passport registration page to be saved.
     */
    public class PassportRegistration public constructor(
        public val passportRegistration: InputPersonalDocumentDto,
    ) : InputPassportElementDto() {
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
            other as PassportRegistration
            return other.passportRegistration == passportRegistration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + passportRegistration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.PassportRegistration")
                append("(")
                append("passportRegistration=")
                append(passportRegistration)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's temporary registration.
     *
     * @property temporaryRegistration The temporary registration document to be saved.
     */
    public class TemporaryRegistration public constructor(
        public val temporaryRegistration: InputPersonalDocumentDto,
    ) : InputPassportElementDto() {
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
            other as TemporaryRegistration
            return other.temporaryRegistration == temporaryRegistration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + temporaryRegistration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.TemporaryRegistration")
                append("(")
                append("temporaryRegistration=")
                append(temporaryRegistration)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's phone number.
     *
     * @property phoneNumber The phone number to be saved.
     */
    public class PhoneNumber public constructor(
        public val phoneNumber: String,
    ) : InputPassportElementDto() {
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
            other as PhoneNumber
            return other.phoneNumber == phoneNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + phoneNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.PhoneNumber")
                append("(")
                append("phoneNumber=")
                append(phoneNumber)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element to be saved containing the user's email address.
     *
     * @property emailAddress The email address to be saved.
     */
    public class EmailAddress public constructor(
        public val emailAddress: String,
    ) : InputPassportElementDto() {
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
            other as EmailAddress
            return other.emailAddress == emailAddress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + emailAddress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementDto.EmailAddress")
                append("(")
                append("emailAddress=")
                append(emailAddress)
                append(")")
            }
        }
    }
}
