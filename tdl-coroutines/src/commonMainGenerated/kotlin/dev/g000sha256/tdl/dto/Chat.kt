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
 * A chat. (Can be a private chat, basic group, supergroup, or secret chat.)
 *
 * @property id Chat unique identifier.
 * @property type Type of the chat.
 * @property title Chat title.
 * @property photo Chat photo; may be null.
 * @property accentColorId Identifier of the accent color for message sender name, and backgrounds of chat photo, reply header, and link preview.
 * @property backgroundCustomEmojiId Identifier of a custom emoji to be shown on the reply header and link preview background for messages sent by the chat; 0 if none.
 * @property profileAccentColorId Identifier of the profile accent color for the chat's profile; -1 if none.
 * @property profileBackgroundCustomEmojiId Identifier of a custom emoji to be shown on the background of the chat's profile; 0 if none.
 * @property permissions Actions that non-administrator chat members are allowed to take in the chat.
 * @property lastMessage Last message in the chat; may be null if none or unknown.
 * @property positions Positions of the chat in chat lists.
 * @property chatLists Chat lists to which the chat belongs. A chat can have a non-zero position in a chat list even if it doesn't belong to the chat list and have no position in a chat list even if it belongs to the chat list.
 * @property messageSenderId Identifier of a user or chat that is selected to send messages in the chat; may be null if the user can't change message sender.
 * @property blockList Block list to which the chat is added; may be null if none.
 * @property hasProtectedContent True, if chat content can't be saved locally, forwarded, or copied.
 * @property isTranslatable True, if translation of all messages in the chat must be suggested to the user.
 * @property isMarkedAsUnread True, if the chat is marked as unread.
 * @property viewAsTopics True, if the chat is a forum supergroup that must be shown in the &quot;View as topics&quot; mode, or Saved Messages chat that must be shown in the &quot;View as chats&quot;.
 * @property hasScheduledMessages True, if the chat has scheduled messages.
 * @property canBeDeletedOnlyForSelf True, if the chat messages can be deleted only for the current user while other users will continue to see the messages.
 * @property canBeDeletedForAllUsers True, if the chat messages can be deleted for all users.
 * @property canBeReported True, if the chat can be reported to Telegram moderators through reportChat or reportChatPhoto.
 * @property defaultDisableNotification Default value of the disableNotification parameter, used when a message is sent to the chat.
 * @property unreadCount Number of unread messages in the chat.
 * @property lastReadInboxMessageId Identifier of the last read incoming message.
 * @property lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @property unreadMentionCount Number of unread messages with a mention/reply in the chat.
 * @property unreadReactionCount Number of messages with unread reactions in the chat.
 * @property notificationSettings Notification settings for the chat.
 * @property availableReactions Types of reaction, available in the chat.
 * @property messageAutoDeleteTime Current message auto-delete or self-destruct timer setting for the chat, in seconds; 0 if disabled. Self-destruct timer in secret chats starts after the message or its content is viewed. Auto-delete timer in other chats starts from the send date.
 * @property emojiStatus Emoji status to be shown along with chat title; may be null.
 * @property background Background set for the chat; may be null if none.
 * @property theme Theme set for the chat; may be null if none.
 * @property actionBar Information about actions which must be possible to do through the chat action bar; may be null if none.
 * @property businessBotManageBar Information about bar for managing a business bot in the chat; may be null if none.
 * @property videoChat Information about video chat of the chat.
 * @property pendingJoinRequests Information about pending join requests; may be null if none.
 * @property replyMarkupMessageId Identifier of the message from which reply markup needs to be used; 0 if there is no default custom reply markup in the chat.
 * @property draftMessage A draft of a message in the chat; may be null if none.
 * @property clientData Application-specific data associated with the chat. (For example, the chat scroll position or local chat notification settings can be stored here.) Persistent if the message database is used.
 */
public class Chat public constructor(
    public val id: Long,
    public val type: ChatType,
    public val title: String,
    public val photo: ChatPhotoInfo?,
    public val accentColorId: Int,
    public val backgroundCustomEmojiId: Long,
    public val profileAccentColorId: Int,
    public val profileBackgroundCustomEmojiId: Long,
    public val permissions: ChatPermissions,
    public val lastMessage: Message?,
    public val positions: Array<ChatPosition>,
    public val chatLists: Array<ChatList>,
    public val messageSenderId: MessageSender?,
    public val blockList: BlockList?,
    public val hasProtectedContent: Boolean,
    public val isTranslatable: Boolean,
    public val isMarkedAsUnread: Boolean,
    public val viewAsTopics: Boolean,
    public val hasScheduledMessages: Boolean,
    public val canBeDeletedOnlyForSelf: Boolean,
    public val canBeDeletedForAllUsers: Boolean,
    public val canBeReported: Boolean,
    public val defaultDisableNotification: Boolean,
    public val unreadCount: Int,
    public val lastReadInboxMessageId: Long,
    public val lastReadOutboxMessageId: Long,
    public val unreadMentionCount: Int,
    public val unreadReactionCount: Int,
    public val notificationSettings: ChatNotificationSettings,
    public val availableReactions: ChatAvailableReactions,
    public val messageAutoDeleteTime: Int,
    public val emojiStatus: EmojiStatus?,
    public val background: ChatBackground?,
    public val theme: ChatTheme?,
    public val actionBar: ChatActionBar?,
    public val businessBotManageBar: BusinessBotManageBar?,
    public val videoChat: VideoChat,
    public val pendingJoinRequests: ChatJoinRequestsInfo?,
    public val replyMarkupMessageId: Long,
    public val draftMessage: DraftMessage?,
    public val clientData: String,
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
        other as Chat
        if (other.id != id) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.photo != photo) {
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
        if (other.permissions != permissions) {
            return false
        }
        if (other.lastMessage != lastMessage) {
            return false
        }
        val positionsEquals = other.positions.contentDeepEquals(positions)
        if (!positionsEquals) {
            return false
        }
        val chatListsEquals = other.chatLists.contentDeepEquals(chatLists)
        if (!chatListsEquals) {
            return false
        }
        if (other.messageSenderId != messageSenderId) {
            return false
        }
        if (other.blockList != blockList) {
            return false
        }
        if (other.hasProtectedContent != hasProtectedContent) {
            return false
        }
        if (other.isTranslatable != isTranslatable) {
            return false
        }
        if (other.isMarkedAsUnread != isMarkedAsUnread) {
            return false
        }
        if (other.viewAsTopics != viewAsTopics) {
            return false
        }
        if (other.hasScheduledMessages != hasScheduledMessages) {
            return false
        }
        if (other.canBeDeletedOnlyForSelf != canBeDeletedOnlyForSelf) {
            return false
        }
        if (other.canBeDeletedForAllUsers != canBeDeletedForAllUsers) {
            return false
        }
        if (other.canBeReported != canBeReported) {
            return false
        }
        if (other.defaultDisableNotification != defaultDisableNotification) {
            return false
        }
        if (other.unreadCount != unreadCount) {
            return false
        }
        if (other.lastReadInboxMessageId != lastReadInboxMessageId) {
            return false
        }
        if (other.lastReadOutboxMessageId != lastReadOutboxMessageId) {
            return false
        }
        if (other.unreadMentionCount != unreadMentionCount) {
            return false
        }
        if (other.unreadReactionCount != unreadReactionCount) {
            return false
        }
        if (other.notificationSettings != notificationSettings) {
            return false
        }
        if (other.availableReactions != availableReactions) {
            return false
        }
        if (other.messageAutoDeleteTime != messageAutoDeleteTime) {
            return false
        }
        if (other.emojiStatus != emojiStatus) {
            return false
        }
        if (other.background != background) {
            return false
        }
        if (other.theme != theme) {
            return false
        }
        if (other.actionBar != actionBar) {
            return false
        }
        if (other.businessBotManageBar != businessBotManageBar) {
            return false
        }
        if (other.videoChat != videoChat) {
            return false
        }
        if (other.pendingJoinRequests != pendingJoinRequests) {
            return false
        }
        if (other.replyMarkupMessageId != replyMarkupMessageId) {
            return false
        }
        if (other.draftMessage != draftMessage) {
            return false
        }
        return other.clientData == clientData
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + backgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + profileAccentColorId.hashCode()
        hashCode = 31 * hashCode + profileBackgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + permissions.hashCode()
        hashCode = 31 * hashCode + lastMessage.hashCode()
        hashCode = 31 * hashCode + positions.contentDeepHashCode()
        hashCode = 31 * hashCode + chatLists.contentDeepHashCode()
        hashCode = 31 * hashCode + messageSenderId.hashCode()
        hashCode = 31 * hashCode + blockList.hashCode()
        hashCode = 31 * hashCode + hasProtectedContent.hashCode()
        hashCode = 31 * hashCode + isTranslatable.hashCode()
        hashCode = 31 * hashCode + isMarkedAsUnread.hashCode()
        hashCode = 31 * hashCode + viewAsTopics.hashCode()
        hashCode = 31 * hashCode + hasScheduledMessages.hashCode()
        hashCode = 31 * hashCode + canBeDeletedOnlyForSelf.hashCode()
        hashCode = 31 * hashCode + canBeDeletedForAllUsers.hashCode()
        hashCode = 31 * hashCode + canBeReported.hashCode()
        hashCode = 31 * hashCode + defaultDisableNotification.hashCode()
        hashCode = 31 * hashCode + unreadCount.hashCode()
        hashCode = 31 * hashCode + lastReadInboxMessageId.hashCode()
        hashCode = 31 * hashCode + lastReadOutboxMessageId.hashCode()
        hashCode = 31 * hashCode + unreadMentionCount.hashCode()
        hashCode = 31 * hashCode + unreadReactionCount.hashCode()
        hashCode = 31 * hashCode + notificationSettings.hashCode()
        hashCode = 31 * hashCode + availableReactions.hashCode()
        hashCode = 31 * hashCode + messageAutoDeleteTime.hashCode()
        hashCode = 31 * hashCode + emojiStatus.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        hashCode = 31 * hashCode + theme.hashCode()
        hashCode = 31 * hashCode + actionBar.hashCode()
        hashCode = 31 * hashCode + businessBotManageBar.hashCode()
        hashCode = 31 * hashCode + videoChat.hashCode()
        hashCode = 31 * hashCode + pendingJoinRequests.hashCode()
        hashCode = 31 * hashCode + replyMarkupMessageId.hashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        hashCode = 31 * hashCode + clientData.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Chat")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("photo=")
            append(photo)
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
            append("permissions=")
            append(permissions)
            append(", ")
            append("lastMessage=")
            append(lastMessage)
            append(", ")
            append("positions=")
            positions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("chatLists=")
            chatLists
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("messageSenderId=")
            append(messageSenderId)
            append(", ")
            append("blockList=")
            append(blockList)
            append(", ")
            append("hasProtectedContent=")
            append(hasProtectedContent)
            append(", ")
            append("isTranslatable=")
            append(isTranslatable)
            append(", ")
            append("isMarkedAsUnread=")
            append(isMarkedAsUnread)
            append(", ")
            append("viewAsTopics=")
            append(viewAsTopics)
            append(", ")
            append("hasScheduledMessages=")
            append(hasScheduledMessages)
            append(", ")
            append("canBeDeletedOnlyForSelf=")
            append(canBeDeletedOnlyForSelf)
            append(", ")
            append("canBeDeletedForAllUsers=")
            append(canBeDeletedForAllUsers)
            append(", ")
            append("canBeReported=")
            append(canBeReported)
            append(", ")
            append("defaultDisableNotification=")
            append(defaultDisableNotification)
            append(", ")
            append("unreadCount=")
            append(unreadCount)
            append(", ")
            append("lastReadInboxMessageId=")
            append(lastReadInboxMessageId)
            append(", ")
            append("lastReadOutboxMessageId=")
            append(lastReadOutboxMessageId)
            append(", ")
            append("unreadMentionCount=")
            append(unreadMentionCount)
            append(", ")
            append("unreadReactionCount=")
            append(unreadReactionCount)
            append(", ")
            append("notificationSettings=")
            append(notificationSettings)
            append(", ")
            append("availableReactions=")
            append(availableReactions)
            append(", ")
            append("messageAutoDeleteTime=")
            append(messageAutoDeleteTime)
            append(", ")
            append("emojiStatus=")
            append(emojiStatus)
            append(", ")
            append("background=")
            append(background)
            append(", ")
            append("theme=")
            append(theme)
            append(", ")
            append("actionBar=")
            append(actionBar)
            append(", ")
            append("businessBotManageBar=")
            append(businessBotManageBar)
            append(", ")
            append("videoChat=")
            append(videoChat)
            append(", ")
            append("pendingJoinRequests=")
            append(pendingJoinRequests)
            append(", ")
            append("replyMarkupMessageId=")
            append(replyMarkupMessageId)
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(", ")
            append("clientData=")
            append(clientData)
            append(")")
        }
    }
}
