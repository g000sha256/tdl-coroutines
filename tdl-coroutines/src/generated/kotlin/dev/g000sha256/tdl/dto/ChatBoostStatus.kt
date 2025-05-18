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
import kotlin.Double
import kotlin.Int
import kotlin.IntArray
import kotlin.String

/**
 * Describes current boost status of a chat.
 *
 * @property boostUrl An HTTP URL, which can be used to boost the chat.
 * @property appliedSlotIds Identifiers of boost slots of the current user applied to the chat.
 * @property level Current boost level of the chat.
 * @property giftCodeBoostCount The number of boosts received by the chat from created Telegram Premium gift codes and giveaways; always 0 if the current user isn't an administrator in the chat.
 * @property boostCount The number of boosts received by the chat.
 * @property currentLevelBoostCount The number of boosts added to reach the current level.
 * @property nextLevelBoostCount The number of boosts needed to reach the next level; 0 if the next level isn't available.
 * @property premiumMemberCount Approximate number of Telegram Premium subscribers joined the chat; always 0 if the current user isn't an administrator in the chat.
 * @property premiumMemberPercentage A percentage of Telegram Premium subscribers joined the chat; always 0 if the current user isn't an administrator in the chat.
 * @property prepaidGiveaways The list of prepaid giveaways available for the chat; only for chat administrators.
 */
public class ChatBoostStatus public constructor(
    public val boostUrl: String,
    public val appliedSlotIds: IntArray,
    public val level: Int,
    public val giftCodeBoostCount: Int,
    public val boostCount: Int,
    public val currentLevelBoostCount: Int,
    public val nextLevelBoostCount: Int,
    public val premiumMemberCount: Int,
    public val premiumMemberPercentage: Double,
    public val prepaidGiveaways: Array<PrepaidGiveaway>,
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
        other as ChatBoostStatus
        if (other.boostUrl != boostUrl) {
            return false
        }
        val appliedSlotIdsEquals = other.appliedSlotIds.contentEquals(appliedSlotIds)
        if (!appliedSlotIdsEquals) {
            return false
        }
        if (other.level != level) {
            return false
        }
        if (other.giftCodeBoostCount != giftCodeBoostCount) {
            return false
        }
        if (other.boostCount != boostCount) {
            return false
        }
        if (other.currentLevelBoostCount != currentLevelBoostCount) {
            return false
        }
        if (other.nextLevelBoostCount != nextLevelBoostCount) {
            return false
        }
        if (other.premiumMemberCount != premiumMemberCount) {
            return false
        }
        if (other.premiumMemberPercentage != premiumMemberPercentage) {
            return false
        }
        return other.prepaidGiveaways.contentDeepEquals(prepaidGiveaways)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + boostUrl.hashCode()
        hashCode = 31 * hashCode + appliedSlotIds.contentHashCode()
        hashCode = 31 * hashCode + level.hashCode()
        hashCode = 31 * hashCode + giftCodeBoostCount.hashCode()
        hashCode = 31 * hashCode + boostCount.hashCode()
        hashCode = 31 * hashCode + currentLevelBoostCount.hashCode()
        hashCode = 31 * hashCode + nextLevelBoostCount.hashCode()
        hashCode = 31 * hashCode + premiumMemberCount.hashCode()
        hashCode = 31 * hashCode + premiumMemberPercentage.hashCode()
        hashCode = 31 * hashCode + prepaidGiveaways.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostStatus")
            append("(")
            append("boostUrl=")
            append(boostUrl)
            append(", ")
            append("appliedSlotIds=")
            appliedSlotIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("level=")
            append(level)
            append(", ")
            append("giftCodeBoostCount=")
            append(giftCodeBoostCount)
            append(", ")
            append("boostCount=")
            append(boostCount)
            append(", ")
            append("currentLevelBoostCount=")
            append(currentLevelBoostCount)
            append(", ")
            append("nextLevelBoostCount=")
            append(nextLevelBoostCount)
            append(", ")
            append("premiumMemberCount=")
            append(premiumMemberCount)
            append(", ")
            append("premiumMemberPercentage=")
            append(premiumMemberPercentage)
            append(", ")
            append("prepaidGiveaways=")
            prepaidGiveaways
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
