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
 * Describes a non-joined group call that isn't bound to a chat.
 */
public sealed class InputGroupCallDto private constructor() {
    /**
     * The group call is accessible through a link.
     *
     * @property link The link for the group call.
     */
    public class Link public constructor(
        public val link: String,
    ) : InputGroupCallDto() {
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
            other as Link
            return other.link == link
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + link.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputGroupCallDto.Link")
                append("(")
                append("link=")
                append(link)
                append(")")
            }
        }
    }

    /**
     * The group call is accessible through a message of the type messageGroupCall.
     *
     * @property chatId Identifier of the chat with the message.
     * @property messageId Identifier of the message of the type messageGroupCall.
     */
    public class Message public constructor(
        public val chatId: Long,
        public val messageId: Long,
    ) : InputGroupCallDto() {
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
            if (other.chatId != chatId) {
                return false
            }
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputGroupCallDto.Message")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }
}
