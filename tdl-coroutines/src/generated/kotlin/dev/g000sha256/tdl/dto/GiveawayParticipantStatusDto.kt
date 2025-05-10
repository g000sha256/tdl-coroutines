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
 * Contains information about status of a user in a giveaway.
 */
public sealed class GiveawayParticipantStatusDto private constructor() {
    /**
     * The user is eligible for the giveaway.
     */
    public class Eligible public constructor() : GiveawayParticipantStatusDto() {
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
            return "GiveawayParticipantStatusDto.Eligible()"
        }
    }

    /**
     * The user participates in the giveaway.
     */
    public class Participating public constructor() : GiveawayParticipantStatusDto() {
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
            return "GiveawayParticipantStatusDto.Participating()"
        }
    }

    /**
     * The user can't participate in the giveaway, because they have already been member of the chat.
     *
     * @property joinedChatDate Point in time (Unix timestamp) when the user joined the chat.
     */
    public class AlreadyWasMember public constructor(
        public val joinedChatDate: Int,
    ) : GiveawayParticipantStatusDto() {
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
            other as AlreadyWasMember
            return other.joinedChatDate == joinedChatDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + joinedChatDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("GiveawayParticipantStatusDto.AlreadyWasMember")
                append("(")
                append("joinedChatDate=")
                append(joinedChatDate)
                append(")")
            }
        }
    }

    /**
     * The user can't participate in the giveaway, because they are an administrator in one of the chats that created the giveaway.
     *
     * @property chatId Identifier of the chat administered by the user.
     */
    public class Administrator public constructor(
        public val chatId: Long,
    ) : GiveawayParticipantStatusDto() {
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
            other as Administrator
            return other.chatId == chatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("GiveawayParticipantStatusDto.Administrator")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }

    /**
     * The user can't participate in the giveaway, because they phone number is from a disallowed country.
     *
     * @property userCountryCode A two-letter ISO 3166-1 alpha-2 country code of the user's country.
     */
    public class DisallowedCountry public constructor(
        public val userCountryCode: String,
    ) : GiveawayParticipantStatusDto() {
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
            other as DisallowedCountry
            return other.userCountryCode == userCountryCode
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userCountryCode.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("GiveawayParticipantStatusDto.DisallowedCountry")
                append("(")
                append("userCountryCode=")
                append(userCountryCode)
                append(")")
            }
        }
    }
}
