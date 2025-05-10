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
 * Contains information about the message or the story to be replied.
 */
public sealed class InputMessageReplyToDto private constructor() {
    /**
     * Describes a message to be replied in the same chat and forum topic.
     *
     * @property messageId The identifier of the message to be replied in the same chat and forum topic. A message can be replied in the same chat and forum topic only if messageProperties.canBeReplied.
     * @property quote Quote from the message to be replied; pass null if none. Must always be null for replies in secret chats.
     */
    public class Message public constructor(
        public val messageId: Long,
        public val quote: InputTextQuoteDto?,
    ) : InputMessageReplyToDto() {
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
            other as Message
            if (other.messageId != messageId) {
                return false
            }
            return other.quote == quote
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + quote.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageReplyToDto.Message")
                append("(")
                append("messageId=")
                append(messageId)
                append(", ")
                append("quote=")
                append(quote)
                append(")")
            }
        }
    }

    /**
     * Describes a message to be replied that is from a different chat or a forum topic; not supported in secret chats.
     *
     * @property chatId The identifier of the chat to which the message to be replied belongs.
     * @property messageId The identifier of the message to be replied in the specified chat. A message can be replied in another chat or forum topic only if messageProperties.canBeRepliedInAnotherChat.
     * @property quote Quote from the message to be replied; pass null if none.
     */
    public class ExternalMessage public constructor(
        public val chatId: Long,
        public val messageId: Long,
        public val quote: InputTextQuoteDto?,
    ) : InputMessageReplyToDto() {
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
            other as ExternalMessage
            if (other.chatId != chatId) {
                return false
            }
            if (other.messageId != messageId) {
                return false
            }
            return other.quote == quote
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + quote.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageReplyToDto.ExternalMessage")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(", ")
                append("quote=")
                append(quote)
                append(")")
            }
        }
    }

    /**
     * Describes a story to be replied.
     *
     * @property storyPosterChatId The identifier of the poster of the story. Currently, stories can be replied only in the chat that posted the story; channel stories can't be replied.
     * @property storyId The identifier of the story.
     */
    public class Story public constructor(
        public val storyPosterChatId: Long,
        public val storyId: Int,
    ) : InputMessageReplyToDto() {
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
            other as Story
            if (other.storyPosterChatId != storyPosterChatId) {
                return false
            }
            return other.storyId == storyId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storyPosterChatId.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageReplyToDto.Story")
                append("(")
                append("storyPosterChatId=")
                append(storyPosterChatId)
                append(", ")
                append("storyId=")
                append(storyId)
                append(")")
            }
        }
    }
}
