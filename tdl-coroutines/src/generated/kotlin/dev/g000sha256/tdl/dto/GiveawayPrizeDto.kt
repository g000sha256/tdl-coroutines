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
 * This class is an abstract base class.
 * Contains information about a giveaway prize.
 */
public sealed class GiveawayPrizeDto private constructor() {
    /**
     * The giveaway sends Telegram Premium subscriptions to the winners.
     *
     * @property monthCount Number of months the Telegram Premium subscription will be active after code activation.
     */
    public class Premium public constructor(
        public val monthCount: Int,
    ) : GiveawayPrizeDto() {
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
            other as Premium
            return other.monthCount == monthCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("GiveawayPrizeDto.Premium")
                append("(")
                append("monthCount=")
                append(monthCount)
                append(")")
            }
        }
    }

    /**
     * The giveaway sends Telegram Stars to the winners.
     *
     * @property starCount Number of Telegram Stars that will be shared by all winners.
     */
    public class Stars public constructor(
        public val starCount: Long,
    ) : GiveawayPrizeDto() {
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
            other as Stars
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("GiveawayPrizeDto.Stars")
                append("(")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }
}
