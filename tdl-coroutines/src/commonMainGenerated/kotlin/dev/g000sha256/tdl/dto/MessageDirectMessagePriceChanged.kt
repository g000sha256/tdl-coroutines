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
 * A price for direct messages was changed in the channel chat.
 *
 * @property isEnabled True, if direct messages group was enabled for the channel; false otherwise.
 * @property paidMessageStarCount The new number of Telegram Stars that must be paid by non-administrator users of the channel chat for each message sent to the direct messages group; 0 if the direct messages group was disabled or the messages are free.
 */
public class MessageDirectMessagePriceChanged public constructor(
    public val isEnabled: Boolean,
    public val paidMessageStarCount: Long,
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
        other as MessageDirectMessagePriceChanged
        if (other.isEnabled != isEnabled) {
            return false
        }
        return other.paidMessageStarCount == paidMessageStarCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isEnabled.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageDirectMessagePriceChanged")
            append("(")
            append("isEnabled=")
            append(isEnabled)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(")")
        }
    }
}
