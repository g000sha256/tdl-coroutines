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
 * Represents a user.
 *
 * @property id User identifier.
 * @property firstName First name of the user.
 * @property lastName Last name of the user.
 * @property usernames Usernames of the user; may be null.
 * @property phoneNumber Phone number of the user.
 * @property status Current online status of the user.
 * @property profilePhoto Profile photo of the user; may be null.
 * @property accentColorId Identifier of the accent color for name, and backgrounds of profile photo, reply header, and link preview.
 * @property backgroundCustomEmojiId Identifier of a custom emoji to be shown on the reply header and link preview background; 0 if none.
 * @property upgradedGiftColors Color scheme based on an upgraded gift to be used for the user instead of accentColorId and backgroundCustomEmojiId; may be null if none.
 * @property profileAccentColorId Identifier of the accent color for the user's profile; -1 if none.
 * @property profileBackgroundCustomEmojiId Identifier of a custom emoji to be shown on the background of the user's profile; 0 if none.
 * @property emojiStatus Emoji status to be shown instead of the default Telegram Premium badge; may be null.
 * @property isContact The user is a contact of the current user.
 * @property isMutualContact The user is a contact of the current user and the current user is a contact of the user.
 * @property isCloseFriend The user is a close friend of the current user; implies that the user is a contact.
 * @property verificationStatus Information about verification status of the user; may be null if none.
 * @property isPremium True, if the user is a Telegram Premium user.
 * @property isSupport True, if the user is Telegram support account.
 * @property restrictionInfo Information about restrictions that must be applied to the corresponding private chat; may be null if none.
 * @property activeStoryState State of active stories of the user; may be null if the user has no active stories.
 * @property restrictsNewChats True, if the user may restrict new chats with non-contacts. Use canSendMessageToUser to check whether the current user can message the user or try to create a chat with them.
 * @property paidMessageStarCount Number of Telegram Stars that must be paid by general user for each sent message to the user. If positive and userFullInfo is unknown, use canSendMessageToUser to check whether the current user must pay.
 * @property haveAccess If false, the user is inaccessible, and the only information known about the user is inside this class. Identifier of the user can't be passed to any method.
 * @property type Type of the user.
 * @property languageCode IETF language tag of the user's language; only available to bots.
 * @property addedToAttachmentMenu True, if the user added the current bot to attachment menu; only available to bots.
 */
public class User public constructor(
    public val id: Long,
    public val firstName: String,
    public val lastName: String,
    public val usernames: Usernames?,
    public val phoneNumber: String,
    public val status: UserStatus,
    public val profilePhoto: ProfilePhoto?,
    public val accentColorId: Int,
    public val backgroundCustomEmojiId: Long,
    public val upgradedGiftColors: UpgradedGiftColors?,
    public val profileAccentColorId: Int,
    public val profileBackgroundCustomEmojiId: Long,
    public val emojiStatus: EmojiStatus?,
    public val isContact: Boolean,
    public val isMutualContact: Boolean,
    public val isCloseFriend: Boolean,
    public val verificationStatus: VerificationStatus?,
    public val isPremium: Boolean,
    public val isSupport: Boolean,
    public val restrictionInfo: RestrictionInfo?,
    public val activeStoryState: ActiveStoryState?,
    public val restrictsNewChats: Boolean,
    public val paidMessageStarCount: Long,
    public val haveAccess: Boolean,
    public val type: UserType,
    public val languageCode: String,
    public val addedToAttachmentMenu: Boolean,
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
        other as User
        if (other.id != id) {
            return false
        }
        if (other.firstName != firstName) {
            return false
        }
        if (other.lastName != lastName) {
            return false
        }
        if (other.usernames != usernames) {
            return false
        }
        if (other.phoneNumber != phoneNumber) {
            return false
        }
        if (other.status != status) {
            return false
        }
        if (other.profilePhoto != profilePhoto) {
            return false
        }
        if (other.accentColorId != accentColorId) {
            return false
        }
        if (other.backgroundCustomEmojiId != backgroundCustomEmojiId) {
            return false
        }
        if (other.upgradedGiftColors != upgradedGiftColors) {
            return false
        }
        if (other.profileAccentColorId != profileAccentColorId) {
            return false
        }
        if (other.profileBackgroundCustomEmojiId != profileBackgroundCustomEmojiId) {
            return false
        }
        if (other.emojiStatus != emojiStatus) {
            return false
        }
        if (other.isContact != isContact) {
            return false
        }
        if (other.isMutualContact != isMutualContact) {
            return false
        }
        if (other.isCloseFriend != isCloseFriend) {
            return false
        }
        if (other.verificationStatus != verificationStatus) {
            return false
        }
        if (other.isPremium != isPremium) {
            return false
        }
        if (other.isSupport != isSupport) {
            return false
        }
        if (other.restrictionInfo != restrictionInfo) {
            return false
        }
        if (other.activeStoryState != activeStoryState) {
            return false
        }
        if (other.restrictsNewChats != restrictsNewChats) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.haveAccess != haveAccess) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.languageCode != languageCode) {
            return false
        }
        return other.addedToAttachmentMenu == addedToAttachmentMenu
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + firstName.hashCode()
        hashCode = 31 * hashCode + lastName.hashCode()
        hashCode = 31 * hashCode + usernames.hashCode()
        hashCode = 31 * hashCode + phoneNumber.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        hashCode = 31 * hashCode + profilePhoto.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + backgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + upgradedGiftColors.hashCode()
        hashCode = 31 * hashCode + profileAccentColorId.hashCode()
        hashCode = 31 * hashCode + profileBackgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + emojiStatus.hashCode()
        hashCode = 31 * hashCode + isContact.hashCode()
        hashCode = 31 * hashCode + isMutualContact.hashCode()
        hashCode = 31 * hashCode + isCloseFriend.hashCode()
        hashCode = 31 * hashCode + verificationStatus.hashCode()
        hashCode = 31 * hashCode + isPremium.hashCode()
        hashCode = 31 * hashCode + isSupport.hashCode()
        hashCode = 31 * hashCode + restrictionInfo.hashCode()
        hashCode = 31 * hashCode + activeStoryState.hashCode()
        hashCode = 31 * hashCode + restrictsNewChats.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + haveAccess.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + languageCode.hashCode()
        hashCode = 31 * hashCode + addedToAttachmentMenu.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("User")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("firstName=")
            append(firstName)
            append(", ")
            append("lastName=")
            append(lastName)
            append(", ")
            append("usernames=")
            append(usernames)
            append(", ")
            append("phoneNumber=")
            append(phoneNumber)
            append(", ")
            append("status=")
            append(status)
            append(", ")
            append("profilePhoto=")
            append(profilePhoto)
            append(", ")
            append("accentColorId=")
            append(accentColorId)
            append(", ")
            append("backgroundCustomEmojiId=")
            append(backgroundCustomEmojiId)
            append(", ")
            append("upgradedGiftColors=")
            append(upgradedGiftColors)
            append(", ")
            append("profileAccentColorId=")
            append(profileAccentColorId)
            append(", ")
            append("profileBackgroundCustomEmojiId=")
            append(profileBackgroundCustomEmojiId)
            append(", ")
            append("emojiStatus=")
            append(emojiStatus)
            append(", ")
            append("isContact=")
            append(isContact)
            append(", ")
            append("isMutualContact=")
            append(isMutualContact)
            append(", ")
            append("isCloseFriend=")
            append(isCloseFriend)
            append(", ")
            append("verificationStatus=")
            append(verificationStatus)
            append(", ")
            append("isPremium=")
            append(isPremium)
            append(", ")
            append("isSupport=")
            append(isSupport)
            append(", ")
            append("restrictionInfo=")
            append(restrictionInfo)
            append(", ")
            append("activeStoryState=")
            append(activeStoryState)
            append(", ")
            append("restrictsNewChats=")
            append(restrictsNewChats)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("haveAccess=")
            append(haveAccess)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("languageCode=")
            append(languageCode)
            append(", ")
            append("addedToAttachmentMenu=")
            append(addedToAttachmentMenu)
            append(")")
        }
    }
}
