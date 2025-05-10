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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains information about a bot.
 *
 * @property shortDescription The text that is shown on the bot's profile page and is sent together with the link when users share the bot.
 * @property description The text shown in the chat with the bot if the chat is empty.
 * @property photo Photo shown in the chat with the bot if the chat is empty; may be null.
 * @property animation Animation shown in the chat with the bot if the chat is empty; may be null.
 * @property menuButton Information about a button to show instead of the bot commands menu button; may be null if ordinary bot commands menu must be shown.
 * @property commands List of the bot commands.
 * @property privacyPolicyUrl The HTTP link to the privacy policy of the bot. If empty, then /privacy command must be used if supported by the bot. If the command isn't supported, then https://telegram.org/privacy-tpa must be opened.
 * @property defaultGroupAdministratorRights Default administrator rights for adding the bot to basic group and supergroup chats; may be null.
 * @property defaultChannelAdministratorRights Default administrator rights for adding the bot to channels; may be null.
 * @property affiliateProgram Information about the affiliate program of the bot; may be null if none.
 * @property webAppBackgroundLightColor Default light background color for bot Web Apps; -1 if not specified.
 * @property webAppBackgroundDarkColor Default dark background color for bot Web Apps; -1 if not specified.
 * @property webAppHeaderLightColor Default light header color for bot Web Apps; -1 if not specified.
 * @property webAppHeaderDarkColor Default dark header color for bot Web Apps; -1 if not specified.
 * @property verificationParameters Parameters of the verification that can be provided by the bot; may be null if none or the current user isn't the owner of the bot.
 * @property canGetRevenueStatistics True, if the bot's revenue statistics are available to the current user.
 * @property canManageEmojiStatus True, if the bot can manage emoji status of the current user.
 * @property hasMediaPreviews True, if the bot has media previews.
 * @property editCommandsLink The internal link, which can be used to edit bot commands; may be null.
 * @property editDescriptionLink The internal link, which can be used to edit bot description; may be null.
 * @property editDescriptionMediaLink The internal link, which can be used to edit the photo or animation shown in the chat with the bot if the chat is empty; may be null.
 * @property editSettingsLink The internal link, which can be used to edit bot settings; may be null.
 */
public class BotInfoDto public constructor(
    public val shortDescription: String,
    public val description: String,
    public val photo: PhotoDto?,
    public val animation: AnimationDto?,
    public val menuButton: BotMenuButtonDto?,
    public val commands: Array<BotCommandDto>,
    public val privacyPolicyUrl: String,
    public val defaultGroupAdministratorRights: ChatAdministratorRightsDto?,
    public val defaultChannelAdministratorRights: ChatAdministratorRightsDto?,
    public val affiliateProgram: AffiliateProgramInfoDto?,
    public val webAppBackgroundLightColor: Int,
    public val webAppBackgroundDarkColor: Int,
    public val webAppHeaderLightColor: Int,
    public val webAppHeaderDarkColor: Int,
    public val verificationParameters: BotVerificationParametersDto?,
    public val canGetRevenueStatistics: Boolean,
    public val canManageEmojiStatus: Boolean,
    public val hasMediaPreviews: Boolean,
    public val editCommandsLink: InternalLinkTypeDto?,
    public val editDescriptionLink: InternalLinkTypeDto?,
    public val editDescriptionMediaLink: InternalLinkTypeDto?,
    public val editSettingsLink: InternalLinkTypeDto?,
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
        other as BotInfoDto
        if (other.shortDescription != shortDescription) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.animation != animation) {
            return false
        }
        if (other.menuButton != menuButton) {
            return false
        }
        val commandsEquals = other.commands.contentDeepEquals(commands)
        if (!commandsEquals) {
            return false
        }
        if (other.privacyPolicyUrl != privacyPolicyUrl) {
            return false
        }
        if (other.defaultGroupAdministratorRights != defaultGroupAdministratorRights) {
            return false
        }
        if (other.defaultChannelAdministratorRights != defaultChannelAdministratorRights) {
            return false
        }
        if (other.affiliateProgram != affiliateProgram) {
            return false
        }
        if (other.webAppBackgroundLightColor != webAppBackgroundLightColor) {
            return false
        }
        if (other.webAppBackgroundDarkColor != webAppBackgroundDarkColor) {
            return false
        }
        if (other.webAppHeaderLightColor != webAppHeaderLightColor) {
            return false
        }
        if (other.webAppHeaderDarkColor != webAppHeaderDarkColor) {
            return false
        }
        if (other.verificationParameters != verificationParameters) {
            return false
        }
        if (other.canGetRevenueStatistics != canGetRevenueStatistics) {
            return false
        }
        if (other.canManageEmojiStatus != canManageEmojiStatus) {
            return false
        }
        if (other.hasMediaPreviews != hasMediaPreviews) {
            return false
        }
        if (other.editCommandsLink != editCommandsLink) {
            return false
        }
        if (other.editDescriptionLink != editDescriptionLink) {
            return false
        }
        if (other.editDescriptionMediaLink != editDescriptionMediaLink) {
            return false
        }
        return other.editSettingsLink == editSettingsLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + shortDescription.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + menuButton.hashCode()
        hashCode = 31 * hashCode + commands.contentDeepHashCode()
        hashCode = 31 * hashCode + privacyPolicyUrl.hashCode()
        hashCode = 31 * hashCode + defaultGroupAdministratorRights.hashCode()
        hashCode = 31 * hashCode + defaultChannelAdministratorRights.hashCode()
        hashCode = 31 * hashCode + affiliateProgram.hashCode()
        hashCode = 31 * hashCode + webAppBackgroundLightColor.hashCode()
        hashCode = 31 * hashCode + webAppBackgroundDarkColor.hashCode()
        hashCode = 31 * hashCode + webAppHeaderLightColor.hashCode()
        hashCode = 31 * hashCode + webAppHeaderDarkColor.hashCode()
        hashCode = 31 * hashCode + verificationParameters.hashCode()
        hashCode = 31 * hashCode + canGetRevenueStatistics.hashCode()
        hashCode = 31 * hashCode + canManageEmojiStatus.hashCode()
        hashCode = 31 * hashCode + hasMediaPreviews.hashCode()
        hashCode = 31 * hashCode + editCommandsLink.hashCode()
        hashCode = 31 * hashCode + editDescriptionLink.hashCode()
        hashCode = 31 * hashCode + editDescriptionMediaLink.hashCode()
        hashCode = 31 * hashCode + editSettingsLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BotInfoDto")
            append("(")
            append("shortDescription=")
            append(shortDescription)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("animation=")
            append(animation)
            append(", ")
            append("menuButton=")
            append(menuButton)
            append(", ")
            append("commands=")
            commands
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("privacyPolicyUrl=")
            append(privacyPolicyUrl)
            append(", ")
            append("defaultGroupAdministratorRights=")
            append(defaultGroupAdministratorRights)
            append(", ")
            append("defaultChannelAdministratorRights=")
            append(defaultChannelAdministratorRights)
            append(", ")
            append("affiliateProgram=")
            append(affiliateProgram)
            append(", ")
            append("webAppBackgroundLightColor=")
            append(webAppBackgroundLightColor)
            append(", ")
            append("webAppBackgroundDarkColor=")
            append(webAppBackgroundDarkColor)
            append(", ")
            append("webAppHeaderLightColor=")
            append(webAppHeaderLightColor)
            append(", ")
            append("webAppHeaderDarkColor=")
            append(webAppHeaderDarkColor)
            append(", ")
            append("verificationParameters=")
            append(verificationParameters)
            append(", ")
            append("canGetRevenueStatistics=")
            append(canGetRevenueStatistics)
            append(", ")
            append("canManageEmojiStatus=")
            append(canManageEmojiStatus)
            append(", ")
            append("hasMediaPreviews=")
            append(hasMediaPreviews)
            append(", ")
            append("editCommandsLink=")
            append(editCommandsLink)
            append(", ")
            append("editDescriptionLink=")
            append(editDescriptionLink)
            append(", ")
            append("editDescriptionMediaLink=")
            append(editDescriptionMediaLink)
            append(", ")
            append("editSettingsLink=")
            append(editSettingsLink)
            append(")")
        }
    }
}
