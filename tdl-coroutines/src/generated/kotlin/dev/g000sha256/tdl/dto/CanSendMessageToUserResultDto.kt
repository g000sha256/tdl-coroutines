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
 * Describes result of canSendMessageToUser.
 */
public sealed class CanSendMessageToUserResultDto private constructor() {
    /**
     * The user can be messaged.
     */
    public class Ok public constructor() : CanSendMessageToUserResultDto() {
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
            return "CanSendMessageToUserResultDto.Ok()"
        }
    }

    /**
     * The user can be messaged, but the messages are paid.
     *
     * @property outgoingPaidMessageStarCount Number of Telegram Stars that must be paid by the current user for each sent message to the user.
     */
    public class UserHasPaidMessages public constructor(
        public val outgoingPaidMessageStarCount: Long,
    ) : CanSendMessageToUserResultDto() {
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
            other as UserHasPaidMessages
            return other.outgoingPaidMessageStarCount == outgoingPaidMessageStarCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + outgoingPaidMessageStarCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CanSendMessageToUserResultDto.UserHasPaidMessages")
                append("(")
                append("outgoingPaidMessageStarCount=")
                append(outgoingPaidMessageStarCount)
                append(")")
            }
        }
    }

    /**
     * The user can't be messaged, because they are deleted or unknown.
     */
    public class UserIsDeleted public constructor() : CanSendMessageToUserResultDto() {
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
            return "CanSendMessageToUserResultDto.UserIsDeleted()"
        }
    }

    /**
     * The user can't be messaged, because they restrict new chats with non-contacts.
     */
    public class UserRestrictsNewChats public constructor() : CanSendMessageToUserResultDto() {
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
            return "CanSendMessageToUserResultDto.UserRestrictsNewChats()"
        }
    }
}
