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
 * Describes a connection of the bot with a business account.
 *
 * @property id Unique identifier of the connection.
 * @property userId Identifier of the business user that created the connection.
 * @property userChatId Chat identifier of the private chat with the user.
 * @property date Point in time (Unix timestamp) when the connection was established.
 * @property rights Rights of the bot; may be null if the connection was disabled.
 * @property isEnabled True, if the connection is enabled; false otherwise.
 */
public class BusinessConnectionDto public constructor(
    public val id: String,
    public val userId: Long,
    public val userChatId: Long,
    public val date: Int,
    public val rights: BusinessBotRightsDto?,
    public val isEnabled: Boolean,
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
        other as BusinessConnectionDto
        if (other.id != id) {
            return false
        }
        if (other.userId != userId) {
            return false
        }
        if (other.userChatId != userChatId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.rights != rights) {
            return false
        }
        return other.isEnabled == isEnabled
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + userChatId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + rights.hashCode()
        hashCode = 31 * hashCode + isEnabled.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessConnectionDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("userId=")
            append(userId)
            append(", ")
            append("userChatId=")
            append(userChatId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("rights=")
            append(rights)
            append(", ")
            append("isEnabled=")
            append(isEnabled)
            append(")")
        }
    }
}
