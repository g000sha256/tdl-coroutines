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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes an address of a location.
 *
 * @property countryCode A two-letter ISO 3166-1 alpha-2 country code.
 * @property state State, if applicable; empty if unknown.
 * @property city City; empty if unknown.
 * @property street The address; empty if unknown.
 */
@SerialName(value = "locationAddress")
@Serializable
public class LocationAddress public constructor(
    @SerialName(value = "country_code")
    public val countryCode: String,
    @SerialName(value = "state")
    public val state: String,
    @SerialName(value = "city")
    public val city: String,
    @SerialName(value = "street")
    public val street: String,
) : Model() {
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
        other as LocationAddress
        if (other.countryCode != countryCode) {
            return false
        }
        if (other.state != state) {
            return false
        }
        if (other.city != city) {
            return false
        }
        return other.street == street
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + countryCode.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + city.hashCode()
        hashCode = 31 * hashCode + street.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LocationAddress")
            append("(")
            append("countryCode=")
            append(countryCode)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("city=")
            append(city)
            append(", ")
            append("street=")
            append(street)
            append(")")
        }
    }
}
