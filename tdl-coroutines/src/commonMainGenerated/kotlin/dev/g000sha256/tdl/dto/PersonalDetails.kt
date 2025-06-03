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
 * Contains the user's personal details.
 *
 * @property firstName First name of the user written in English; 1-255 characters.
 * @property middleName Middle name of the user written in English; 0-255 characters.
 * @property lastName Last name of the user written in English; 1-255 characters.
 * @property nativeFirstName Native first name of the user; 1-255 characters.
 * @property nativeMiddleName Native middle name of the user; 0-255 characters.
 * @property nativeLastName Native last name of the user; 1-255 characters.
 * @property birthdate Birthdate of the user.
 * @property gender Gender of the user, &quot;male&quot; or &quot;female&quot;.
 * @property countryCode A two-letter ISO 3166-1 alpha-2 country code of the user's country.
 * @property residenceCountryCode A two-letter ISO 3166-1 alpha-2 country code of the user's residence country.
 */
public class PersonalDetails public constructor(
    public val firstName: String,
    public val middleName: String,
    public val lastName: String,
    public val nativeFirstName: String,
    public val nativeMiddleName: String,
    public val nativeLastName: String,
    public val birthdate: Date,
    public val gender: String,
    public val countryCode: String,
    public val residenceCountryCode: String,
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
        other as PersonalDetails
        if (other.firstName != firstName) {
            return false
        }
        if (other.middleName != middleName) {
            return false
        }
        if (other.lastName != lastName) {
            return false
        }
        if (other.nativeFirstName != nativeFirstName) {
            return false
        }
        if (other.nativeMiddleName != nativeMiddleName) {
            return false
        }
        if (other.nativeLastName != nativeLastName) {
            return false
        }
        if (other.birthdate != birthdate) {
            return false
        }
        if (other.gender != gender) {
            return false
        }
        if (other.countryCode != countryCode) {
            return false
        }
        return other.residenceCountryCode == residenceCountryCode
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + firstName.hashCode()
        hashCode = 31 * hashCode + middleName.hashCode()
        hashCode = 31 * hashCode + lastName.hashCode()
        hashCode = 31 * hashCode + nativeFirstName.hashCode()
        hashCode = 31 * hashCode + nativeMiddleName.hashCode()
        hashCode = 31 * hashCode + nativeLastName.hashCode()
        hashCode = 31 * hashCode + birthdate.hashCode()
        hashCode = 31 * hashCode + gender.hashCode()
        hashCode = 31 * hashCode + countryCode.hashCode()
        hashCode = 31 * hashCode + residenceCountryCode.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PersonalDetails")
            append("(")
            append("firstName=")
            append(firstName)
            append(", ")
            append("middleName=")
            append(middleName)
            append(", ")
            append("lastName=")
            append(lastName)
            append(", ")
            append("nativeFirstName=")
            append(nativeFirstName)
            append(", ")
            append("nativeMiddleName=")
            append(nativeMiddleName)
            append(", ")
            append("nativeLastName=")
            append(nativeLastName)
            append(", ")
            append("birthdate=")
            append(birthdate)
            append(", ")
            append("gender=")
            append(gender)
            append(", ")
            append("countryCode=")
            append(countryCode)
            append(", ")
            append("residenceCountryCode=")
            append(residenceCountryCode)
            append(")")
        }
    }
}
