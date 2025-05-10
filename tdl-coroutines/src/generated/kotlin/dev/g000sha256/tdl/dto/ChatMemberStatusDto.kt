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
 * This class is an abstract base class.
 * Provides information about the status of a member in a chat.
 */
public sealed class ChatMemberStatusDto private constructor() {
    /**
     * The user is the owner of the chat and has all the administrator privileges.
     *
     * @property customTitle A custom title of the owner; 0-16 characters without emoji; applicable to supergroups only.
     * @property isAnonymous True, if the creator isn't shown in the chat member list and sends messages anonymously; applicable to supergroups only.
     * @property isMember True, if the user is a member of the chat.
     */
    public class Creator public constructor(
        public val customTitle: String,
        public val isAnonymous: Boolean,
        public val isMember: Boolean,
    ) : ChatMemberStatusDto() {
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
            other as Creator
            if (other.customTitle != customTitle) {
                return false
            }
            if (other.isAnonymous != isAnonymous) {
                return false
            }
            return other.isMember == isMember
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + customTitle.hashCode()
            hashCode = 31 * hashCode + isAnonymous.hashCode()
            hashCode = 31 * hashCode + isMember.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMemberStatusDto.Creator")
                append("(")
                append("customTitle=")
                append(customTitle)
                append(", ")
                append("isAnonymous=")
                append(isAnonymous)
                append(", ")
                append("isMember=")
                append(isMember)
                append(")")
            }
        }
    }

    /**
     * The user is a member of the chat and has some additional privileges. In basic groups, administrators can edit and delete messages sent by others, add new members, ban unprivileged members, and manage video chats. In supergroups and channels, there are more detailed options for administrator privileges.
     *
     * @property customTitle A custom title of the administrator; 0-16 characters without emoji; applicable to supergroups only.
     * @property canBeEdited True, if the current user can edit the administrator privileges for the called user.
     * @property rights Rights of the administrator.
     */
    public class Administrator public constructor(
        public val customTitle: String,
        public val canBeEdited: Boolean,
        public val rights: ChatAdministratorRightsDto,
    ) : ChatMemberStatusDto() {
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
            other as Administrator
            if (other.customTitle != customTitle) {
                return false
            }
            if (other.canBeEdited != canBeEdited) {
                return false
            }
            return other.rights == rights
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + customTitle.hashCode()
            hashCode = 31 * hashCode + canBeEdited.hashCode()
            hashCode = 31 * hashCode + rights.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMemberStatusDto.Administrator")
                append("(")
                append("customTitle=")
                append(customTitle)
                append(", ")
                append("canBeEdited=")
                append(canBeEdited)
                append(", ")
                append("rights=")
                append(rights)
                append(")")
            }
        }
    }

    /**
     * The user is a member of the chat, without any additional privileges or restrictions.
     *
     * @property memberUntilDate Point in time (Unix timestamp) when the user will be removed from the chat because of the expired subscription; 0 if never. Ignored in setChatMemberStatus.
     */
    public class Member public constructor(
        public val memberUntilDate: Int,
    ) : ChatMemberStatusDto() {
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
            other as Member
            return other.memberUntilDate == memberUntilDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + memberUntilDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMemberStatusDto.Member")
                append("(")
                append("memberUntilDate=")
                append(memberUntilDate)
                append(")")
            }
        }
    }

    /**
     * The user is under certain restrictions in the chat. Not supported in basic groups and channels.
     *
     * @property isMember True, if the user is a member of the chat.
     * @property restrictedUntilDate Point in time (Unix timestamp) when restrictions will be lifted from the user; 0 if never. If the user is restricted for more than 366 days or for less than 30 seconds from the current time, the user is considered to be restricted forever.
     * @property permissions User permissions in the chat.
     */
    public class Restricted public constructor(
        public val isMember: Boolean,
        public val restrictedUntilDate: Int,
        public val permissions: ChatPermissionsDto,
    ) : ChatMemberStatusDto() {
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
            other as Restricted
            if (other.isMember != isMember) {
                return false
            }
            if (other.restrictedUntilDate != restrictedUntilDate) {
                return false
            }
            return other.permissions == permissions
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isMember.hashCode()
            hashCode = 31 * hashCode + restrictedUntilDate.hashCode()
            hashCode = 31 * hashCode + permissions.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMemberStatusDto.Restricted")
                append("(")
                append("isMember=")
                append(isMember)
                append(", ")
                append("restrictedUntilDate=")
                append(restrictedUntilDate)
                append(", ")
                append("permissions=")
                append(permissions)
                append(")")
            }
        }
    }

    /**
     * The user or the chat is not a chat member.
     */
    public class Left public constructor() : ChatMemberStatusDto() {
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
            return "ChatMemberStatusDto.Left()"
        }
    }

    /**
     * The user or the chat was banned (and hence is not a member of the chat). Implies the user can't return to the chat, view messages, or be used as a participant identifier to join a video chat of the chat.
     *
     * @property bannedUntilDate Point in time (Unix timestamp) when the user will be unbanned; 0 if never. If the user is banned for more than 366 days or for less than 30 seconds from the current time, the user is considered to be banned forever. Always 0 in basic groups.
     */
    public class Banned public constructor(
        public val bannedUntilDate: Int,
    ) : ChatMemberStatusDto() {
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
            other as Banned
            return other.bannedUntilDate == bannedUntilDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + bannedUntilDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMemberStatusDto.Banned")
                append("(")
                append("bannedUntilDate=")
                append(bannedUntilDate)
                append(")")
            }
        }
    }
}
