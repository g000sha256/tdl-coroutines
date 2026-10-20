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
 * Describes availability of cryptocurrency purchase through an on-ramp provider.
 *
 * @property isAllowed True, if the current user can use the provider.
 * @property isPurchaseAllowed True, if the current user can purchase through the provider.
 * @property methods The list of available payment methods.
 * @property countryCode A two-letter ISO 3166-1 alpha-2 country code of the current user's country.
 * @property state Code of the state of the current user; may be empty if unknown.
 */
public class OnRampPaymentAvailability public constructor(
    public val isAllowed: Boolean,
    public val isPurchaseAllowed: Boolean,
    public val methods: Array<OnRampPaymentMethod>,
    public val countryCode: String,
    public val state: String,
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
        other as OnRampPaymentAvailability
        if (other.isAllowed != isAllowed) {
            return false
        }
        if (other.isPurchaseAllowed != isPurchaseAllowed) {
            return false
        }
        val methodsEquals = other.methods.contentDeepEquals(methods)
        if (!methodsEquals) {
            return false
        }
        if (other.countryCode != countryCode) {
            return false
        }
        return other.state == state
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isAllowed.hashCode()
        hashCode = 31 * hashCode + isPurchaseAllowed.hashCode()
        hashCode = 31 * hashCode + methods.contentDeepHashCode()
        hashCode = 31 * hashCode + countryCode.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OnRampPaymentAvailability")
            append("(")
            append("isAllowed=")
            append(isAllowed)
            append(", ")
            append("isPurchaseAllowed=")
            append(isPurchaseAllowed)
            append(", ")
            append("methods=")
            methods
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("countryCode=")
            append(countryCode)
            append(", ")
            append("state=")
            append(state)
            append(")")
        }
    }
}
