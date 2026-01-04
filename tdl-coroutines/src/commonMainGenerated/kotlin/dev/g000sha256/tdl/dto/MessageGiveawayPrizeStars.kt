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
 * A Telegram Stars were received by the current user from a giveaway.
 *
 * @property starCount Number of Telegram Stars that were received.
 * @property transactionId Identifier of the transaction for Telegram Stars credit.
 * @property boostedChatId Identifier of the supergroup or channel chat, which was automatically boosted by the winners of the giveaway.
 * @property giveawayMessageId Identifier of the message with the giveaway in the boosted chat; may be 0 or an identifier of a deleted message.
 * @property isUnclaimed True, if the corresponding winner wasn't chosen and the Telegram Stars were received by the owner of the boosted chat.
 * @property sticker A sticker to be shown in the message; may be null if unknown.
 */
public class MessageGiveawayPrizeStars public constructor(
    public val starCount: Long,
    public val transactionId: String,
    public val boostedChatId: Long,
    public val giveawayMessageId: Long,
    public val isUnclaimed: Boolean,
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
        other as MessageGiveawayPrizeStars
        if (other.starCount != starCount) {
            return false
        }
        if (other.transactionId != transactionId) {
            return false
        }
        if (other.boostedChatId != boostedChatId) {
            return false
        }
        if (other.giveawayMessageId != giveawayMessageId) {
            return false
        }
        if (other.isUnclaimed != isUnclaimed) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + transactionId.hashCode()
        hashCode = 31 * hashCode + boostedChatId.hashCode()
        hashCode = 31 * hashCode + giveawayMessageId.hashCode()
        hashCode = 31 * hashCode + isUnclaimed.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGiveawayPrizeStars")
            append("(")
            append("starCount=")
            append(starCount)
            append(", ")
            append("transactionId=")
            append(transactionId)
            append(", ")
            append("boostedChatId=")
            append(boostedChatId)
            append(", ")
            append("giveawayMessageId=")
            append(giveawayMessageId)
            append(", ")
            append("isUnclaimed=")
            append(isUnclaimed)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
