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
 * Represents a gift that was acquired by the current user on an auction.
 *
 * @property receiverId Receiver of the gift.
 * @property date Point in time (Unix timestamp) when the gift was acquired.
 * @property starCount The number of Telegram Stars that were paid for the gift.
 * @property auctionRoundNumber Identifier of the auction round in which the gift was acquired.
 * @property auctionRoundPosition Position of the user in the round among all auction participants.
 * @property text Message added to the gift.
 * @property isPrivate True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them.
 */
public class GiftAuctionAcquiredGift public constructor(
    public val receiverId: MessageSender,
    public val date: Int,
    public val starCount: Long,
    public val auctionRoundNumber: Int,
    public val auctionRoundPosition: Int,
    public val text: FormattedText,
    public val isPrivate: Boolean,
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
        other as GiftAuctionAcquiredGift
        if (other.receiverId != receiverId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        if (other.auctionRoundNumber != auctionRoundNumber) {
            return false
        }
        if (other.auctionRoundPosition != auctionRoundPosition) {
            return false
        }
        if (other.text != text) {
            return false
        }
        return other.isPrivate == isPrivate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + receiverId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + auctionRoundNumber.hashCode()
        hashCode = 31 * hashCode + auctionRoundPosition.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + isPrivate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftAuctionAcquiredGift")
            append("(")
            append("receiverId=")
            append(receiverId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("auctionRoundNumber=")
            append(auctionRoundNumber)
            append(", ")
            append("auctionRoundPosition=")
            append(auctionRoundPosition)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("isPrivate=")
            append(isPrivate)
            append(")")
        }
    }
}
