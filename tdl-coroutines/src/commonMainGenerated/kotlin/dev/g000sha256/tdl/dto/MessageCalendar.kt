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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about found messages, split by days according to the option &quot;utc_time_offset&quot;.
 *
 * @property totalCount Total number of found messages.
 * @property days Information about messages sent.
 */
@SerialName(value = "messageCalendar")
@Serializable
public class MessageCalendar public constructor(
    @SerialName(value = "total_count")
    public val totalCount: Int,
    @SerialName(value = "days")
    public val days: Array<MessageCalendarDay>,
) : Model() {
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
        other as MessageCalendar
        if (other.totalCount != totalCount) {
            return false
        }
        return other.days.contentDeepEquals(days)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + days.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageCalendar")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("days=")
            days
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
