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
 * Describes actions which must be possible to do through a chat action bar.
 */
public sealed class ChatActionBarDto private constructor() {
    /**
     * The chat can be reported as spam using the method reportChat with an empty optionId and messageIds. If the chat is a private chat with a user with an emoji status, then a notice about emoji status usage must be shown.
     *
     * @property canUnarchive If true, the chat was automatically archived and can be moved back to the main chat list using addChatToList simultaneously with setting chat notification settings to default using setChatNotificationSettings.
     */
    public class ReportSpam public constructor(
        public val canUnarchive: Boolean,
    ) : ChatActionBarDto() {
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
            other as ReportSpam
            return other.canUnarchive == canUnarchive
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + canUnarchive.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionBarDto.ReportSpam")
                append("(")
                append("canUnarchive=")
                append(canUnarchive)
                append(")")
            }
        }
    }

    /**
     * The chat is a recently created group chat to which new members can be invited.
     */
    public class InviteMembers public constructor() : ChatActionBarDto() {
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
            return "ChatActionBarDto.InviteMembers()"
        }
    }

    /**
     * The chat is a private or secret chat, which can be reported using the method reportChat, or the other user can be blocked using the method setMessageSenderBlockList, or the other user can be added to the contact list using the method addContact. If the chat is a private chat with a user with an emoji status, then a notice about emoji status usage must be shown.
     *
     * @property canUnarchive If true, the chat was automatically archived and can be moved back to the main chat list using addChatToList simultaneously with setting chat notification settings to default using setChatNotificationSettings.
     * @property accountInfo Basic information about the other user in the chat; may be null if unknown.
     */
    public class ReportAddBlock public constructor(
        public val canUnarchive: Boolean,
        public val accountInfo: AccountInfoDto?,
    ) : ChatActionBarDto() {
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
            other as ReportAddBlock
            if (other.canUnarchive != canUnarchive) {
                return false
            }
            return other.accountInfo == accountInfo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + canUnarchive.hashCode()
            hashCode = 31 * hashCode + accountInfo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionBarDto.ReportAddBlock")
                append("(")
                append("canUnarchive=")
                append(canUnarchive)
                append(", ")
                append("accountInfo=")
                append(accountInfo)
                append(")")
            }
        }
    }

    /**
     * The chat is a private or secret chat and the other user can be added to the contact list using the method addContact.
     */
    public class AddContact public constructor() : ChatActionBarDto() {
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
            return "ChatActionBarDto.AddContact()"
        }
    }

    /**
     * The chat is a private or secret chat with a mutual contact and the user's phone number can be shared with the other user using the method sharePhoneNumber.
     */
    public class SharePhoneNumber public constructor() : ChatActionBarDto() {
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
            return "ChatActionBarDto.SharePhoneNumber()"
        }
    }

    /**
     * The chat is a private chat with an administrator of a chat to which the user sent join request.
     *
     * @property title Title of the chat to which the join request was sent.
     * @property isChannel True, if the join request was sent to a channel chat.
     * @property requestDate Point in time (Unix timestamp) when the join request was sent.
     */
    public class JoinRequest public constructor(
        public val title: String,
        public val isChannel: Boolean,
        public val requestDate: Int,
    ) : ChatActionBarDto() {
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
            other as JoinRequest
            if (other.title != title) {
                return false
            }
            if (other.isChannel != isChannel) {
                return false
            }
            return other.requestDate == requestDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + isChannel.hashCode()
            hashCode = 31 * hashCode + requestDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionBarDto.JoinRequest")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("isChannel=")
                append(isChannel)
                append(", ")
                append("requestDate=")
                append(requestDate)
                append(")")
            }
        }
    }
}
