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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.ErrorDto
import dev.g000sha256.tdl.dto.MessageDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A message failed to send. Be aware that some messages being sent can be irrecoverably deleted, in which case updateDeleteMessages will be received instead of this update.
 *
 * @property message The failed to send message.
 * @property oldMessageId The previous temporary message identifier.
 * @property error The cause of the message sending failure.
 */
public class MessageSendFailedUpdateDto public constructor(
    public val message: MessageDto,
    public val oldMessageId: Long,
    public val error: ErrorDto,
) : UpdateDto() {
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
        other as MessageSendFailedUpdateDto
        if (other.message != message) {
            return false
        }
        if (other.oldMessageId != oldMessageId) {
            return false
        }
        return other.error == error
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + oldMessageId.hashCode()
        hashCode = 31 * hashCode + error.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageSendFailedUpdateDto")
            append("(")
            append("message=")
            append(message)
            append(", ")
            append("oldMessageId=")
            append(oldMessageId)
            append(", ")
            append("error=")
            append(error)
            append(")")
        }
    }
}
