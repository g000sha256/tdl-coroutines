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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Subscription of a user to the bot was changed; for bots only.
 *
 * @property userId Identifier of the user.
 * @property payload Bot-specified subscription invoice payload.
 * @property isCanceled True, if the subscription was canceled.
 * @property isRestored True, if the subscription was restored.
 * @property isPaymentFailed True, if the payment for the subscription has failed.
 */
public class UpdateUserSubscription public constructor(
    public val userId: Long,
    public val payload: String,
    public val isCanceled: Boolean,
    public val isRestored: Boolean,
    public val isPaymentFailed: Boolean,
) : Update() {
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
        other as UpdateUserSubscription
        if (other.userId != userId) {
            return false
        }
        if (other.payload != payload) {
            return false
        }
        if (other.isCanceled != isCanceled) {
            return false
        }
        if (other.isRestored != isRestored) {
            return false
        }
        return other.isPaymentFailed == isPaymentFailed
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        hashCode = 31 * hashCode + isCanceled.hashCode()
        hashCode = 31 * hashCode + isRestored.hashCode()
        hashCode = 31 * hashCode + isPaymentFailed.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateUserSubscription")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("payload=")
            append(payload)
            append(", ")
            append("isCanceled=")
            append(isCanceled)
            append(", ")
            append("isRestored=")
            append(isRestored)
            append(", ")
            append("isPaymentFailed=")
            append(isPaymentFailed)
            append(")")
        }
    }
}
