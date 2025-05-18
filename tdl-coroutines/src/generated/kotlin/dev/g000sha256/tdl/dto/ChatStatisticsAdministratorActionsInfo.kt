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
 * Contains statistics about administrator actions done by a user.
 *
 * @property userId Administrator user identifier.
 * @property deletedMessageCount Number of messages deleted by the administrator.
 * @property bannedUserCount Number of users banned by the administrator.
 * @property restrictedUserCount Number of users restricted by the administrator.
 */
public class ChatStatisticsAdministratorActionsInfo public constructor(
    public val userId: Long,
    public val deletedMessageCount: Int,
    public val bannedUserCount: Int,
    public val restrictedUserCount: Int,
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
        other as ChatStatisticsAdministratorActionsInfo
        if (other.userId != userId) {
            return false
        }
        if (other.deletedMessageCount != deletedMessageCount) {
            return false
        }
        if (other.bannedUserCount != bannedUserCount) {
            return false
        }
        return other.restrictedUserCount == restrictedUserCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + deletedMessageCount.hashCode()
        hashCode = 31 * hashCode + bannedUserCount.hashCode()
        hashCode = 31 * hashCode + restrictedUserCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatStatisticsAdministratorActionsInfo")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("deletedMessageCount=")
            append(deletedMessageCount)
            append(", ")
            append("bannedUserCount=")
            append(bannedUserCount)
            append(", ")
            append("restrictedUserCount=")
            append(restrictedUserCount)
            append(")")
        }
    }
}
