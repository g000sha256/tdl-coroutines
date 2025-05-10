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
 * This class is an abstract base class.
 * Describes a reason why a bot was allowed to write messages to the current user.
 */
public sealed class BotWriteAccessAllowReasonDto private constructor() {
    /**
     * The user connected a website by logging in using Telegram Login Widget on it.
     *
     * @property domainName Domain name of the connected website.
     */
    public class ConnectedWebsite public constructor(
        public val domainName: String,
    ) : BotWriteAccessAllowReasonDto() {
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
            other as ConnectedWebsite
            return other.domainName == domainName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + domainName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("BotWriteAccessAllowReasonDto.ConnectedWebsite")
                append("(")
                append("domainName=")
                append(domainName)
                append(")")
            }
        }
    }

    /**
     * The user added the bot to attachment or side menu using toggleBotIsAddedToAttachmentMenu.
     */
    public class AddedToAttachmentMenu public constructor() : BotWriteAccessAllowReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "BotWriteAccessAllowReasonDto.AddedToAttachmentMenu()"
        }
    }

    /**
     * The user launched a Web App using getWebAppLinkUrl.
     *
     * @property webApp Information about the Web App.
     */
    public class LaunchedWebApp public constructor(
        public val webApp: WebAppDto,
    ) : BotWriteAccessAllowReasonDto() {
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
            other as LaunchedWebApp
            return other.webApp == webApp
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + webApp.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("BotWriteAccessAllowReasonDto.LaunchedWebApp")
                append("(")
                append("webApp=")
                append(webApp)
                append(")")
            }
        }
    }

    /**
     * The user accepted bot's request to send messages with allowBotToSendMessages.
     */
    public class AcceptedRequest public constructor() : BotWriteAccessAllowReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "BotWriteAccessAllowReasonDto.AcceptedRequest()"
        }
    }
}
