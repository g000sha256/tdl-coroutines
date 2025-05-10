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
 * Represents result of checking whether a username can be set for a chat.
 */
public sealed class CheckChatUsernameResultDto private constructor() {
    /**
     * The username can be set.
     */
    public class Ok public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.Ok()"
        }
    }

    /**
     * The username is invalid.
     */
    public class UsernameInvalid public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.UsernameInvalid()"
        }
    }

    /**
     * The username is occupied.
     */
    public class UsernameOccupied public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.UsernameOccupied()"
        }
    }

    /**
     * The username can be purchased at https://fragment.com. Information about the username can be received using getCollectibleItemInfo.
     */
    public class UsernamePurchasable public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.UsernamePurchasable()"
        }
    }

    /**
     * The user has too many chats with username, one of them must be made private first.
     */
    public class PublicChatsTooMany public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.PublicChatsTooMany()"
        }
    }

    /**
     * The user can't be a member of a public supergroup.
     */
    public class PublicGroupsUnavailable public constructor() : CheckChatUsernameResultDto() {
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
            return "CheckChatUsernameResultDto.PublicGroupsUnavailable()"
        }
    }
}
