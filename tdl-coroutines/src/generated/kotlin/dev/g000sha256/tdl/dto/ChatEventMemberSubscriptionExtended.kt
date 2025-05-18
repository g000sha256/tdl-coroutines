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
 * A chat member extended their subscription to the chat.
 *
 * @property userId Affected chat member user identifier.
 * @property oldStatus Previous status of the chat member.
 * @property newStatus New status of the chat member.
 */
public class ChatEventMemberSubscriptionExtended public constructor(
    public val userId: Long,
    public val oldStatus: ChatMemberStatus,
    public val newStatus: ChatMemberStatus,
) : ChatEventAction() {
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
        other as ChatEventMemberSubscriptionExtended
        if (other.userId != userId) {
            return false
        }
        if (other.oldStatus != oldStatus) {
            return false
        }
        return other.newStatus == newStatus
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + oldStatus.hashCode()
        hashCode = 31 * hashCode + newStatus.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventMemberSubscriptionExtended")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("oldStatus=")
            append(oldStatus)
            append(", ")
            append("newStatus=")
            append(newStatus)
            append(")")
        }
    }
}
