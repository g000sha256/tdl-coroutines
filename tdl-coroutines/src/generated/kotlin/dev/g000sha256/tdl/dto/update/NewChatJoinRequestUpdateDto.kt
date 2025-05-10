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
import dev.g000sha256.tdl.dto.ChatJoinRequestDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A user sent a join request to a chat; for bots only.
 *
 * @property chatId Chat identifier.
 * @property request Join request.
 * @property userChatId Chat identifier of the private chat with the user.
 * @property inviteLink The invite link, which was used to send join request; may be null.
 */
public class NewChatJoinRequestUpdateDto public constructor(
    public val chatId: Long,
    public val request: ChatJoinRequestDto,
    public val userChatId: Long,
    public val inviteLink: ChatInviteLinkDto?,
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
        other as NewChatJoinRequestUpdateDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.request != request) {
            return false
        }
        if (other.userChatId != userChatId) {
            return false
        }
        return other.inviteLink == inviteLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + request.hashCode()
        hashCode = 31 * hashCode + userChatId.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NewChatJoinRequestUpdateDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("request=")
            append(request)
            append(", ")
            append("userChatId=")
            append(userChatId)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(")")
        }
    }
}
