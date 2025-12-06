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
 * Contains information about a Telegram Premium gift code.
 *
 * @property creatorId Identifier of a chat or a user that created the gift code; may be null if unknown. If null and the code is from messagePremiumGiftCode message, then creatorId from the message can be used.
 * @property creationDate Point in time (Unix timestamp) when the code was created.
 * @property isFromGiveaway True, if the gift code was created for a giveaway.
 * @property giveawayMessageId Identifier of the corresponding giveaway message in the creatorId chat; can be 0 or an identifier of a deleted message.
 * @property monthCount Number of months the Telegram Premium subscription will be active after code activation; 0 if the number of months isn't integer.
 * @property dayCount Number of days the Telegram Premium subscription will be active after code activation.
 * @property userId Identifier of a user for which the code was created; 0 if none.
 * @property useDate Point in time (Unix timestamp) when the code was activated; 0 if none.
 */
public class PremiumGiftCodeInfo public constructor(
    public val creatorId: MessageSender?,
    public val creationDate: Int,
    public val isFromGiveaway: Boolean,
    public val giveawayMessageId: Long,
    public val monthCount: Int,
    public val dayCount: Int,
    public val userId: Long,
    public val useDate: Int,
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
        other as PremiumGiftCodeInfo
        if (other.creatorId != creatorId) {
            return false
        }
        if (other.creationDate != creationDate) {
            return false
        }
        if (other.isFromGiveaway != isFromGiveaway) {
            return false
        }
        if (other.giveawayMessageId != giveawayMessageId) {
            return false
        }
        if (other.monthCount != monthCount) {
            return false
        }
        if (other.dayCount != dayCount) {
            return false
        }
        if (other.userId != userId) {
            return false
        }
        return other.useDate == useDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + creatorId.hashCode()
        hashCode = 31 * hashCode + creationDate.hashCode()
        hashCode = 31 * hashCode + isFromGiveaway.hashCode()
        hashCode = 31 * hashCode + giveawayMessageId.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        hashCode = 31 * hashCode + dayCount.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + useDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumGiftCodeInfo")
            append("(")
            append("creatorId=")
            append(creatorId)
            append(", ")
            append("creationDate=")
            append(creationDate)
            append(", ")
            append("isFromGiveaway=")
            append(isFromGiveaway)
            append(", ")
            append("giveawayMessageId=")
            append(giveawayMessageId)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(", ")
            append("dayCount=")
            append(dayCount)
            append(", ")
            append("userId=")
            append(userId)
            append(", ")
            append("useDate=")
            append(useDate)
            append(")")
        }
    }
}
