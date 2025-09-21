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
 * Describes a gift that can be sent to another user or channel chat.
 *
 * @property id Unique identifier of the gift.
 * @property publisherChatId Identifier of the chat that published the gift; 0 if none.
 * @property sticker The sticker representing the gift.
 * @property starCount Number of Telegram Stars that must be paid for the gift.
 * @property defaultSellStarCount Number of Telegram Stars that can be claimed by the receiver instead of the regular gift by default. If the gift was paid with just bought Telegram Stars, then full value can be claimed.
 * @property upgradeStarCount Number of Telegram Stars that must be paid to upgrade the gift; 0 if upgrade isn't possible.
 * @property isForBirthday True, if the gift is a birthday gift.
 * @property isPremium True, if the gift can be bought only by Telegram Premium subscribers.
 * @property userLimits Number of times the gift can be purchased by the current user; may be null if not limited.
 * @property overallLimits Number of times the gift can be purchased all users; may be null if not limited.
 * @property firstSendDate Point in time (Unix timestamp) when the gift was send for the first time; for sold out gifts only.
 * @property lastSendDate Point in time (Unix timestamp) when the gift was send for the last time; for sold out gifts only.
 */
public class Gift public constructor(
    public val id: Long,
    public val publisherChatId: Long,
    public val sticker: Sticker,
    public val starCount: Long,
    public val defaultSellStarCount: Long,
    public val upgradeStarCount: Long,
    public val isForBirthday: Boolean,
    public val isPremium: Boolean,
    public val userLimits: GiftPurchaseLimits?,
    public val overallLimits: GiftPurchaseLimits?,
    public val firstSendDate: Int,
    public val lastSendDate: Int,
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
        other as Gift
        if (other.id != id) {
            return false
        }
        if (other.publisherChatId != publisherChatId) {
            return false
        }
        if (other.sticker != sticker) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        if (other.defaultSellStarCount != defaultSellStarCount) {
            return false
        }
        if (other.upgradeStarCount != upgradeStarCount) {
            return false
        }
        if (other.isForBirthday != isForBirthday) {
            return false
        }
        if (other.isPremium != isPremium) {
            return false
        }
        if (other.userLimits != userLimits) {
            return false
        }
        if (other.overallLimits != overallLimits) {
            return false
        }
        if (other.firstSendDate != firstSendDate) {
            return false
        }
        return other.lastSendDate == lastSendDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + publisherChatId.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + defaultSellStarCount.hashCode()
        hashCode = 31 * hashCode + upgradeStarCount.hashCode()
        hashCode = 31 * hashCode + isForBirthday.hashCode()
        hashCode = 31 * hashCode + isPremium.hashCode()
        hashCode = 31 * hashCode + userLimits.hashCode()
        hashCode = 31 * hashCode + overallLimits.hashCode()
        hashCode = 31 * hashCode + firstSendDate.hashCode()
        hashCode = 31 * hashCode + lastSendDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Gift")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("publisherChatId=")
            append(publisherChatId)
            append(", ")
            append("sticker=")
            append(sticker)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("defaultSellStarCount=")
            append(defaultSellStarCount)
            append(", ")
            append("upgradeStarCount=")
            append(upgradeStarCount)
            append(", ")
            append("isForBirthday=")
            append(isForBirthday)
            append(", ")
            append("isPremium=")
            append(isPremium)
            append(", ")
            append("userLimits=")
            append(userLimits)
            append(", ")
            append("overallLimits=")
            append(overallLimits)
            append(", ")
            append("firstSendDate=")
            append(firstSendDate)
            append(", ")
            append("lastSendDate=")
            append(lastSendDate)
            append(")")
        }
    }
}
