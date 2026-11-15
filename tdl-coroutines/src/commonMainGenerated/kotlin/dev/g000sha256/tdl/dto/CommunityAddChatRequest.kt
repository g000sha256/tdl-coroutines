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
import kotlin.Long
import kotlin.String

/**
 * Describes a request to add a chat to a community.
 *
 * @property chatId Identifier of the chat to be added.
 * @property isHidden True, if the chat will be visible only to administrators of the community.
 * @property senderUserId Identifier of the user who sent the request.
 * @property date Point in time (Unix timestamp) when the request was sent.
 */
public class CommunityAddChatRequest public constructor(
    public val chatId: Long,
    public val isHidden: Boolean,
    public val senderUserId: Long,
    public val date: Int,
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
        other as CommunityAddChatRequest
        if (other.chatId != chatId) {
            return false
        }
        if (other.isHidden != isHidden) {
            return false
        }
        if (other.senderUserId != senderUserId) {
            return false
        }
        return other.date == date
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + isHidden.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CommunityAddChatRequest")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("isHidden=")
            append(isHidden)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("date=")
            append(date)
            append(")")
        }
    }
}
