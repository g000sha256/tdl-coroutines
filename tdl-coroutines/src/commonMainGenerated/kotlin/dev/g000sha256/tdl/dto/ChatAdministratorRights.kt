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
 * Describes rights of the administrator.
 *
 * @property canManageChat True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report supergroup spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other privilege; applicable to supergroups and channels only.
 * @property canChangeInfo True, if the administrator can change the chat title, photo, and other settings.
 * @property canPostMessages True, if the administrator can create channel posts, approve suggested channel posts, or view channel statistics; applicable to channels only.
 * @property canEditMessages True, if the administrator can edit messages of other users and pin messages; applicable to channels only.
 * @property canDeleteMessages True, if the administrator can delete messages of other users.
 * @property canInviteUsers True, if the administrator can invite new users to the chat.
 * @property canRestrictMembers True, if the administrator can restrict, ban, or unban chat members or view supergroup statistics.
 * @property canPinMessages True, if the administrator can pin messages; applicable to basic groups and supergroups only.
 * @property canManageTopics True, if the administrator can create, rename, close, reopen, hide, and unhide forum topics; applicable to forum supergroups only.
 * @property canPromoteMembers True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that were directly or indirectly promoted by them.
 * @property canManageVideoChats True, if the administrator can manage video chats.
 * @property canPostStories True, if the administrator can create new chat stories, or edit and delete posted stories; applicable to supergroups and channels only.
 * @property canEditStories True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access story archive; applicable to supergroups and channels only.
 * @property canDeleteStories True, if the administrator can delete stories posted by other users; applicable to supergroups and channels only.
 * @property canManageDirectMessages True, if the administrator can answer to channel direct messages; applicable to channels only.
 * @property isAnonymous True, if the administrator isn't shown in the chat member list and sends messages anonymously; applicable to supergroups only.
 */
public class ChatAdministratorRights public constructor(
    public val canManageChat: Boolean,
    public val canChangeInfo: Boolean,
    public val canPostMessages: Boolean,
    public val canEditMessages: Boolean,
    public val canDeleteMessages: Boolean,
    public val canInviteUsers: Boolean,
    public val canRestrictMembers: Boolean,
    public val canPinMessages: Boolean,
    public val canManageTopics: Boolean,
    public val canPromoteMembers: Boolean,
    public val canManageVideoChats: Boolean,
    public val canPostStories: Boolean,
    public val canEditStories: Boolean,
    public val canDeleteStories: Boolean,
    public val canManageDirectMessages: Boolean,
    public val isAnonymous: Boolean,
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
        other as ChatAdministratorRights
        if (other.canManageChat != canManageChat) {
            return false
        }
        if (other.canChangeInfo != canChangeInfo) {
            return false
        }
        if (other.canPostMessages != canPostMessages) {
            return false
        }
        if (other.canEditMessages != canEditMessages) {
            return false
        }
        if (other.canDeleteMessages != canDeleteMessages) {
            return false
        }
        if (other.canInviteUsers != canInviteUsers) {
            return false
        }
        if (other.canRestrictMembers != canRestrictMembers) {
            return false
        }
        if (other.canPinMessages != canPinMessages) {
            return false
        }
        if (other.canManageTopics != canManageTopics) {
            return false
        }
        if (other.canPromoteMembers != canPromoteMembers) {
            return false
        }
        if (other.canManageVideoChats != canManageVideoChats) {
            return false
        }
        if (other.canPostStories != canPostStories) {
            return false
        }
        if (other.canEditStories != canEditStories) {
            return false
        }
        if (other.canDeleteStories != canDeleteStories) {
            return false
        }
        if (other.canManageDirectMessages != canManageDirectMessages) {
            return false
        }
        return other.isAnonymous == isAnonymous
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canManageChat.hashCode()
        hashCode = 31 * hashCode + canChangeInfo.hashCode()
        hashCode = 31 * hashCode + canPostMessages.hashCode()
        hashCode = 31 * hashCode + canEditMessages.hashCode()
        hashCode = 31 * hashCode + canDeleteMessages.hashCode()
        hashCode = 31 * hashCode + canInviteUsers.hashCode()
        hashCode = 31 * hashCode + canRestrictMembers.hashCode()
        hashCode = 31 * hashCode + canPinMessages.hashCode()
        hashCode = 31 * hashCode + canManageTopics.hashCode()
        hashCode = 31 * hashCode + canPromoteMembers.hashCode()
        hashCode = 31 * hashCode + canManageVideoChats.hashCode()
        hashCode = 31 * hashCode + canPostStories.hashCode()
        hashCode = 31 * hashCode + canEditStories.hashCode()
        hashCode = 31 * hashCode + canDeleteStories.hashCode()
        hashCode = 31 * hashCode + canManageDirectMessages.hashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatAdministratorRights")
            append("(")
            append("canManageChat=")
            append(canManageChat)
            append(", ")
            append("canChangeInfo=")
            append(canChangeInfo)
            append(", ")
            append("canPostMessages=")
            append(canPostMessages)
            append(", ")
            append("canEditMessages=")
            append(canEditMessages)
            append(", ")
            append("canDeleteMessages=")
            append(canDeleteMessages)
            append(", ")
            append("canInviteUsers=")
            append(canInviteUsers)
            append(", ")
            append("canRestrictMembers=")
            append(canRestrictMembers)
            append(", ")
            append("canPinMessages=")
            append(canPinMessages)
            append(", ")
            append("canManageTopics=")
            append(canManageTopics)
            append(", ")
            append("canPromoteMembers=")
            append(canPromoteMembers)
            append(", ")
            append("canManageVideoChats=")
            append(canManageVideoChats)
            append(", ")
            append("canPostStories=")
            append(canPostStories)
            append(", ")
            append("canEditStories=")
            append(canEditStories)
            append(", ")
            append("canDeleteStories=")
            append(canDeleteStories)
            append(", ")
            append("canManageDirectMessages=")
            append(canManageDirectMessages)
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(")")
        }
    }
}
