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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Contains full information about a supergroup or channel.
 *
 * @property photo Chat photo; may be null if empty or unknown. If non-null, then it is the same photo as in chat.photo.
 * @property description Supergroup or channel description.
 * @property memberCount Number of members in the supergroup or channel; 0 if unknown.
 * @property administratorCount Number of privileged users in the supergroup or channel; 0 if unknown.
 * @property restrictedCount Number of restricted users in the supergroup; 0 if unknown.
 * @property bannedCount Number of users banned from chat; 0 if unknown.
 * @property linkedChatId Chat identifier of a discussion group for the channel, or a channel, for which the supergroup is the designated discussion group; 0 if none or unknown.
 * @property directMessagesChatId Chat identifier of a direct messages group for the channel, or a channel, for which the supergroup is the designated direct messages group; 0 if none.
 * @property slowModeDelay Delay between consecutive sent messages for non-administrator supergroup members, in seconds.
 * @property slowModeDelayExpiresIn Time left before next message can be sent in the supergroup, in seconds. An updateSupergroupFullInfo update is not triggered when value of this field changes, but both new and old values are non-zero.
 * @property canEnablePaidMessages True, if paid messages can be enabled in the supergroup chat; for supergroup only.
 * @property canEnablePaidReaction True, if paid reaction can be enabled in the channel chat; for channels only.
 * @property canGetMembers True, if members of the chat can be retrieved via getSupergroupMembers or searchChatMembers.
 * @property hasHiddenMembers True, if non-administrators can receive only administrators and bots using getSupergroupMembers or searchChatMembers.
 * @property canHideMembers True, if non-administrators and non-bots can be hidden in responses to getSupergroupMembers and searchChatMembers for non-administrators.
 * @property canSetStickerSet True, if the supergroup sticker set can be changed.
 * @property canSetLocation True, if the supergroup location can be changed.
 * @property canGetStatistics True, if the supergroup or channel statistics are available.
 * @property canGetRevenueStatistics True, if the supergroup or channel revenue statistics are available.
 * @property canGetStarRevenueStatistics True, if the supergroup or channel Telegram Star revenue statistics are available.
 * @property canSendGift True, if the user can send a gift to the supergroup or channel using sendGift or transferGift.
 * @property canToggleAggressiveAntiSpam True, if aggressive anti-spam checks can be enabled or disabled in the supergroup.
 * @property isAllHistoryAvailable True, if new chat members will have access to old messages. In public, discussion, of forum groups and all channels, old messages are always available, so this option affects only private non-forum supergroups without a linked chat. The value of this field is only available to chat administrators.
 * @property canHaveSponsoredMessages True, if the chat can have sponsored messages. The value of this field is only available to the owner of the chat.
 * @property hasAggressiveAntiSpamEnabled True, if aggressive anti-spam checks are enabled in the supergroup. The value of this field is only available to chat administrators.
 * @property hasPaidMediaAllowed True, if paid media can be sent and forwarded to the channel chat; for channels only.
 * @property hasPinnedStories True, if the supergroup or channel has pinned stories.
 * @property giftCount Number of saved to profile gifts for channels without canPostMessages administrator right, otherwise, the total number of received gifts.
 * @property myBoostCount Number of times the current user boosted the supergroup or channel.
 * @property unrestrictBoostCount Number of times the supergroup must be boosted by a user to ignore slow mode and chat permission restrictions; 0 if unspecified.
 * @property outgoingPaidMessageStarCount Number of Telegram Stars that must be paid by the current user for each sent message to the supergroup.
 * @property stickerSetId Identifier of the supergroup sticker set that must be shown before user sticker sets; 0 if none.
 * @property customEmojiStickerSetId Identifier of the custom emoji sticker set that can be used in the supergroup without Telegram Premium subscription; 0 if none.
 * @property location Location to which the supergroup is connected; may be null if none.
 * @property inviteLink Primary invite link for the chat; may be null. For chat administrators with canInviteUsers right only.
 * @property botCommands List of commands of bots in the group.
 * @property botVerification Information about verification status of the supergroup or the channel provided by a bot; may be null if none or unknown.
 * @property mainProfileTab The main tab chosen by the administrators of the channel; may be null if not chosen manually.
 * @property upgradedFromBasicGroupId Identifier of the basic group from which supergroup was upgraded; 0 if none.
 * @property upgradedFromMaxMessageId Identifier of the last message in the basic group from which supergroup was upgraded; 0 if none.
 */
public class SupergroupFullInfo public constructor(
    public val photo: ChatPhoto?,
    public val description: String,
    public val memberCount: Int,
    public val administratorCount: Int,
    public val restrictedCount: Int,
    public val bannedCount: Int,
    public val linkedChatId: Long,
    public val directMessagesChatId: Long,
    public val slowModeDelay: Int,
    public val slowModeDelayExpiresIn: Double,
    public val canEnablePaidMessages: Boolean,
    public val canEnablePaidReaction: Boolean,
    public val canGetMembers: Boolean,
    public val hasHiddenMembers: Boolean,
    public val canHideMembers: Boolean,
    public val canSetStickerSet: Boolean,
    public val canSetLocation: Boolean,
    public val canGetStatistics: Boolean,
    public val canGetRevenueStatistics: Boolean,
    public val canGetStarRevenueStatistics: Boolean,
    public val canSendGift: Boolean,
    public val canToggleAggressiveAntiSpam: Boolean,
    public val isAllHistoryAvailable: Boolean,
    public val canHaveSponsoredMessages: Boolean,
    public val hasAggressiveAntiSpamEnabled: Boolean,
    public val hasPaidMediaAllowed: Boolean,
    public val hasPinnedStories: Boolean,
    public val giftCount: Int,
    public val myBoostCount: Int,
    public val unrestrictBoostCount: Int,
    public val outgoingPaidMessageStarCount: Long,
    public val stickerSetId: Long,
    public val customEmojiStickerSetId: Long,
    public val location: ChatLocation?,
    public val inviteLink: ChatInviteLink?,
    public val botCommands: Array<BotCommands>,
    public val botVerification: BotVerification?,
    public val mainProfileTab: ProfileTab?,
    public val upgradedFromBasicGroupId: Long,
    public val upgradedFromMaxMessageId: Long,
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
        other as SupergroupFullInfo
        if (other.photo != photo) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.administratorCount != administratorCount) {
            return false
        }
        if (other.restrictedCount != restrictedCount) {
            return false
        }
        if (other.bannedCount != bannedCount) {
            return false
        }
        if (other.linkedChatId != linkedChatId) {
            return false
        }
        if (other.directMessagesChatId != directMessagesChatId) {
            return false
        }
        if (other.slowModeDelay != slowModeDelay) {
            return false
        }
        if (other.slowModeDelayExpiresIn != slowModeDelayExpiresIn) {
            return false
        }
        if (other.canEnablePaidMessages != canEnablePaidMessages) {
            return false
        }
        if (other.canEnablePaidReaction != canEnablePaidReaction) {
            return false
        }
        if (other.canGetMembers != canGetMembers) {
            return false
        }
        if (other.hasHiddenMembers != hasHiddenMembers) {
            return false
        }
        if (other.canHideMembers != canHideMembers) {
            return false
        }
        if (other.canSetStickerSet != canSetStickerSet) {
            return false
        }
        if (other.canSetLocation != canSetLocation) {
            return false
        }
        if (other.canGetStatistics != canGetStatistics) {
            return false
        }
        if (other.canGetRevenueStatistics != canGetRevenueStatistics) {
            return false
        }
        if (other.canGetStarRevenueStatistics != canGetStarRevenueStatistics) {
            return false
        }
        if (other.canSendGift != canSendGift) {
            return false
        }
        if (other.canToggleAggressiveAntiSpam != canToggleAggressiveAntiSpam) {
            return false
        }
        if (other.isAllHistoryAvailable != isAllHistoryAvailable) {
            return false
        }
        if (other.canHaveSponsoredMessages != canHaveSponsoredMessages) {
            return false
        }
        if (other.hasAggressiveAntiSpamEnabled != hasAggressiveAntiSpamEnabled) {
            return false
        }
        if (other.hasPaidMediaAllowed != hasPaidMediaAllowed) {
            return false
        }
        if (other.hasPinnedStories != hasPinnedStories) {
            return false
        }
        if (other.giftCount != giftCount) {
            return false
        }
        if (other.myBoostCount != myBoostCount) {
            return false
        }
        if (other.unrestrictBoostCount != unrestrictBoostCount) {
            return false
        }
        if (other.outgoingPaidMessageStarCount != outgoingPaidMessageStarCount) {
            return false
        }
        if (other.stickerSetId != stickerSetId) {
            return false
        }
        if (other.customEmojiStickerSetId != customEmojiStickerSetId) {
            return false
        }
        if (other.location != location) {
            return false
        }
        if (other.inviteLink != inviteLink) {
            return false
        }
        val botCommandsEquals = other.botCommands.contentDeepEquals(botCommands)
        if (!botCommandsEquals) {
            return false
        }
        if (other.botVerification != botVerification) {
            return false
        }
        if (other.mainProfileTab != mainProfileTab) {
            return false
        }
        if (other.upgradedFromBasicGroupId != upgradedFromBasicGroupId) {
            return false
        }
        return other.upgradedFromMaxMessageId == upgradedFromMaxMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + administratorCount.hashCode()
        hashCode = 31 * hashCode + restrictedCount.hashCode()
        hashCode = 31 * hashCode + bannedCount.hashCode()
        hashCode = 31 * hashCode + linkedChatId.hashCode()
        hashCode = 31 * hashCode + directMessagesChatId.hashCode()
        hashCode = 31 * hashCode + slowModeDelay.hashCode()
        hashCode = 31 * hashCode + slowModeDelayExpiresIn.hashCode()
        hashCode = 31 * hashCode + canEnablePaidMessages.hashCode()
        hashCode = 31 * hashCode + canEnablePaidReaction.hashCode()
        hashCode = 31 * hashCode + canGetMembers.hashCode()
        hashCode = 31 * hashCode + hasHiddenMembers.hashCode()
        hashCode = 31 * hashCode + canHideMembers.hashCode()
        hashCode = 31 * hashCode + canSetStickerSet.hashCode()
        hashCode = 31 * hashCode + canSetLocation.hashCode()
        hashCode = 31 * hashCode + canGetStatistics.hashCode()
        hashCode = 31 * hashCode + canGetRevenueStatistics.hashCode()
        hashCode = 31 * hashCode + canGetStarRevenueStatistics.hashCode()
        hashCode = 31 * hashCode + canSendGift.hashCode()
        hashCode = 31 * hashCode + canToggleAggressiveAntiSpam.hashCode()
        hashCode = 31 * hashCode + isAllHistoryAvailable.hashCode()
        hashCode = 31 * hashCode + canHaveSponsoredMessages.hashCode()
        hashCode = 31 * hashCode + hasAggressiveAntiSpamEnabled.hashCode()
        hashCode = 31 * hashCode + hasPaidMediaAllowed.hashCode()
        hashCode = 31 * hashCode + hasPinnedStories.hashCode()
        hashCode = 31 * hashCode + giftCount.hashCode()
        hashCode = 31 * hashCode + myBoostCount.hashCode()
        hashCode = 31 * hashCode + unrestrictBoostCount.hashCode()
        hashCode = 31 * hashCode + outgoingPaidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + stickerSetId.hashCode()
        hashCode = 31 * hashCode + customEmojiStickerSetId.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        hashCode = 31 * hashCode + botCommands.contentDeepHashCode()
        hashCode = 31 * hashCode + botVerification.hashCode()
        hashCode = 31 * hashCode + mainProfileTab.hashCode()
        hashCode = 31 * hashCode + upgradedFromBasicGroupId.hashCode()
        hashCode = 31 * hashCode + upgradedFromMaxMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SupergroupFullInfo")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("administratorCount=")
            append(administratorCount)
            append(", ")
            append("restrictedCount=")
            append(restrictedCount)
            append(", ")
            append("bannedCount=")
            append(bannedCount)
            append(", ")
            append("linkedChatId=")
            append(linkedChatId)
            append(", ")
            append("directMessagesChatId=")
            append(directMessagesChatId)
            append(", ")
            append("slowModeDelay=")
            append(slowModeDelay)
            append(", ")
            append("slowModeDelayExpiresIn=")
            append(slowModeDelayExpiresIn)
            append(", ")
            append("canEnablePaidMessages=")
            append(canEnablePaidMessages)
            append(", ")
            append("canEnablePaidReaction=")
            append(canEnablePaidReaction)
            append(", ")
            append("canGetMembers=")
            append(canGetMembers)
            append(", ")
            append("hasHiddenMembers=")
            append(hasHiddenMembers)
            append(", ")
            append("canHideMembers=")
            append(canHideMembers)
            append(", ")
            append("canSetStickerSet=")
            append(canSetStickerSet)
            append(", ")
            append("canSetLocation=")
            append(canSetLocation)
            append(", ")
            append("canGetStatistics=")
            append(canGetStatistics)
            append(", ")
            append("canGetRevenueStatistics=")
            append(canGetRevenueStatistics)
            append(", ")
            append("canGetStarRevenueStatistics=")
            append(canGetStarRevenueStatistics)
            append(", ")
            append("canSendGift=")
            append(canSendGift)
            append(", ")
            append("canToggleAggressiveAntiSpam=")
            append(canToggleAggressiveAntiSpam)
            append(", ")
            append("isAllHistoryAvailable=")
            append(isAllHistoryAvailable)
            append(", ")
            append("canHaveSponsoredMessages=")
            append(canHaveSponsoredMessages)
            append(", ")
            append("hasAggressiveAntiSpamEnabled=")
            append(hasAggressiveAntiSpamEnabled)
            append(", ")
            append("hasPaidMediaAllowed=")
            append(hasPaidMediaAllowed)
            append(", ")
            append("hasPinnedStories=")
            append(hasPinnedStories)
            append(", ")
            append("giftCount=")
            append(giftCount)
            append(", ")
            append("myBoostCount=")
            append(myBoostCount)
            append(", ")
            append("unrestrictBoostCount=")
            append(unrestrictBoostCount)
            append(", ")
            append("outgoingPaidMessageStarCount=")
            append(outgoingPaidMessageStarCount)
            append(", ")
            append("stickerSetId=")
            append(stickerSetId)
            append(", ")
            append("customEmojiStickerSetId=")
            append(customEmojiStickerSetId)
            append(", ")
            append("location=")
            append(location)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(", ")
            append("botCommands=")
            botCommands
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("botVerification=")
            append(botVerification)
            append(", ")
            append("mainProfileTab=")
            append(mainProfileTab)
            append(", ")
            append("upgradedFromBasicGroupId=")
            append(upgradedFromBasicGroupId)
            append(", ")
            append("upgradedFromMaxMessageId=")
            append(upgradedFromMaxMessageId)
            append(")")
        }
    }
}
