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
 * A group call message failed to send.
 *
 * @property groupCallId Identifier of the group call.
 * @property messageId Message identifier.
 * @property error The cause of the message sending failure.
 */
public class UpdateGroupCallMessageSendFailed public constructor(
    public val groupCallId: Int,
    public val messageId: Int,
    public val error: Error,
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
        other as UpdateGroupCallMessageSendFailed
        if (other.groupCallId != groupCallId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        return other.error == error
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + error.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateGroupCallMessageSendFailed")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("error=")
            append(error)
            append(")")
        }
    }
}
