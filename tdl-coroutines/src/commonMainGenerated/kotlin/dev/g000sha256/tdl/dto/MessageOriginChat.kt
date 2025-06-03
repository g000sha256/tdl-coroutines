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
 * The message was originally sent on behalf of a chat.
 *
 * @property senderChatId Identifier of the chat that originally sent the message.
 * @property authorSignature For messages originally sent by an anonymous chat administrator, original message author signature.
 */
public class MessageOriginChat public constructor(
    public val senderChatId: Long,
    public val authorSignature: String,
) : MessageOrigin() {
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
        other as MessageOriginChat
        if (other.senderChatId != senderChatId) {
            return false
        }
        return other.authorSignature == authorSignature
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderChatId.hashCode()
        hashCode = 31 * hashCode + authorSignature.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageOriginChat")
            append("(")
            append("senderChatId=")
            append(senderChatId)
            append(", ")
            append("authorSignature=")
            append(authorSignature)
            append(")")
        }
    }
}
