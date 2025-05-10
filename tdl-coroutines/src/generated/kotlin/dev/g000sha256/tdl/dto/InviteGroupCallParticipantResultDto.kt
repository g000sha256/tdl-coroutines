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
 * Describes result of group call participant invitation.
 */
public sealed class InviteGroupCallParticipantResultDto private constructor() {
    /**
     * The user can't be invited due to their privacy settings.
     */
    public class UserPrivacyRestricted public constructor() : InviteGroupCallParticipantResultDto() {
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
            return "InviteGroupCallParticipantResultDto.UserPrivacyRestricted()"
        }
    }

    /**
     * The user can't be invited because they are already a participant of the call.
     */
    public class UserAlreadyParticipant public constructor() : InviteGroupCallParticipantResultDto() {
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
            return "InviteGroupCallParticipantResultDto.UserAlreadyParticipant()"
        }
    }

    /**
     * The user can't be invited because they were banned by the owner of the call and can be invited back only by the owner of the group call.
     */
    public class UserWasBanned public constructor() : InviteGroupCallParticipantResultDto() {
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
            return "InviteGroupCallParticipantResultDto.UserWasBanned()"
        }
    }

    /**
     * The user was invited and a service message of the type messageGroupCall was sent which can be used in declineGroupCallInvitation to cancel the invitation.
     *
     * @property chatId Identifier of the chat with the invitation message.
     * @property messageId Identifier of the message.
     */
    public class Success public constructor(
        public val chatId: Long,
        public val messageId: Long,
    ) : InviteGroupCallParticipantResultDto() {
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
            other as Success
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
                append("InviteGroupCallParticipantResultDto.Success")
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
