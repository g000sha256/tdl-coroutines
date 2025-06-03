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
 * The link is a link to a chat with a Telegram bot. Call searchPublicChat with the given bot username, check that the user is a bot, show START button in the chat with the bot, and then call sendBotStartMessage with the given start parameter after the button is pressed.
 *
 * @property botUsername Username of the bot.
 * @property startParameter The parameter to be passed to sendBotStartMessage.
 * @property autostart True, if sendBotStartMessage must be called automatically without showing the START button.
 */
public class InternalLinkTypeBotStart public constructor(
    public val botUsername: String,
    public val startParameter: String,
    public val autostart: Boolean,
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
        other as InternalLinkTypeBotStart
        if (other.botUsername != botUsername) {
            return false
        }
        if (other.startParameter != startParameter) {
            return false
        }
        return other.autostart == autostart
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUsername.hashCode()
        hashCode = 31 * hashCode + startParameter.hashCode()
        hashCode = 31 * hashCode + autostart.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeBotStart")
            append("(")
            append("botUsername=")
            append(botUsername)
            append(", ")
            append("startParameter=")
            append(startParameter)
            append(", ")
            append("autostart=")
            append(autostart)
            append(")")
        }
    }
}
