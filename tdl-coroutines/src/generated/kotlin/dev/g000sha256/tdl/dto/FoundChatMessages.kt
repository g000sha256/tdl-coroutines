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
import kotlin.Long
import kotlin.String

/**
 * Contains a list of messages found by a search in a given chat.
 *
 * @property totalCount Approximate total number of messages found; -1 if unknown.
 * @property messages List of messages.
 * @property nextFromMessageId The offset for the next request. If 0, there are no more results.
 */
public class FoundChatMessages public constructor(
    public val totalCount: Int,
    public val messages: Array<Message>,
    public val nextFromMessageId: Long,
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
        other as FoundChatMessages
        if (other.totalCount != totalCount) {
            return false
        }
        val messagesEquals = other.messages.contentDeepEquals(messages)
        if (!messagesEquals) {
            return false
        }
        return other.nextFromMessageId == nextFromMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + messages.contentDeepHashCode()
        hashCode = 31 * hashCode + nextFromMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FoundChatMessages")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("messages=")
            messages
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextFromMessageId=")
            append(nextFromMessageId)
            append(")")
        }
    }
}
