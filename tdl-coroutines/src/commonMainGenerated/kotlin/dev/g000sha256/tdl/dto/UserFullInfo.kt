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
 * @property rating The current rating of the user; may be null if none.
 * @property pendingRating The rating of the user after the next change; may be null if the user isn't the current user or there are no pending rating changes.
 * @property pendingRatingDate Unix timestamp when rating of the user will change to pendingRating; 0 if the user isn't the current user or there are no pending rating changes.
 * @property businessInfo Information about business settings for Telegram Business accounts; may be null if none.
 * @property botInfo For bots, information about the bot; may be null if the user isn't a bot.
 */
public class UserFullInfo public constructor(
    public val personalPhoto: ChatPhoto?,
    public val photo: ChatPhoto?,
    public val publicPhoto: ChatPhoto?,
    public val blockList: BlockList?,
    public val canBeCalled: Boolean,
    public val supportsVideoCalls: Boolean,
    public val hasPrivateCalls: Boolean,
    public val hasPrivateForwards: Boolean,
    public val hasRestrictedVoiceAndVideoNoteMessages: Boolean,
    public val hasPostedToProfileStories: Boolean,
    public val hasSponsoredMessagesEnabled: Boolean,
    public val needPhoneNumberPrivacyException: Boolean,
    public val setChatBackground: Boolean,
    public val bio: FormattedText?,
    public val birthdate: Birthdate?,
    public val personalChatId: Long,
    public val giftCount: Int,
    public val groupInCommonCount: Int,
    public val incomingPaidMessageStarCount: Long,
    public val outgoingPaidMessageStarCount: Long,
    public val giftSettings: GiftSettings,
    public val botVerification: BotVerification?,
    public val rating: UserRating?,
    public val pendingRating: UserRating?,
    public val pendingRatingDate: Int,
    public val businessInfo: BusinessInfo?,
    public val botInfo: BotInfo?,
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
        if (other.rating != rating) {
            return false
        }
        if (other.pendingRating != pendingRating) {
            return false
        }
        if (other.pendingRatingDate != pendingRatingDate) {
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
        hashCode = 31 * hashCode + rating.hashCode()
        hashCode = 31 * hashCode + pendingRating.hashCode()
        hashCode = 31 * hashCode + pendingRatingDate.hashCode()
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
            append("rating=")
            append(rating)
            append(", ")
            append("pendingRating=")
            append(pendingRating)
            append(", ")
            append("pendingRatingDate=")
            append(pendingRatingDate)
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
