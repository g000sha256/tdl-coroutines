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
 * Contains basic information about another user that started a chat with the current user.
 *
 * @property registrationMonth Month when the user was registered in Telegram; 0-12; may be 0 if unknown.
 * @property registrationYear Year when the user was registered in Telegram; 0-9999; may be 0 if unknown.
 * @property phoneNumberCountryCode A two-letter ISO 3166-1 alpha-2 country code based on the phone number of the user; may be empty if unknown.
 * @property lastNameChangeDate Point in time (Unix timestamp) when the user changed name last time; 0 if unknown.
 * @property lastPhotoChangeDate Point in time (Unix timestamp) when the user changed photo last time; 0 if unknown.
 */
public class AccountInfo public constructor(
    public val registrationMonth: Int,
    public val registrationYear: Int,
    public val phoneNumberCountryCode: String,
    public val lastNameChangeDate: Int,
    public val lastPhotoChangeDate: Int,
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
        other as AccountInfo
        if (other.registrationMonth != registrationMonth) {
            return false
        }
        if (other.registrationYear != registrationYear) {
            return false
        }
        if (other.phoneNumberCountryCode != phoneNumberCountryCode) {
            return false
        }
        if (other.lastNameChangeDate != lastNameChangeDate) {
            return false
        }
        return other.lastPhotoChangeDate == lastPhotoChangeDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + registrationMonth.hashCode()
        hashCode = 31 * hashCode + registrationYear.hashCode()
        hashCode = 31 * hashCode + phoneNumberCountryCode.hashCode()
        hashCode = 31 * hashCode + lastNameChangeDate.hashCode()
        hashCode = 31 * hashCode + lastPhotoChangeDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AccountInfo")
            append("(")
            append("registrationMonth=")
            append(registrationMonth)
            append(", ")
            append("registrationYear=")
            append(registrationYear)
            append(", ")
            append("phoneNumberCountryCode=")
            append(phoneNumberCountryCode)
            append(", ")
            append("lastNameChangeDate=")
            append(lastNameChangeDate)
            append(", ")
            append("lastPhotoChangeDate=")
            append(lastPhotoChangeDate)
            append(")")
        }
    }
}
