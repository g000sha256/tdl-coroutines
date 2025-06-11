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
 * Contains information about a message in a specific position.
 *
 * @property position 0-based message position in the full list of suitable messages.
 * @property messageId Message identifier.
 * @property date Point in time (Unix timestamp) when the message was sent.
 */
public class MessagePosition public constructor(
    public val position: Int,
    public val messageId: Long,
    public val date: Int,
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
        other as MessagePosition
        if (other.position != position) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        return other.date == date
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + position.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePosition")
            append("(")
            append("position=")
            append(position)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("date=")
            append(date)
            append(")")
        }
    }
}
