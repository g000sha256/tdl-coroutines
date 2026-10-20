/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * The link is a link to a dialog for creating of a managed bot. Call searchPublicChat with the given manager bot username. If the chat is found, the chat is a chat with a bot and the bot has canManageBots == true, then show bot creation confirmation dialog with the given suggestedBotUsername and suggestedBotName. If user agrees, call createBot with viaLink == true to create the bot.
 *
 * @property managerBotUsername Username of the bot which will manage the new bot.
 * @property suggestedBotUsername Suggested username for the bot; always ends with &quot;bot&quot; or a string from updateAllowedBotUsernamePremiumSuffixes case-insensitive.
 * @property suggestedBotName Suggested name for the bot; may be empty if not specified.
 */
public class InternalLinkTypeRequestManagedBot public constructor(
    public val managerBotUsername: String,
    public val suggestedBotUsername: String,
    public val suggestedBotName: String,
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
        other as InternalLinkTypeRequestManagedBot
        if (other.managerBotUsername != managerBotUsername) {
            return false
        }
        if (other.suggestedBotUsername != suggestedBotUsername) {
            return false
        }
        return other.suggestedBotName == suggestedBotName
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + managerBotUsername.hashCode()
        hashCode = 31 * hashCode + suggestedBotUsername.hashCode()
        hashCode = 31 * hashCode + suggestedBotName.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeRequestManagedBot")
            append("(")
            append("managerBotUsername=")
            append(managerBotUsername)
            append(", ")
            append("suggestedBotUsername=")
            append(suggestedBotUsername)
            append(", ")
            append("suggestedBotName=")
            append(suggestedBotName)
            append(")")
        }
    }
}
