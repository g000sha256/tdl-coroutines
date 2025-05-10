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
 * Contains information about the sender of a message.
 */
public sealed class MessageSenderDto private constructor() {
    /**
     * The message was sent by a known user.
     *
     * @property userId Identifier of the user that sent the message.
     */
    public class User public constructor(
        public val userId: Long,
    ) : MessageSenderDto() {
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
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageSenderDto.User")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * The message was sent on behalf of a chat.
     *
     * @property chatId Identifier of the chat that sent the message.
     */
    public class Chat public constructor(
        public val chatId: Long,
    ) : MessageSenderDto() {
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
                append("MessageSenderDto.Chat")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }
}
