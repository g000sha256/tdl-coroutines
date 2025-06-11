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
 * A chat default appearance has changed.
 *
 * @property chatId Chat identifier.
 * @property viewAsTopics New value of viewAsTopics.
 */
public class UpdateChatViewAsTopics public constructor(
    public val chatId: Long,
    public val viewAsTopics: Boolean,
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
        other as UpdateChatViewAsTopics
        if (other.chatId != chatId) {
            return false
        }
        return other.viewAsTopics == viewAsTopics
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + viewAsTopics.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatViewAsTopics")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("viewAsTopics=")
            append(viewAsTopics)
            append(")")
        }
    }
}
