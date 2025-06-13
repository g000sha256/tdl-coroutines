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
 * Represents a supergroup or channel with zero or more members (subscribers in the case of channels). From the point of view of the system, a channel is a special kind of a supergroup: only administrators can post and see the list of members, and posts from all administrators use the name and photo of the channel instead of individual names and profile photos. Unlike supergroups, channels can have an unlimited number of subscribers.
 *
 * @property id Supergroup or channel identifier.
 * @property usernames Usernames of the supergroup or channel; may be null.
 * @property date Point in time (Unix timestamp) when the current user joined, or the point in time when the supergroup or channel was created, in case the user is not a member.
 * @property status Status of the current user in the supergroup or channel; custom title will always be empty.
 * @property memberCount Number of members in the supergroup or channel; 0 if unknown. Currently, it is guaranteed to be known only if the supergroup or channel was received through getChatSimilarChats, getChatsToPostStories, getCreatedPublicChats, getGroupsInCommon, getInactiveSupergroupChats, getRecommendedChats, getSuitableDiscussionChats, getUserPrivacySettingRules, getVideoChatAvailableParticipants, searchPublicChats, or in chatFolderInviteLinkInfo.missingChatIds, or in userFullInfo.personalChatId, or for chats with messages or stories from publicForwards and foundStories.
 * @property boostLevel Approximate boost level for the chat.
 * @property hasAutomaticTranslation True, if automatic translation of messages is enabled in the channel.
 * @property hasLinkedChat True, if the channel has a discussion group, or the supergroup is the designated discussion group for a channel.
 * @property hasLocation True, if the supergroup is connected to a location, i.e. the supergroup is a location-based supergroup.
 * @property signMessages True, if messages sent to the channel contains name of the sender. This field is only applicable to channels.
 * @property showMessageSender True, if messages sent to the channel have information about the sender user. This field is only applicable to channels.
 * @property joinToSendMessages True, if users need to join the supergroup before they can send messages. Always true for channels and non-discussion supergroups.
 * @property joinByRequest True, if all users directly joining the supergroup need to be approved by supergroup administrators. Always false for channels and supergroups without username, location, or a linked chat.
 * @property isSlowModeEnabled True, if the slow mode is enabled in the supergroup.
 * @property isChannel True, if the supergroup is a channel.
 * @property isBroadcastGroup True, if the supergroup is a broadcast group, i.e. only administrators can send messages and there is no limit on the number of members.
 * @property isForum True, if the supergroup is a forum with topics.
 * @property isDirectMessagesGroup True, if the supergroup is a direct message group for a channel chat.
 * @property isAdministeredDirectMessagesGroup True, if the supergroup is a direct messages group for a channel chat that is administered by the current user.
 * @property verificationStatus Information about verification status of the supergroup or channel; may be null if none.
 * @property hasDirectMessagesGroup True, if the channel has direct messages group.
 * @property hasForumTabs True, if the supergroup is a forum, which topics are shown in the same way as in channel direct messages groups.
 * @property hasSensitiveContent True, if content of media messages in the supergroup or channel chat must be hidden with 18+ spoiler.
 * @property restrictionReason If non-empty, contains a human-readable description of the reason why access to this supergroup or channel must be restricted.
 * @property paidMessageStarCount Number of Telegram Stars that must be paid by non-administrator users of the supergroup chat for each sent message.
 * @property hasActiveStories True, if the supergroup or channel has non-expired stories available to the current user.
 * @property hasUnreadActiveStories True, if the supergroup or channel has unread non-expired stories available to the current user.
 */
public class Supergroup public constructor(
    public val id: Long,
    public val usernames: Usernames?,
    public val date: Int,
    public val status: ChatMemberStatus,
    public val memberCount: Int,
    public val boostLevel: Int,
    public val hasAutomaticTranslation: Boolean,
    public val hasLinkedChat: Boolean,
    public val hasLocation: Boolean,
    public val signMessages: Boolean,
    public val showMessageSender: Boolean,
    public val joinToSendMessages: Boolean,
    public val joinByRequest: Boolean,
    public val isSlowModeEnabled: Boolean,
    public val isChannel: Boolean,
    public val isBroadcastGroup: Boolean,
    public val isForum: Boolean,
    public val isDirectMessagesGroup: Boolean,
    public val isAdministeredDirectMessagesGroup: Boolean,
    public val verificationStatus: VerificationStatus?,
    public val hasDirectMessagesGroup: Boolean,
    public val hasForumTabs: Boolean,
    public val hasSensitiveContent: Boolean,
    public val restrictionReason: String,
    public val paidMessageStarCount: Long,
    public val hasActiveStories: Boolean,
    public val hasUnreadActiveStories: Boolean,
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
        other as Supergroup
        if (other.id != id) {
            return false
        }
        if (other.usernames != usernames) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.status != status) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.boostLevel != boostLevel) {
            return false
        }
        if (other.hasAutomaticTranslation != hasAutomaticTranslation) {
            return false
        }
        if (other.hasLinkedChat != hasLinkedChat) {
            return false
        }
        if (other.hasLocation != hasLocation) {
            return false
        }
        if (other.signMessages != signMessages) {
            return false
        }
        if (other.showMessageSender != showMessageSender) {
            return false
        }
        if (other.joinToSendMessages != joinToSendMessages) {
            return false
        }
        if (other.joinByRequest != joinByRequest) {
            return false
        }
        if (other.isSlowModeEnabled != isSlowModeEnabled) {
            return false
        }
        if (other.isChannel != isChannel) {
            return false
        }
        if (other.isBroadcastGroup != isBroadcastGroup) {
            return false
        }
        if (other.isForum != isForum) {
            return false
        }
        if (other.isDirectMessagesGroup != isDirectMessagesGroup) {
            return false
        }
        if (other.isAdministeredDirectMessagesGroup != isAdministeredDirectMessagesGroup) {
            return false
        }
        if (other.verificationStatus != verificationStatus) {
            return false
        }
        if (other.hasDirectMessagesGroup != hasDirectMessagesGroup) {
            return false
        }
        if (other.hasForumTabs != hasForumTabs) {
            return false
        }
        if (other.hasSensitiveContent != hasSensitiveContent) {
            return false
        }
        if (other.restrictionReason != restrictionReason) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.hasActiveStories != hasActiveStories) {
            return false
        }
        return other.hasUnreadActiveStories == hasUnreadActiveStories
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + usernames.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + boostLevel.hashCode()
        hashCode = 31 * hashCode + hasAutomaticTranslation.hashCode()
        hashCode = 31 * hashCode + hasLinkedChat.hashCode()
        hashCode = 31 * hashCode + hasLocation.hashCode()
        hashCode = 31 * hashCode + signMessages.hashCode()
        hashCode = 31 * hashCode + showMessageSender.hashCode()
        hashCode = 31 * hashCode + joinToSendMessages.hashCode()
        hashCode = 31 * hashCode + joinByRequest.hashCode()
        hashCode = 31 * hashCode + isSlowModeEnabled.hashCode()
        hashCode = 31 * hashCode + isChannel.hashCode()
        hashCode = 31 * hashCode + isBroadcastGroup.hashCode()
        hashCode = 31 * hashCode + isForum.hashCode()
        hashCode = 31 * hashCode + isDirectMessagesGroup.hashCode()
        hashCode = 31 * hashCode + isAdministeredDirectMessagesGroup.hashCode()
        hashCode = 31 * hashCode + verificationStatus.hashCode()
        hashCode = 31 * hashCode + hasDirectMessagesGroup.hashCode()
        hashCode = 31 * hashCode + hasForumTabs.hashCode()
        hashCode = 31 * hashCode + hasSensitiveContent.hashCode()
        hashCode = 31 * hashCode + restrictionReason.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + hasActiveStories.hashCode()
        hashCode = 31 * hashCode + hasUnreadActiveStories.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Supergroup")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("usernames=")
            append(usernames)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("status=")
            append(status)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("boostLevel=")
            append(boostLevel)
            append(", ")
            append("hasAutomaticTranslation=")
            append(hasAutomaticTranslation)
            append(", ")
            append("hasLinkedChat=")
            append(hasLinkedChat)
            append(", ")
            append("hasLocation=")
            append(hasLocation)
            append(", ")
            append("signMessages=")
            append(signMessages)
            append(", ")
            append("showMessageSender=")
            append(showMessageSender)
            append(", ")
            append("joinToSendMessages=")
            append(joinToSendMessages)
            append(", ")
            append("joinByRequest=")
            append(joinByRequest)
            append(", ")
            append("isSlowModeEnabled=")
            append(isSlowModeEnabled)
            append(", ")
            append("isChannel=")
            append(isChannel)
            append(", ")
            append("isBroadcastGroup=")
            append(isBroadcastGroup)
            append(", ")
            append("isForum=")
            append(isForum)
            append(", ")
            append("isDirectMessagesGroup=")
            append(isDirectMessagesGroup)
            append(", ")
            append("isAdministeredDirectMessagesGroup=")
            append(isAdministeredDirectMessagesGroup)
            append(", ")
            append("verificationStatus=")
            append(verificationStatus)
            append(", ")
            append("hasDirectMessagesGroup=")
            append(hasDirectMessagesGroup)
            append(", ")
            append("hasForumTabs=")
            append(hasForumTabs)
            append(", ")
            append("hasSensitiveContent=")
            append(hasSensitiveContent)
            append(", ")
            append("restrictionReason=")
            append(restrictionReason)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("hasActiveStories=")
            append(hasActiveStories)
            append(", ")
            append("hasUnreadActiveStories=")
            append(hasUnreadActiveStories)
            append(")")
        }
    }
}
