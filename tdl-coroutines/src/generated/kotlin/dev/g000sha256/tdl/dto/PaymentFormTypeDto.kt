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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes type of payment form.
 */
public sealed class PaymentFormTypeDto private constructor() {
    /**
     * The payment form is for a regular payment.
     *
     * @property invoice Full information about the invoice.
     * @property paymentProviderUserId User identifier of the payment provider bot.
     * @property paymentProvider Information about the payment provider.
     * @property additionalPaymentOptions The list of additional payment options.
     * @property savedOrderInfo Saved server-side order information; may be null.
     * @property savedCredentials The list of saved payment credentials.
     * @property canSaveCredentials True, if the user can choose to save credentials.
     * @property needPassword True, if the user will be able to save credentials, if sets up a 2-step verification password.
     */
    public class Regular public constructor(
        public val invoice: InvoiceDto,
        public val paymentProviderUserId: Long,
        public val paymentProvider: PaymentProviderDto,
        public val additionalPaymentOptions: Array<PaymentOptionDto>,
        public val savedOrderInfo: OrderInfoDto?,
        public val savedCredentials: Array<SavedCredentialsDto>,
        public val canSaveCredentials: Boolean,
        public val needPassword: Boolean,
    ) : PaymentFormTypeDto() {
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
            other as Regular
            if (other.invoice != invoice) {
                return false
            }
            if (other.paymentProviderUserId != paymentProviderUserId) {
                return false
            }
            if (other.paymentProvider != paymentProvider) {
                return false
            }
            val additionalPaymentOptionsEquals = other.additionalPaymentOptions.contentDeepEquals(additionalPaymentOptions)
            if (!additionalPaymentOptionsEquals) {
                return false
            }
            if (other.savedOrderInfo != savedOrderInfo) {
                return false
            }
            val savedCredentialsEquals = other.savedCredentials.contentDeepEquals(savedCredentials)
            if (!savedCredentialsEquals) {
                return false
            }
            if (other.canSaveCredentials != canSaveCredentials) {
                return false
            }
            return other.needPassword == needPassword
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + invoice.hashCode()
            hashCode = 31 * hashCode + paymentProviderUserId.hashCode()
            hashCode = 31 * hashCode + paymentProvider.hashCode()
            hashCode = 31 * hashCode + additionalPaymentOptions.contentDeepHashCode()
            hashCode = 31 * hashCode + savedOrderInfo.hashCode()
            hashCode = 31 * hashCode + savedCredentials.contentDeepHashCode()
            hashCode = 31 * hashCode + canSaveCredentials.hashCode()
            hashCode = 31 * hashCode + needPassword.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentFormTypeDto.Regular")
                append("(")
                append("invoice=")
                append(invoice)
                append(", ")
                append("paymentProviderUserId=")
                append(paymentProviderUserId)
                append(", ")
                append("paymentProvider=")
                append(paymentProvider)
                append(", ")
                append("additionalPaymentOptions=")
                additionalPaymentOptions
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("savedOrderInfo=")
                append(savedOrderInfo)
                append(", ")
                append("savedCredentials=")
                savedCredentials
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("canSaveCredentials=")
                append(canSaveCredentials)
                append(", ")
                append("needPassword=")
                append(needPassword)
                append(")")
            }
        }
    }

    /**
     * The payment form is for a payment in Telegram Stars.
     *
     * @property starCount Number of Telegram Stars that will be paid.
     */
    public class Stars public constructor(
        public val starCount: Long,
    ) : PaymentFormTypeDto() {
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
            other as Stars
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentFormTypeDto.Stars")
                append("(")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }

    /**
     * The payment form is for a payment in Telegram Stars for subscription.
     *
     * @property pricing Information about subscription plan.
     */
    public class StarSubscription public constructor(
        public val pricing: StarSubscriptionPricingDto,
    ) : PaymentFormTypeDto() {
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
            other as StarSubscription
            return other.pricing == pricing
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + pricing.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaymentFormTypeDto.StarSubscription")
                append("(")
                append("pricing=")
                append(pricing)
                append(")")
            }
        }
    }
}
