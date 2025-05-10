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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains a list of chat invite links.
 *
 * @property totalCount Approximate total number of chat invite links found.
 * @property inviteLinks List of invite links.
 */
public class ChatInviteLinksDto public constructor(
    public val totalCount: Int,
    public val inviteLinks: Array<ChatInviteLinkDto>,
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
        other as ChatInviteLinksDto
        if (other.totalCount != totalCount) {
            return false
        }
        return other.inviteLinks.contentDeepEquals(inviteLinks)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + inviteLinks.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinksDto")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("inviteLinks=")
            inviteLinks
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
