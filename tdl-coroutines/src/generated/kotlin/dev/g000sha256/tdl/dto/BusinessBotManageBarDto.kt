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
 * Contains information about a business bot that manages the chat.
 *
 * @property botUserId User identifier of the bot.
 * @property manageUrl URL to be opened to manage the bot.
 * @property isBotPaused True, if the bot is paused. Use toggleBusinessConnectedBotChatIsPaused to change the value of the field.
 * @property canBotReply True, if the bot can reply.
 */
public class BusinessBotManageBarDto public constructor(
    public val botUserId: Long,
    public val manageUrl: String,
    public val isBotPaused: Boolean,
    public val canBotReply: Boolean,
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
        other as BusinessBotManageBarDto
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.manageUrl != manageUrl) {
            return false
        }
        if (other.isBotPaused != isBotPaused) {
            return false
        }
        return other.canBotReply == canBotReply
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + manageUrl.hashCode()
        hashCode = 31 * hashCode + isBotPaused.hashCode()
        hashCode = 31 * hashCode + canBotReply.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessBotManageBarDto")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("manageUrl=")
            append(manageUrl)
            append(", ")
            append("isBotPaused=")
            append(isBotPaused)
            append(", ")
            append("canBotReply=")
            append(canBotReply)
            append(")")
        }
    }
}
