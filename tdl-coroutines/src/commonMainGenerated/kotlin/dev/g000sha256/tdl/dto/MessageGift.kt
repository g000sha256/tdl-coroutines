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
 * A regular gift was received or sent by the current user, or the current user was notified about a channel gift.
 *
 * @property gift The gift.
 * @property senderId Sender of the gift; may be null for outgoing messages about prepaid upgrade of gifts from unknown users.
 * @property receiverId Receiver of the gift.
 * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
 * @property text Message added to the gift.
 * @property uniqueGiftNumber Unique number of the gift among gifts upgraded from the same gift after upgrade; 0 if yet unassigned.
 * @property sellStarCount Number of Telegram Stars that can be claimed by the receiver instead of the regular gift; 0 if the gift can't be sold by the receiver.
 * @property prepaidUpgradeStarCount Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift.
 * @property isUpgradeSeparate True, if the upgrade was bought after the gift was sent. In this case, prepaid upgrade cost must not be added to the gift cost.
 * @property isFromAuction True, if the message is a notification about a gift won on an auction.
 * @property isPrivate True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them.
 * @property isSaved True, if the gift is displayed on the user's or the channel's profile page; only for the receiver of the gift.
 * @property isPrepaidUpgrade True, if the message is about prepaid upgrade of the gift by another user.
 * @property canBeUpgraded True, if the gift can be upgraded to a unique gift; only for the receiver of the gift.
 * @property wasConverted True, if the gift was converted to Telegram Stars; only for the receiver of the gift.
 * @property wasUpgraded True, if the gift was upgraded to a unique gift.
 * @property wasRefunded True, if the gift was refunded and isn't available anymore.
 * @property upgradedReceivedGiftId Identifier of the corresponding upgraded gift; may be empty if unknown. Use getReceivedGift to get information about the gift.
 * @property prepaidUpgradeHash If non-empty, then the user can pay for an upgrade of the gift using buyGiftUpgrade.
 */
public class MessageGift public constructor(
    public val gift: Gift,
    public val senderId: MessageSender?,
    public val receiverId: MessageSender,
    public val receivedGiftId: String,
    public val text: FormattedText,
    public val uniqueGiftNumber: Int,
    public val sellStarCount: Long,
    public val prepaidUpgradeStarCount: Long,
    public val isUpgradeSeparate: Boolean,
    public val isFromAuction: Boolean,
    public val isPrivate: Boolean,
    public val isSaved: Boolean,
    public val isPrepaidUpgrade: Boolean,
    public val canBeUpgraded: Boolean,
    public val wasConverted: Boolean,
    public val wasUpgraded: Boolean,
    public val wasRefunded: Boolean,
    public val upgradedReceivedGiftId: String,
    public val prepaidUpgradeHash: String,
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
        other as MessageGift
        if (other.gift != gift) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.receiverId != receiverId) {
            return false
        }
        if (other.receivedGiftId != receivedGiftId) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.uniqueGiftNumber != uniqueGiftNumber) {
            return false
        }
        if (other.sellStarCount != sellStarCount) {
            return false
        }
        if (other.prepaidUpgradeStarCount != prepaidUpgradeStarCount) {
            return false
        }
        if (other.isUpgradeSeparate != isUpgradeSeparate) {
            return false
        }
        if (other.isFromAuction != isFromAuction) {
            return false
        }
        if (other.isPrivate != isPrivate) {
            return false
        }
        if (other.isSaved != isSaved) {
            return false
        }
        if (other.isPrepaidUpgrade != isPrepaidUpgrade) {
            return false
        }
        if (other.canBeUpgraded != canBeUpgraded) {
            return false
        }
        if (other.wasConverted != wasConverted) {
            return false
        }
        if (other.wasUpgraded != wasUpgraded) {
            return false
        }
        if (other.wasRefunded != wasRefunded) {
            return false
        }
        if (other.upgradedReceivedGiftId != upgradedReceivedGiftId) {
            return false
        }
        return other.prepaidUpgradeHash == prepaidUpgradeHash
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + receiverId.hashCode()
        hashCode = 31 * hashCode + receivedGiftId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + uniqueGiftNumber.hashCode()
        hashCode = 31 * hashCode + sellStarCount.hashCode()
        hashCode = 31 * hashCode + prepaidUpgradeStarCount.hashCode()
        hashCode = 31 * hashCode + isUpgradeSeparate.hashCode()
        hashCode = 31 * hashCode + isFromAuction.hashCode()
        hashCode = 31 * hashCode + isPrivate.hashCode()
        hashCode = 31 * hashCode + isSaved.hashCode()
        hashCode = 31 * hashCode + isPrepaidUpgrade.hashCode()
        hashCode = 31 * hashCode + canBeUpgraded.hashCode()
        hashCode = 31 * hashCode + wasConverted.hashCode()
        hashCode = 31 * hashCode + wasUpgraded.hashCode()
        hashCode = 31 * hashCode + wasRefunded.hashCode()
        hashCode = 31 * hashCode + upgradedReceivedGiftId.hashCode()
        hashCode = 31 * hashCode + prepaidUpgradeHash.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGift")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("receiverId=")
            append(receiverId)
            append(", ")
            append("receivedGiftId=")
            append(receivedGiftId)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("uniqueGiftNumber=")
            append(uniqueGiftNumber)
            append(", ")
            append("sellStarCount=")
            append(sellStarCount)
            append(", ")
            append("prepaidUpgradeStarCount=")
            append(prepaidUpgradeStarCount)
            append(", ")
            append("isUpgradeSeparate=")
            append(isUpgradeSeparate)
            append(", ")
            append("isFromAuction=")
            append(isFromAuction)
            append(", ")
            append("isPrivate=")
            append(isPrivate)
            append(", ")
            append("isSaved=")
            append(isSaved)
            append(", ")
            append("isPrepaidUpgrade=")
            append(isPrepaidUpgrade)
            append(", ")
            append("canBeUpgraded=")
            append(canBeUpgraded)
            append(", ")
            append("wasConverted=")
            append(wasConverted)
            append(", ")
            append("wasUpgraded=")
            append(wasUpgraded)
            append(", ")
            append("wasRefunded=")
            append(wasRefunded)
            append(", ")
            append("upgradedReceivedGiftId=")
            append(upgradedReceivedGiftId)
            append(", ")
            append("prepaidUpgradeHash=")
            append(prepaidUpgradeHash)
            append(")")
        }
    }
}
