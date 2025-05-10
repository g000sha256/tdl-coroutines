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
import kotlin.LongArray
import kotlin.String

/**
 * This class is an abstract base class.
 * Represents a single rule for managing user privacy settings.
 */
public sealed class UserPrivacySettingRuleDto private constructor() {
    /**
     * A rule to allow all users to do something.
     */
    public class AllowAll public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.AllowAll()"
        }
    }

    /**
     * A rule to allow all contacts of the user to do something.
     */
    public class AllowContacts public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.AllowContacts()"
        }
    }

    /**
     * A rule to allow all bots to do something.
     */
    public class AllowBots public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.AllowBots()"
        }
    }

    /**
     * A rule to allow all Premium Users to do something; currently, allowed only for userPrivacySettingAllowChatInvites.
     */
    public class AllowPremiumUsers public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.AllowPremiumUsers()"
        }
    }

    /**
     * A rule to allow certain specified users to do something.
     *
     * @property userIds The user identifiers, total number of users in all rules must not exceed 1000.
     */
    public class AllowUsers public constructor(
        public val userIds: LongArray,
    ) : UserPrivacySettingRuleDto() {
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
            other as AllowUsers
            return other.userIds.contentEquals(userIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserPrivacySettingRuleDto.AllowUsers")
                append("(")
                append("userIds=")
                userIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A rule to allow all members of certain specified basic groups and supergroups to doing something.
     *
     * @property chatIds The chat identifiers, total number of chats in all rules must not exceed 20.
     */
    public class AllowChatMembers public constructor(
        public val chatIds: LongArray,
    ) : UserPrivacySettingRuleDto() {
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
            other as AllowChatMembers
            return other.chatIds.contentEquals(chatIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserPrivacySettingRuleDto.AllowChatMembers")
                append("(")
                append("chatIds=")
                chatIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A rule to restrict all users from doing something.
     */
    public class RestrictAll public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.RestrictAll()"
        }
    }

    /**
     * A rule to restrict all contacts of the user from doing something.
     */
    public class RestrictContacts public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.RestrictContacts()"
        }
    }

    /**
     * A rule to restrict all bots from doing something.
     */
    public class RestrictBots public constructor() : UserPrivacySettingRuleDto() {
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
            return "UserPrivacySettingRuleDto.RestrictBots()"
        }
    }

    /**
     * A rule to restrict all specified users from doing something.
     *
     * @property userIds The user identifiers, total number of users in all rules must not exceed 1000.
     */
    public class RestrictUsers public constructor(
        public val userIds: LongArray,
    ) : UserPrivacySettingRuleDto() {
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
            other as RestrictUsers
            return other.userIds.contentEquals(userIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserPrivacySettingRuleDto.RestrictUsers")
                append("(")
                append("userIds=")
                userIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A rule to restrict all members of specified basic groups and supergroups from doing something.
     *
     * @property chatIds The chat identifiers, total number of chats in all rules must not exceed 20.
     */
    public class RestrictChatMembers public constructor(
        public val chatIds: LongArray,
    ) : UserPrivacySettingRuleDto() {
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
            other as RestrictChatMembers
            return other.chatIds.contentEquals(chatIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserPrivacySettingRuleDto.RestrictChatMembers")
                append("(")
                append("chatIds=")
                chatIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }
}
