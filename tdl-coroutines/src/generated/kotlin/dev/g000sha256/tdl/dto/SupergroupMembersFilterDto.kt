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
 * Specifies the kind of chat members to return in getSupergroupMembers.
 */
public sealed class SupergroupMembersFilterDto private constructor() {
    /**
     * Returns recently active users in reverse chronological order.
     */
    public class Recent public constructor() : SupergroupMembersFilterDto() {
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
            return "SupergroupMembersFilterDto.Recent()"
        }
    }

    /**
     * Returns contacts of the user, which are members of the supergroup or channel.
     *
     * @property query Query to search for.
     */
    public class Contacts public constructor(
        public val query: String,
    ) : SupergroupMembersFilterDto() {
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
            other as Contacts
            return other.query == query
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SupergroupMembersFilterDto.Contacts")
                append("(")
                append("query=")
                append(query)
                append(")")
            }
        }
    }

    /**
     * Returns the owner and administrators.
     */
    public class Administrators public constructor() : SupergroupMembersFilterDto() {
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
            return "SupergroupMembersFilterDto.Administrators()"
        }
    }

    /**
     * Used to search for supergroup or channel members via a (string) query.
     *
     * @property query Query to search for.
     */
    public class Search public constructor(
        public val query: String,
    ) : SupergroupMembersFilterDto() {
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
            other as Search
            return other.query == query
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SupergroupMembersFilterDto.Search")
                append("(")
                append("query=")
                append(query)
                append(")")
            }
        }
    }

    /**
     * Returns restricted supergroup members; can be used only by administrators.
     *
     * @property query Query to search for.
     */
    public class Restricted public constructor(
        public val query: String,
    ) : SupergroupMembersFilterDto() {
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
            other as Restricted
            return other.query == query
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SupergroupMembersFilterDto.Restricted")
                append("(")
                append("query=")
                append(query)
                append(")")
            }
        }
    }

    /**
     * Returns users banned from the supergroup or channel; can be used only by administrators.
     *
     * @property query Query to search for.
     */
    public class Banned public constructor(
        public val query: String,
    ) : SupergroupMembersFilterDto() {
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
            other as Banned
            return other.query == query
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SupergroupMembersFilterDto.Banned")
                append("(")
                append("query=")
                append(query)
                append(")")
            }
        }
    }

    /**
     * Returns users which can be mentioned in the supergroup.
     *
     * @property query Query to search for.
     * @property messageThreadId If non-zero, the identifier of the current message thread.
     */
    public class Mention public constructor(
        public val query: String,
        public val messageThreadId: Long,
    ) : SupergroupMembersFilterDto() {
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
            other as Mention
            if (other.query != query) {
                return false
            }
            return other.messageThreadId == messageThreadId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            hashCode = 31 * hashCode + messageThreadId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SupergroupMembersFilterDto.Mention")
                append("(")
                append("query=")
                append(query)
                append(", ")
                append("messageThreadId=")
                append(messageThreadId)
                append(")")
            }
        }
    }

    /**
     * Returns bot members of the supergroup or channel.
     */
    public class Bots public constructor() : SupergroupMembersFilterDto() {
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
            return "SupergroupMembersFilterDto.Bots()"
        }
    }
}
