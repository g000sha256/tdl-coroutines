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
 * Stripe payment provider.
 *
 * @property publishableKey Stripe API publishable key.
 * @property needCountry True, if the user country must be provided.
 * @property needPostalCode True, if the user ZIP/postal code must be provided.
 * @property needCardholderName True, if the cardholder name must be provided.
 */
public class PaymentProviderStripe public constructor(
    public val publishableKey: String,
    public val needCountry: Boolean,
    public val needPostalCode: Boolean,
    public val needCardholderName: Boolean,
) : PaymentProvider() {
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
        other as PaymentProviderStripe
        if (other.publishableKey != publishableKey) {
            return false
        }
        if (other.needCountry != needCountry) {
            return false
        }
        if (other.needPostalCode != needPostalCode) {
            return false
        }
        return other.needCardholderName == needCardholderName
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + publishableKey.hashCode()
        hashCode = 31 * hashCode + needCountry.hashCode()
        hashCode = 31 * hashCode + needPostalCode.hashCode()
        hashCode = 31 * hashCode + needCardholderName.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PaymentProviderStripe")
            append("(")
            append("publishableKey=")
            append(publishableKey)
            append(", ")
            append("needCountry=")
            append(needCountry)
            append(", ")
            append("needPostalCode=")
            append(needPostalCode)
            append(", ")
            append("needCardholderName=")
            append(needCardholderName)
            append(")")
        }
    }
}
