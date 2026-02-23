/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * The chat created a giveaway.
 *
 * @property userId Identifier of a user who won in the giveaway; 0 if none.
 * @property giftCode The created Telegram Premium gift code if it was used by the user or can be claimed by the current user; an empty string otherwise; for Telegram Premium giveways only.
 * @property starCount Number of Telegram Stars distributed among winners of the giveaway.
 * @property giveawayMessageId Identifier of the corresponding giveaway message; can be an identifier of a deleted message.
 * @property isUnclaimed True, if the winner for the corresponding giveaway prize wasn't chosen, because there were not enough participants.
 */
public class ChatBoostSourceGiveaway public constructor(
    public val userId: Long,
    public val giftCode: String,
    public val starCount: Long,
    public val giveawayMessageId: Long,
    public val isUnclaimed: Boolean,
) : ChatBoostSource() {
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
        other as ChatBoostSourceGiveaway
        if (other.userId != userId) {
            return false
        }
        if (other.giftCode != giftCode) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        if (other.giveawayMessageId != giveawayMessageId) {
            return false
        }
        return other.isUnclaimed == isUnclaimed
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + giftCode.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + giveawayMessageId.hashCode()
        hashCode = 31 * hashCode + isUnclaimed.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostSourceGiveaway")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("giftCode=")
            append(giftCode)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("giveawayMessageId=")
            append(giveawayMessageId)
            append(", ")
            append("isUnclaimed=")
            append(isUnclaimed)
            append(")")
        }
    }
}
