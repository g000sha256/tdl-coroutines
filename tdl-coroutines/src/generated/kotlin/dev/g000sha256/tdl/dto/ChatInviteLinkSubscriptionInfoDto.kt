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
import kotlin.Long
import kotlin.String

/**
 * Contains information about subscription plan that must be paid by the user to use a chat invite link.
 *
 * @property pricing Information about subscription plan that must be paid by the user to use the link.
 * @property canReuse True, if the user has already paid for the subscription and can use joinChatByInviteLink to join the subscribed chat again.
 * @property formId Identifier of the payment form to use for subscription payment; 0 if the subscription can't be paid.
 */
public class ChatInviteLinkSubscriptionInfoDto public constructor(
    public val pricing: StarSubscriptionPricingDto,
    public val canReuse: Boolean,
    public val formId: Long,
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
        other as ChatInviteLinkSubscriptionInfoDto
        if (other.pricing != pricing) {
            return false
        }
        if (other.canReuse != canReuse) {
            return false
        }
        return other.formId == formId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + pricing.hashCode()
        hashCode = 31 * hashCode + canReuse.hashCode()
        hashCode = 31 * hashCode + formId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinkSubscriptionInfoDto")
            append("(")
            append("pricing=")
            append(pricing)
            append(", ")
            append("canReuse=")
            append(canReuse)
            append(", ")
            append("formId=")
            append(formId)
            append(")")
        }
    }
}
