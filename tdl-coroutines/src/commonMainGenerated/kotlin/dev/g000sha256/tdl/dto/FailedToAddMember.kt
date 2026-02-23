/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * Contains information about a user who has failed to be added to a chat.
 *
 * @property userId User identifier.
 * @property premiumWouldAllowInvite True, if subscription to Telegram Premium would have allowed to add the user to the chat.
 * @property premiumRequiredToSendMessages True, if subscription to Telegram Premium is required to send the user chat invite link.
 */
public class FailedToAddMember public constructor(
    public val userId: Long,
    public val premiumWouldAllowInvite: Boolean,
    public val premiumRequiredToSendMessages: Boolean,
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
        other as FailedToAddMember
        if (other.userId != userId) {
            return false
        }
        if (other.premiumWouldAllowInvite != premiumWouldAllowInvite) {
            return false
        }
        return other.premiumRequiredToSendMessages == premiumRequiredToSendMessages
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + premiumWouldAllowInvite.hashCode()
        hashCode = 31 * hashCode + premiumRequiredToSendMessages.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FailedToAddMember")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("premiumWouldAllowInvite=")
            append(premiumWouldAllowInvite)
            append(", ")
            append("premiumRequiredToSendMessages=")
            append(premiumRequiredToSendMessages)
            append(")")
        }
    }
}
