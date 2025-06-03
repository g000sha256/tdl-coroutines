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
 * The user subscribing to Telegram Premium.
 *
 * @property isRestore Pass true if this is a restore of a Telegram Premium purchase; only for App Store.
 * @property isUpgrade Pass true if this is an upgrade from a monthly subscription to early subscription; only for App Store.
 */
public class StorePaymentPurposePremiumSubscription public constructor(
    public val isRestore: Boolean,
    public val isUpgrade: Boolean,
) : StorePaymentPurpose() {
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
        other as StorePaymentPurposePremiumSubscription
        if (other.isRestore != isRestore) {
            return false
        }
        return other.isUpgrade == isUpgrade
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isRestore.hashCode()
        hashCode = 31 * hashCode + isUpgrade.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorePaymentPurposePremiumSubscription")
            append("(")
            append("isRestore=")
            append(isRestore)
            append(", ")
            append("isUpgrade=")
            append(isUpgrade)
            append(")")
        }
    }
}
