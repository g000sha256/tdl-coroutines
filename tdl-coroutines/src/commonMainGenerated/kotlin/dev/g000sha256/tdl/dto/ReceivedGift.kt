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
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * Represents a gift received by a user or a chat.
 *
 * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
 * @property senderId Identifier of a user or a chat that sent the gift; may be null if unknown.
 * @property text Message added to the gift.
 * @property isPrivate True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone are able to see them.
 * @property isSaved True, if the gift is displayed on the chat's profile page; only for the receiver of the gift.
 * @property isPinned True, if the gift is pinned to the top of the chat's profile page.
 * @property canBeUpgraded True, if the gift is a regular gift that can be upgraded to a unique gift; only for the receiver of the gift.
 * @property canBeTransferred True, if the gift is an upgraded gift that can be transferred to another owner; only for the receiver of the gift.
 * @property wasRefunded True, if the gift was refunded and isn't available anymore.
 * @property date Point in time (Unix timestamp) when the gift was sent.
 * @property gift The gift.
 * @property collectionIds Identifiers of collections to which the gift is added; only for the receiver of the gift.
 * @property sellStarCount Number of Telegram Stars that can be claimed by the receiver instead of the regular gift; 0 if the gift can't be sold by the current user.
 * @property prepaidUpgradeStarCount Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift.
 * @property transferStarCount Number of Telegram Stars that must be paid to transfer the upgraded gift; only for the receiver of the gift.
 * @property nextTransferDate Point in time (Unix timestamp) when the gift can be transferred to another owner; 0 if the gift can be transferred immediately or transfer isn't possible; only for the receiver of the gift.
 * @property nextResaleDate Point in time (Unix timestamp) when the gift can be resold to another user; 0 if the gift can't be resold; only for the receiver of the gift.
 * @property exportDate Point in time (Unix timestamp) when the upgraded gift can be transferred to the TON blockchain as an NFT; 0 if NFT export isn't possible; only for the receiver of the gift.
 */
public class ReceivedGift public constructor(
    public val receivedGiftId: String,
    public val senderId: MessageSender?,
    public val text: FormattedText,
    public val isPrivate: Boolean,
    public val isSaved: Boolean,
    public val isPinned: Boolean,
    public val canBeUpgraded: Boolean,
    public val canBeTransferred: Boolean,
    public val wasRefunded: Boolean,
    public val date: Int,
    public val gift: SentGift,
    public val collectionIds: IntArray,
    public val sellStarCount: Long,
    public val prepaidUpgradeStarCount: Long,
    public val transferStarCount: Long,
    public val nextTransferDate: Int,
    public val nextResaleDate: Int,
    public val exportDate: Int,
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
        other as ReceivedGift
        if (other.receivedGiftId != receivedGiftId) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.isPrivate != isPrivate) {
            return false
        }
        if (other.isSaved != isSaved) {
            return false
        }
        if (other.isPinned != isPinned) {
            return false
        }
        if (other.canBeUpgraded != canBeUpgraded) {
            return false
        }
        if (other.canBeTransferred != canBeTransferred) {
            return false
        }
        if (other.wasRefunded != wasRefunded) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.gift != gift) {
            return false
        }
        val collectionIdsEquals = other.collectionIds.contentEquals(collectionIds)
        if (!collectionIdsEquals) {
            return false
        }
        if (other.sellStarCount != sellStarCount) {
            return false
        }
        if (other.prepaidUpgradeStarCount != prepaidUpgradeStarCount) {
            return false
        }
        if (other.transferStarCount != transferStarCount) {
            return false
        }
        if (other.nextTransferDate != nextTransferDate) {
            return false
        }
        if (other.nextResaleDate != nextResaleDate) {
            return false
        }
        return other.exportDate == exportDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + receivedGiftId.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + isPrivate.hashCode()
        hashCode = 31 * hashCode + isSaved.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + canBeUpgraded.hashCode()
        hashCode = 31 * hashCode + canBeTransferred.hashCode()
        hashCode = 31 * hashCode + wasRefunded.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + collectionIds.contentHashCode()
        hashCode = 31 * hashCode + sellStarCount.hashCode()
        hashCode = 31 * hashCode + prepaidUpgradeStarCount.hashCode()
        hashCode = 31 * hashCode + transferStarCount.hashCode()
        hashCode = 31 * hashCode + nextTransferDate.hashCode()
        hashCode = 31 * hashCode + nextResaleDate.hashCode()
        hashCode = 31 * hashCode + exportDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReceivedGift")
            append("(")
            append("receivedGiftId=")
            append(receivedGiftId)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("isPrivate=")
            append(isPrivate)
            append(", ")
            append("isSaved=")
            append(isSaved)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(", ")
            append("canBeUpgraded=")
            append(canBeUpgraded)
            append(", ")
            append("canBeTransferred=")
            append(canBeTransferred)
            append(", ")
            append("wasRefunded=")
            append(wasRefunded)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("gift=")
            append(gift)
            append(", ")
            append("collectionIds=")
            collectionIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("sellStarCount=")
            append(sellStarCount)
            append(", ")
            append("prepaidUpgradeStarCount=")
            append(prepaidUpgradeStarCount)
            append(", ")
            append("transferStarCount=")
            append(transferStarCount)
            append(", ")
            append("nextTransferDate=")
            append(nextTransferDate)
            append(", ")
            append("nextResaleDate=")
            append(nextResaleDate)
            append(", ")
            append("exportDate=")
            append(exportDate)
            append(")")
        }
    }
}
