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
 * Contains information about a chat shared with a bot.
 *
 * @property chatId Chat identifier.
 * @property title Title of the chat; for bots only.
 * @property username Username of the chat; for bots only.
 * @property photo Photo of the chat; for bots only; may be null.
 */
public class SharedChat public constructor(
    public val chatId: Long,
    public val title: String,
    public val username: String,
    public val photo: Photo?,
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
        other as SharedChat
        if (other.chatId != chatId) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.username != username) {
            return false
        }
        return other.photo == photo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + username.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SharedChat")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("username=")
            append(username)
            append(", ")
            append("photo=")
            append(photo)
            append(")")
        }
    }
}
