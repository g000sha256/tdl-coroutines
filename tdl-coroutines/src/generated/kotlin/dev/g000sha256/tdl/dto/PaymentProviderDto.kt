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
 * Contains information about a payment provider.
 */
public sealed class PaymentProviderDto private constructor() {
    /**
     * Smart Glocal payment provider.
     *
     * @property publicToken Public payment token.
     * @property tokenizeUrl URL for sending card tokenization requests.
     */
    public class SmartGlocal public constructor(
        public val publicToken: String,
        public val tokenizeUrl: String,
    ) : PaymentProviderDto() {
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
            other as SmartGlocal
            if (other.publicToken != publicToken) {
                return false
            }
            return other.tokenizeUrl == tokenizeUrl
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + publicToken.hashCode()
            hashCode = 31 * hashCode + tokenizeUrl.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentProviderDto.SmartGlocal")
                append("(")
                append("publicToken=")
                append(publicToken)
                append(", ")
                append("tokenizeUrl=")
                append(tokenizeUrl)
                append(")")
            }
        }
    }

    /**
     * Stripe payment provider.
     *
     * @property publishableKey Stripe API publishable key.
     * @property needCountry True, if the user country must be provided.
     * @property needPostalCode True, if the user ZIP/postal code must be provided.
     * @property needCardholderName True, if the cardholder name must be provided.
     */
    public class Stripe public constructor(
        public val publishableKey: String,
        public val needCountry: Boolean,
        public val needPostalCode: Boolean,
        public val needCardholderName: Boolean,
    ) : PaymentProviderDto() {
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
            other as Stripe
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
                append("PaymentProviderDto.Stripe")
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

    /**
     * Some other payment provider, for which a web payment form must be shown.
     *
     * @property url Payment form URL.
     */
    public class Other public constructor(
        public val url: String,
    ) : PaymentProviderDto() {
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
            other as Other
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentProviderDto.Other")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }
}
