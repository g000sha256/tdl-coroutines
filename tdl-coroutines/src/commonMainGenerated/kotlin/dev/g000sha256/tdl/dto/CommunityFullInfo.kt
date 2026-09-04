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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains full information about a community.
 *
 * @property photo Photo of the community.
 * @property chats Chats belonging to the community.
 * @property administratorCount Number of privileged users in the community; 0 if the current user isn't an administrator of the community.
 * @property bannedCount Number of users banned from the community; 0 if the current user isn't an administrator of the community.
 * @property addChatRequestCount Number of pending requests for addition of chats to the community; 0 if the current user isn't an administrator of the community.
 */
public class CommunityFullInfo public constructor(
    public val photo: ChatPhoto,
    public val chats: Array<CommunityChat>,
    public val administratorCount: Int,
    public val bannedCount: Int,
    public val addChatRequestCount: Int,
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
        other as CommunityFullInfo
        if (other.photo != photo) {
            return false
        }
        val chatsEquals = other.chats.contentDeepEquals(chats)
        if (!chatsEquals) {
            return false
        }
        if (other.administratorCount != administratorCount) {
            return false
        }
        if (other.bannedCount != bannedCount) {
            return false
        }
        return other.addChatRequestCount == addChatRequestCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + chats.contentDeepHashCode()
        hashCode = 31 * hashCode + administratorCount.hashCode()
        hashCode = 31 * hashCode + bannedCount.hashCode()
        hashCode = 31 * hashCode + addChatRequestCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CommunityFullInfo")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("chats=")
            chats
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("administratorCount=")
            append(administratorCount)
            append(", ")
            append("bannedCount=")
            append(bannedCount)
            append(", ")
            append("addChatRequestCount=")
            append(addChatRequestCount)
            append(")")
        }
    }
}
