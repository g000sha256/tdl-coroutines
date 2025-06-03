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
 * Describes a message to be replied in the same chat and forum topic.
 *
 * @property messageId The identifier of the message to be replied in the same chat and forum topic. A message can be replied in the same chat and forum topic only if messageProperties.canBeReplied.
 * @property quote Quote from the message to be replied; pass null if none. Must always be null for replies in secret chats.
 */
public class InputMessageReplyToMessage public constructor(
    public val messageId: Long,
    public val quote: InputTextQuote?,
) : InputMessageReplyTo() {
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
        other as InputMessageReplyToMessage
        if (other.messageId != messageId) {
            return false
        }
        return other.quote == quote
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + quote.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageReplyToMessage")
            append("(")
            append("messageId=")
            append(messageId)
            append(", ")
            append("quote=")
            append(quote)
            append(")")
        }
    }
}
