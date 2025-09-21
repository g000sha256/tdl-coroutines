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
 * Describes parameters for age verification of the current user.
 *
 * @property minAge The minimum age required to view restricted content.
 * @property verificationBotUsername Username of the bot which main Web App may be used to verify age of the user.
 * @property country Unique name for the country or region, which legislation required age verification. May be used to get the corresponding localization key.
 */
public class AgeVerificationParameters public constructor(
    public val minAge: Int,
    public val verificationBotUsername: String,
    public val country: String,
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
        other as AgeVerificationParameters
        if (other.minAge != minAge) {
            return false
        }
        if (other.verificationBotUsername != verificationBotUsername) {
            return false
        }
        return other.country == country
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + minAge.hashCode()
        hashCode = 31 * hashCode + verificationBotUsername.hashCode()
        hashCode = 31 * hashCode + country.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AgeVerificationParameters")
            append("(")
            append("minAge=")
            append(minAge)
            append(", ")
            append("verificationBotUsername=")
            append(verificationBotUsername)
            append(", ")
            append("country=")
            append(country)
            append(")")
        }
    }
}
