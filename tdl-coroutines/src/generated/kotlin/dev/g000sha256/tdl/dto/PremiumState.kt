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
 * Contains state of Telegram Premium subscription and promotion videos for Premium features.
 *
 * @property state Text description of the state of the current Premium subscription; may be empty if the current user has no Telegram Premium subscription.
 * @property paymentOptions The list of available options for buying Telegram Premium.
 * @property animations The list of available promotion animations for Premium features.
 * @property businessAnimations The list of available promotion animations for Business features.
 */
public class PremiumState public constructor(
    public val state: FormattedText,
    public val paymentOptions: Array<PremiumStatePaymentOption>,
    public val animations: Array<PremiumFeaturePromotionAnimation>,
    public val businessAnimations: Array<BusinessFeaturePromotionAnimation>,
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
        other as PremiumState
        if (other.state != state) {
            return false
        }
        val paymentOptionsEquals = other.paymentOptions.contentDeepEquals(paymentOptions)
        if (!paymentOptionsEquals) {
            return false
        }
        val animationsEquals = other.animations.contentDeepEquals(animations)
        if (!animationsEquals) {
            return false
        }
        return other.businessAnimations.contentDeepEquals(businessAnimations)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + paymentOptions.contentDeepHashCode()
        hashCode = 31 * hashCode + animations.contentDeepHashCode()
        hashCode = 31 * hashCode + businessAnimations.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumState")
            append("(")
            append("state=")
            append(state)
            append(", ")
            append("paymentOptions=")
            paymentOptions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("animations=")
            animations
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("businessAnimations=")
            businessAnimations
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
