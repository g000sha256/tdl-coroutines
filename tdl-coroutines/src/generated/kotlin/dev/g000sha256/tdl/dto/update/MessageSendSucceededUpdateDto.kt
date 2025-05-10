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

import dev.g000sha256.tdl.dto.MessageDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A message has been successfully sent.
 *
 * @property message The sent message. Almost any field of the new message can be different from the corresponding field of the original message. For example, the field schedulingState may change, making the message scheduled, or non-scheduled.
 * @property oldMessageId The previous temporary message identifier.
 */
public class MessageSendSucceededUpdateDto public constructor(
    public val message: MessageDto,
    public val oldMessageId: Long,
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
        other as MessageSendSucceededUpdateDto
        if (other.message != message) {
            return false
        }
        return other.oldMessageId == oldMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + oldMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageSendSucceededUpdateDto")
            append("(")
            append("message=")
            append(message)
            append(", ")
            append("oldMessageId=")
            append(oldMessageId)
            append(")")
        }
    }
}
