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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
@SerialName(value = "updateChatMember")
@Serializable
public class UpdateChatMember public constructor(
    @SerialName(value = "chat_id")
    public val chatId: Long,
    @SerialName(value = "actor_user_id")
    public val actorUserId: Long,
    @SerialName(value = "date")
    public val date: Int,
    @SerialName(value = "invite_link")
    public val inviteLink: ChatInviteLink?,
    @SerialName(value = "via_join_request")
    public val viaJoinRequest: Boolean,
    @SerialName(value = "via_chat_folder_invite_link")
    public val viaChatFolderInviteLink: Boolean,
    @SerialName(value = "old_chat_member")
    public val oldChatMember: ChatMember,
    @SerialName(value = "new_chat_member")
    public val newChatMember: ChatMember,
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
        other as UpdateChatMember
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
            append("UpdateChatMember")
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
