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
 * The linked chat of a supergroup was changed.
 *
 * @property oldLinkedChatId Previous supergroup linked chat identifier.
 * @property newLinkedChatId New supergroup linked chat identifier.
 */
public class ChatEventLinkedChatChanged public constructor(
    public val oldLinkedChatId: Long,
    public val newLinkedChatId: Long,
) : ChatEventAction() {
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
        other as ChatEventLinkedChatChanged
        if (other.oldLinkedChatId != oldLinkedChatId) {
            return false
        }
        return other.newLinkedChatId == newLinkedChatId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldLinkedChatId.hashCode()
        hashCode = 31 * hashCode + newLinkedChatId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventLinkedChatChanged")
            append("(")
            append("oldLinkedChatId=")
            append(oldLinkedChatId)
            append(", ")
            append("newLinkedChatId=")
            append(newLinkedChatId)
            append(")")
        }
    }
}
