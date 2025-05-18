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
import kotlin.LongArray
import kotlin.String

/**
 * Some messages were deleted.
 *
 * @property chatId Chat identifier.
 * @property messageIds Identifiers of the deleted messages.
 * @property isPermanent True, if the messages are permanently deleted by a user (as opposed to just becoming inaccessible).
 * @property fromCache True, if the messages are deleted only from the cache and can possibly be retrieved again in the future.
 */
public class UpdateDeleteMessages public constructor(
    public val chatId: Long,
    public val messageIds: LongArray,
    public val isPermanent: Boolean,
    public val fromCache: Boolean,
) : Update() {
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
        other as UpdateDeleteMessages
        if (other.chatId != chatId) {
            return false
        }
        val messageIdsEquals = other.messageIds.contentEquals(messageIds)
        if (!messageIdsEquals) {
            return false
        }
        if (other.isPermanent != isPermanent) {
            return false
        }
        return other.fromCache == fromCache
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageIds.contentHashCode()
        hashCode = 31 * hashCode + isPermanent.hashCode()
        hashCode = 31 * hashCode + fromCache.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateDeleteMessages")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageIds=")
            messageIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("isPermanent=")
            append(isPermanent)
            append(", ")
            append("fromCache=")
            append(fromCache)
            append(")")
        }
    }
}
