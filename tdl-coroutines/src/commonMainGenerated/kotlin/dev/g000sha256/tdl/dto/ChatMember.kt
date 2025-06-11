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
 * Describes a user or a chat as a member of another chat.
 *
 * @property memberId Identifier of the chat member. Currently, other chats can be only Left or Banned. Only supergroups and channels can have other chats as Left or Banned members and these chats must be supergroups or channels.
 * @property inviterUserId Identifier of a user that invited/promoted/banned this member in the chat; 0 if unknown.
 * @property joinedChatDate Point in time (Unix timestamp) when the user joined/was promoted/was banned in the chat.
 * @property status Status of the member in the chat.
 */
public class ChatMember public constructor(
    public val memberId: MessageSender,
    public val inviterUserId: Long,
    public val joinedChatDate: Int,
    public val status: ChatMemberStatus,
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
        other as ChatMember
        if (other.memberId != memberId) {
            return false
        }
        if (other.inviterUserId != inviterUserId) {
            return false
        }
        if (other.joinedChatDate != joinedChatDate) {
            return false
        }
        return other.status == status
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + memberId.hashCode()
        hashCode = 31 * hashCode + inviterUserId.hashCode()
        hashCode = 31 * hashCode + joinedChatDate.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatMember")
            append("(")
            append("memberId=")
            append(memberId)
            append(", ")
            append("inviterUserId=")
            append(inviterUserId)
            append(", ")
            append("joinedChatDate=")
            append(joinedChatDate)
            append(", ")
            append("status=")
            append(status)
            append(")")
        }
    }
}
