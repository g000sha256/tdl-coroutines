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
 * Represents the scope to which bot commands are relevant.
 */
public sealed class BotCommandScopeDto private constructor() {
    /**
     * A scope covering all users.
     */
    public class Default public constructor() : BotCommandScopeDto() {
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
            return "BotCommandScopeDto.Default()"
        }
    }

    /**
     * A scope covering all private chats.
     */
    public class AllPrivateChats public constructor() : BotCommandScopeDto() {
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
            return "BotCommandScopeDto.AllPrivateChats()"
        }
    }

    /**
     * A scope covering all group and supergroup chats.
     */
    public class AllGroupChats public constructor() : BotCommandScopeDto() {
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
            return "BotCommandScopeDto.AllGroupChats()"
        }
    }

    /**
     * A scope covering all group and supergroup chat administrators.
     */
    public class AllChatAdministrators public constructor() : BotCommandScopeDto() {
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
            return "BotCommandScopeDto.AllChatAdministrators()"
        }
    }

    /**
     * A scope covering all members of a chat.
     *
     * @property chatId Chat identifier.
     */
    public class Chat public constructor(
        public val chatId: Long,
    ) : BotCommandScopeDto() {
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
            return other.chatId == chatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("BotCommandScopeDto.Chat")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }

    /**
     * A scope covering all administrators of a chat.
     *
     * @property chatId Chat identifier.
     */
    public class ChatAdministrators public constructor(
        public val chatId: Long,
    ) : BotCommandScopeDto() {
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
            other as ChatAdministrators
            return other.chatId == chatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("BotCommandScopeDto.ChatAdministrators")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }

    /**
     * A scope covering a member of a chat.
     *
     * @property chatId Chat identifier.
     * @property userId User identifier.
     */
    public class ChatMember public constructor(
        public val chatId: Long,
        public val userId: Long,
    ) : BotCommandScopeDto() {
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
            other as ChatMember
            if (other.chatId != chatId) {
                return false
            }
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("BotCommandScopeDto.ChatMember")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }
}
