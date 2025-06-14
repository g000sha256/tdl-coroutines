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
 * Represents a basic group of 0-200 users (must be upgraded to a supergroup to accommodate more than 200 users).
 *
 * @property id Group identifier.
 * @property memberCount Number of members in the group.
 * @property status Status of the current user in the group.
 * @property isActive True, if the group is active.
 * @property upgradedToSupergroupId Identifier of the supergroup to which this group was upgraded; 0 if none.
 */
public class BasicGroup public constructor(
    public val id: Long,
    public val memberCount: Int,
    public val status: ChatMemberStatus,
    public val isActive: Boolean,
    public val upgradedToSupergroupId: Long,
) {
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
        if (other.id != id) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.status != status) {
            return false
        }
        if (other.isActive != isActive) {
            return false
        }
        return other.upgradedToSupergroupId == upgradedToSupergroupId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        hashCode = 31 * hashCode + isActive.hashCode()
        hashCode = 31 * hashCode + upgradedToSupergroupId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BasicGroup")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("status=")
            append(status)
            append(", ")
            append("isActive=")
            append(isActive)
            append(", ")
            append("upgradedToSupergroupId=")
            append(upgradedToSupergroupId)
            append(")")
        }
    }
}
