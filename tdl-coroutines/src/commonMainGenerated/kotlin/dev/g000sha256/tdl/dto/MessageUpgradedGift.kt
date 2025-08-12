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
 * An upgraded gift was received or sent by the current user, or the current user was notified about a channel gift.
 *
 * @property gift The gift.
 * @property senderId Sender of the gift; may be null for anonymous gifts.
 * @property receiverId Receiver of the gift.
 * @property origin Origin of the upgraded gift.
 * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
 * @property isSaved True, if the gift is displayed on the user's or the channel's profile page; only for the receiver of the gift.
 * @property canBeTransferred True, if the gift can be transferred to another owner; only for the receiver of the gift.
 * @property wasTransferred True, if the gift has already been transferred to another owner; only for the receiver of the gift.
 * @property transferStarCount Number of Telegram Stars that must be paid to transfer the upgraded gift; only for the receiver of the gift.
 * @property nextTransferDate Point in time (Unix timestamp) when the gift can be transferred to another owner; 0 if the gift can be transferred immediately or transfer isn't possible; only for the receiver of the gift.
 * @property nextResaleDate Point in time (Unix timestamp) when the gift can be resold to another user; 0 if the gift can't be resold; only for the receiver of the gift.
 * @property exportDate Point in time (Unix timestamp) when the gift can be transferred to the TON blockchain as an NFT; 0 if NFT export isn't possible; only for the receiver of the gift.
 */
public class MessageUpgradedGift public constructor(
    public val gift: UpgradedGift,
    public val senderId: MessageSender?,
    public val receiverId: MessageSender,
    public val origin: UpgradedGiftOrigin,
    public val receivedGiftId: String,
    public val isSaved: Boolean,
    public val canBeTransferred: Boolean,
    public val wasTransferred: Boolean,
    public val transferStarCount: Long,
    public val nextTransferDate: Int,
    public val nextResaleDate: Int,
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
        if (other.receiverId != receiverId) {
            return false
        }
        if (other.origin != origin) {
            return false
        }
        if (other.receivedGiftId != receivedGiftId) {
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
        hashCode = 31 * hashCode + receiverId.hashCode()
        hashCode = 31 * hashCode + origin.hashCode()
        hashCode = 31 * hashCode + receivedGiftId.hashCode()
        hashCode = 31 * hashCode + isSaved.hashCode()
        hashCode = 31 * hashCode + canBeTransferred.hashCode()
        hashCode = 31 * hashCode + wasTransferred.hashCode()
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
            append("receiverId=")
            append(receiverId)
            append(", ")
            append("origin=")
            append(origin)
            append(", ")
            append("receivedGiftId=")
            append(receivedGiftId)
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
