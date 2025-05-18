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
 * The link is a link to a Telegram bot, which is expected to be added to a group chat. Call searchPublicChat with the given bot username, check that the user is a bot and can be added to groups, ask the current user to select a basic group or a supergroup chat to add the bot to, taking into account that bots can be added to a public supergroup only by administrators of the supergroup. If administrator rights are provided by the link, call getChatMember to receive the current bot rights in the chat and if the bot already is an administrator, check that the current user can edit its administrator rights, combine received rights with the requested administrator rights, show confirmation box to the user, and call setChatMemberStatus with the chosen chat and confirmed administrator rights. Before call to setChatMemberStatus it may be required to upgrade the chosen basic group chat to a supergroup chat. Then, if startParameter isn't empty, call sendBotStartMessage with the given start parameter and the chosen chat; otherwise, just send /start message with bot's username added to the chat.
 *
 * @property botUsername Username of the bot.
 * @property startParameter The parameter to be passed to sendBotStartMessage.
 * @property administratorRights Expected administrator rights for the bot; may be null.
 */
public class InternalLinkTypeBotStartInGroup public constructor(
    public val botUsername: String,
    public val startParameter: String,
    public val administratorRights: ChatAdministratorRights?,
) : InternalLinkType() {
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
        other as InternalLinkTypeBotStartInGroup
        if (other.botUsername != botUsername) {
            return false
        }
        if (other.startParameter != startParameter) {
            return false
        }
        return other.administratorRights == administratorRights
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUsername.hashCode()
        hashCode = 31 * hashCode + startParameter.hashCode()
        hashCode = 31 * hashCode + administratorRights.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeBotStartInGroup")
            append("(")
            append("botUsername=")
            append(botUsername)
            append(", ")
            append("startParameter=")
            append(startParameter)
            append(", ")
            append("administratorRights=")
            append(administratorRights)
            append(")")
        }
    }
}
