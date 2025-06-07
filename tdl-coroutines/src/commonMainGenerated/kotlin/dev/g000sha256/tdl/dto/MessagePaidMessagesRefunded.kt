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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Paid messages were refunded.
 *
 * @property messageCount The number of refunded messages.
 * @property starCount The number of refunded Telegram Stars.
 */
@SerialName(value = "messagePaidMessagesRefunded")
@Serializable
public class MessagePaidMessagesRefunded public constructor(
    @SerialName(value = "message_count")
    public val messageCount: Int,
    @SerialName(value = "star_count")
    public val starCount: Long,
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
        other as MessagePaidMessagesRefunded
        if (other.messageCount != messageCount) {
            return false
        }
        return other.starCount == starCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageCount.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePaidMessagesRefunded")
            append("(")
            append("messageCount=")
            append(messageCount)
            append(", ")
            append("starCount=")
            append(starCount)
            append(")")
        }
    }
}
