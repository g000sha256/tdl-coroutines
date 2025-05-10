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
import kotlin.LongArray
import kotlin.String

/**
 * Product invoice.
 *
 * @property currency ISO 4217 currency code.
 * @property priceParts A list of objects used to calculate the total price of the product.
 * @property subscriptionPeriod The number of seconds between consecutive Telegram Star debiting for subscription invoices; 0 if the invoice doesn't create subscription.
 * @property maxTipAmount The maximum allowed amount of tip in the smallest units of the currency.
 * @property suggestedTipAmounts Suggested amounts of tip in the smallest units of the currency.
 * @property recurringPaymentTermsOfServiceUrl An HTTP URL with terms of service for recurring payments. If non-empty, the invoice payment will result in recurring payments and the user must accept the terms of service before allowed to pay.
 * @property termsOfServiceUrl An HTTP URL with terms of service for non-recurring payments. If non-empty, then the user must accept the terms of service before allowed to pay.
 * @property isTest True, if the payment is a test payment.
 * @property needName True, if the user's name is needed for payment.
 * @property needPhoneNumber True, if the user's phone number is needed for payment.
 * @property needEmailAddress True, if the user's email address is needed for payment.
 * @property needShippingAddress True, if the user's shipping address is needed for payment.
 * @property sendPhoneNumberToProvider True, if the user's phone number will be sent to the provider.
 * @property sendEmailAddressToProvider True, if the user's email address will be sent to the provider.
 * @property isFlexible True, if the total price depends on the shipping method.
 */
public class InvoiceDto public constructor(
    public val currency: String,
    public val priceParts: Array<LabeledPricePartDto>,
    public val subscriptionPeriod: Int,
    public val maxTipAmount: Long,
    public val suggestedTipAmounts: LongArray,
    public val recurringPaymentTermsOfServiceUrl: String,
    public val termsOfServiceUrl: String,
    public val isTest: Boolean,
    public val needName: Boolean,
    public val needPhoneNumber: Boolean,
    public val needEmailAddress: Boolean,
    public val needShippingAddress: Boolean,
    public val sendPhoneNumberToProvider: Boolean,
    public val sendEmailAddressToProvider: Boolean,
    public val isFlexible: Boolean,
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
        other as InvoiceDto
        if (other.currency != currency) {
            return false
        }
        val pricePartsEquals = other.priceParts.contentDeepEquals(priceParts)
        if (!pricePartsEquals) {
            return false
        }
        if (other.subscriptionPeriod != subscriptionPeriod) {
            return false
        }
        if (other.maxTipAmount != maxTipAmount) {
            return false
        }
        val suggestedTipAmountsEquals = other.suggestedTipAmounts.contentEquals(suggestedTipAmounts)
        if (!suggestedTipAmountsEquals) {
            return false
        }
        if (other.recurringPaymentTermsOfServiceUrl != recurringPaymentTermsOfServiceUrl) {
            return false
        }
        if (other.termsOfServiceUrl != termsOfServiceUrl) {
            return false
        }
        if (other.isTest != isTest) {
            return false
        }
        if (other.needName != needName) {
            return false
        }
        if (other.needPhoneNumber != needPhoneNumber) {
            return false
        }
        if (other.needEmailAddress != needEmailAddress) {
            return false
        }
        if (other.needShippingAddress != needShippingAddress) {
            return false
        }
        if (other.sendPhoneNumberToProvider != sendPhoneNumberToProvider) {
            return false
        }
        if (other.sendEmailAddressToProvider != sendEmailAddressToProvider) {
            return false
        }
        return other.isFlexible == isFlexible
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + currency.hashCode()
        hashCode = 31 * hashCode + priceParts.contentDeepHashCode()
        hashCode = 31 * hashCode + subscriptionPeriod.hashCode()
        hashCode = 31 * hashCode + maxTipAmount.hashCode()
        hashCode = 31 * hashCode + suggestedTipAmounts.contentHashCode()
        hashCode = 31 * hashCode + recurringPaymentTermsOfServiceUrl.hashCode()
        hashCode = 31 * hashCode + termsOfServiceUrl.hashCode()
        hashCode = 31 * hashCode + isTest.hashCode()
        hashCode = 31 * hashCode + needName.hashCode()
        hashCode = 31 * hashCode + needPhoneNumber.hashCode()
        hashCode = 31 * hashCode + needEmailAddress.hashCode()
        hashCode = 31 * hashCode + needShippingAddress.hashCode()
        hashCode = 31 * hashCode + sendPhoneNumberToProvider.hashCode()
        hashCode = 31 * hashCode + sendEmailAddressToProvider.hashCode()
        hashCode = 31 * hashCode + isFlexible.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InvoiceDto")
            append("(")
            append("currency=")
            append(currency)
            append(", ")
            append("priceParts=")
            priceParts
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("subscriptionPeriod=")
            append(subscriptionPeriod)
            append(", ")
            append("maxTipAmount=")
            append(maxTipAmount)
            append(", ")
            append("suggestedTipAmounts=")
            suggestedTipAmounts
                .contentToString()
                .also { append(it) }
            append(", ")
            append("recurringPaymentTermsOfServiceUrl=")
            append(recurringPaymentTermsOfServiceUrl)
            append(", ")
            append("termsOfServiceUrl=")
            append(termsOfServiceUrl)
            append(", ")
            append("isTest=")
            append(isTest)
            append(", ")
            append("needName=")
            append(needName)
            append(", ")
            append("needPhoneNumber=")
            append(needPhoneNumber)
            append(", ")
            append("needEmailAddress=")
            append(needEmailAddress)
            append(", ")
            append("needShippingAddress=")
            append(needShippingAddress)
            append(", ")
            append("sendPhoneNumberToProvider=")
            append(sendPhoneNumberToProvider)
            append(", ")
            append("sendEmailAddressToProvider=")
            append(sendEmailAddressToProvider)
            append(", ")
            append("isFlexible=")
            append(isFlexible)
            append(")")
        }
    }
}
