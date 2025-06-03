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
import kotlin.String

/**
 * Describes a shortcut that can be used for a quick reply.
 *
 * @property id Unique shortcut identifier.
 * @property name The name of the shortcut that can be used to use the shortcut.
 * @property firstMessage The first shortcut message.
 * @property messageCount The total number of messages in the shortcut.
 */
public class QuickReplyShortcut public constructor(
    public val id: Int,
    public val name: String,
    public val firstMessage: QuickReplyMessage,
    public val messageCount: Int,
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
        other as QuickReplyShortcut
        if (other.id != id) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.firstMessage != firstMessage) {
            return false
        }
        return other.messageCount == messageCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + firstMessage.hashCode()
        hashCode = 31 * hashCode + messageCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("QuickReplyShortcut")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("firstMessage=")
            append(firstMessage)
            append(", ")
            append("messageCount=")
            append(messageCount)
            append(")")
        }
    }
}
