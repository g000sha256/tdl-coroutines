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
 * Describes a subscription to a channel chat.
 *
 * @property canReuse True, if the subscription is active and the user can use the method reuseStarSubscription to join the subscribed chat again.
 * @property inviteLink The invite link that can be used to renew the subscription if it has been expired; may be empty, if the link isn't available anymore.
 */
public class StarSubscriptionTypeChannel public constructor(
    public val canReuse: Boolean,
    public val inviteLink: String,
) : StarSubscriptionType() {
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
        other as StarSubscriptionTypeChannel
        if (other.canReuse != canReuse) {
            return false
        }
        return other.inviteLink == inviteLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canReuse.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarSubscriptionTypeChannel")
            append("(")
            append("canReuse=")
            append(canReuse)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(")")
        }
    }
}
