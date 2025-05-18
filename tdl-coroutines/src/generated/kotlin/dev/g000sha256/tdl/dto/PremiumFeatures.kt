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
 * Contains information about features, available to Premium users.
 *
 * @property features The list of available features.
 * @property limits The list of limits, increased for Premium users.
 * @property paymentLink An internal link to be opened to pay for Telegram Premium if store payment isn't possible; may be null if direct payment isn't available.
 */
public class PremiumFeatures public constructor(
    public val features: Array<PremiumFeature>,
    public val limits: Array<PremiumLimit>,
    public val paymentLink: InternalLinkType?,
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
        other as PremiumFeatures
        val featuresEquals = other.features.contentDeepEquals(features)
        if (!featuresEquals) {
            return false
        }
        val limitsEquals = other.limits.contentDeepEquals(limits)
        if (!limitsEquals) {
            return false
        }
        return other.paymentLink == paymentLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + features.contentDeepHashCode()
        hashCode = 31 * hashCode + limits.contentDeepHashCode()
        hashCode = 31 * hashCode + paymentLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumFeatures")
            append("(")
            append("features=")
            features
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("limits=")
            limits
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("paymentLink=")
            append(paymentLink)
            append(")")
        }
    }
}
