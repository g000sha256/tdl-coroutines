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
import kotlin.String

/**
 * Describes one answer option of a poll.
 *
 * @property text Option text; 1-100 characters. Only custom emoji entities are allowed.
 * @property voterCount Number of voters for this option, available only for closed or voted polls.
 * @property votePercentage The percentage of votes for this option; 0-100.
 * @property isChosen True, if the option was chosen by the user.
 * @property isBeingChosen True, if the option is being chosen by a pending setPollAnswer request.
 */
public class PollOptionDto public constructor(
    public val text: FormattedTextDto,
    public val voterCount: Int,
    public val votePercentage: Int,
    public val isChosen: Boolean,
    public val isBeingChosen: Boolean,
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
        other as PollOptionDto
        if (other.text != text) {
            return false
        }
        if (other.voterCount != voterCount) {
            return false
        }
        if (other.votePercentage != votePercentage) {
            return false
        }
        if (other.isChosen != isChosen) {
            return false
        }
        return other.isBeingChosen == isBeingChosen
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + voterCount.hashCode()
        hashCode = 31 * hashCode + votePercentage.hashCode()
        hashCode = 31 * hashCode + isChosen.hashCode()
        hashCode = 31 * hashCode + isBeingChosen.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PollOptionDto")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("voterCount=")
            append(voterCount)
            append(", ")
            append("votePercentage=")
            append(votePercentage)
            append(", ")
            append("isChosen=")
            append(isChosen)
            append(", ")
            append("isBeingChosen=")
            append(isBeingChosen)
            append(")")
        }
    }
}
