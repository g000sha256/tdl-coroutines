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
 * A button that requests a chat to be shared by the current user; available only in private chats. Use the method shareChatWithBot to complete the request.
 *
 * @property id Unique button identifier.
 * @property chatIsChannel True, if the chat must be a channel; otherwise, a basic group or a supergroup chat is shared.
 * @property restrictChatIsForum True, if the chat must or must not be a forum supergroup.
 * @property chatIsForum True, if the chat must be a forum supergroup; otherwise, the chat must not be a forum supergroup. Ignored if restrictChatIsForum is false.
 * @property restrictChatHasUsername True, if the chat must or must not have a username.
 * @property chatHasUsername True, if the chat must have a username; otherwise, the chat must not have a username. Ignored if restrictChatHasUsername is false.
 * @property chatIsCreated True, if the chat must be created by the current user.
 * @property userAdministratorRights Expected user administrator rights in the chat; may be null if they aren't restricted.
 * @property botAdministratorRights Expected bot administrator rights in the chat; may be null if they aren't restricted.
 * @property botIsMember True, if the bot must be a member of the chat; for basic group and supergroup chats only.
 * @property requestTitle Pass true to request title of the chat; bots only.
 * @property requestUsername Pass true to request username of the chat; bots only.
 * @property requestPhoto Pass true to request photo of the chat; bots only.
 */
public class KeyboardButtonTypeRequestChat public constructor(
    public val id: Int,
    public val chatIsChannel: Boolean,
    public val restrictChatIsForum: Boolean,
    public val chatIsForum: Boolean,
    public val restrictChatHasUsername: Boolean,
    public val chatHasUsername: Boolean,
    public val chatIsCreated: Boolean,
    public val userAdministratorRights: ChatAdministratorRights?,
    public val botAdministratorRights: ChatAdministratorRights?,
    public val botIsMember: Boolean,
    public val requestTitle: Boolean,
    public val requestUsername: Boolean,
    public val requestPhoto: Boolean,
) : KeyboardButtonType() {
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
        other as KeyboardButtonTypeRequestChat
        if (other.id != id) {
            return false
        }
        if (other.chatIsChannel != chatIsChannel) {
            return false
        }
        if (other.restrictChatIsForum != restrictChatIsForum) {
            return false
        }
        if (other.chatIsForum != chatIsForum) {
            return false
        }
        if (other.restrictChatHasUsername != restrictChatHasUsername) {
            return false
        }
        if (other.chatHasUsername != chatHasUsername) {
            return false
        }
        if (other.chatIsCreated != chatIsCreated) {
            return false
        }
        if (other.userAdministratorRights != userAdministratorRights) {
            return false
        }
        if (other.botAdministratorRights != botAdministratorRights) {
            return false
        }
        if (other.botIsMember != botIsMember) {
            return false
        }
        if (other.requestTitle != requestTitle) {
            return false
        }
        if (other.requestUsername != requestUsername) {
            return false
        }
        return other.requestPhoto == requestPhoto
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + chatIsChannel.hashCode()
        hashCode = 31 * hashCode + restrictChatIsForum.hashCode()
        hashCode = 31 * hashCode + chatIsForum.hashCode()
        hashCode = 31 * hashCode + restrictChatHasUsername.hashCode()
        hashCode = 31 * hashCode + chatHasUsername.hashCode()
        hashCode = 31 * hashCode + chatIsCreated.hashCode()
        hashCode = 31 * hashCode + userAdministratorRights.hashCode()
        hashCode = 31 * hashCode + botAdministratorRights.hashCode()
        hashCode = 31 * hashCode + botIsMember.hashCode()
        hashCode = 31 * hashCode + requestTitle.hashCode()
        hashCode = 31 * hashCode + requestUsername.hashCode()
        hashCode = 31 * hashCode + requestPhoto.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("KeyboardButtonTypeRequestChat")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("chatIsChannel=")
            append(chatIsChannel)
            append(", ")
            append("restrictChatIsForum=")
            append(restrictChatIsForum)
            append(", ")
            append("chatIsForum=")
            append(chatIsForum)
            append(", ")
            append("restrictChatHasUsername=")
            append(restrictChatHasUsername)
            append(", ")
            append("chatHasUsername=")
            append(chatHasUsername)
            append(", ")
            append("chatIsCreated=")
            append(chatIsCreated)
            append(", ")
            append("userAdministratorRights=")
            append(userAdministratorRights)
            append(", ")
            append("botAdministratorRights=")
            append(botAdministratorRights)
            append(", ")
            append("botIsMember=")
            append(botIsMember)
            append(", ")
            append("requestTitle=")
            append(requestTitle)
            append(", ")
            append("requestUsername=")
            append(requestUsername)
            append(", ")
            append("requestPhoto=")
            append(requestPhoto)
            append(")")
        }
    }
}
