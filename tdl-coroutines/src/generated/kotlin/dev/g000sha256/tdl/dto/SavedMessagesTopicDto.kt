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
 * Contains information about a Saved Messages topic.
 *
 * @property id Unique topic identifier.
 * @property type Type of the topic.
 * @property isPinned True, if the topic is pinned.
 * @property order A parameter used to determine order of the topic in the topic list. Topics must be sorted by the order in descending order.
 * @property lastMessage Last message in the topic; may be null if none or unknown.
 * @property draftMessage A draft of a message in the topic; may be null if none.
 */
public class SavedMessagesTopicDto public constructor(
    public val id: Long,
    public val type: SavedMessagesTopicTypeDto,
    public val isPinned: Boolean,
    public val order: Long,
    public val lastMessage: MessageDto?,
    public val draftMessage: DraftMessageDto?,
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
        other as SavedMessagesTopicDto
        if (other.id != id) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.isPinned != isPinned) {
            return false
        }
        if (other.order != order) {
            return false
        }
        if (other.lastMessage != lastMessage) {
            return false
        }
        return other.draftMessage == draftMessage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        hashCode = 31 * hashCode + lastMessage.hashCode()
        hashCode = 31 * hashCode + draftMessage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SavedMessagesTopicDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(", ")
            append("order=")
            append(order)
            append(", ")
            append("lastMessage=")
            append(lastMessage)
            append(", ")
            append("draftMessage=")
            append(draftMessage)
            append(")")
        }
    }
}
