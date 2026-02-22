/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * The owner of the chat has left.
 *
 * @property newOwnerUserId Identifier of the user who will become the new owner of the chat if the previous owner isn't return; 0 if none.
 */
public class MessageChatOwnerLeft public constructor(
    public val newOwnerUserId: Long,
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
        other as MessageChatOwnerLeft
        return other.newOwnerUserId == newOwnerUserId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + newOwnerUserId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChatOwnerLeft")
            append("(")
            append("newOwnerUserId=")
            append(newOwnerUserId)
            append(")")
        }
    }
}
