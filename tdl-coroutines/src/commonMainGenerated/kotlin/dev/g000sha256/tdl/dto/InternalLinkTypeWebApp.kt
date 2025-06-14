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
 * The link is a link to a Web App. Call searchPublicChat with the given bot username, check that the user is a bot. If the bot is restricted for the current user, then show an error message. Otherwise, call searchWebApp with the received bot and the given webAppShortName. Process received foundWebApp by showing a confirmation dialog if needed. If the bot can be added to attachment or side menu, but isn't added yet, then show a disclaimer about Mini Apps being third-party applications instead of the dialog and ask the user to accept their Terms of service. If the user accept the terms and confirms adding, then use toggleBotIsAddedToAttachmentMenu to add the bot. Then, call getWebAppLinkUrl and open the returned URL as a Web App.
 *
 * @property botUsername Username of the bot that owns the Web App.
 * @property webAppShortName Short name of the Web App.
 * @property startParameter Start parameter to be passed to getWebAppLinkUrl.
 * @property mode The mode in which the Web App must be opened.
 */
public class InternalLinkTypeWebApp public constructor(
    public val botUsername: String,
    public val webAppShortName: String,
    public val startParameter: String,
    public val mode: WebAppOpenMode,
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
        other as InternalLinkTypeWebApp
        if (other.botUsername != botUsername) {
            return false
        }
        if (other.webAppShortName != webAppShortName) {
            return false
        }
        if (other.startParameter != startParameter) {
            return false
        }
        return other.mode == mode
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUsername.hashCode()
        hashCode = 31 * hashCode + webAppShortName.hashCode()
        hashCode = 31 * hashCode + startParameter.hashCode()
        hashCode = 31 * hashCode + mode.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeWebApp")
            append("(")
            append("botUsername=")
            append(botUsername)
            append(", ")
            append("webAppShortName=")
            append(webAppShortName)
            append(", ")
            append("startParameter=")
            append(startParameter)
            append(", ")
            append("mode=")
            append(mode)
            append(")")
        }
    }
}
