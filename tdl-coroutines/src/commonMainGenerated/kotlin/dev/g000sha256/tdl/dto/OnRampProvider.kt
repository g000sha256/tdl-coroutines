/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Describes an on-ramp provider.
 *
 * @property id Unique identifier of the provider.
 * @property name Name of the provider.
 * @property cryptocurrencies List of cryptocurrencies supported by the provider.
 * @property supportsBaseCurrencies True, if the provider supports base currencies and can be used in the method getOnRampProviderBaseCurrencies.
 * @property supportsLimits True, if the provider supports limits retrieval using the method getOnRampPaymentLimits.
 * @property supportsQuote True, if the provider supports quote retrieval using the method getOnRampPaymentQuote.
 */
public class OnRampProvider public constructor(
    public val id: String,
    public val name: String,
    public val cryptocurrencies: Array<String>,
    public val supportsBaseCurrencies: Boolean,
    public val supportsLimits: Boolean,
    public val supportsQuote: Boolean,
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
        other as OnRampProvider
        if (other.id != id) {
            return false
        }
        if (other.name != name) {
            return false
        }
        val cryptocurrenciesEquals = other.cryptocurrencies.contentDeepEquals(cryptocurrencies)
        if (!cryptocurrenciesEquals) {
            return false
        }
        if (other.supportsBaseCurrencies != supportsBaseCurrencies) {
            return false
        }
        if (other.supportsLimits != supportsLimits) {
            return false
        }
        return other.supportsQuote == supportsQuote
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + cryptocurrencies.contentDeepHashCode()
        hashCode = 31 * hashCode + supportsBaseCurrencies.hashCode()
        hashCode = 31 * hashCode + supportsLimits.hashCode()
        hashCode = 31 * hashCode + supportsQuote.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OnRampProvider")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("cryptocurrencies=")
            cryptocurrencies
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("supportsBaseCurrencies=")
            append(supportsBaseCurrencies)
            append(", ")
            append("supportsLimits=")
            append(supportsLimits)
            append(", ")
            append("supportsQuote=")
            append(supportsQuote)
            append(")")
        }
    }
}
