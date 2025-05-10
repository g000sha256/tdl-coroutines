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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents a list of gifts received by a user or a chat.
 *
 * @property totalCount The total number of received gifts.
 * @property gifts The list of gifts.
 * @property areNotificationsEnabled True, if notifications about new gifts of the owner are enabled.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class ReceivedGiftsDto public constructor(
    public val totalCount: Int,
    public val gifts: Array<ReceivedGiftDto>,
    public val areNotificationsEnabled: Boolean,
    public val nextOffset: String,
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
        other as ReceivedGiftsDto
        if (other.totalCount != totalCount) {
            return false
        }
        val giftsEquals = other.gifts.contentDeepEquals(gifts)
        if (!giftsEquals) {
            return false
        }
        if (other.areNotificationsEnabled != areNotificationsEnabled) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + gifts.contentDeepHashCode()
        hashCode = 31 * hashCode + areNotificationsEnabled.hashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReceivedGiftsDto")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("gifts=")
            gifts
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("areNotificationsEnabled=")
            append(areNotificationsEnabled)
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
