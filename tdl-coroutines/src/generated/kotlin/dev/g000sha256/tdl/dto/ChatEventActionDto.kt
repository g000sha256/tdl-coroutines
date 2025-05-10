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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Represents a chat event.
 */
public sealed class ChatEventActionDto private constructor() {
    /**
     * A message was edited.
     *
     * @property oldMessage The original message before the edit.
     * @property newMessage The message after it was edited.
     */
    public class MessageEdited public constructor(
        public val oldMessage: MessageDto,
        public val newMessage: MessageDto,
    ) : ChatEventActionDto() {
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
            other as MessageEdited
            if (other.oldMessage != oldMessage) {
                return false
            }
            return other.newMessage == newMessage
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldMessage.hashCode()
            hashCode = 31 * hashCode + newMessage.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MessageEdited")
                append("(")
                append("oldMessage=")
                append(oldMessage)
                append(", ")
                append("newMessage=")
                append(newMessage)
                append(")")
            }
        }
    }

    /**
     * A message was deleted.
     *
     * @property message Deleted message.
     * @property canReportAntiSpamFalsePositive True, if the message deletion can be reported via reportSupergroupAntiSpamFalsePositive.
     */
    public class MessageDeleted public constructor(
        public val message: MessageDto,
        public val canReportAntiSpamFalsePositive: Boolean,
    ) : ChatEventActionDto() {
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
            other as MessageDeleted
            if (other.message != message) {
                return false
            }
            return other.canReportAntiSpamFalsePositive == canReportAntiSpamFalsePositive
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + message.hashCode()
            hashCode = 31 * hashCode + canReportAntiSpamFalsePositive.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MessageDeleted")
                append("(")
                append("message=")
                append(message)
                append(", ")
                append("canReportAntiSpamFalsePositive=")
                append(canReportAntiSpamFalsePositive)
                append(")")
            }
        }
    }

    /**
     * A message was pinned.
     *
     * @property message Pinned message.
     */
    public class MessagePinned public constructor(
        public val message: MessageDto,
    ) : ChatEventActionDto() {
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
            other as MessagePinned
            return other.message == message
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + message.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MessagePinned")
                append("(")
                append("message=")
                append(message)
                append(")")
            }
        }
    }

    /**
     * A message was unpinned.
     *
     * @property message Unpinned message.
     */
    public class MessageUnpinned public constructor(
        public val message: MessageDto,
    ) : ChatEventActionDto() {
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
            other as MessageUnpinned
            return other.message == message
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + message.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MessageUnpinned")
                append("(")
                append("message=")
                append(message)
                append(")")
            }
        }
    }

    /**
     * A poll in a message was stopped.
     *
     * @property message The message with the poll.
     */
    public class PollStopped public constructor(
        public val message: MessageDto,
    ) : ChatEventActionDto() {
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
            other as PollStopped
            return other.message == message
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + message.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.PollStopped")
                append("(")
                append("message=")
                append(message)
                append(")")
            }
        }
    }

    /**
     * A new member joined the chat.
     */
    public class MemberJoined public constructor() : ChatEventActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ChatEventActionDto.MemberJoined()"
        }
    }

    /**
     * A new member joined the chat via an invite link.
     *
     * @property inviteLink Invite link used to join the chat.
     * @property viaChatFolderInviteLink True, if the user has joined the chat using an invite link for a chat folder.
     */
    public class MemberJoinedByInviteLink public constructor(
        public val inviteLink: ChatInviteLinkDto,
        public val viaChatFolderInviteLink: Boolean,
    ) : ChatEventActionDto() {
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
            other as MemberJoinedByInviteLink
            if (other.inviteLink != inviteLink) {
                return false
            }
            return other.viaChatFolderInviteLink == viaChatFolderInviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            hashCode = 31 * hashCode + viaChatFolderInviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberJoinedByInviteLink")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(", ")
                append("viaChatFolderInviteLink=")
                append(viaChatFolderInviteLink)
                append(")")
            }
        }
    }

    /**
     * A new member was accepted to the chat by an administrator.
     *
     * @property approverUserId User identifier of the chat administrator, approved user join request.
     * @property inviteLink Invite link used to join the chat; may be null.
     */
    public class MemberJoinedByRequest public constructor(
        public val approverUserId: Long,
        public val inviteLink: ChatInviteLinkDto?,
    ) : ChatEventActionDto() {
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
            other as MemberJoinedByRequest
            if (other.approverUserId != approverUserId) {
                return false
            }
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + approverUserId.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberJoinedByRequest")
                append("(")
                append("approverUserId=")
                append(approverUserId)
                append(", ")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * A new chat member was invited.
     *
     * @property userId New member user identifier.
     * @property status New member status.
     */
    public class MemberInvited public constructor(
        public val userId: Long,
        public val status: ChatMemberStatusDto,
    ) : ChatEventActionDto() {
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
            other as MemberInvited
            if (other.userId != userId) {
                return false
            }
            return other.status == status
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + status.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberInvited")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("status=")
                append(status)
                append(")")
            }
        }
    }

    /**
     * A member left the chat.
     */
    public class MemberLeft public constructor() : ChatEventActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ChatEventActionDto.MemberLeft()"
        }
    }

    /**
     * A chat member has gained/lost administrator status, or the list of their administrator privileges has changed.
     *
     * @property userId Affected chat member user identifier.
     * @property oldStatus Previous status of the chat member.
     * @property newStatus New status of the chat member.
     */
    public class MemberPromoted public constructor(
        public val userId: Long,
        public val oldStatus: ChatMemberStatusDto,
        public val newStatus: ChatMemberStatusDto,
    ) : ChatEventActionDto() {
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
            other as MemberPromoted
            if (other.userId != userId) {
                return false
            }
            if (other.oldStatus != oldStatus) {
                return false
            }
            return other.newStatus == newStatus
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + oldStatus.hashCode()
            hashCode = 31 * hashCode + newStatus.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberPromoted")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("oldStatus=")
                append(oldStatus)
                append(", ")
                append("newStatus=")
                append(newStatus)
                append(")")
            }
        }
    }

    /**
     * A chat member was restricted/unrestricted or banned/unbanned, or the list of their restrictions has changed.
     *
     * @property memberId Affected chat member identifier.
     * @property oldStatus Previous status of the chat member.
     * @property newStatus New status of the chat member.
     */
    public class MemberRestricted public constructor(
        public val memberId: MessageSenderDto,
        public val oldStatus: ChatMemberStatusDto,
        public val newStatus: ChatMemberStatusDto,
    ) : ChatEventActionDto() {
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
            other as MemberRestricted
            if (other.memberId != memberId) {
                return false
            }
            if (other.oldStatus != oldStatus) {
                return false
            }
            return other.newStatus == newStatus
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + memberId.hashCode()
            hashCode = 31 * hashCode + oldStatus.hashCode()
            hashCode = 31 * hashCode + newStatus.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberRestricted")
                append("(")
                append("memberId=")
                append(memberId)
                append(", ")
                append("oldStatus=")
                append(oldStatus)
                append(", ")
                append("newStatus=")
                append(newStatus)
                append(")")
            }
        }
    }

    /**
     * A chat member extended their subscription to the chat.
     *
     * @property userId Affected chat member user identifier.
     * @property oldStatus Previous status of the chat member.
     * @property newStatus New status of the chat member.
     */
    public class MemberSubscriptionExtended public constructor(
        public val userId: Long,
        public val oldStatus: ChatMemberStatusDto,
        public val newStatus: ChatMemberStatusDto,
    ) : ChatEventActionDto() {
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
            other as MemberSubscriptionExtended
            if (other.userId != userId) {
                return false
            }
            if (other.oldStatus != oldStatus) {
                return false
            }
            return other.newStatus == newStatus
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            hashCode = 31 * hashCode + oldStatus.hashCode()
            hashCode = 31 * hashCode + newStatus.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MemberSubscriptionExtended")
                append("(")
                append("userId=")
                append(userId)
                append(", ")
                append("oldStatus=")
                append(oldStatus)
                append(", ")
                append("newStatus=")
                append(newStatus)
                append(")")
            }
        }
    }

    /**
     * The chat available reactions were changed.
     *
     * @property oldAvailableReactions Previous chat available reactions.
     * @property newAvailableReactions New chat available reactions.
     */
    public class AvailableReactionsChanged public constructor(
        public val oldAvailableReactions: ChatAvailableReactionsDto,
        public val newAvailableReactions: ChatAvailableReactionsDto,
    ) : ChatEventActionDto() {
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
            other as AvailableReactionsChanged
            if (other.oldAvailableReactions != oldAvailableReactions) {
                return false
            }
            return other.newAvailableReactions == newAvailableReactions
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldAvailableReactions.hashCode()
            hashCode = 31 * hashCode + newAvailableReactions.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.AvailableReactionsChanged")
                append("(")
                append("oldAvailableReactions=")
                append(oldAvailableReactions)
                append(", ")
                append("newAvailableReactions=")
                append(newAvailableReactions)
                append(")")
            }
        }
    }

    /**
     * The chat background was changed.
     *
     * @property oldBackground Previous background; may be null if none.
     * @property newBackground New background; may be null if none.
     */
    public class BackgroundChanged public constructor(
        public val oldBackground: ChatBackgroundDto?,
        public val newBackground: ChatBackgroundDto?,
    ) : ChatEventActionDto() {
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
            other as BackgroundChanged
            if (other.oldBackground != oldBackground) {
                return false
            }
            return other.newBackground == newBackground
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldBackground.hashCode()
            hashCode = 31 * hashCode + newBackground.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.BackgroundChanged")
                append("(")
                append("oldBackground=")
                append(oldBackground)
                append(", ")
                append("newBackground=")
                append(newBackground)
                append(")")
            }
        }
    }

    /**
     * The chat description was changed.
     *
     * @property oldDescription Previous chat description.
     * @property newDescription New chat description.
     */
    public class DescriptionChanged public constructor(
        public val oldDescription: String,
        public val newDescription: String,
    ) : ChatEventActionDto() {
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
            other as DescriptionChanged
            if (other.oldDescription != oldDescription) {
                return false
            }
            return other.newDescription == newDescription
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldDescription.hashCode()
            hashCode = 31 * hashCode + newDescription.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.DescriptionChanged")
                append("(")
                append("oldDescription=")
                append(oldDescription)
                append(", ")
                append("newDescription=")
                append(newDescription)
                append(")")
            }
        }
    }

    /**
     * The chat emoji status was changed.
     *
     * @property oldEmojiStatus Previous emoji status; may be null if none.
     * @property newEmojiStatus New emoji status; may be null if none.
     */
    public class EmojiStatusChanged public constructor(
        public val oldEmojiStatus: EmojiStatusDto?,
        public val newEmojiStatus: EmojiStatusDto?,
    ) : ChatEventActionDto() {
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
            other as EmojiStatusChanged
            if (other.oldEmojiStatus != oldEmojiStatus) {
                return false
            }
            return other.newEmojiStatus == newEmojiStatus
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldEmojiStatus.hashCode()
            hashCode = 31 * hashCode + newEmojiStatus.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.EmojiStatusChanged")
                append("(")
                append("oldEmojiStatus=")
                append(oldEmojiStatus)
                append(", ")
                append("newEmojiStatus=")
                append(newEmojiStatus)
                append(")")
            }
        }
    }

    /**
     * The linked chat of a supergroup was changed.
     *
     * @property oldLinkedChatId Previous supergroup linked chat identifier.
     * @property newLinkedChatId New supergroup linked chat identifier.
     */
    public class LinkedChatChanged public constructor(
        public val oldLinkedChatId: Long,
        public val newLinkedChatId: Long,
    ) : ChatEventActionDto() {
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
            other as LinkedChatChanged
            if (other.oldLinkedChatId != oldLinkedChatId) {
                return false
            }
            return other.newLinkedChatId == newLinkedChatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldLinkedChatId.hashCode()
            hashCode = 31 * hashCode + newLinkedChatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.LinkedChatChanged")
                append("(")
                append("oldLinkedChatId=")
                append(oldLinkedChatId)
                append(", ")
                append("newLinkedChatId=")
                append(newLinkedChatId)
                append(")")
            }
        }
    }

    /**
     * The supergroup location was changed.
     *
     * @property oldLocation Previous location; may be null.
     * @property newLocation New location; may be null.
     */
    public class LocationChanged public constructor(
        public val oldLocation: ChatLocationDto?,
        public val newLocation: ChatLocationDto?,
    ) : ChatEventActionDto() {
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
            other as LocationChanged
            if (other.oldLocation != oldLocation) {
                return false
            }
            return other.newLocation == newLocation
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldLocation.hashCode()
            hashCode = 31 * hashCode + newLocation.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.LocationChanged")
                append("(")
                append("oldLocation=")
                append(oldLocation)
                append(", ")
                append("newLocation=")
                append(newLocation)
                append(")")
            }
        }
    }

    /**
     * The message auto-delete timer was changed.
     *
     * @property oldMessageAutoDeleteTime Previous value of messageAutoDeleteTime.
     * @property newMessageAutoDeleteTime New value of messageAutoDeleteTime.
     */
    public class MessageAutoDeleteTimeChanged public constructor(
        public val oldMessageAutoDeleteTime: Int,
        public val newMessageAutoDeleteTime: Int,
    ) : ChatEventActionDto() {
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
            other as MessageAutoDeleteTimeChanged
            if (other.oldMessageAutoDeleteTime != oldMessageAutoDeleteTime) {
                return false
            }
            return other.newMessageAutoDeleteTime == newMessageAutoDeleteTime
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldMessageAutoDeleteTime.hashCode()
            hashCode = 31 * hashCode + newMessageAutoDeleteTime.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.MessageAutoDeleteTimeChanged")
                append("(")
                append("oldMessageAutoDeleteTime=")
                append(oldMessageAutoDeleteTime)
                append(", ")
                append("newMessageAutoDeleteTime=")
                append(newMessageAutoDeleteTime)
                append(")")
            }
        }
    }

    /**
     * The chat permissions were changed.
     *
     * @property oldPermissions Previous chat permissions.
     * @property newPermissions New chat permissions.
     */
    public class PermissionsChanged public constructor(
        public val oldPermissions: ChatPermissionsDto,
        public val newPermissions: ChatPermissionsDto,
    ) : ChatEventActionDto() {
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
            other as PermissionsChanged
            if (other.oldPermissions != oldPermissions) {
                return false
            }
            return other.newPermissions == newPermissions
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldPermissions.hashCode()
            hashCode = 31 * hashCode + newPermissions.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.PermissionsChanged")
                append("(")
                append("oldPermissions=")
                append(oldPermissions)
                append(", ")
                append("newPermissions=")
                append(newPermissions)
                append(")")
            }
        }
    }

    /**
     * The chat photo was changed.
     *
     * @property oldPhoto Previous chat photo value; may be null.
     * @property newPhoto New chat photo value; may be null.
     */
    public class PhotoChanged public constructor(
        public val oldPhoto: ChatPhotoDto?,
        public val newPhoto: ChatPhotoDto?,
    ) : ChatEventActionDto() {
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
            other as PhotoChanged
            if (other.oldPhoto != oldPhoto) {
                return false
            }
            return other.newPhoto == newPhoto
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldPhoto.hashCode()
            hashCode = 31 * hashCode + newPhoto.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.PhotoChanged")
                append("(")
                append("oldPhoto=")
                append(oldPhoto)
                append(", ")
                append("newPhoto=")
                append(newPhoto)
                append(")")
            }
        }
    }

    /**
     * The slowModeDelay setting of a supergroup was changed.
     *
     * @property oldSlowModeDelay Previous value of slowModeDelay, in seconds.
     * @property newSlowModeDelay New value of slowModeDelay, in seconds.
     */
    public class SlowModeDelayChanged public constructor(
        public val oldSlowModeDelay: Int,
        public val newSlowModeDelay: Int,
    ) : ChatEventActionDto() {
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
            other as SlowModeDelayChanged
            if (other.oldSlowModeDelay != oldSlowModeDelay) {
                return false
            }
            return other.newSlowModeDelay == newSlowModeDelay
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldSlowModeDelay.hashCode()
            hashCode = 31 * hashCode + newSlowModeDelay.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.SlowModeDelayChanged")
                append("(")
                append("oldSlowModeDelay=")
                append(oldSlowModeDelay)
                append(", ")
                append("newSlowModeDelay=")
                append(newSlowModeDelay)
                append(")")
            }
        }
    }

    /**
     * The supergroup sticker set was changed.
     *
     * @property oldStickerSetId Previous identifier of the chat sticker set; 0 if none.
     * @property newStickerSetId New identifier of the chat sticker set; 0 if none.
     */
    public class StickerSetChanged public constructor(
        public val oldStickerSetId: Long,
        public val newStickerSetId: Long,
    ) : ChatEventActionDto() {
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
            other as StickerSetChanged
            if (other.oldStickerSetId != oldStickerSetId) {
                return false
            }
            return other.newStickerSetId == newStickerSetId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldStickerSetId.hashCode()
            hashCode = 31 * hashCode + newStickerSetId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.StickerSetChanged")
                append("(")
                append("oldStickerSetId=")
                append(oldStickerSetId)
                append(", ")
                append("newStickerSetId=")
                append(newStickerSetId)
                append(")")
            }
        }
    }

    /**
     * The supergroup sticker set with allowed custom emoji was changed.
     *
     * @property oldStickerSetId Previous identifier of the chat sticker set; 0 if none.
     * @property newStickerSetId New identifier of the chat sticker set; 0 if none.
     */
    public class CustomEmojiStickerSetChanged public constructor(
        public val oldStickerSetId: Long,
        public val newStickerSetId: Long,
    ) : ChatEventActionDto() {
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
            other as CustomEmojiStickerSetChanged
            if (other.oldStickerSetId != oldStickerSetId) {
                return false
            }
            return other.newStickerSetId == newStickerSetId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldStickerSetId.hashCode()
            hashCode = 31 * hashCode + newStickerSetId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.CustomEmojiStickerSetChanged")
                append("(")
                append("oldStickerSetId=")
                append(oldStickerSetId)
                append(", ")
                append("newStickerSetId=")
                append(newStickerSetId)
                append(")")
            }
        }
    }

    /**
     * The chat title was changed.
     *
     * @property oldTitle Previous chat title.
     * @property newTitle New chat title.
     */
    public class TitleChanged public constructor(
        public val oldTitle: String,
        public val newTitle: String,
    ) : ChatEventActionDto() {
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
            other as TitleChanged
            if (other.oldTitle != oldTitle) {
                return false
            }
            return other.newTitle == newTitle
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldTitle.hashCode()
            hashCode = 31 * hashCode + newTitle.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.TitleChanged")
                append("(")
                append("oldTitle=")
                append(oldTitle)
                append(", ")
                append("newTitle=")
                append(newTitle)
                append(")")
            }
        }
    }

    /**
     * The chat editable username was changed.
     *
     * @property oldUsername Previous chat username.
     * @property newUsername New chat username.
     */
    public class UsernameChanged public constructor(
        public val oldUsername: String,
        public val newUsername: String,
    ) : ChatEventActionDto() {
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
            other as UsernameChanged
            if (other.oldUsername != oldUsername) {
                return false
            }
            return other.newUsername == newUsername
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldUsername.hashCode()
            hashCode = 31 * hashCode + newUsername.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.UsernameChanged")
                append("(")
                append("oldUsername=")
                append(oldUsername)
                append(", ")
                append("newUsername=")
                append(newUsername)
                append(")")
            }
        }
    }

    /**
     * The chat active usernames were changed.
     *
     * @property oldUsernames Previous list of active usernames.
     * @property newUsernames New list of active usernames.
     */
    public class ActiveUsernamesChanged public constructor(
        public val oldUsernames: Array<String>,
        public val newUsernames: Array<String>,
    ) : ChatEventActionDto() {
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
            other as ActiveUsernamesChanged
            val oldUsernamesEquals = other.oldUsernames.contentDeepEquals(oldUsernames)
            if (!oldUsernamesEquals) {
                return false
            }
            return other.newUsernames.contentDeepEquals(newUsernames)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldUsernames.contentDeepHashCode()
            hashCode = 31 * hashCode + newUsernames.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ActiveUsernamesChanged")
                append("(")
                append("oldUsernames=")
                oldUsernames
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("newUsernames=")
                newUsernames
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The chat accent color or background custom emoji were changed.
     *
     * @property oldAccentColorId Previous identifier of chat accent color.
     * @property oldBackgroundCustomEmojiId Previous identifier of the custom emoji; 0 if none.
     * @property newAccentColorId New identifier of chat accent color.
     * @property newBackgroundCustomEmojiId New identifier of the custom emoji; 0 if none.
     */
    public class AccentColorChanged public constructor(
        public val oldAccentColorId: Int,
        public val oldBackgroundCustomEmojiId: Long,
        public val newAccentColorId: Int,
        public val newBackgroundCustomEmojiId: Long,
    ) : ChatEventActionDto() {
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
            other as AccentColorChanged
            if (other.oldAccentColorId != oldAccentColorId) {
                return false
            }
            if (other.oldBackgroundCustomEmojiId != oldBackgroundCustomEmojiId) {
                return false
            }
            if (other.newAccentColorId != newAccentColorId) {
                return false
            }
            return other.newBackgroundCustomEmojiId == newBackgroundCustomEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldAccentColorId.hashCode()
            hashCode = 31 * hashCode + oldBackgroundCustomEmojiId.hashCode()
            hashCode = 31 * hashCode + newAccentColorId.hashCode()
            hashCode = 31 * hashCode + newBackgroundCustomEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.AccentColorChanged")
                append("(")
                append("oldAccentColorId=")
                append(oldAccentColorId)
                append(", ")
                append("oldBackgroundCustomEmojiId=")
                append(oldBackgroundCustomEmojiId)
                append(", ")
                append("newAccentColorId=")
                append(newAccentColorId)
                append(", ")
                append("newBackgroundCustomEmojiId=")
                append(newBackgroundCustomEmojiId)
                append(")")
            }
        }
    }

    /**
     * The chat's profile accent color or profile background custom emoji were changed.
     *
     * @property oldProfileAccentColorId Previous identifier of chat's profile accent color; -1 if none.
     * @property oldProfileBackgroundCustomEmojiId Previous identifier of the custom emoji; 0 if none.
     * @property newProfileAccentColorId New identifier of chat's profile accent color; -1 if none.
     * @property newProfileBackgroundCustomEmojiId New identifier of the custom emoji; 0 if none.
     */
    public class ProfileAccentColorChanged public constructor(
        public val oldProfileAccentColorId: Int,
        public val oldProfileBackgroundCustomEmojiId: Long,
        public val newProfileAccentColorId: Int,
        public val newProfileBackgroundCustomEmojiId: Long,
    ) : ChatEventActionDto() {
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
            other as ProfileAccentColorChanged
            if (other.oldProfileAccentColorId != oldProfileAccentColorId) {
                return false
            }
            if (other.oldProfileBackgroundCustomEmojiId != oldProfileBackgroundCustomEmojiId) {
                return false
            }
            if (other.newProfileAccentColorId != newProfileAccentColorId) {
                return false
            }
            return other.newProfileBackgroundCustomEmojiId == newProfileBackgroundCustomEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldProfileAccentColorId.hashCode()
            hashCode = 31 * hashCode + oldProfileBackgroundCustomEmojiId.hashCode()
            hashCode = 31 * hashCode + newProfileAccentColorId.hashCode()
            hashCode = 31 * hashCode + newProfileBackgroundCustomEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ProfileAccentColorChanged")
                append("(")
                append("oldProfileAccentColorId=")
                append(oldProfileAccentColorId)
                append(", ")
                append("oldProfileBackgroundCustomEmojiId=")
                append(oldProfileBackgroundCustomEmojiId)
                append(", ")
                append("newProfileAccentColorId=")
                append(newProfileAccentColorId)
                append(", ")
                append("newProfileBackgroundCustomEmojiId=")
                append(newProfileBackgroundCustomEmojiId)
                append(")")
            }
        }
    }

    /**
     * The hasProtectedContent setting of a channel was toggled.
     *
     * @property hasProtectedContent New value of hasProtectedContent.
     */
    public class HasProtectedContentToggled public constructor(
        public val hasProtectedContent: Boolean,
    ) : ChatEventActionDto() {
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
            other as HasProtectedContentToggled
            return other.hasProtectedContent == hasProtectedContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + hasProtectedContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.HasProtectedContentToggled")
                append("(")
                append("hasProtectedContent=")
                append(hasProtectedContent)
                append(")")
            }
        }
    }

    /**
     * The canInviteUsers permission of a supergroup chat was toggled.
     *
     * @property canInviteUsers New value of canInviteUsers permission.
     */
    public class InvitesToggled public constructor(
        public val canInviteUsers: Boolean,
    ) : ChatEventActionDto() {
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
            other as InvitesToggled
            return other.canInviteUsers == canInviteUsers
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + canInviteUsers.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.InvitesToggled")
                append("(")
                append("canInviteUsers=")
                append(canInviteUsers)
                append(")")
            }
        }
    }

    /**
     * The isAllHistoryAvailable setting of a supergroup was toggled.
     *
     * @property isAllHistoryAvailable New value of isAllHistoryAvailable.
     */
    public class IsAllHistoryAvailableToggled public constructor(
        public val isAllHistoryAvailable: Boolean,
    ) : ChatEventActionDto() {
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
            other as IsAllHistoryAvailableToggled
            return other.isAllHistoryAvailable == isAllHistoryAvailable
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isAllHistoryAvailable.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.IsAllHistoryAvailableToggled")
                append("(")
                append("isAllHistoryAvailable=")
                append(isAllHistoryAvailable)
                append(")")
            }
        }
    }

    /**
     * The hasAggressiveAntiSpamEnabled setting of a supergroup was toggled.
     *
     * @property hasAggressiveAntiSpamEnabled New value of hasAggressiveAntiSpamEnabled.
     */
    public class HasAggressiveAntiSpamEnabledToggled public constructor(
        public val hasAggressiveAntiSpamEnabled: Boolean,
    ) : ChatEventActionDto() {
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
            other as HasAggressiveAntiSpamEnabledToggled
            return other.hasAggressiveAntiSpamEnabled == hasAggressiveAntiSpamEnabled
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + hasAggressiveAntiSpamEnabled.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.HasAggressiveAntiSpamEnabledToggled")
                append("(")
                append("hasAggressiveAntiSpamEnabled=")
                append(hasAggressiveAntiSpamEnabled)
                append(")")
            }
        }
    }

    /**
     * The signMessages setting of a channel was toggled.
     *
     * @property signMessages New value of signMessages.
     */
    public class SignMessagesToggled public constructor(
        public val signMessages: Boolean,
    ) : ChatEventActionDto() {
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
            other as SignMessagesToggled
            return other.signMessages == signMessages
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + signMessages.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.SignMessagesToggled")
                append("(")
                append("signMessages=")
                append(signMessages)
                append(")")
            }
        }
    }

    /**
     * The showMessageSender setting of a channel was toggled.
     *
     * @property showMessageSender New value of showMessageSender.
     */
    public class ShowMessageSenderToggled public constructor(
        public val showMessageSender: Boolean,
    ) : ChatEventActionDto() {
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
            other as ShowMessageSenderToggled
            return other.showMessageSender == showMessageSender
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + showMessageSender.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ShowMessageSenderToggled")
                append("(")
                append("showMessageSender=")
                append(showMessageSender)
                append(")")
            }
        }
    }

    /**
     * A chat invite link was edited.
     *
     * @property oldInviteLink Previous information about the invite link.
     * @property newInviteLink New information about the invite link.
     */
    public class InviteLinkEdited public constructor(
        public val oldInviteLink: ChatInviteLinkDto,
        public val newInviteLink: ChatInviteLinkDto,
    ) : ChatEventActionDto() {
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
            other as InviteLinkEdited
            if (other.oldInviteLink != oldInviteLink) {
                return false
            }
            return other.newInviteLink == newInviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldInviteLink.hashCode()
            hashCode = 31 * hashCode + newInviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.InviteLinkEdited")
                append("(")
                append("oldInviteLink=")
                append(oldInviteLink)
                append(", ")
                append("newInviteLink=")
                append(newInviteLink)
                append(")")
            }
        }
    }

    /**
     * A chat invite link was revoked.
     *
     * @property inviteLink The invite link.
     */
    public class InviteLinkRevoked public constructor(
        public val inviteLink: ChatInviteLinkDto,
    ) : ChatEventActionDto() {
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
            other as InviteLinkRevoked
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.InviteLinkRevoked")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * A revoked chat invite link was deleted.
     *
     * @property inviteLink The invite link.
     */
    public class InviteLinkDeleted public constructor(
        public val inviteLink: ChatInviteLinkDto,
    ) : ChatEventActionDto() {
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
            other as InviteLinkDeleted
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.InviteLinkDeleted")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * A video chat was created.
     *
     * @property groupCallId Identifier of the video chat. The video chat can be received through the method getGroupCall.
     */
    public class VideoChatCreated public constructor(
        public val groupCallId: Int,
    ) : ChatEventActionDto() {
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
            other as VideoChatCreated
            return other.groupCallId == groupCallId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + groupCallId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.VideoChatCreated")
                append("(")
                append("groupCallId=")
                append(groupCallId)
                append(")")
            }
        }
    }

    /**
     * A video chat was ended.
     *
     * @property groupCallId Identifier of the video chat. The video chat can be received through the method getGroupCall.
     */
    public class VideoChatEnded public constructor(
        public val groupCallId: Int,
    ) : ChatEventActionDto() {
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
            other as VideoChatEnded
            return other.groupCallId == groupCallId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + groupCallId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.VideoChatEnded")
                append("(")
                append("groupCallId=")
                append(groupCallId)
                append(")")
            }
        }
    }

    /**
     * The muteNewParticipants setting of a video chat was toggled.
     *
     * @property muteNewParticipants New value of the muteNewParticipants setting.
     */
    public class VideoChatMuteNewParticipantsToggled public constructor(
        public val muteNewParticipants: Boolean,
    ) : ChatEventActionDto() {
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
            other as VideoChatMuteNewParticipantsToggled
            return other.muteNewParticipants == muteNewParticipants
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + muteNewParticipants.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.VideoChatMuteNewParticipantsToggled")
                append("(")
                append("muteNewParticipants=")
                append(muteNewParticipants)
                append(")")
            }
        }
    }

    /**
     * A video chat participant was muted or unmuted.
     *
     * @property participantId Identifier of the affected group call participant.
     * @property isMuted New value of isMuted.
     */
    public class VideoChatParticipantIsMutedToggled public constructor(
        public val participantId: MessageSenderDto,
        public val isMuted: Boolean,
    ) : ChatEventActionDto() {
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
            other as VideoChatParticipantIsMutedToggled
            if (other.participantId != participantId) {
                return false
            }
            return other.isMuted == isMuted
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + participantId.hashCode()
            hashCode = 31 * hashCode + isMuted.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.VideoChatParticipantIsMutedToggled")
                append("(")
                append("participantId=")
                append(participantId)
                append(", ")
                append("isMuted=")
                append(isMuted)
                append(")")
            }
        }
    }

    /**
     * A video chat participant volume level was changed.
     *
     * @property participantId Identifier of the affected group call participant.
     * @property volumeLevel New value of volumeLevel; 1-20000 in hundreds of percents.
     */
    public class VideoChatParticipantVolumeLevelChanged public constructor(
        public val participantId: MessageSenderDto,
        public val volumeLevel: Int,
    ) : ChatEventActionDto() {
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
            other as VideoChatParticipantVolumeLevelChanged
            if (other.participantId != participantId) {
                return false
            }
            return other.volumeLevel == volumeLevel
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + participantId.hashCode()
            hashCode = 31 * hashCode + volumeLevel.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.VideoChatParticipantVolumeLevelChanged")
                append("(")
                append("participantId=")
                append(participantId)
                append(", ")
                append("volumeLevel=")
                append(volumeLevel)
                append(")")
            }
        }
    }

    /**
     * The isForum setting of a channel was toggled.
     *
     * @property isForum New value of isForum.
     */
    public class IsForumToggled public constructor(
        public val isForum: Boolean,
    ) : ChatEventActionDto() {
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
            other as IsForumToggled
            return other.isForum == isForum
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isForum.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.IsForumToggled")
                append("(")
                append("isForum=")
                append(isForum)
                append(")")
            }
        }
    }

    /**
     * A new forum topic was created.
     *
     * @property topicInfo Information about the topic.
     */
    public class ForumTopicCreated public constructor(
        public val topicInfo: ForumTopicInfoDto,
    ) : ChatEventActionDto() {
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
            other as ForumTopicCreated
            return other.topicInfo == topicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + topicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicCreated")
                append("(")
                append("topicInfo=")
                append(topicInfo)
                append(")")
            }
        }
    }

    /**
     * A forum topic was edited.
     *
     * @property oldTopicInfo Old information about the topic.
     * @property newTopicInfo New information about the topic.
     */
    public class ForumTopicEdited public constructor(
        public val oldTopicInfo: ForumTopicInfoDto,
        public val newTopicInfo: ForumTopicInfoDto,
    ) : ChatEventActionDto() {
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
            other as ForumTopicEdited
            if (other.oldTopicInfo != oldTopicInfo) {
                return false
            }
            return other.newTopicInfo == newTopicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldTopicInfo.hashCode()
            hashCode = 31 * hashCode + newTopicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicEdited")
                append("(")
                append("oldTopicInfo=")
                append(oldTopicInfo)
                append(", ")
                append("newTopicInfo=")
                append(newTopicInfo)
                append(")")
            }
        }
    }

    /**
     * A forum topic was closed or reopened.
     *
     * @property topicInfo New information about the topic.
     */
    public class ForumTopicToggleIsClosed public constructor(
        public val topicInfo: ForumTopicInfoDto,
    ) : ChatEventActionDto() {
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
            other as ForumTopicToggleIsClosed
            return other.topicInfo == topicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + topicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicToggleIsClosed")
                append("(")
                append("topicInfo=")
                append(topicInfo)
                append(")")
            }
        }
    }

    /**
     * The General forum topic was hidden or unhidden.
     *
     * @property topicInfo New information about the topic.
     */
    public class ForumTopicToggleIsHidden public constructor(
        public val topicInfo: ForumTopicInfoDto,
    ) : ChatEventActionDto() {
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
            other as ForumTopicToggleIsHidden
            return other.topicInfo == topicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + topicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicToggleIsHidden")
                append("(")
                append("topicInfo=")
                append(topicInfo)
                append(")")
            }
        }
    }

    /**
     * A forum topic was deleted.
     *
     * @property topicInfo Information about the topic.
     */
    public class ForumTopicDeleted public constructor(
        public val topicInfo: ForumTopicInfoDto,
    ) : ChatEventActionDto() {
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
            other as ForumTopicDeleted
            return other.topicInfo == topicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + topicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicDeleted")
                append("(")
                append("topicInfo=")
                append(topicInfo)
                append(")")
            }
        }
    }

    /**
     * A pinned forum topic was changed.
     *
     * @property oldTopicInfo Information about the old pinned topic; may be null.
     * @property newTopicInfo Information about the new pinned topic; may be null.
     */
    public class ForumTopicPinned public constructor(
        public val oldTopicInfo: ForumTopicInfoDto?,
        public val newTopicInfo: ForumTopicInfoDto?,
    ) : ChatEventActionDto() {
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
            other as ForumTopicPinned
            if (other.oldTopicInfo != oldTopicInfo) {
                return false
            }
            return other.newTopicInfo == newTopicInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldTopicInfo.hashCode()
            hashCode = 31 * hashCode + newTopicInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatEventActionDto.ForumTopicPinned")
                append("(")
                append("oldTopicInfo=")
                append(oldTopicInfo)
                append(", ")
                append("newTopicInfo=")
                append(newTopicInfo)
                append(")")
            }
        }
    }
}
