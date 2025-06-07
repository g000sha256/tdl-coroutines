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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
@SerialName(value = "userTypeBot")
@Serializable
public class UserTypeBot public constructor(
    @SerialName(value = "can_be_edited")
    public val canBeEdited: Boolean,
    @SerialName(value = "can_join_groups")
    public val canJoinGroups: Boolean,
    @SerialName(value = "can_read_all_group_messages")
    public val canReadAllGroupMessages: Boolean,
    @SerialName(value = "has_main_web_app")
    public val hasMainWebApp: Boolean,
    @SerialName(value = "is_inline")
    public val isInline: Boolean,
    @SerialName(value = "inline_query_placeholder")
    public val inlineQueryPlaceholder: String,
    @SerialName(value = "need_location")
    public val needLocation: Boolean,
    @SerialName(value = "can_connect_to_business")
    public val canConnectToBusiness: Boolean,
    @SerialName(value = "can_be_added_to_attachment_menu")
    public val canBeAddedToAttachmentMenu: Boolean,
    @SerialName(value = "active_user_count")
    public val activeUserCount: Int,
) : UserType() {
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
        other as UserTypeBot
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
            append("UserTypeBot")
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
