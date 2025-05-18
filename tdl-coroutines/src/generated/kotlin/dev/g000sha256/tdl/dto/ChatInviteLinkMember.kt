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
 * Describes a chat member joined a chat via an invite link.
 *
 * @property userId User identifier.
 * @property joinedChatDate Point in time (Unix timestamp) when the user joined the chat.
 * @property viaChatFolderInviteLink True, if the user has joined the chat using an invite link for a chat folder.
 * @property approverUserId User identifier of the chat administrator, approved user join request.
 */
public class ChatInviteLinkMember public constructor(
    public val userId: Long,
    public val joinedChatDate: Int,
    public val viaChatFolderInviteLink: Boolean,
    public val approverUserId: Long,
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
        other as ChatInviteLinkMember
        if (other.userId != userId) {
            return false
        }
        if (other.joinedChatDate != joinedChatDate) {
            return false
        }
        if (other.viaChatFolderInviteLink != viaChatFolderInviteLink) {
            return false
        }
        return other.approverUserId == approverUserId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + joinedChatDate.hashCode()
        hashCode = 31 * hashCode + viaChatFolderInviteLink.hashCode()
        hashCode = 31 * hashCode + approverUserId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinkMember")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("joinedChatDate=")
            append(joinedChatDate)
            append(", ")
            append("viaChatFolderInviteLink=")
            append(viaChatFolderInviteLink)
            append(", ")
            append("approverUserId=")
            append(approverUserId)
            append(")")
        }
    }
}
