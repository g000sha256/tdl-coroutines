/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Contains information about chats in a community, which are joined or owned by a member of the community.
 *
 * @property ownedChatIds Identifiers of the chats owned by the member. The chats will be removed from the community if the member is banned in the community.
 * @property joinedChatIds Identifiers of the non-owned chats joined by the member.
 */
public class CommunityMemberChats public constructor(
    public val ownedChatIds: LongArray,
    public val joinedChatIds: LongArray,
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
        other as CommunityMemberChats
        val ownedChatIdsEquals = other.ownedChatIds.contentEquals(ownedChatIds)
        if (!ownedChatIdsEquals) {
            return false
        }
        return other.joinedChatIds.contentEquals(joinedChatIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + ownedChatIds.contentHashCode()
        hashCode = 31 * hashCode + joinedChatIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CommunityMemberChats")
            append("(")
            append("ownedChatIds=")
            ownedChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("joinedChatIds=")
            joinedChatIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
