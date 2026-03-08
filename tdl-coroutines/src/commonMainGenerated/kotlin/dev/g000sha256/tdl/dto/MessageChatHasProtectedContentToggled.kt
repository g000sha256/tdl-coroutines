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
 * Chat hasProtectedContent setting was changed or request to change it was rejected.
 *
 * @property requestMessageId Identifier of the message with the request to change the setting; can be an identifier of a deleted message or 0.
 * @property oldHasProtectedContent Previous value of the setting.
 * @property newHasProtectedContent New value of the setting.
 */
public class MessageChatHasProtectedContentToggled public constructor(
    public val requestMessageId: Long,
    public val oldHasProtectedContent: Boolean,
    public val newHasProtectedContent: Boolean,
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
        other as MessageChatHasProtectedContentToggled
        if (other.requestMessageId != requestMessageId) {
            return false
        }
        if (other.oldHasProtectedContent != oldHasProtectedContent) {
            return false
        }
        return other.newHasProtectedContent == newHasProtectedContent
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + requestMessageId.hashCode()
        hashCode = 31 * hashCode + oldHasProtectedContent.hashCode()
        hashCode = 31 * hashCode + newHasProtectedContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChatHasProtectedContentToggled")
            append("(")
            append("requestMessageId=")
            append(requestMessageId)
            append(", ")
            append("oldHasProtectedContent=")
            append(oldHasProtectedContent)
            append(", ")
            append("newHasProtectedContent=")
            append(newHasProtectedContent)
            append(")")
        }
    }
}
