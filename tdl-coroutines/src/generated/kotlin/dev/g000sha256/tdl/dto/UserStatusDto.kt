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
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes the last time the user was online.
 */
public sealed class UserStatusDto private constructor() {
    /**
     * The user's status has never been changed.
     */
    public class Empty public constructor() : UserStatusDto() {
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
            return "UserStatusDto.Empty()"
        }
    }

    /**
     * The user is online.
     *
     * @property expires Point in time (Unix timestamp) when the user's online status will expire.
     */
    public class Online public constructor(
        public val expires: Int,
    ) : UserStatusDto() {
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
            other as Online
            return other.expires == expires
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + expires.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserStatusDto.Online")
                append("(")
                append("expires=")
                append(expires)
                append(")")
            }
        }
    }

    /**
     * The user is offline.
     *
     * @property wasOnline Point in time (Unix timestamp) when the user was last online.
     */
    public class Offline public constructor(
        public val wasOnline: Int,
    ) : UserStatusDto() {
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
            other as Offline
            return other.wasOnline == wasOnline
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + wasOnline.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserStatusDto.Offline")
                append("(")
                append("wasOnline=")
                append(wasOnline)
                append(")")
            }
        }
    }

    /**
     * The user was online recently.
     *
     * @property byMyPrivacySettings Exact user's status is hidden because the current user enabled userPrivacySettingShowStatus privacy setting for the user and has no Telegram Premium.
     */
    public class Recently public constructor(
        public val byMyPrivacySettings: Boolean,
    ) : UserStatusDto() {
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
            other as Recently
            return other.byMyPrivacySettings == byMyPrivacySettings
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + byMyPrivacySettings.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserStatusDto.Recently")
                append("(")
                append("byMyPrivacySettings=")
                append(byMyPrivacySettings)
                append(")")
            }
        }
    }

    /**
     * The user is offline, but was online last week.
     *
     * @property byMyPrivacySettings Exact user's status is hidden because the current user enabled userPrivacySettingShowStatus privacy setting for the user and has no Telegram Premium.
     */
    public class LastWeek public constructor(
        public val byMyPrivacySettings: Boolean,
    ) : UserStatusDto() {
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
            other as LastWeek
            return other.byMyPrivacySettings == byMyPrivacySettings
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + byMyPrivacySettings.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserStatusDto.LastWeek")
                append("(")
                append("byMyPrivacySettings=")
                append(byMyPrivacySettings)
                append(")")
            }
        }
    }

    /**
     * The user is offline, but was online last month.
     *
     * @property byMyPrivacySettings Exact user's status is hidden because the current user enabled userPrivacySettingShowStatus privacy setting for the user and has no Telegram Premium.
     */
    public class LastMonth public constructor(
        public val byMyPrivacySettings: Boolean,
    ) : UserStatusDto() {
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
            other as LastMonth
            return other.byMyPrivacySettings == byMyPrivacySettings
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + byMyPrivacySettings.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("UserStatusDto.LastMonth")
                append("(")
                append("byMyPrivacySettings=")
                append(byMyPrivacySettings)
                append(")")
            }
        }
    }
}
