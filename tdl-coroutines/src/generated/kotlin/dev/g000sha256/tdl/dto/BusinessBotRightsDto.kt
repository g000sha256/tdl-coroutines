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
 * Describes rights of a business bot.
 *
 * @property canReply True, if the bot can send and edit messages in the private chats that had incoming messages in the last 24 hours.
 * @property canReadMessages True, if the bot can mark incoming private messages as read.
 * @property canDeleteSentMessages True, if the bot can delete sent messages.
 * @property canDeleteAllMessages True, if the bot can delete any message.
 * @property canEditName True, if the bot can edit name of the business account.
 * @property canEditBio True, if the bot can edit bio of the business account.
 * @property canEditProfilePhoto True, if the bot can edit profile photo of the business account.
 * @property canEditUsername True, if the bot can edit username of the business account.
 * @property canViewGiftsAndStars True, if the bot can view gifts and amount of Telegram Stars owned by the business account.
 * @property canSellGifts True, if the bot can sell regular gifts received by the business account.
 * @property canChangeGiftSettings True, if the bot can change gift receiving settings of the business account.
 * @property canTransferAndUpgradeGifts True, if the bot can transfer and upgrade gifts received by the business account.
 * @property canTransferStars True, if the bot can transfer Telegram Stars received by the business account to account of the bot, or use them to upgrade and transfer gifts.
 * @property canManageStories True, if the bot can post, edit and delete stories.
 */
public class BusinessBotRightsDto public constructor(
    public val canReply: Boolean,
    public val canReadMessages: Boolean,
    public val canDeleteSentMessages: Boolean,
    public val canDeleteAllMessages: Boolean,
    public val canEditName: Boolean,
    public val canEditBio: Boolean,
    public val canEditProfilePhoto: Boolean,
    public val canEditUsername: Boolean,
    public val canViewGiftsAndStars: Boolean,
    public val canSellGifts: Boolean,
    public val canChangeGiftSettings: Boolean,
    public val canTransferAndUpgradeGifts: Boolean,
    public val canTransferStars: Boolean,
    public val canManageStories: Boolean,
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
        other as BusinessBotRightsDto
        if (other.canReply != canReply) {
            return false
        }
        if (other.canReadMessages != canReadMessages) {
            return false
        }
        if (other.canDeleteSentMessages != canDeleteSentMessages) {
            return false
        }
        if (other.canDeleteAllMessages != canDeleteAllMessages) {
            return false
        }
        if (other.canEditName != canEditName) {
            return false
        }
        if (other.canEditBio != canEditBio) {
            return false
        }
        if (other.canEditProfilePhoto != canEditProfilePhoto) {
            return false
        }
        if (other.canEditUsername != canEditUsername) {
            return false
        }
        if (other.canViewGiftsAndStars != canViewGiftsAndStars) {
            return false
        }
        if (other.canSellGifts != canSellGifts) {
            return false
        }
        if (other.canChangeGiftSettings != canChangeGiftSettings) {
            return false
        }
        if (other.canTransferAndUpgradeGifts != canTransferAndUpgradeGifts) {
            return false
        }
        if (other.canTransferStars != canTransferStars) {
            return false
        }
        return other.canManageStories == canManageStories
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canReply.hashCode()
        hashCode = 31 * hashCode + canReadMessages.hashCode()
        hashCode = 31 * hashCode + canDeleteSentMessages.hashCode()
        hashCode = 31 * hashCode + canDeleteAllMessages.hashCode()
        hashCode = 31 * hashCode + canEditName.hashCode()
        hashCode = 31 * hashCode + canEditBio.hashCode()
        hashCode = 31 * hashCode + canEditProfilePhoto.hashCode()
        hashCode = 31 * hashCode + canEditUsername.hashCode()
        hashCode = 31 * hashCode + canViewGiftsAndStars.hashCode()
        hashCode = 31 * hashCode + canSellGifts.hashCode()
        hashCode = 31 * hashCode + canChangeGiftSettings.hashCode()
        hashCode = 31 * hashCode + canTransferAndUpgradeGifts.hashCode()
        hashCode = 31 * hashCode + canTransferStars.hashCode()
        hashCode = 31 * hashCode + canManageStories.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessBotRightsDto")
            append("(")
            append("canReply=")
            append(canReply)
            append(", ")
            append("canReadMessages=")
            append(canReadMessages)
            append(", ")
            append("canDeleteSentMessages=")
            append(canDeleteSentMessages)
            append(", ")
            append("canDeleteAllMessages=")
            append(canDeleteAllMessages)
            append(", ")
            append("canEditName=")
            append(canEditName)
            append(", ")
            append("canEditBio=")
            append(canEditBio)
            append(", ")
            append("canEditProfilePhoto=")
            append(canEditProfilePhoto)
            append(", ")
            append("canEditUsername=")
            append(canEditUsername)
            append(", ")
            append("canViewGiftsAndStars=")
            append(canViewGiftsAndStars)
            append(", ")
            append("canSellGifts=")
            append(canSellGifts)
            append(", ")
            append("canChangeGiftSettings=")
            append(canChangeGiftSettings)
            append(", ")
            append("canTransferAndUpgradeGifts=")
            append(canTransferAndUpgradeGifts)
            append(", ")
            append("canTransferStars=")
            append(canTransferStars)
            append(", ")
            append("canManageStories=")
            append(canManageStories)
            append(")")
        }
    }
}
