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
 * Contains full information about a user.
 *
 * @property personalPhoto User profile photo set by the current user for the contact; may be null. If null and user.profilePhoto is null, then the photo is empty; otherwise, it is unknown. If non-null, then it is the same photo as in user.profilePhoto and chat.photo. This photo isn't returned in the list of user photos.
 * @property photo User profile photo; may be null. If null and user.profilePhoto is null, then the photo is empty; otherwise, it is unknown. If non-null and personalPhoto is null, then it is the same photo as in user.profilePhoto and chat.photo.
 * @property publicPhoto User profile photo visible if the main photo is hidden by privacy settings; may be null. If null and user.profilePhoto is null, then the photo is empty; otherwise, it is unknown. If non-null and both photo and personalPhoto are null, then it is the same photo as in user.profilePhoto and chat.photo. This photo isn't returned in the list of user photos.
 * @property blockList Block list to which the user is added; may be null if none.
 * @property canBeCalled True, if the user can be called.
 * @property supportsVideoCalls True, if a video call can be created with the user.
 * @property hasPrivateCalls True, if the user can't be called due to their privacy settings.
 * @property hasPrivateForwards True, if the user can't be linked in forwarded messages due to their privacy settings.
 * @property hasRestrictedVoiceAndVideoNoteMessages True, if voice and video notes can't be sent or forwarded to the user.
 * @property hasPostedToProfileStories True, if the user has posted to profile stories.
 * @property hasSponsoredMessagesEnabled True, if the user always enabled sponsored messages; known only for the current user.
 * @property needPhoneNumberPrivacyException True, if the current user needs to explicitly allow to share their phone number with the user when the method addContact is used.
 * @property setChatBackground True, if the user set chat background for both chat users and it wasn't reverted yet.
 * @property bio A short user bio; may be null for bots.
 * @property birthdate Birthdate of the user; may be null if unknown.
 * @property personalChatId Identifier of the personal chat of the user; 0 if none.
 * @property giftCount Number of saved to profile gifts for other users or the total number of received gifts for the current user.
 * @property groupInCommonCount Number of group chats where both the other user and the current user are a member; 0 for the current user.
 * @property incomingPaidMessageStarCount Number of Telegram Stars that must be paid by the user for each sent message to the current user.
 * @property outgoingPaidMessageStarCount Number of Telegram Stars that must be paid by the current user for each sent message to the user.
 * @property giftSettings Settings for gift receiving for the user.
 * @property botVerification Information about verification status of the user provided by a bot; may be null if none or unknown.
 * @property businessInfo Information about business settings for Telegram Business accounts; may be null if none.
 * @property botInfo For bots, information about the bot; may be null if the user isn't a bot.
 */
@SerialName(value = "userFullInfo")
@Serializable
public class UserFullInfo public constructor(
    @SerialName(value = "personal_photo")
    public val personalPhoto: ChatPhoto?,
    @SerialName(value = "photo")
    public val photo: ChatPhoto?,
    @SerialName(value = "public_photo")
    public val publicPhoto: ChatPhoto?,
    @SerialName(value = "block_list")
    public val blockList: BlockList?,
    @SerialName(value = "can_be_called")
    public val canBeCalled: Boolean,
    @SerialName(value = "supports_video_calls")
    public val supportsVideoCalls: Boolean,
    @SerialName(value = "has_private_calls")
    public val hasPrivateCalls: Boolean,
    @SerialName(value = "has_private_forwards")
    public val hasPrivateForwards: Boolean,
    @SerialName(value = "has_restricted_voice_and_video_note_messages")
    public val hasRestrictedVoiceAndVideoNoteMessages: Boolean,
    @SerialName(value = "has_posted_to_profile_stories")
    public val hasPostedToProfileStories: Boolean,
    @SerialName(value = "has_sponsored_messages_enabled")
    public val hasSponsoredMessagesEnabled: Boolean,
    @SerialName(value = "need_phone_number_privacy_exception")
    public val needPhoneNumberPrivacyException: Boolean,
    @SerialName(value = "set_chat_background")
    public val setChatBackground: Boolean,
    @SerialName(value = "bio")
    public val bio: FormattedText?,
    @SerialName(value = "birthdate")
    public val birthdate: Birthdate?,
    @SerialName(value = "personal_chat_id")
    public val personalChatId: Long,
    @SerialName(value = "gift_count")
    public val giftCount: Int,
    @SerialName(value = "group_in_common_count")
    public val groupInCommonCount: Int,
    @SerialName(value = "incoming_paid_message_star_count")
    public val incomingPaidMessageStarCount: Long,
    @SerialName(value = "outgoing_paid_message_star_count")
    public val outgoingPaidMessageStarCount: Long,
    @SerialName(value = "gift_settings")
    public val giftSettings: GiftSettings,
    @SerialName(value = "bot_verification")
    public val botVerification: BotVerification?,
    @SerialName(value = "business_info")
    public val businessInfo: BusinessInfo?,
    @SerialName(value = "bot_info")
    public val botInfo: BotInfo?,
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
        other as UserFullInfo
        if (other.personalPhoto != personalPhoto) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.publicPhoto != publicPhoto) {
            return false
        }
        if (other.blockList != blockList) {
            return false
        }
        if (other.canBeCalled != canBeCalled) {
            return false
        }
        if (other.supportsVideoCalls != supportsVideoCalls) {
            return false
        }
        if (other.hasPrivateCalls != hasPrivateCalls) {
            return false
        }
        if (other.hasPrivateForwards != hasPrivateForwards) {
            return false
        }
        if (other.hasRestrictedVoiceAndVideoNoteMessages != hasRestrictedVoiceAndVideoNoteMessages) {
            return false
        }
        if (other.hasPostedToProfileStories != hasPostedToProfileStories) {
            return false
        }
        if (other.hasSponsoredMessagesEnabled != hasSponsoredMessagesEnabled) {
            return false
        }
        if (other.needPhoneNumberPrivacyException != needPhoneNumberPrivacyException) {
            return false
        }
        if (other.setChatBackground != setChatBackground) {
            return false
        }
        if (other.bio != bio) {
            return false
        }
        if (other.birthdate != birthdate) {
            return false
        }
        if (other.personalChatId != personalChatId) {
            return false
        }
        if (other.giftCount != giftCount) {
            return false
        }
        if (other.groupInCommonCount != groupInCommonCount) {
            return false
        }
        if (other.incomingPaidMessageStarCount != incomingPaidMessageStarCount) {
            return false
        }
        if (other.outgoingPaidMessageStarCount != outgoingPaidMessageStarCount) {
            return false
        }
        if (other.giftSettings != giftSettings) {
            return false
        }
        if (other.botVerification != botVerification) {
            return false
        }
        if (other.businessInfo != businessInfo) {
            return false
        }
        return other.botInfo == botInfo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + personalPhoto.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + publicPhoto.hashCode()
        hashCode = 31 * hashCode + blockList.hashCode()
        hashCode = 31 * hashCode + canBeCalled.hashCode()
        hashCode = 31 * hashCode + supportsVideoCalls.hashCode()
        hashCode = 31 * hashCode + hasPrivateCalls.hashCode()
        hashCode = 31 * hashCode + hasPrivateForwards.hashCode()
        hashCode = 31 * hashCode + hasRestrictedVoiceAndVideoNoteMessages.hashCode()
        hashCode = 31 * hashCode + hasPostedToProfileStories.hashCode()
        hashCode = 31 * hashCode + hasSponsoredMessagesEnabled.hashCode()
        hashCode = 31 * hashCode + needPhoneNumberPrivacyException.hashCode()
        hashCode = 31 * hashCode + setChatBackground.hashCode()
        hashCode = 31 * hashCode + bio.hashCode()
        hashCode = 31 * hashCode + birthdate.hashCode()
        hashCode = 31 * hashCode + personalChatId.hashCode()
        hashCode = 31 * hashCode + giftCount.hashCode()
        hashCode = 31 * hashCode + groupInCommonCount.hashCode()
        hashCode = 31 * hashCode + incomingPaidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + outgoingPaidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + giftSettings.hashCode()
        hashCode = 31 * hashCode + botVerification.hashCode()
        hashCode = 31 * hashCode + businessInfo.hashCode()
        hashCode = 31 * hashCode + botInfo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserFullInfo")
            append("(")
            append("personalPhoto=")
            append(personalPhoto)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("publicPhoto=")
            append(publicPhoto)
            append(", ")
            append("blockList=")
            append(blockList)
            append(", ")
            append("canBeCalled=")
            append(canBeCalled)
            append(", ")
            append("supportsVideoCalls=")
            append(supportsVideoCalls)
            append(", ")
            append("hasPrivateCalls=")
            append(hasPrivateCalls)
            append(", ")
            append("hasPrivateForwards=")
            append(hasPrivateForwards)
            append(", ")
            append("hasRestrictedVoiceAndVideoNoteMessages=")
            append(hasRestrictedVoiceAndVideoNoteMessages)
            append(", ")
            append("hasPostedToProfileStories=")
            append(hasPostedToProfileStories)
            append(", ")
            append("hasSponsoredMessagesEnabled=")
            append(hasSponsoredMessagesEnabled)
            append(", ")
            append("needPhoneNumberPrivacyException=")
            append(needPhoneNumberPrivacyException)
            append(", ")
            append("setChatBackground=")
            append(setChatBackground)
            append(", ")
            append("bio=")
            append(bio)
            append(", ")
            append("birthdate=")
            append(birthdate)
            append(", ")
            append("personalChatId=")
            append(personalChatId)
            append(", ")
            append("giftCount=")
            append(giftCount)
            append(", ")
            append("groupInCommonCount=")
            append(groupInCommonCount)
            append(", ")
            append("incomingPaidMessageStarCount=")
            append(incomingPaidMessageStarCount)
            append(", ")
            append("outgoingPaidMessageStarCount=")
            append(outgoingPaidMessageStarCount)
            append(", ")
            append("giftSettings=")
            append(giftSettings)
            append(", ")
            append("botVerification=")
            append(botVerification)
            append(", ")
            append("businessInfo=")
            append(businessInfo)
            append(", ")
            append("botInfo=")
            append(botInfo)
            append(")")
        }
    }
}
