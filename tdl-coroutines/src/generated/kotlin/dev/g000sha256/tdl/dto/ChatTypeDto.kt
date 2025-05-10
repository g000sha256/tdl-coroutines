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
 * Describes the type of chat.
 */
public sealed class ChatTypeDto private constructor() {
    /**
     * An ordinary chat with a user.
     *
     * @property userId User identifier.
     */
    public class Private public constructor(
        public val userId: Long,
    ) : ChatTypeDto() {
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
            other as Private
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatTypeDto.Private")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * A basic group (a chat with 0-200 other users).
     *
     * @property basicGroupId Basic group identifier.
     */
    public class BasicGroup public constructor(
        public val basicGroupId: Long,
    ) : ChatTypeDto() {
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
            other as BasicGroup
            return other.basicGroupId == basicGroupId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + basicGroupId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatTypeDto.BasicGroup")
                append("(")
                append("basicGroupId=")
                append(basicGroupId)
                append(")")
            }
        }
    }

    /**
     * A supergroup or channel (with unlimited members).
     *
     * @property supergroupId Supergroup or channel identifier.
     * @property isChannel True, if the supergroup is a channel.
     */
    public class Supergroup public constructor(
        public val supergroupId: Long,
        public val isChannel: Boolean,
    ) : ChatTypeDto() {
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
            other as Supergroup
            if (other.supergroupId != supergroupId) {
                return false
            }
            return other.isChannel == isChannel
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + supergroupId.hashCode()
            hashCode = 31 * hashCode + isChannel.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatTypeDto.Supergroup")
                append("(")
                append("supergroupId=")
                append(supergroupId)
                append(", ")
                append("isChannel=")
                append(isChannel)
                append(")")
            }
        }
    }

    /**
     * A secret chat with a user.
     *
     * @property secretChatId Secret chat identifier.
     * @property userId User identifier of the other user in the secret chat.
     */
    public class Secret public constructor(
        public val secretChatId: Int,
        public val userId: Long,
    ) : ChatTypeDto() {
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
            other as Secret
            if (other.secretChatId != secretChatId) {
                return false
            }
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + secretChatId.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatTypeDto.Secret")
                append("(")
                append("secretChatId=")
                append(secretChatId)
                append(", ")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }
}
