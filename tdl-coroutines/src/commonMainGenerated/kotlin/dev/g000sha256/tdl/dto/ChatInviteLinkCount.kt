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
 * Describes a chat administrator with a number of active and revoked chat invite links.
 *
 * @property userId Administrator's user identifier.
 * @property inviteLinkCount Number of active invite links.
 * @property revokedInviteLinkCount Number of revoked invite links.
 */
public class ChatInviteLinkCount public constructor(
    public val userId: Long,
    public val inviteLinkCount: Int,
    public val revokedInviteLinkCount: Int,
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
        other as ChatInviteLinkCount
        if (other.userId != userId) {
            return false
        }
        if (other.inviteLinkCount != inviteLinkCount) {
            return false
        }
        return other.revokedInviteLinkCount == revokedInviteLinkCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + inviteLinkCount.hashCode()
        hashCode = 31 * hashCode + revokedInviteLinkCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinkCount")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("inviteLinkCount=")
            append(inviteLinkCount)
            append(", ")
            append("revokedInviteLinkCount=")
            append(revokedInviteLinkCount)
            append(")")
        }
    }
}
