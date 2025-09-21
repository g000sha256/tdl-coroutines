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
 * Contains information about public post search limits.
 *
 * @property dailyFreeQueryCount Number of queries that can be sent daily for free.
 * @property remainingFreeQueryCount Number of remaining free queries today.
 * @property nextFreeQueryIn Amount of time till the next free query can be sent; 0 if it can be sent now.
 * @property starCount Number of Telegram Stars that must be paid for each non-free query.
 * @property isCurrentQueryFree True, if the search for the specified query isn't charged.
 */
public class PublicPostSearchLimits public constructor(
    public val dailyFreeQueryCount: Int,
    public val remainingFreeQueryCount: Int,
    public val nextFreeQueryIn: Int,
    public val starCount: Long,
    public val isCurrentQueryFree: Boolean,
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
        other as PublicPostSearchLimits
        if (other.dailyFreeQueryCount != dailyFreeQueryCount) {
            return false
        }
        if (other.remainingFreeQueryCount != remainingFreeQueryCount) {
            return false
        }
        if (other.nextFreeQueryIn != nextFreeQueryIn) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        return other.isCurrentQueryFree == isCurrentQueryFree
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + dailyFreeQueryCount.hashCode()
        hashCode = 31 * hashCode + remainingFreeQueryCount.hashCode()
        hashCode = 31 * hashCode + nextFreeQueryIn.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + isCurrentQueryFree.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PublicPostSearchLimits")
            append("(")
            append("dailyFreeQueryCount=")
            append(dailyFreeQueryCount)
            append(", ")
            append("remainingFreeQueryCount=")
            append(remainingFreeQueryCount)
            append(", ")
            append("nextFreeQueryIn=")
            append(nextFreeQueryIn)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("isCurrentQueryFree=")
            append(isCurrentQueryFree)
            append(")")
        }
    }
}
