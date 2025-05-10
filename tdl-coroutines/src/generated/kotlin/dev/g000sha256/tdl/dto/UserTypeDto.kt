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
 * Represents the type of user. The following types are possible: regular users, deleted users and bots.
 */
public sealed class UserTypeDto private constructor() {
    /**
     * A regular user.
     */
    public class Regular public constructor() : UserTypeDto() {
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
            return "UserTypeDto.Regular()"
        }
    }

    /**
     * A deleted user or deleted bot. No information on the user besides the user identifier is available. It is not possible to perform any active actions on this type of user.
     */
    public class Deleted public constructor() : UserTypeDto() {
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
            return "UserTypeDto.Deleted()"
        }
    }

    /**
     * A bot (see https://core.telegram.org/bots).
     *
     * @property canBeEdited True, if the bot is owned by the current user and can be edited using the methods toggleBotUsernameIsActive, reorderBotActiveUsernames, setBotProfilePhoto, setBotName, setBotInfoDescription, and setBotInfoShortDescription.
     * @property canJoinGroups True, if the bot can be invited to basic group and supergroup chats.
     * @property canReadAllGroupMessages True, if the bot can read all messages in basic group or supergroup chats and not just those addressed to the bot. In private and channel chats a bot can always read all messages.
     * @property hasMainWebApp True, if the bot has the main Web App.
     * @property isInline True, if the bot supports inline queries.
     * @property inlineQueryPlaceholder Placeholder for inline queries (displayed on the application input field).
     * @property needLocation True, if the location of the user is expected to be sent with every inline query to this bot.
     * @property canConnectToBusiness True, if the bot supports connection to Telegram Business accounts.
     * @property canBeAddedToAttachmentMenu True, if the bot can be added to attachment or side menu.
     * @property activeUserCount The number of recently active users of the bot.
     */
    public class Bot public constructor(
        public val canBeEdited: Boolean,
        public val canJoinGroups: Boolean,
        public val canReadAllGroupMessages: Boolean,
        public val hasMainWebApp: Boolean,
        public val isInline: Boolean,
        public val inlineQueryPlaceholder: String,
        public val needLocation: Boolean,
        public val canConnectToBusiness: Boolean,
        public val canBeAddedToAttachmentMenu: Boolean,
        public val activeUserCount: Int,
    ) : UserTypeDto() {
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
            other as Bot
            if (other.canBeEdited != canBeEdited) {
                return false
            }
            if (other.canJoinGroups != canJoinGroups) {
                return false
            }
            if (other.canReadAllGroupMessages != canReadAllGroupMessages) {
                return false
            }
            if (other.hasMainWebApp != hasMainWebApp) {
                return false
            }
            if (other.isInline != isInline) {
                return false
            }
            if (other.inlineQueryPlaceholder != inlineQueryPlaceholder) {
                return false
            }
            if (other.needLocation != needLocation) {
                return false
            }
            if (other.canConnectToBusiness != canConnectToBusiness) {
                return false
            }
            if (other.canBeAddedToAttachmentMenu != canBeAddedToAttachmentMenu) {
                return false
            }
            return other.activeUserCount == activeUserCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + canBeEdited.hashCode()
            hashCode = 31 * hashCode + canJoinGroups.hashCode()
            hashCode = 31 * hashCode + canReadAllGroupMessages.hashCode()
            hashCode = 31 * hashCode + hasMainWebApp.hashCode()
            hashCode = 31 * hashCode + isInline.hashCode()
            hashCode = 31 * hashCode + inlineQueryPlaceholder.hashCode()
            hashCode = 31 * hashCode + needLocation.hashCode()
            hashCode = 31 * hashCode + canConnectToBusiness.hashCode()
            hashCode = 31 * hashCode + canBeAddedToAttachmentMenu.hashCode()
            hashCode = 31 * hashCode + activeUserCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserTypeDto.Bot")
                append("(")
                append("canBeEdited=")
                append(canBeEdited)
                append(", ")
                append("canJoinGroups=")
                append(canJoinGroups)
                append(", ")
                append("canReadAllGroupMessages=")
                append(canReadAllGroupMessages)
                append(", ")
                append("hasMainWebApp=")
                append(hasMainWebApp)
                append(", ")
                append("isInline=")
                append(isInline)
                append(", ")
                append("inlineQueryPlaceholder=")
                append(inlineQueryPlaceholder)
                append(", ")
                append("needLocation=")
                append(needLocation)
                append(", ")
                append("canConnectToBusiness=")
                append(canConnectToBusiness)
                append(", ")
                append("canBeAddedToAttachmentMenu=")
                append(canBeAddedToAttachmentMenu)
                append(", ")
                append("activeUserCount=")
                append(activeUserCount)
                append(")")
            }
        }
    }

    /**
     * No information on the user besides the user identifier is available, yet this user has not been deleted. This object is extremely rare and must be handled like a deleted user. It is not possible to perform any actions on users of this type.
     */
    public class Unknown public constructor() : UserTypeDto() {
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
            return "UserTypeDto.Unknown()"
        }
    }
}
