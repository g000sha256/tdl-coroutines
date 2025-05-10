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
 * This class is an abstract base class.
 * Specifies the kind of chat members to return in searchChatMembers.
 */
public sealed class ChatMembersFilterDto private constructor() {
    /**
     * Returns contacts of the user.
     */
    public class Contacts public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Contacts()"
        }
    }

    /**
     * Returns the owner and administrators.
     */
    public class Administrators public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Administrators()"
        }
    }

    /**
     * Returns all chat members, including restricted chat members.
     */
    public class Members public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Members()"
        }
    }

    /**
     * Returns users which can be mentioned in the chat.
     *
     * @property messageThreadId If non-zero, the identifier of the current message thread.
     */
    public class Mention public constructor(
        public val messageThreadId: Long,
    ) : ChatMembersFilterDto() {
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
            other as Mention
            return other.messageThreadId == messageThreadId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageThreadId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatMembersFilterDto.Mention")
                append("(")
                append("messageThreadId=")
                append(messageThreadId)
                append(")")
            }
        }
    }

    /**
     * Returns users under certain restrictions in the chat; can be used only by administrators in a supergroup.
     */
    public class Restricted public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Restricted()"
        }
    }

    /**
     * Returns users banned from the chat; can be used only by administrators in a supergroup or in a channel.
     */
    public class Banned public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Banned()"
        }
    }

    /**
     * Returns bot members of the chat.
     */
    public class Bots public constructor() : ChatMembersFilterDto() {
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
            return "ChatMembersFilterDto.Bots()"
        }
    }
}
