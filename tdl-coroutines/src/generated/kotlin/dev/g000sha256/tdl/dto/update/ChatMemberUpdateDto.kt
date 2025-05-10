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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.ChatInviteLinkDto
import dev.g000sha256.tdl.dto.ChatMemberDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * User rights changed in a chat; for bots only.
 *
 * @property chatId Chat identifier.
 * @property actorUserId Identifier of the user, changing the rights.
 * @property date Point in time (Unix timestamp) when the user rights were changed.
 * @property inviteLink If user has joined the chat using an invite link, the invite link; may be null.
 * @property viaJoinRequest True, if the user has joined the chat after sending a join request and being approved by an administrator.
 * @property viaChatFolderInviteLink True, if the user has joined the chat using an invite link for a chat folder.
 * @property oldChatMember Previous chat member.
 * @property newChatMember New chat member.
 */
public class ChatMemberUpdateDto public constructor(
    public val chatId: Long,
    public val actorUserId: Long,
    public val date: Int,
    public val inviteLink: ChatInviteLinkDto?,
    public val viaJoinRequest: Boolean,
    public val viaChatFolderInviteLink: Boolean,
    public val oldChatMember: ChatMemberDto,
    public val newChatMember: ChatMemberDto,
) : UpdateDto() {
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
        other as ChatMemberUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.actorUserId != actorUserId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.inviteLink != inviteLink) {
            return false
        }
        if (other.viaJoinRequest != viaJoinRequest) {
            return false
        }
        if (other.viaChatFolderInviteLink != viaChatFolderInviteLink) {
            return false
        }
        if (other.oldChatMember != oldChatMember) {
            return false
        }
        return other.newChatMember == newChatMember
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + actorUserId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        hashCode = 31 * hashCode + viaJoinRequest.hashCode()
        hashCode = 31 * hashCode + viaChatFolderInviteLink.hashCode()
        hashCode = 31 * hashCode + oldChatMember.hashCode()
        hashCode = 31 * hashCode + newChatMember.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatMemberUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("actorUserId=")
            append(actorUserId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(", ")
            append("viaJoinRequest=")
            append(viaJoinRequest)
            append(", ")
            append("viaChatFolderInviteLink=")
            append(viaChatFolderInviteLink)
            append(", ")
            append("oldChatMember=")
            append(oldChatMember)
            append(", ")
            append("newChatMember=")
            append(newChatMember)
            append(")")
        }
    }
}
