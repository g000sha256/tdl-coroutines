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
 * Describes an option for the number of winners of a Telegram Star giveaway.
 *
 * @property winnerCount The number of users that will be chosen as winners.
 * @property wonStarCount The number of Telegram Stars that will be won by the winners of the giveaway.
 * @property isDefault True, if the option must be chosen by default.
 */
public class StarGiveawayWinnerOptionDto public constructor(
    public val winnerCount: Int,
    public val wonStarCount: Long,
    public val isDefault: Boolean,
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
        other as StarGiveawayWinnerOptionDto
        if (other.winnerCount != winnerCount) {
            return false
        }
        if (other.wonStarCount != wonStarCount) {
            return false
        }
        return other.isDefault == isDefault
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + winnerCount.hashCode()
        hashCode = 31 * hashCode + wonStarCount.hashCode()
        hashCode = 31 * hashCode + isDefault.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarGiveawayWinnerOptionDto")
            append("(")
            append("winnerCount=")
            append(winnerCount)
            append(", ")
            append("wonStarCount=")
            append(wonStarCount)
            append(", ")
            append("isDefault=")
            append(isDefault)
            append(")")
        }
    }
}
