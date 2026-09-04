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
 * A bot managed by another bot was created by the user.
 *
 * @property botUserId User identifier of the created bot.
 * @property managerBotUserId Identifier of the bot which will manage the new bot.
 */
public class MessageManagedBotCreated public constructor(
    public val botUserId: Long,
    public val managerBotUserId: Long,
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
        other as MessageManagedBotCreated
        if (other.botUserId != botUserId) {
            return false
        }
        return other.managerBotUserId == managerBotUserId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + managerBotUserId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageManagedBotCreated")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("managerBotUserId=")
            append(managerBotUserId)
            append(")")
        }
    }
}
