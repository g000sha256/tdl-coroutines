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
 * Contains information about a country.
 *
 * @property countryCode A two-letter ISO 3166-1 alpha-2 country code.
 * @property name Native name of the country.
 * @property englishName English name of the country.
 * @property isHidden True, if the country must be hidden from the list of all countries.
 * @property callingCodes List of country calling codes.
 */
public class CountryInfo public constructor(
    public val countryCode: String,
    public val name: String,
    public val englishName: String,
    public val isHidden: Boolean,
    public val callingCodes: Array<String>,
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
        other as CountryInfo
        if (other.countryCode != countryCode) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.englishName != englishName) {
            return false
        }
        if (other.isHidden != isHidden) {
            return false
        }
        return other.callingCodes.contentDeepEquals(callingCodes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + countryCode.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + englishName.hashCode()
        hashCode = 31 * hashCode + isHidden.hashCode()
        hashCode = 31 * hashCode + callingCodes.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CountryInfo")
            append("(")
            append("countryCode=")
            append(countryCode)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("englishName=")
            append(englishName)
            append(", ")
            append("isHidden=")
            append(isHidden)
            append(", ")
            append("callingCodes=")
            callingCodes
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
