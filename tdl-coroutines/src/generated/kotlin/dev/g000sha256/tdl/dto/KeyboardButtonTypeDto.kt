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
 * Describes a keyboard button type.
 */
public sealed class KeyboardButtonTypeDto private constructor() {
    /**
     * A simple button, with text that must be sent when the button is pressed.
     */
    public class Text public constructor() : KeyboardButtonTypeDto() {
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
            return "KeyboardButtonTypeDto.Text()"
        }
    }

    /**
     * A button that sends the user's phone number when pressed; available only in private chats.
     */
    public class RequestPhoneNumber public constructor() : KeyboardButtonTypeDto() {
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
            return "KeyboardButtonTypeDto.RequestPhoneNumber()"
        }
    }

    /**
     * A button that sends the user's location when pressed; available only in private chats.
     */
    public class RequestLocation public constructor() : KeyboardButtonTypeDto() {
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
            return "KeyboardButtonTypeDto.RequestLocation()"
        }
    }

    /**
     * A button that allows the user to create and send a poll when pressed; available only in private chats.
     *
     * @property forceRegular If true, only regular polls must be allowed to create.
     * @property forceQuiz If true, only polls in quiz mode must be allowed to create.
     */
    public class RequestPoll public constructor(
        public val forceRegular: Boolean,
        public val forceQuiz: Boolean,
    ) : KeyboardButtonTypeDto() {
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
            other as RequestPoll
            if (other.forceRegular != forceRegular) {
                return false
            }
            return other.forceQuiz == forceQuiz
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + forceRegular.hashCode()
            hashCode = 31 * hashCode + forceQuiz.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("KeyboardButtonTypeDto.RequestPoll")
                append("(")
                append("forceRegular=")
                append(forceRegular)
                append(", ")
                append("forceQuiz=")
                append(forceQuiz)
                append(")")
            }
        }
    }

    /**
     * A button that requests users to be shared by the current user; available only in private chats. Use the method shareUsersWithBot to complete the request.
     *
     * @property id Unique button identifier.
     * @property restrictUserIsBot True, if the shared users must or must not be bots.
     * @property userIsBot True, if the shared users must be bots; otherwise, the shared users must not be bots. Ignored if restrictUserIsBot is false.
     * @property restrictUserIsPremium True, if the shared users must or must not be Telegram Premium users.
     * @property userIsPremium True, if the shared users must be Telegram Premium users; otherwise, the shared users must not be Telegram Premium users. Ignored if restrictUserIsPremium is false.
     * @property maxQuantity The maximum number of users to share.
     * @property requestName Pass true to request name of the users; bots only.
     * @property requestUsername Pass true to request username of the users; bots only.
     * @property requestPhoto Pass true to request photo of the users; bots only.
     */
    public class RequestUsers public constructor(
        public val id: Int,
        public val restrictUserIsBot: Boolean,
        public val userIsBot: Boolean,
        public val restrictUserIsPremium: Boolean,
        public val userIsPremium: Boolean,
        public val maxQuantity: Int,
        public val requestName: Boolean,
        public val requestUsername: Boolean,
        public val requestPhoto: Boolean,
    ) : KeyboardButtonTypeDto() {
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
            other as RequestUsers
            if (other.id != id) {
                return false
            }
            if (other.restrictUserIsBot != restrictUserIsBot) {
                return false
            }
            if (other.userIsBot != userIsBot) {
                return false
            }
            if (other.restrictUserIsPremium != restrictUserIsPremium) {
                return false
            }
            if (other.userIsPremium != userIsPremium) {
                return false
            }
            if (other.maxQuantity != maxQuantity) {
                return false
            }
            if (other.requestName != requestName) {
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
            hashCode = 31 * hashCode + restrictUserIsBot.hashCode()
            hashCode = 31 * hashCode + userIsBot.hashCode()
            hashCode = 31 * hashCode + restrictUserIsPremium.hashCode()
            hashCode = 31 * hashCode + userIsPremium.hashCode()
            hashCode = 31 * hashCode + maxQuantity.hashCode()
            hashCode = 31 * hashCode + requestName.hashCode()
            hashCode = 31 * hashCode + requestUsername.hashCode()
            hashCode = 31 * hashCode + requestPhoto.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("KeyboardButtonTypeDto.RequestUsers")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("restrictUserIsBot=")
                append(restrictUserIsBot)
                append(", ")
                append("userIsBot=")
                append(userIsBot)
                append(", ")
                append("restrictUserIsPremium=")
                append(restrictUserIsPremium)
                append(", ")
                append("userIsPremium=")
                append(userIsPremium)
                append(", ")
                append("maxQuantity=")
                append(maxQuantity)
                append(", ")
                append("requestName=")
                append(requestName)
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
    public class RequestChat public constructor(
        public val id: Int,
        public val chatIsChannel: Boolean,
        public val restrictChatIsForum: Boolean,
        public val chatIsForum: Boolean,
        public val restrictChatHasUsername: Boolean,
        public val chatHasUsername: Boolean,
        public val chatIsCreated: Boolean,
        public val userAdministratorRights: ChatAdministratorRightsDto?,
        public val botAdministratorRights: ChatAdministratorRightsDto?,
        public val botIsMember: Boolean,
        public val requestTitle: Boolean,
        public val requestUsername: Boolean,
        public val requestPhoto: Boolean,
    ) : KeyboardButtonTypeDto() {
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
            other as RequestChat
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
                append("KeyboardButtonTypeDto.RequestChat")
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

    /**
     * A button that opens a Web App by calling getWebAppUrl.
     *
     * @property url An HTTP URL to pass to getWebAppUrl.
     */
    public class WebApp public constructor(
        public val url: String,
    ) : KeyboardButtonTypeDto() {
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
            other as WebApp
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("KeyboardButtonTypeDto.WebApp")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }
}
