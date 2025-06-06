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
 * Contains full information about a basic group.
 *
 * @property photo Chat photo; may be null if empty or unknown. If non-null, then it is the same photo as in chat.photo.
 * @property description Group description. Updated only after the basic group is opened.
 * @property creatorUserId User identifier of the creator of the group; 0 if unknown.
 * @property members Group members.
 * @property canHideMembers True, if non-administrators and non-bots can be hidden in responses to getSupergroupMembers and searchChatMembers for non-administrators after upgrading the basic group to a supergroup.
 * @property canToggleAggressiveAntiSpam True, if aggressive anti-spam checks can be enabled or disabled in the supergroup after upgrading the basic group to a supergroup.
 * @property inviteLink Primary invite link for this group; may be null. For chat administrators with canInviteUsers right only. Updated only after the basic group is opened.
 * @property botCommands List of commands of bots in the group.
 */
public class BasicGroupFullInfo public constructor(
    public val photo: ChatPhoto?,
    public val description: String,
    public val creatorUserId: Long,
    public val members: Array<ChatMember>,
    public val canHideMembers: Boolean,
    public val canToggleAggressiveAntiSpam: Boolean,
    public val inviteLink: ChatInviteLink?,
    public val botCommands: Array<BotCommands>,
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
        other as BasicGroupFullInfo
        if (other.photo != photo) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.creatorUserId != creatorUserId) {
            return false
        }
        val membersEquals = other.members.contentDeepEquals(members)
        if (!membersEquals) {
            return false
        }
        if (other.canHideMembers != canHideMembers) {
            return false
        }
        if (other.canToggleAggressiveAntiSpam != canToggleAggressiveAntiSpam) {
            return false
        }
        if (other.inviteLink != inviteLink) {
            return false
        }
        return other.botCommands.contentDeepEquals(botCommands)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + creatorUserId.hashCode()
        hashCode = 31 * hashCode + members.contentDeepHashCode()
        hashCode = 31 * hashCode + canHideMembers.hashCode()
        hashCode = 31 * hashCode + canToggleAggressiveAntiSpam.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        hashCode = 31 * hashCode + botCommands.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BasicGroupFullInfo")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("creatorUserId=")
            append(creatorUserId)
            append(", ")
            append("members=")
            members
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("canHideMembers=")
            append(canHideMembers)
            append(", ")
            append("canToggleAggressiveAntiSpam=")
            append(canToggleAggressiveAntiSpam)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(", ")
            append("botCommands=")
            botCommands
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
