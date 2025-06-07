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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a bot, which can be added to attachment or side menu.
 *
 * @property botUserId User identifier of the bot.
 * @property supportsSelfChat True, if the bot supports opening from attachment menu in the chat with the bot.
 * @property supportsUserChats True, if the bot supports opening from attachment menu in private chats with ordinary users.
 * @property supportsBotChats True, if the bot supports opening from attachment menu in private chats with other bots.
 * @property supportsGroupChats True, if the bot supports opening from attachment menu in basic group and supergroup chats.
 * @property supportsChannelChats True, if the bot supports opening from attachment menu in channel chats.
 * @property requestWriteAccess True, if the user must be asked for the permission to send messages to the bot.
 * @property isAdded True, if the bot was explicitly added by the user. If the bot isn't added, then on the first bot launch toggleBotIsAddedToAttachmentMenu must be called and the bot must be added or removed.
 * @property showInAttachmentMenu True, if the bot must be shown in the attachment menu.
 * @property showInSideMenu True, if the bot must be shown in the side menu.
 * @property showDisclaimerInSideMenu True, if a disclaimer, why the bot is shown in the side menu, is needed.
 * @property name Name for the bot in attachment menu.
 * @property nameColor Color to highlight selected name of the bot if appropriate; may be null.
 * @property defaultIcon Default icon for the bot in SVG format; may be null.
 * @property iosStaticIcon Icon for the bot in SVG format for the official iOS app; may be null.
 * @property iosAnimatedIcon Icon for the bot in TGS format for the official iOS app; may be null.
 * @property iosSideMenuIcon Icon for the bot in PNG format for the official iOS app side menu; may be null.
 * @property androidIcon Icon for the bot in TGS format for the official Android app; may be null.
 * @property androidSideMenuIcon Icon for the bot in SVG format for the official Android app side menu; may be null.
 * @property macosIcon Icon for the bot in TGS format for the official native macOS app; may be null.
 * @property macosSideMenuIcon Icon for the bot in PNG format for the official macOS app side menu; may be null.
 * @property iconColor Color to highlight selected icon of the bot if appropriate; may be null.
 * @property webAppPlaceholder Default placeholder for opened Web Apps in SVG format; may be null.
 */
@SerialName(value = "attachmentMenuBot")
@Serializable
public class AttachmentMenuBot public constructor(
    @SerialName(value = "bot_user_id")
    public val botUserId: Long,
    @SerialName(value = "supports_self_chat")
    public val supportsSelfChat: Boolean,
    @SerialName(value = "supports_user_chats")
    public val supportsUserChats: Boolean,
    @SerialName(value = "supports_bot_chats")
    public val supportsBotChats: Boolean,
    @SerialName(value = "supports_group_chats")
    public val supportsGroupChats: Boolean,
    @SerialName(value = "supports_channel_chats")
    public val supportsChannelChats: Boolean,
    @SerialName(value = "request_write_access")
    public val requestWriteAccess: Boolean,
    @SerialName(value = "is_added")
    public val isAdded: Boolean,
    @SerialName(value = "show_in_attachment_menu")
    public val showInAttachmentMenu: Boolean,
    @SerialName(value = "show_in_side_menu")
    public val showInSideMenu: Boolean,
    @SerialName(value = "show_disclaimer_in_side_menu")
    public val showDisclaimerInSideMenu: Boolean,
    @SerialName(value = "name")
    public val name: String,
    @SerialName(value = "name_color")
    public val nameColor: AttachmentMenuBotColor?,
    @SerialName(value = "default_icon")
    public val defaultIcon: File?,
    @SerialName(value = "ios_static_icon")
    public val iosStaticIcon: File?,
    @SerialName(value = "ios_animated_icon")
    public val iosAnimatedIcon: File?,
    @SerialName(value = "ios_side_menu_icon")
    public val iosSideMenuIcon: File?,
    @SerialName(value = "android_icon")
    public val androidIcon: File?,
    @SerialName(value = "android_side_menu_icon")
    public val androidSideMenuIcon: File?,
    @SerialName(value = "macos_icon")
    public val macosIcon: File?,
    @SerialName(value = "macos_side_menu_icon")
    public val macosSideMenuIcon: File?,
    @SerialName(value = "icon_color")
    public val iconColor: AttachmentMenuBotColor?,
    @SerialName(value = "web_app_placeholder")
    public val webAppPlaceholder: File?,
) : Model() {
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
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.supportsSelfChat != supportsSelfChat) {
            return false
        }
        if (other.supportsUserChats != supportsUserChats) {
            return false
        }
        if (other.supportsBotChats != supportsBotChats) {
            return false
        }
        if (other.supportsGroupChats != supportsGroupChats) {
            return false
        }
        if (other.supportsChannelChats != supportsChannelChats) {
            return false
        }
        if (other.requestWriteAccess != requestWriteAccess) {
            return false
        }
        if (other.isAdded != isAdded) {
            return false
        }
        if (other.showInAttachmentMenu != showInAttachmentMenu) {
            return false
        }
        if (other.showInSideMenu != showInSideMenu) {
            return false
        }
        if (other.showDisclaimerInSideMenu != showDisclaimerInSideMenu) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.nameColor != nameColor) {
            return false
        }
        if (other.defaultIcon != defaultIcon) {
            return false
        }
        if (other.iosStaticIcon != iosStaticIcon) {
            return false
        }
        if (other.iosAnimatedIcon != iosAnimatedIcon) {
            return false
        }
        if (other.iosSideMenuIcon != iosSideMenuIcon) {
            return false
        }
        if (other.androidIcon != androidIcon) {
            return false
        }
        if (other.androidSideMenuIcon != androidSideMenuIcon) {
            return false
        }
        if (other.macosIcon != macosIcon) {
            return false
        }
        if (other.macosSideMenuIcon != macosSideMenuIcon) {
            return false
        }
        if (other.iconColor != iconColor) {
            return false
        }
        return other.webAppPlaceholder == webAppPlaceholder
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + supportsSelfChat.hashCode()
        hashCode = 31 * hashCode + supportsUserChats.hashCode()
        hashCode = 31 * hashCode + supportsBotChats.hashCode()
        hashCode = 31 * hashCode + supportsGroupChats.hashCode()
        hashCode = 31 * hashCode + supportsChannelChats.hashCode()
        hashCode = 31 * hashCode + requestWriteAccess.hashCode()
        hashCode = 31 * hashCode + isAdded.hashCode()
        hashCode = 31 * hashCode + showInAttachmentMenu.hashCode()
        hashCode = 31 * hashCode + showInSideMenu.hashCode()
        hashCode = 31 * hashCode + showDisclaimerInSideMenu.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + nameColor.hashCode()
        hashCode = 31 * hashCode + defaultIcon.hashCode()
        hashCode = 31 * hashCode + iosStaticIcon.hashCode()
        hashCode = 31 * hashCode + iosAnimatedIcon.hashCode()
        hashCode = 31 * hashCode + iosSideMenuIcon.hashCode()
        hashCode = 31 * hashCode + androidIcon.hashCode()
        hashCode = 31 * hashCode + androidSideMenuIcon.hashCode()
        hashCode = 31 * hashCode + macosIcon.hashCode()
        hashCode = 31 * hashCode + macosSideMenuIcon.hashCode()
        hashCode = 31 * hashCode + iconColor.hashCode()
        hashCode = 31 * hashCode + webAppPlaceholder.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AttachmentMenuBot")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("supportsSelfChat=")
            append(supportsSelfChat)
            append(", ")
            append("supportsUserChats=")
            append(supportsUserChats)
            append(", ")
            append("supportsBotChats=")
            append(supportsBotChats)
            append(", ")
            append("supportsGroupChats=")
            append(supportsGroupChats)
            append(", ")
            append("supportsChannelChats=")
            append(supportsChannelChats)
            append(", ")
            append("requestWriteAccess=")
            append(requestWriteAccess)
            append(", ")
            append("isAdded=")
            append(isAdded)
            append(", ")
            append("showInAttachmentMenu=")
            append(showInAttachmentMenu)
            append(", ")
            append("showInSideMenu=")
            append(showInSideMenu)
            append(", ")
            append("showDisclaimerInSideMenu=")
            append(showDisclaimerInSideMenu)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("nameColor=")
            append(nameColor)
            append(", ")
            append("defaultIcon=")
            append(defaultIcon)
            append(", ")
            append("iosStaticIcon=")
            append(iosStaticIcon)
            append(", ")
            append("iosAnimatedIcon=")
            append(iosAnimatedIcon)
            append(", ")
            append("iosSideMenuIcon=")
            append(iosSideMenuIcon)
            append(", ")
            append("androidIcon=")
            append(androidIcon)
            append(", ")
            append("androidSideMenuIcon=")
            append(androidSideMenuIcon)
            append(", ")
            append("macosIcon=")
            append(macosIcon)
            append(", ")
            append("macosSideMenuIcon=")
            append(macosSideMenuIcon)
            append(", ")
            append("iconColor=")
            append(iconColor)
            append(", ")
            append("webAppPlaceholder=")
            append(webAppPlaceholder)
            append(")")
        }
    }
}
