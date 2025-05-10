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
 * Contains information about a phone number.
 *
 * @property country Information about the country to which the phone number belongs; may be null.
 * @property countryCallingCode The part of the phone number denoting country calling code or its part.
 * @property formattedPhoneNumber The phone number without country calling code formatted accordingly to local rules. Expected digits are returned as '-', but even more digits might be entered by the user.
 * @property isAnonymous True, if the phone number was bought at https://fragment.com and isn't tied to a SIM card. Information about the phone number can be received using getCollectibleItemInfo.
 */
public class PhoneNumberInfoDto public constructor(
    public val country: CountryInfoDto?,
    public val countryCallingCode: String,
    public val formattedPhoneNumber: String,
    public val isAnonymous: Boolean,
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
        other as PhoneNumberInfoDto
        if (other.country != country) {
            return false
        }
        if (other.countryCallingCode != countryCallingCode) {
            return false
        }
        if (other.formattedPhoneNumber != formattedPhoneNumber) {
            return false
        }
        return other.isAnonymous == isAnonymous
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + country.hashCode()
        hashCode = 31 * hashCode + countryCallingCode.hashCode()
        hashCode = 31 * hashCode + formattedPhoneNumber.hashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PhoneNumberInfoDto")
            append("(")
            append("country=")
            append(country)
            append(", ")
            append("countryCallingCode=")
            append(countryCallingCode)
            append(", ")
            append("formattedPhoneNumber=")
            append(formattedPhoneNumber)
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(")")
        }
    }
}
