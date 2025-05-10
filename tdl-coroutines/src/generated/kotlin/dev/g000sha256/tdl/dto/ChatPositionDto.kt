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
 * Describes a position of a chat in a chat list.
 *
 * @property list The chat list.
 * @property order A parameter used to determine order of the chat in the chat list. Chats must be sorted by the pair (order, chat.id) in descending order.
 * @property isPinned True, if the chat is pinned in the chat list.
 * @property source Source of the chat in the chat list; may be null.
 */
public class ChatPositionDto public constructor(
    public val list: ChatListDto,
    public val order: Long,
    public val isPinned: Boolean,
    public val source: ChatSourceDto?,
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
        other as ChatPositionDto
        if (other.list != list) {
            return false
        }
        if (other.order != order) {
            return false
        }
        if (other.isPinned != isPinned) {
            return false
        }
        return other.source == source
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + list.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatPositionDto")
            append("(")
            append("list=")
            append(list)
            append(", ")
            append("order=")
            append(order)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(", ")
            append("source=")
            append(source)
            append(")")
        }
    }
}
