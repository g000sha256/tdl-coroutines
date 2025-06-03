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
import kotlin.Long
import kotlin.String

/**
 * Describes a poll.
 *
 * @property id Unique poll identifier.
 * @property question Poll question; 1-300 characters. Only custom emoji entities are allowed.
 * @property options List of poll answer options.
 * @property totalVoterCount Total number of voters, participating in the poll.
 * @property recentVoterIds Identifiers of recent voters, if the poll is non-anonymous.
 * @property isAnonymous True, if the poll is anonymous.
 * @property type Type of the poll.
 * @property openPeriod Amount of time the poll will be active after creation, in seconds.
 * @property closeDate Point in time (Unix timestamp) when the poll will automatically be closed.
 * @property isClosed True, if the poll is closed.
 */
public class Poll public constructor(
    public val id: Long,
    public val question: FormattedText,
    public val options: Array<PollOption>,
    public val totalVoterCount: Int,
    public val recentVoterIds: Array<MessageSender>,
    public val isAnonymous: Boolean,
    public val type: PollType,
    public val openPeriod: Int,
    public val closeDate: Int,
    public val isClosed: Boolean,
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
        other as Poll
        if (other.id != id) {
            return false
        }
        if (other.question != question) {
            return false
        }
        val optionsEquals = other.options.contentDeepEquals(options)
        if (!optionsEquals) {
            return false
        }
        if (other.totalVoterCount != totalVoterCount) {
            return false
        }
        val recentVoterIdsEquals = other.recentVoterIds.contentDeepEquals(recentVoterIds)
        if (!recentVoterIdsEquals) {
            return false
        }
        if (other.isAnonymous != isAnonymous) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.openPeriod != openPeriod) {
            return false
        }
        if (other.closeDate != closeDate) {
            return false
        }
        return other.isClosed == isClosed
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + question.hashCode()
        hashCode = 31 * hashCode + options.contentDeepHashCode()
        hashCode = 31 * hashCode + totalVoterCount.hashCode()
        hashCode = 31 * hashCode + recentVoterIds.contentDeepHashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + openPeriod.hashCode()
        hashCode = 31 * hashCode + closeDate.hashCode()
        hashCode = 31 * hashCode + isClosed.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Poll")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("question=")
            append(question)
            append(", ")
            append("options=")
            options
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("totalVoterCount=")
            append(totalVoterCount)
            append(", ")
            append("recentVoterIds=")
            recentVoterIds
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("openPeriod=")
            append(openPeriod)
            append(", ")
            append("closeDate=")
            append(closeDate)
            append(", ")
            append("isClosed=")
            append(isClosed)
            append(")")
        }
    }
}
