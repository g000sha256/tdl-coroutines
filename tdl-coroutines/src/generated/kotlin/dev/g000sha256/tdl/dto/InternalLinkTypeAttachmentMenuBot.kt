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
 * The link is a link to an attachment menu bot to be opened in the specified or a chosen chat. Process given targetChat to open the chat. Then, call searchPublicChat with the given bot username, check that the user is a bot and can be added to attachment menu. Then, use getAttachmentMenuBot to receive information about the bot. If the bot isn't added to attachment menu, then show a disclaimer about Mini Apps being third-party applications, ask the user to accept their Terms of service and confirm adding the bot to side and attachment menu. If the user accept the terms and confirms adding, then use toggleBotIsAddedToAttachmentMenu to add the bot. If the attachment menu bot can't be used in the opened chat, show an error to the user. If the bot is added to attachment menu and can be used in the chat, then use openWebApp with the given URL.
 *
 * @property targetChat Target chat to be opened.
 * @property botUsername Username of the bot.
 * @property url URL to be passed to openWebApp.
 */
public class InternalLinkTypeAttachmentMenuBot public constructor(
    public val targetChat: TargetChat,
    public val botUsername: String,
    public val url: String,
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
        other as InternalLinkTypeAttachmentMenuBot
        if (other.targetChat != targetChat) {
            return false
        }
        if (other.botUsername != botUsername) {
            return false
        }
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + targetChat.hashCode()
        hashCode = 31 * hashCode + botUsername.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeAttachmentMenuBot")
            append("(")
            append("targetChat=")
            append(targetChat)
            append(", ")
            append("botUsername=")
            append(botUsername)
            append(", ")
            append("url=")
            append(url)
            append(")")
        }
    }
}
