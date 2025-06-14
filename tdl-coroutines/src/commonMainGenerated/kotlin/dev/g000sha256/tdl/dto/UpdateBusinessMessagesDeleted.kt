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
 * Messages in a business account were deleted; for bots only.
 *
 * @property connectionId Unique identifier of the business connection.
 * @property chatId Identifier of a chat in the business account in which messages were deleted.
 * @property messageIds Unique message identifiers of the deleted messages.
 */
public class UpdateBusinessMessagesDeleted public constructor(
    public val connectionId: String,
    public val chatId: Long,
    public val messageIds: LongArray,
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
        other as UpdateBusinessMessagesDeleted
        if (other.connectionId != connectionId) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        return other.messageIds.contentEquals(messageIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + connectionId.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateBusinessMessagesDeleted")
            append("(")
            append("connectionId=")
            append(connectionId)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageIds=")
            messageIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
