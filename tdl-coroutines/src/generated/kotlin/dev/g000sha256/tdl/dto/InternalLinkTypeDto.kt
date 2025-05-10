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
 * This class is an abstract base class.
 * Describes an internal https://t.me or tg: link, which must be processed by the application in a special way.
 */
public sealed class InternalLinkTypeDto private constructor() {
    /**
     * The link is a link to the Devices section of the application. Use getActiveSessions to get the list of active sessions and show them to the user.
     */
    public class ActiveSessions public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.ActiveSessions()"
        }
    }

    /**
     * The link is a link to an attachment menu bot to be opened in the specified or a chosen chat. Process given targetChat to open the chat. Then, call searchPublicChat with the given bot username, check that the user is a bot and can be added to attachment menu. Then, use getAttachmentMenuBot to receive information about the bot. If the bot isn't added to attachment menu, then show a disclaimer about Mini Apps being third-party applications, ask the user to accept their Terms of service and confirm adding the bot to side and attachment menu. If the user accept the terms and confirms adding, then use toggleBotIsAddedToAttachmentMenu to add the bot. If the attachment menu bot can't be used in the opened chat, show an error to the user. If the bot is added to attachment menu and can be used in the chat, then use openWebApp with the given URL.
     *
     * @property targetChat Target chat to be opened.
     * @property botUsername Username of the bot.
     * @property url URL to be passed to openWebApp.
     */
    public class AttachmentMenuBot public constructor(
        public val targetChat: TargetChatDto,
        public val botUsername: String,
        public val url: String,
    ) : InternalLinkTypeDto() {
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
            other as AttachmentMenuBot
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
                append("InternalLinkTypeDto.AttachmentMenuBot")
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

    /**
     * The link contains an authentication code. Call checkAuthenticationCode with the code if the current authorization state is authorizationStateWaitCode.
     *
     * @property code The authentication code.
     */
    public class AuthenticationCode public constructor(
        public val code: String,
    ) : InternalLinkTypeDto() {
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
            other as AuthenticationCode
            return other.code == code
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + code.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.AuthenticationCode")
                append("(")
                append("code=")
                append(code)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a background. Call searchBackground with the given background name to process the link. If background is found and the user wants to apply it, then call setDefaultBackground.
     *
     * @property backgroundName Name of the background.
     */
    public class Background public constructor(
        public val backgroundName: String,
    ) : InternalLinkTypeDto() {
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
            other as Background
            return other.backgroundName == backgroundName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + backgroundName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Background")
                append("(")
                append("backgroundName=")
                append(backgroundName)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a Telegram bot, which is expected to be added to a channel chat as an administrator. Call searchPublicChat with the given bot username and check that the user is a bot, ask the current user to select a channel chat to add the bot to as an administrator. Then, call getChatMember to receive the current bot rights in the chat and if the bot already is an administrator, check that the current user can edit its administrator rights and combine received rights with the requested administrator rights. Then, show confirmation box to the user, and call setChatMemberStatus with the chosen chat and confirmed rights.
     *
     * @property botUsername Username of the bot.
     * @property administratorRights Expected administrator rights for the bot.
     */
    public class BotAddToChannel public constructor(
        public val botUsername: String,
        public val administratorRights: ChatAdministratorRightsDto,
    ) : InternalLinkTypeDto() {
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
            other as BotAddToChannel
            if (other.botUsername != botUsername) {
                return false
            }
            return other.administratorRights == administratorRights
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + botUsername.hashCode()
            hashCode = 31 * hashCode + administratorRights.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.BotAddToChannel")
                append("(")
                append("botUsername=")
                append(botUsername)
                append(", ")
                append("administratorRights=")
                append(administratorRights)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a chat with a Telegram bot. Call searchPublicChat with the given bot username, check that the user is a bot, show START button in the chat with the bot, and then call sendBotStartMessage with the given start parameter after the button is pressed.
     *
     * @property botUsername Username of the bot.
     * @property startParameter The parameter to be passed to sendBotStartMessage.
     * @property autostart True, if sendBotStartMessage must be called automatically without showing the START button.
     */
    public class BotStart public constructor(
        public val botUsername: String,
        public val startParameter: String,
        public val autostart: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as BotStart
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
                append("InternalLinkTypeDto.BotStart")
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

    /**
     * The link is a link to a Telegram bot, which is expected to be added to a group chat. Call searchPublicChat with the given bot username, check that the user is a bot and can be added to groups, ask the current user to select a basic group or a supergroup chat to add the bot to, taking into account that bots can be added to a public supergroup only by administrators of the supergroup. If administrator rights are provided by the link, call getChatMember to receive the current bot rights in the chat and if the bot already is an administrator, check that the current user can edit its administrator rights, combine received rights with the requested administrator rights, show confirmation box to the user, and call setChatMemberStatus with the chosen chat and confirmed administrator rights. Before call to setChatMemberStatus it may be required to upgrade the chosen basic group chat to a supergroup chat. Then, if startParameter isn't empty, call sendBotStartMessage with the given start parameter and the chosen chat; otherwise, just send /start message with bot's username added to the chat.
     *
     * @property botUsername Username of the bot.
     * @property startParameter The parameter to be passed to sendBotStartMessage.
     * @property administratorRights Expected administrator rights for the bot; may be null.
     */
    public class BotStartInGroup public constructor(
        public val botUsername: String,
        public val startParameter: String,
        public val administratorRights: ChatAdministratorRightsDto?,
    ) : InternalLinkTypeDto() {
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
            other as BotStartInGroup
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
                append("InternalLinkTypeDto.BotStartInGroup")
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

    /**
     * The link is a link to a business chat. Use getBusinessChatLinkInfo with the provided link name to get information about the link, then open received private chat and replace chat draft with the provided text.
     *
     * @property linkName Name of the link.
     */
    public class BusinessChat public constructor(
        public val linkName: String,
    ) : InternalLinkTypeDto() {
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
            other as BusinessChat
            return other.linkName == linkName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + linkName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.BusinessChat")
                append("(")
                append("linkName=")
                append(linkName)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the Telegram Star purchase section of the application.
     *
     * @property starCount The number of Telegram Stars that must be owned by the user.
     * @property purpose Purpose of Telegram Star purchase. Arbitrary string specified by the server, for example, &quot;subs&quot; if the Telegram Stars are required to extend channel subscriptions.
     */
    public class BuyStars public constructor(
        public val starCount: Long,
        public val purpose: String,
    ) : InternalLinkTypeDto() {
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
            other as BuyStars
            if (other.starCount != starCount) {
                return false
            }
            return other.purpose == purpose
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + purpose.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.BuyStars")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("purpose=")
                append(purpose)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the change phone number section of the application.
     */
    public class ChangePhoneNumber public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.ChangePhoneNumber()"
        }
    }

    /**
     * The link is an affiliate program link. Call searchChatAffiliateProgram with the given username and referrer to process the link.
     *
     * @property username Username to be passed to searchChatAffiliateProgram.
     * @property referrer Referrer to be passed to searchChatAffiliateProgram.
     */
    public class ChatAffiliateProgram public constructor(
        public val username: String,
        public val referrer: String,
    ) : InternalLinkTypeDto() {
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
            other as ChatAffiliateProgram
            if (other.username != username) {
                return false
            }
            return other.referrer == referrer
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + username.hashCode()
            hashCode = 31 * hashCode + referrer.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.ChatAffiliateProgram")
                append("(")
                append("username=")
                append(username)
                append(", ")
                append("referrer=")
                append(referrer)
                append(")")
            }
        }
    }

    /**
     * The link is a link to boost a Telegram chat. Call getChatBoostLinkInfo with the given URL to process the link. If the chat is found, then call getChatBoostStatus and getAvailableChatBoostSlots to get the current boost status and check whether the chat can be boosted. If the user wants to boost the chat and the chat can be boosted, then call boostChat.
     *
     * @property url URL to be passed to getChatBoostLinkInfo.
     */
    public class ChatBoost public constructor(
        public val url: String,
    ) : InternalLinkTypeDto() {
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
            other as ChatBoost
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.ChatBoost")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * The link is an invite link to a chat folder. Call checkChatFolderInviteLink with the given invite link to process the link. If the link is valid and the user wants to join the chat folder, then call addChatFolderByInviteLink.
     *
     * @property inviteLink Internal representation of the invite link.
     */
    public class ChatFolderInvite public constructor(
        public val inviteLink: String,
    ) : InternalLinkTypeDto() {
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
            other as ChatFolderInvite
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.ChatFolderInvite")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the folder section of the application settings.
     */
    public class ChatFolderSettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.ChatFolderSettings()"
        }
    }

    /**
     * The link is a chat invite link. Call checkChatInviteLink with the given invite link to process the link. If the link is valid and the user wants to join the chat, then call joinChatByInviteLink.
     *
     * @property inviteLink Internal representation of the invite link.
     */
    public class ChatInvite public constructor(
        public val inviteLink: String,
    ) : InternalLinkTypeDto() {
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
            other as ChatInvite
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.ChatInvite")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the default message auto-delete timer settings section of the application settings.
     */
    public class DefaultMessageAutoDeleteTimerSettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.DefaultMessageAutoDeleteTimerSettings()"
        }
    }

    /**
     * The link is a link to the edit profile section of the application settings.
     */
    public class EditProfileSettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.EditProfileSettings()"
        }
    }

    /**
     * The link is a link to a game. Call searchPublicChat with the given bot username, check that the user is a bot, ask the current user to select a chat to send the game, and then call sendMessage with inputMessageGame.
     *
     * @property botUsername Username of the bot that owns the game.
     * @property gameShortName Short name of the game.
     */
    public class Game public constructor(
        public val botUsername: String,
        public val gameShortName: String,
    ) : InternalLinkTypeDto() {
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
            other as Game
            if (other.botUsername != botUsername) {
                return false
            }
            return other.gameShortName == gameShortName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + botUsername.hashCode()
            hashCode = 31 * hashCode + gameShortName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Game")
                append("(")
                append("botUsername=")
                append(botUsername)
                append(", ")
                append("gameShortName=")
                append(gameShortName)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a group call that isn't bound to a chat. Call joinGroupCall with the given inviteLink.
     *
     * @property inviteLink Internal representation of the invite link.
     */
    public class GroupCall public constructor(
        public val inviteLink: String,
    ) : InternalLinkTypeDto() {
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
            other as GroupCall
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.GroupCall")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * The link must be opened in an Instant View. Call getWebPageInstantView with the given URL to process the link. If Instant View is found, then show it, otherwise, open the fallback URL in an external browser.
     *
     * @property url URL to be passed to getWebPageInstantView.
     * @property fallbackUrl An URL to open if getWebPageInstantView fails.
     */
    public class InstantView public constructor(
        public val url: String,
        public val fallbackUrl: String,
    ) : InternalLinkTypeDto() {
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
            other as InstantView
            if (other.url != url) {
                return false
            }
            return other.fallbackUrl == fallbackUrl
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + fallbackUrl.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.InstantView")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("fallbackUrl=")
                append(fallbackUrl)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an invoice. Call getPaymentForm with the given invoice name to process the link.
     *
     * @property invoiceName Name of the invoice.
     */
    public class Invoice public constructor(
        public val invoiceName: String,
    ) : InternalLinkTypeDto() {
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
            other as Invoice
            return other.invoiceName == invoiceName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + invoiceName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Invoice")
                append("(")
                append("invoiceName=")
                append(invoiceName)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a language pack. Call getLanguagePackInfo with the given language pack identifier to process the link. If the language pack is found and the user wants to apply it, then call setOption for the option &quot;language_pack_id&quot;.
     *
     * @property languagePackId Language pack identifier.
     */
    public class LanguagePack public constructor(
        public val languagePackId: String,
    ) : InternalLinkTypeDto() {
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
            other as LanguagePack
            return other.languagePackId == languagePackId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + languagePackId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.LanguagePack")
                append("(")
                append("languagePackId=")
                append(languagePackId)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the language section of the application settings.
     */
    public class LanguageSettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.LanguageSettings()"
        }
    }

    /**
     * The link is a link to the main Web App of a bot. Call searchPublicChat with the given bot username, check that the user is a bot and has the main Web App. If the bot can be added to attachment menu, then use getAttachmentMenuBot to receive information about the bot, then if the bot isn't added to side menu, show a disclaimer about Mini Apps being third-party applications, ask the user to accept their Terms of service and confirm adding the bot to side and attachment menu, then if the user accepts the terms and confirms adding, use toggleBotIsAddedToAttachmentMenu to add the bot. Then, use getMainWebApp with the given start parameter and mode and open the returned URL as a Web App.
     *
     * @property botUsername Username of the bot.
     * @property startParameter Start parameter to be passed to getMainWebApp.
     * @property mode The mode to be passed to getMainWebApp.
     */
    public class MainWebApp public constructor(
        public val botUsername: String,
        public val startParameter: String,
        public val mode: WebAppOpenModeDto,
    ) : InternalLinkTypeDto() {
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
            other as MainWebApp
            if (other.botUsername != botUsername) {
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
            hashCode = 31 * hashCode + startParameter.hashCode()
            hashCode = 31 * hashCode + mode.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.MainWebApp")
                append("(")
                append("botUsername=")
                append(botUsername)
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

    /**
     * The link is a link to a Telegram message or a forum topic. Call getMessageLinkInfo with the given URL to process the link, and then open received forum topic or chat and show the message there.
     *
     * @property url URL to be passed to getMessageLinkInfo.
     */
    public class Message public constructor(
        public val url: String,
    ) : InternalLinkTypeDto() {
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
            other as Message
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Message")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * The link contains a message draft text. A share screen needs to be shown to the user, then the chosen chat must be opened and the text is added to the input field.
     *
     * @property text Message draft text.
     * @property containsLink True, if the first line of the text contains a link. If true, the input field needs to be focused and the text after the link must be selected.
     */
    public class MessageDraft public constructor(
        public val text: FormattedTextDto,
        public val containsLink: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as MessageDraft
            if (other.text != text) {
                return false
            }
            return other.containsLink == containsLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + containsLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.MessageDraft")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("containsLink=")
                append(containsLink)
                append(")")
            }
        }
    }

    /**
     * The link contains a request of Telegram passport data. Call getPassportAuthorizationForm with the given parameters to process the link if the link was received from outside of the application; otherwise, ignore it.
     *
     * @property botUserId User identifier of the service's bot; the corresponding user may be unknown yet.
     * @property scope Telegram Passport element types requested by the service.
     * @property publicKey Service's public key.
     * @property nonce Unique request identifier provided by the service.
     * @property callbackUrl An HTTP URL to open once the request is finished, canceled, or failed with the parameters tgPassport=success, tgPassport=cancel, or tgPassport=error&amp;error=... respectively. If empty, then onActivityResult method must be used to return response on Android, or the link tgbot{botUserId}://passport/success or tgbot{botUserId}://passport/cancel must be opened otherwise.
     */
    public class PassportDataRequest public constructor(
        public val botUserId: Long,
        public val scope: String,
        public val publicKey: String,
        public val nonce: String,
        public val callbackUrl: String,
    ) : InternalLinkTypeDto() {
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
            other as PassportDataRequest
            if (other.botUserId != botUserId) {
                return false
            }
            if (other.scope != scope) {
                return false
            }
            if (other.publicKey != publicKey) {
                return false
            }
            if (other.nonce != nonce) {
                return false
            }
            return other.callbackUrl == callbackUrl
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + botUserId.hashCode()
            hashCode = 31 * hashCode + scope.hashCode()
            hashCode = 31 * hashCode + publicKey.hashCode()
            hashCode = 31 * hashCode + nonce.hashCode()
            hashCode = 31 * hashCode + callbackUrl.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PassportDataRequest")
                append("(")
                append("botUserId=")
                append(botUserId)
                append(", ")
                append("scope=")
                append(scope)
                append(", ")
                append("publicKey=")
                append(publicKey)
                append(", ")
                append("nonce=")
                append(nonce)
                append(", ")
                append("callbackUrl=")
                append(callbackUrl)
                append(")")
            }
        }
    }

    /**
     * The link can be used to confirm ownership of a phone number to prevent account deletion. Call sendPhoneNumberCode with the given phone number and with phoneNumberCodeTypeConfirmOwnership with the given hash to process the link. If succeeded, call checkPhoneNumberCode to check entered by the user code, or resendPhoneNumberCode to resend it.
     *
     * @property hash Hash value from the link.
     * @property phoneNumber Phone number value from the link.
     */
    public class PhoneNumberConfirmation public constructor(
        public val hash: String,
        public val phoneNumber: String,
    ) : InternalLinkTypeDto() {
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
            other as PhoneNumberConfirmation
            if (other.hash != hash) {
                return false
            }
            return other.phoneNumber == phoneNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + hash.hashCode()
            hashCode = 31 * hashCode + phoneNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PhoneNumberConfirmation")
                append("(")
                append("hash=")
                append(hash)
                append(", ")
                append("phoneNumber=")
                append(phoneNumber)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the Premium features screen of the application from which the user can subscribe to Telegram Premium. Call getPremiumFeatures with the given referrer to process the link.
     *
     * @property referrer Referrer specified in the link.
     */
    public class PremiumFeatures public constructor(
        public val referrer: String,
    ) : InternalLinkTypeDto() {
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
            other as PremiumFeatures
            return other.referrer == referrer
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + referrer.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PremiumFeatures")
                append("(")
                append("referrer=")
                append(referrer)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the screen for gifting Telegram Premium subscriptions to friends via inputInvoiceTelegram with telegramPaymentPurposePremiumGift payments or in-store purchases.
     *
     * @property referrer Referrer specified in the link.
     */
    public class PremiumGift public constructor(
        public val referrer: String,
    ) : InternalLinkTypeDto() {
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
            other as PremiumGift
            return other.referrer == referrer
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + referrer.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PremiumGift")
                append("(")
                append("referrer=")
                append(referrer)
                append(")")
            }
        }
    }

    /**
     * The link is a link with a Telegram Premium gift code. Call checkPremiumGiftCode with the given code to process the link. If the code is valid and the user wants to apply it, then call applyPremiumGiftCode.
     *
     * @property code The Telegram Premium gift code.
     */
    public class PremiumGiftCode public constructor(
        public val code: String,
    ) : InternalLinkTypeDto() {
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
            other as PremiumGiftCode
            return other.code == code
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + code.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PremiumGiftCode")
                append("(")
                append("code=")
                append(code)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the privacy and security section of the application settings.
     */
    public class PrivacyAndSecuritySettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.PrivacyAndSecuritySettings()"
        }
    }

    /**
     * The link is a link to a proxy. Call addProxy with the given parameters to process the link and add the proxy.
     *
     * @property server Proxy server domain or IP address.
     * @property port Proxy server port.
     * @property type Type of the proxy.
     */
    public class Proxy public constructor(
        public val server: String,
        public val port: Int,
        public val type: ProxyTypeDto,
    ) : InternalLinkTypeDto() {
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
            other as Proxy
            if (other.server != server) {
                return false
            }
            if (other.port != port) {
                return false
            }
            return other.type == type
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + server.hashCode()
            hashCode = 31 * hashCode + port.hashCode()
            hashCode = 31 * hashCode + type.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Proxy")
                append("(")
                append("server=")
                append(server)
                append(", ")
                append("port=")
                append(port)
                append(", ")
                append("type=")
                append(type)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a chat by its username. Call searchPublicChat with the given chat username to process the link. If the chat is found, open its profile information screen or the chat itself. If draft text isn't empty and the chat is a private chat with a regular user, then put the draft text in the input field.
     *
     * @property chatUsername Username of the chat.
     * @property draftText Draft text for message to send in the chat.
     * @property openProfile True, if chat profile information screen must be opened; otherwise, the chat itself must be opened.
     */
    public class PublicChat public constructor(
        public val chatUsername: String,
        public val draftText: String,
        public val openProfile: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as PublicChat
            if (other.chatUsername != chatUsername) {
                return false
            }
            if (other.draftText != draftText) {
                return false
            }
            return other.openProfile == openProfile
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatUsername.hashCode()
            hashCode = 31 * hashCode + draftText.hashCode()
            hashCode = 31 * hashCode + openProfile.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.PublicChat")
                append("(")
                append("chatUsername=")
                append(chatUsername)
                append(", ")
                append("draftText=")
                append(draftText)
                append(", ")
                append("openProfile=")
                append(openProfile)
                append(")")
            }
        }
    }

    /**
     * The link can be used to login the current user on another device, but it must be scanned from QR-code using in-app camera. An alert similar to &quot;This code can be used to allow someone to log in to your Telegram account. To confirm Telegram login, please go to Settings &gt; Devices &gt; Scan QR and scan the code&quot; needs to be shown.
     */
    public class QrCodeAuthentication public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.QrCodeAuthentication()"
        }
    }

    /**
     * The link forces restore of App Store purchases when opened. For official iOS application only.
     */
    public class RestorePurchases public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.RestorePurchases()"
        }
    }

    /**
     * The link is a link to application settings.
     */
    public class Settings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.Settings()"
        }
    }

    /**
     * The link is a link to a sticker set. Call searchStickerSet with the given sticker set name to process the link and show the sticker set. If the sticker set is found and the user wants to add it, then call changeStickerSet.
     *
     * @property stickerSetName Name of the sticker set.
     * @property expectCustomEmoji True, if the sticker set is expected to contain custom emoji.
     */
    public class StickerSet public constructor(
        public val stickerSetName: String,
        public val expectCustomEmoji: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as StickerSet
            if (other.stickerSetName != stickerSetName) {
                return false
            }
            return other.expectCustomEmoji == expectCustomEmoji
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + stickerSetName.hashCode()
            hashCode = 31 * hashCode + expectCustomEmoji.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.StickerSet")
                append("(")
                append("stickerSetName=")
                append(stickerSetName)
                append(", ")
                append("expectCustomEmoji=")
                append(expectCustomEmoji)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a story. Call searchPublicChat with the given poster username, then call getStory with the received chat identifier and the given story identifier, then show the story if received.
     *
     * @property storyPosterUsername Username of the poster of the story.
     * @property storyId Story identifier.
     */
    public class Story public constructor(
        public val storyPosterUsername: String,
        public val storyId: Int,
    ) : InternalLinkTypeDto() {
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
            other as Story
            if (other.storyPosterUsername != storyPosterUsername) {
                return false
            }
            return other.storyId == storyId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storyPosterUsername.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Story")
                append("(")
                append("storyPosterUsername=")
                append(storyPosterUsername)
                append(", ")
                append("storyId=")
                append(storyId)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a cloud theme. TDLib has no theme support yet.
     *
     * @property themeName Name of the theme.
     */
    public class Theme public constructor(
        public val themeName: String,
    ) : InternalLinkTypeDto() {
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
            other as Theme
            return other.themeName == themeName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + themeName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.Theme")
                append("(")
                append("themeName=")
                append(themeName)
                append(")")
            }
        }
    }

    /**
     * The link is a link to the theme section of the application settings.
     */
    public class ThemeSettings public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.ThemeSettings()"
        }
    }

    /**
     * The link is an unknown tg: link. Call getDeepLinkInfo to process the link.
     *
     * @property link Link to be passed to getDeepLinkInfo.
     */
    public class UnknownDeepLink public constructor(
        public val link: String,
    ) : InternalLinkTypeDto() {
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
            other as UnknownDeepLink
            return other.link == link
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + link.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.UnknownDeepLink")
                append("(")
                append("link=")
                append(link)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an unsupported proxy. An alert can be shown to the user.
     */
    public class UnsupportedProxy public constructor() : InternalLinkTypeDto() {
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
            return "InternalLinkTypeDto.UnsupportedProxy()"
        }
    }

    /**
     * The link is a link to an upgraded gift. Call getUpgradedGift with the given name to process the link.
     *
     * @property name Name of the unique gift.
     */
    public class UpgradedGift public constructor(
        public val name: String,
    ) : InternalLinkTypeDto() {
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
            other as UpgradedGift
            return other.name == name
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.UpgradedGift")
                append("(")
                append("name=")
                append(name)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a user by its phone number. Call searchUserByPhoneNumber with the given phone number to process the link. If the user is found, then call createPrivateChat and open user's profile information screen or the chat itself. If draft text isn't empty, then put the draft text in the input field.
     *
     * @property phoneNumber Phone number of the user.
     * @property draftText Draft text for message to send in the chat.
     * @property openProfile True, if user's profile information screen must be opened; otherwise, the chat itself must be opened.
     */
    public class UserPhoneNumber public constructor(
        public val phoneNumber: String,
        public val draftText: String,
        public val openProfile: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as UserPhoneNumber
            if (other.phoneNumber != phoneNumber) {
                return false
            }
            if (other.draftText != draftText) {
                return false
            }
            return other.openProfile == openProfile
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + phoneNumber.hashCode()
            hashCode = 31 * hashCode + draftText.hashCode()
            hashCode = 31 * hashCode + openProfile.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.UserPhoneNumber")
                append("(")
                append("phoneNumber=")
                append(phoneNumber)
                append(", ")
                append("draftText=")
                append(draftText)
                append(", ")
                append("openProfile=")
                append(openProfile)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a user by a temporary token. Call searchUserByToken with the given token to process the link. If the user is found, then call createPrivateChat and open the chat.
     *
     * @property token The token.
     */
    public class UserToken public constructor(
        public val token: String,
    ) : InternalLinkTypeDto() {
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
            other as UserToken
            return other.token == token
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + token.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.UserToken")
                append("(")
                append("token=")
                append(token)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video chat. Call searchPublicChat with the given chat username, and then joinVideoChat with the given invite hash to process the link.
     *
     * @property chatUsername Username of the chat with the video chat.
     * @property inviteHash If non-empty, invite hash to be used to join the video chat without being muted by administrators.
     * @property isLiveStream True, if the video chat is expected to be a live stream in a channel or a broadcast group.
     */
    public class VideoChat public constructor(
        public val chatUsername: String,
        public val inviteHash: String,
        public val isLiveStream: Boolean,
    ) : InternalLinkTypeDto() {
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
            other as VideoChat
            if (other.chatUsername != chatUsername) {
                return false
            }
            if (other.inviteHash != inviteHash) {
                return false
            }
            return other.isLiveStream == isLiveStream
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatUsername.hashCode()
            hashCode = 31 * hashCode + inviteHash.hashCode()
            hashCode = 31 * hashCode + isLiveStream.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InternalLinkTypeDto.VideoChat")
                append("(")
                append("chatUsername=")
                append(chatUsername)
                append(", ")
                append("inviteHash=")
                append(inviteHash)
                append(", ")
                append("isLiveStream=")
                append(isLiveStream)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a Web App. Call searchPublicChat with the given bot username, check that the user is a bot. If the bot is restricted for the current user, then show an error message. Otherwise, call searchWebApp with the received bot and the given webAppShortName. Process received foundWebApp by showing a confirmation dialog if needed. If the bot can be added to attachment or side menu, but isn't added yet, then show a disclaimer about Mini Apps being third-party applications instead of the dialog and ask the user to accept their Terms of service. If the user accept the terms and confirms adding, then use toggleBotIsAddedToAttachmentMenu to add the bot. Then, call getWebAppLinkUrl and open the returned URL as a Web App.
     *
     * @property botUsername Username of the bot that owns the Web App.
     * @property webAppShortName Short name of the Web App.
     * @property startParameter Start parameter to be passed to getWebAppLinkUrl.
     * @property mode The mode in which the Web App must be opened.
     */
    public class WebApp public constructor(
        public val botUsername: String,
        public val webAppShortName: String,
        public val startParameter: String,
        public val mode: WebAppOpenModeDto,
    ) : InternalLinkTypeDto() {
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
                append("InternalLinkTypeDto.WebApp")
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
}
