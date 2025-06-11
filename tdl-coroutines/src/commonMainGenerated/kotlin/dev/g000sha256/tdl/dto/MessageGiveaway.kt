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
import kotlin.String

/**
 * A giveaway.
 *
 * @property parameters Giveaway parameters.
 * @property winnerCount Number of users which will receive Telegram Premium subscription gift codes.
 * @property prize Prize of the giveaway.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 */
public class MessageGiveaway public constructor(
    public val parameters: GiveawayParameters,
    public val winnerCount: Int,
    public val prize: GiveawayPrize,
    public val sticker: Sticker?,
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
        other as MessageGiveaway
        if (other.parameters != parameters) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.prize != prize) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + parameters.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + prize.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiveaway")
            append("(")
            append("parameters=")
            append(parameters)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("prize=")
            append(prize)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
