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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Contains a list of bot commands.
 *
 * @property botUserId Bot's user identifier.
 * @property commands List of bot commands.
 */
public class BotCommands public constructor(
    public val botUserId: Long,
    public val commands: Array<BotCommand>,
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
        other as BotCommands
        if (other.botUserId != botUserId) {
            return false
        }
        return other.commands.contentDeepEquals(commands)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + commands.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BotCommands")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("commands=")
            commands
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
