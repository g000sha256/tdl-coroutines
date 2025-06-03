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
 * The auto-delete or self-destruct timer for messages in the chat has been changed.
 *
 * @property messageAutoDeleteTime New value auto-delete or self-destruct time, in seconds; 0 if disabled.
 * @property fromUserId If not 0, a user identifier, which default setting was automatically applied.
 */
public class MessageChatSetMessageAutoDeleteTime public constructor(
    public val messageAutoDeleteTime: Int,
    public val fromUserId: Long,
) : MessageContent() {
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
        other as MessageChatSetMessageAutoDeleteTime
        if (other.messageAutoDeleteTime != messageAutoDeleteTime) {
            return false
        }
        return other.fromUserId == fromUserId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageAutoDeleteTime.hashCode()
        hashCode = 31 * hashCode + fromUserId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChatSetMessageAutoDeleteTime")
            append("(")
            append("messageAutoDeleteTime=")
            append(messageAutoDeleteTime)
            append(", ")
            append("fromUserId=")
            append(fromUserId)
            append(")")
        }
    }
}
