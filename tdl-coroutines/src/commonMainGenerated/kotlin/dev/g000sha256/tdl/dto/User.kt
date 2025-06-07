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
 * @property profileAccentColorId Identifier of the accent color for the user's profile; -1 if none.
 * @property profileBackgroundCustomEmojiId Identifier of a custom emoji to be shown on the background of the user's profile; 0 if none.
 * @property emojiStatus Emoji status to be shown instead of the default Telegram Premium badge; may be null.
 * @property isContact The user is a contact of the current user.
 * @property isMutualContact The user is a contact of the current user and the current user is a contact of the user.
 * @property isCloseFriend The user is a close friend of the current user; implies that the user is a contact.
 * @property verificationStatus Information about verification status of the user; may be null if none.
 * @property isPremium True, if the user is a Telegram Premium user.
 * @property isSupport True, if the user is Telegram support account.
 * @property restrictionReason If non-empty, it contains a human-readable description of the reason why access to this user must be restricted.
 * @property hasActiveStories True, if the user has non-expired stories available to the current user.
 * @property hasUnreadActiveStories True, if the user has unread non-expired stories available to the current user.
 * @property restrictsNewChats True, if the user may restrict new chats with non-contacts. Use canSendMessageToUser to check whether the current user can message the user or try to create a chat with them.
 * @property paidMessageStarCount Number of Telegram Stars that must be paid by general user for each sent message to the user. If positive and userFullInfo is unknown, use canSendMessageToUser to check whether the current user must pay.
 * @property haveAccess If false, the user is inaccessible, and the only information known about the user is inside this class. Identifier of the user can't be passed to any method.
 * @property type Type of the user.
 * @property languageCode IETF language tag of the user's language; only available to bots.
 * @property addedToAttachmentMenu True, if the user added the current bot to attachment menu; only available to bots.
 */
@SerialName(value = "user")
@Serializable
public class User public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "first_name")
    public val firstName: String,
    @SerialName(value = "last_name")
    public val lastName: String,
    @SerialName(value = "usernames")
    public val usernames: Usernames?,
    @SerialName(value = "phone_number")
    public val phoneNumber: String,
    @SerialName(value = "status")
    public val status: UserStatus,
    @SerialName(value = "profile_photo")
    public val profilePhoto: ProfilePhoto?,
    @SerialName(value = "accent_color_id")
    public val accentColorId: Int,
    @SerialName(value = "background_custom_emoji_id")
    public val backgroundCustomEmojiId: Long,
    @SerialName(value = "profile_accent_color_id")
    public val profileAccentColorId: Int,
    @SerialName(value = "profile_background_custom_emoji_id")
    public val profileBackgroundCustomEmojiId: Long,
    @SerialName(value = "emoji_status")
    public val emojiStatus: EmojiStatus?,
    @SerialName(value = "is_contact")
    public val isContact: Boolean,
    @SerialName(value = "is_mutual_contact")
    public val isMutualContact: Boolean,
    @SerialName(value = "is_close_friend")
    public val isCloseFriend: Boolean,
    @SerialName(value = "verification_status")
    public val verificationStatus: VerificationStatus?,
    @SerialName(value = "is_premium")
    public val isPremium: Boolean,
    @SerialName(value = "is_support")
    public val isSupport: Boolean,
    @SerialName(value = "restriction_reason")
    public val restrictionReason: String,
    @SerialName(value = "has_active_stories")
    public val hasActiveStories: Boolean,
    @SerialName(value = "has_unread_active_stories")
    public val hasUnreadActiveStories: Boolean,
    @SerialName(value = "restricts_new_chats")
    public val restrictsNewChats: Boolean,
    @SerialName(value = "paid_message_star_count")
    public val paidMessageStarCount: Long,
    @SerialName(value = "have_access")
    public val haveAccess: Boolean,
    @SerialName(value = "type")
    public val type: UserType,
    @SerialName(value = "language_code")
    public val languageCode: String,
    @SerialName(value = "added_to_attachment_menu")
    public val addedToAttachmentMenu: Boolean,
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
        if (other.restrictionReason != restrictionReason) {
            return false
        }
        if (other.hasActiveStories != hasActiveStories) {
            return false
        }
        if (other.hasUnreadActiveStories != hasUnreadActiveStories) {
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
        hashCode = 31 * hashCode + profileAccentColorId.hashCode()
        hashCode = 31 * hashCode + profileBackgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + emojiStatus.hashCode()
        hashCode = 31 * hashCode + isContact.hashCode()
        hashCode = 31 * hashCode + isMutualContact.hashCode()
        hashCode = 31 * hashCode + isCloseFriend.hashCode()
        hashCode = 31 * hashCode + verificationStatus.hashCode()
        hashCode = 31 * hashCode + isPremium.hashCode()
        hashCode = 31 * hashCode + isSupport.hashCode()
        hashCode = 31 * hashCode + restrictionReason.hashCode()
        hashCode = 31 * hashCode + hasActiveStories.hashCode()
        hashCode = 31 * hashCode + hasUnreadActiveStories.hashCode()
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
            append("restrictionReason=")
            append(restrictionReason)
            append(", ")
            append("hasActiveStories=")
            append(hasActiveStories)
            append(", ")
            append("hasUnreadActiveStories=")
            append(hasUnreadActiveStories)
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
