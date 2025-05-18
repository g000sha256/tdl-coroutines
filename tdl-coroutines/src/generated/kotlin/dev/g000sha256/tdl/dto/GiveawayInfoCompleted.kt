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
 * Describes a completed giveaway.
 *
 * @property creationDate Point in time (Unix timestamp) when the giveaway was created.
 * @property actualWinnersSelectionDate Point in time (Unix timestamp) when the winners were selected. May be bigger than winners selection date specified in parameters of the giveaway.
 * @property wasRefunded True, if the giveaway was canceled and was fully refunded.
 * @property isWinner True, if the current user is a winner of the giveaway.
 * @property winnerCount Number of winners in the giveaway.
 * @property activationCount Number of winners, which activated their gift codes; for Telegram Premium giveaways only.
 * @property giftCode Telegram Premium gift code that was received by the current user; empty if the user isn't a winner in the giveaway or the giveaway isn't a Telegram Premium giveaway.
 * @property wonStarCount The amount of Telegram Stars won by the current user; 0 if the user isn't a winner in the giveaway or the giveaway isn't a Telegram Star giveaway.
 */
public class GiveawayInfoCompleted public constructor(
    public val creationDate: Int,
    public val actualWinnersSelectionDate: Int,
    public val wasRefunded: Boolean,
    public val isWinner: Boolean,
    public val winnerCount: Int,
    public val activationCount: Int,
    public val giftCode: String,
    public val wonStarCount: Long,
) : GiveawayInfo() {
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
        other as GiveawayInfoCompleted
        if (other.creationDate != creationDate) {
            return false
        }
        if (other.actualWinnersSelectionDate != actualWinnersSelectionDate) {
            return false
        }
        if (other.wasRefunded != wasRefunded) {
            return false
        }
        if (other.isWinner != isWinner) {
            return false
        }
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.activationCount != activationCount) {
            return false
        }
        if (other.giftCode != giftCode) {
            return false
        }
        return other.wonStarCount == wonStarCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + creationDate.hashCode()
        hashCode = 31 * hashCode + actualWinnersSelectionDate.hashCode()
        hashCode = 31 * hashCode + wasRefunded.hashCode()
        hashCode = 31 * hashCode + isWinner.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + activationCount.hashCode()
        hashCode = 31 * hashCode + giftCode.hashCode()
        hashCode = 31 * hashCode + wonStarCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiveawayInfoCompleted")
            append("(")
            append("creationDate=")
            append(creationDate)
            append(", ")
            append("actualWinnersSelectionDate=")
            append(actualWinnersSelectionDate)
            append(", ")
            append("wasRefunded=")
            append(wasRefunded)
            append(", ")
            append("isWinner=")
            append(isWinner)
            append(", ")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("activationCount=")
            append(activationCount)
            append(", ")
            append("giftCode=")
            append(giftCode)
            append(", ")
            append("wonStarCount=")
            append(wonStarCount)
            append(")")
        }
    }
}
