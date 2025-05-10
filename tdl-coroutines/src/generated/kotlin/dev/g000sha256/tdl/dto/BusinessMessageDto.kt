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
 * Describes a message from a business account as received by a bot.
 *
 * @property message The message.
 * @property replyToMessage Message that is replied by the message in the same chat; may be null if none.
 */
public class BusinessMessageDto public constructor(
    public val message: MessageDto,
    public val replyToMessage: MessageDto?,
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
        other as BusinessMessageDto
        if (other.message != message) {
            return false
        }
        return other.replyToMessage == replyToMessage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + replyToMessage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessMessageDto")
            append("(")
            append("message=")
            append(message)
            append(", ")
            append("replyToMessage=")
            append(replyToMessage)
            append(")")
        }
    }
}
