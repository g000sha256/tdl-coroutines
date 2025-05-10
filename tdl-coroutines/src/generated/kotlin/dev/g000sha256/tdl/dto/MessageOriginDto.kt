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
 * Contains information about the origin of a message.
 */
public sealed class MessageOriginDto private constructor() {
    /**
     * The message was originally sent by a known user.
     *
     * @property senderUserId Identifier of the user that originally sent the message.
     */
    public class User public constructor(
        public val senderUserId: Long,
    ) : MessageOriginDto() {
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
            return other.senderUserId == senderUserId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + senderUserId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageOriginDto.User")
                append("(")
                append("senderUserId=")
                append(senderUserId)
                append(")")
            }
        }
    }

    /**
     * The message was originally sent by a user, which is hidden by their privacy settings.
     *
     * @property senderName Name of the sender.
     */
    public class HiddenUser public constructor(
        public val senderName: String,
    ) : MessageOriginDto() {
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
            other as HiddenUser
            return other.senderName == senderName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + senderName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageOriginDto.HiddenUser")
                append("(")
                append("senderName=")
                append(senderName)
                append(")")
            }
        }
    }

    /**
     * The message was originally sent on behalf of a chat.
     *
     * @property senderChatId Identifier of the chat that originally sent the message.
     * @property authorSignature For messages originally sent by an anonymous chat administrator, original message author signature.
     */
    public class Chat public constructor(
        public val senderChatId: Long,
        public val authorSignature: String,
    ) : MessageOriginDto() {
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
            if (other.senderChatId != senderChatId) {
                return false
            }
            return other.authorSignature == authorSignature
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + senderChatId.hashCode()
            hashCode = 31 * hashCode + authorSignature.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageOriginDto.Chat")
                append("(")
                append("senderChatId=")
                append(senderChatId)
                append(", ")
                append("authorSignature=")
                append(authorSignature)
                append(")")
            }
        }
    }

    /**
     * The message was originally a post in a channel.
     *
     * @property chatId Identifier of the channel chat to which the message was originally sent.
     * @property messageId Message identifier of the original message.
     * @property authorSignature Original post author signature.
     */
    public class Channel public constructor(
        public val chatId: Long,
        public val messageId: Long,
        public val authorSignature: String,
    ) : MessageOriginDto() {
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
            other as Channel
            if (other.chatId != chatId) {
                return false
            }
            if (other.messageId != messageId) {
                return false
            }
            return other.authorSignature == authorSignature
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + authorSignature.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageOriginDto.Channel")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(", ")
                append("authorSignature=")
                append(authorSignature)
                append(")")
            }
        }
    }
}
