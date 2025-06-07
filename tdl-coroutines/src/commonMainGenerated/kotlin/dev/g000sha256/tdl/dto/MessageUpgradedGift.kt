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
 * An upgraded gift was received or sent by the current user, or the current user was notified about a channel gift.
 *
 * @property gift The gift.
 * @property senderId Sender of the gift; may be null for anonymous gifts.
 * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
 * @property isUpgrade True, if the gift was obtained by upgrading of a previously received gift; otherwise, this is a transferred or resold gift.
 * @property isSaved True, if the gift is displayed on the user's or the channel's profile page; only for the receiver of the gift.
 * @property canBeTransferred True, if the gift can be transferred to another owner; only for the receiver of the gift.
 * @property wasTransferred True, if the gift was transferred to another owner; only for the receiver of the gift.
 * @property lastResaleStarCount Number of Telegram Stars that were paid by the sender for the gift; 0 if the gift was upgraded or transferred.
 * @property transferStarCount Number of Telegram Stars that must be paid to transfer the upgraded gift; only for the receiver of the gift.
 * @property nextTransferDate Point in time (Unix timestamp) when the gift can be transferred to another owner; 0 if the gift can be transferred immediately or transfer isn't possible; only for the receiver of the gift.
 * @property nextResaleDate Point in time (Unix timestamp) when the gift can be resold to another user; 0 if the gift can't be resold; only for the receiver of the gift.
 * @property exportDate Point in time (Unix timestamp) when the gift can be transferred to the TON blockchain as an NFT; 0 if NFT export isn't possible; only for the receiver of the gift.
 */
@SerialName(value = "messageUpgradedGift")
@Serializable
public class MessageUpgradedGift public constructor(
    @SerialName(value = "gift")
    public val gift: UpgradedGift,
    @SerialName(value = "sender_id")
    public val senderId: MessageSender?,
    @SerialName(value = "received_gift_id")
    public val receivedGiftId: String,
    @SerialName(value = "is_upgrade")
    public val isUpgrade: Boolean,
    @SerialName(value = "is_saved")
    public val isSaved: Boolean,
    @SerialName(value = "can_be_transferred")
    public val canBeTransferred: Boolean,
    @SerialName(value = "was_transferred")
    public val wasTransferred: Boolean,
    @SerialName(value = "last_resale_star_count")
    public val lastResaleStarCount: Long,
    @SerialName(value = "transfer_star_count")
    public val transferStarCount: Long,
    @SerialName(value = "next_transfer_date")
    public val nextTransferDate: Int,
    @SerialName(value = "next_resale_date")
    public val nextResaleDate: Int,
    @SerialName(value = "export_date")
    public val exportDate: Int,
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
        other as MessageUpgradedGift
        if (other.gift != gift) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.receivedGiftId != receivedGiftId) {
            return false
        }
        if (other.isUpgrade != isUpgrade) {
            return false
        }
        if (other.isSaved != isSaved) {
            return false
        }
        if (other.canBeTransferred != canBeTransferred) {
            return false
        }
        if (other.wasTransferred != wasTransferred) {
            return false
        }
        if (other.lastResaleStarCount != lastResaleStarCount) {
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
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + receivedGiftId.hashCode()
        hashCode = 31 * hashCode + isUpgrade.hashCode()
        hashCode = 31 * hashCode + isSaved.hashCode()
        hashCode = 31 * hashCode + canBeTransferred.hashCode()
        hashCode = 31 * hashCode + wasTransferred.hashCode()
        hashCode = 31 * hashCode + lastResaleStarCount.hashCode()
        hashCode = 31 * hashCode + transferStarCount.hashCode()
        hashCode = 31 * hashCode + nextTransferDate.hashCode()
        hashCode = 31 * hashCode + nextResaleDate.hashCode()
        hashCode = 31 * hashCode + exportDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageUpgradedGift")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("receivedGiftId=")
            append(receivedGiftId)
            append(", ")
            append("isUpgrade=")
            append(isUpgrade)
            append(", ")
            append("isSaved=")
            append(isSaved)
            append(", ")
            append("canBeTransferred=")
            append(canBeTransferred)
            append(", ")
            append("wasTransferred=")
            append(wasTransferred)
            append(", ")
            append("lastResaleStarCount=")
            append(lastResaleStarCount)
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
