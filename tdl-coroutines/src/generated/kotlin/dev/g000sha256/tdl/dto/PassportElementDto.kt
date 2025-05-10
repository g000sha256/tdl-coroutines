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
 * Contains information about a Telegram Passport element.
 */
public sealed class PassportElementDto private constructor() {
    /**
     * A Telegram Passport element containing the user's personal details.
     *
     * @property personalDetails Personal details of the user.
     */
    public class PersonalDetails public constructor(
        public val personalDetails: PersonalDetailsDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.PersonalDetails")
                append("(")
                append("personalDetails=")
                append(personalDetails)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's passport.
     *
     * @property passport Passport.
     */
    public class Passport public constructor(
        public val passport: IdentityDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.Passport")
                append("(")
                append("passport=")
                append(passport)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's driver license.
     *
     * @property driverLicense Driver license.
     */
    public class DriverLicense public constructor(
        public val driverLicense: IdentityDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.DriverLicense")
                append("(")
                append("driverLicense=")
                append(driverLicense)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's identity card.
     *
     * @property identityCard Identity card.
     */
    public class IdentityCard public constructor(
        public val identityCard: IdentityDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.IdentityCard")
                append("(")
                append("identityCard=")
                append(identityCard)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's internal passport.
     *
     * @property internalPassport Internal passport.
     */
    public class InternalPassport public constructor(
        public val internalPassport: IdentityDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.InternalPassport")
                append("(")
                append("internalPassport=")
                append(internalPassport)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's address.
     *
     * @property address Address.
     */
    public class Address public constructor(
        public val address: AddressDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.Address")
                append("(")
                append("address=")
                append(address)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's utility bill.
     *
     * @property utilityBill Utility bill.
     */
    public class UtilityBill public constructor(
        public val utilityBill: PersonalDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.UtilityBill")
                append("(")
                append("utilityBill=")
                append(utilityBill)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's bank statement.
     *
     * @property bankStatement Bank statement.
     */
    public class BankStatement public constructor(
        public val bankStatement: PersonalDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.BankStatement")
                append("(")
                append("bankStatement=")
                append(bankStatement)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's rental agreement.
     *
     * @property rentalAgreement Rental agreement.
     */
    public class RentalAgreement public constructor(
        public val rentalAgreement: PersonalDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.RentalAgreement")
                append("(")
                append("rentalAgreement=")
                append(rentalAgreement)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's passport registration pages.
     *
     * @property passportRegistration Passport registration pages.
     */
    public class PassportRegistration public constructor(
        public val passportRegistration: PersonalDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.PassportRegistration")
                append("(")
                append("passportRegistration=")
                append(passportRegistration)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's temporary registration.
     *
     * @property temporaryRegistration Temporary registration.
     */
    public class TemporaryRegistration public constructor(
        public val temporaryRegistration: PersonalDocumentDto,
    ) : PassportElementDto() {
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
                append("PassportElementDto.TemporaryRegistration")
                append("(")
                append("temporaryRegistration=")
                append(temporaryRegistration)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's phone number.
     *
     * @property phoneNumber Phone number.
     */
    public class PhoneNumber public constructor(
        public val phoneNumber: String,
    ) : PassportElementDto() {
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
                append("PassportElementDto.PhoneNumber")
                append("(")
                append("phoneNumber=")
                append(phoneNumber)
                append(")")
            }
        }
    }

    /**
     * A Telegram Passport element containing the user's email address.
     *
     * @property emailAddress Email address.
     */
    public class EmailAddress public constructor(
        public val emailAddress: String,
    ) : PassportElementDto() {
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
                append("PassportElementDto.EmailAddress")
                append("(")
                append("emailAddress=")
                append(emailAddress)
                append(")")
            }
        }
    }
}
