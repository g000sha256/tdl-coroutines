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
 * The user must buy Telegram Premium as an in-store purchase to log in. Call checkAuthenticationPremiumPurchase and then setAuthenticationPremiumPurchaseTransaction.
 *
 * @property storeProductId Identifier of the store product that must be bought.
 * @property supportEmailAddress Email address to use for support if the user has issues with Telegram Premium purchase.
 * @property supportEmailSubject Subject for the email sent to the support email address.
 */
public class AuthorizationStateWaitPremiumPurchase public constructor(
    public val storeProductId: String,
    public val supportEmailAddress: String,
    public val supportEmailSubject: String,
) : AuthorizationState() {
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
        other as AuthorizationStateWaitPremiumPurchase
        if (other.storeProductId != storeProductId) {
            return false
        }
        if (other.supportEmailAddress != supportEmailAddress) {
            return false
        }
        return other.supportEmailSubject == supportEmailSubject
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storeProductId.hashCode()
        hashCode = 31 * hashCode + supportEmailAddress.hashCode()
        hashCode = 31 * hashCode + supportEmailSubject.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AuthorizationStateWaitPremiumPurchase")
            append("(")
            append("storeProductId=")
            append(storeProductId)
            append(", ")
            append("supportEmailAddress=")
            append(supportEmailAddress)
            append(", ")
            append("supportEmailSubject=")
            append(supportEmailSubject)
            append(")")
        }
    }
}
