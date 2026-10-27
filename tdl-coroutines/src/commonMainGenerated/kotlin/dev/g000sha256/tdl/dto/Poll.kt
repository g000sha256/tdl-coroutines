/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * Describes a poll.
 *
 * @property id Unique poll identifier.
 * @property question Poll question; 1-300 characters; may contain only custom emoji entities.
 * @property options List of poll answer options.
 * @property totalVoterCount Total number of voters, participating in the poll.
 * @property recentVoterIds Identifiers of recent voters, if the poll is non-anonymous and poll results are available.
 * @property canGetVoters True, if the current user can get voters in the poll using getPollVoters.
 * @property canSeeResults True, if the current user can see results of the poll.
 * @property isAnonymous True, if the poll is anonymous.
 * @property allowsMultipleAnswers True, if multiple answer options can be chosen simultaneously.
 * @property allowsRevoting True, if the poll can be answered multiple times.
 * @property membersOnly True, if only the users that are members of the chat for more than a day will be able to vote.
 * @property countryCodes The list of two-letter ISO 3166-1 alpha-2 codes of countries, users from which will be able to vote. If empty, then all users can participate in the poll.
 * @property optionOrder The list of 0-based poll option identifiers in which the options of the poll must be shown; empty if the order of options must not be changed.
 * @property type Type of the poll.
 * @property openPeriod Amount of time the poll will be active after creation, in seconds.
 * @property closeDate Point in time (Unix timestamp) when the poll will automatically be closed.
 * @property isClosed True, if the poll is closed.
 * @property voteRestrictionReason The reason describing, why the current user can't vote in the poll; may be null if the user can vote in the poll.
 */
public class Poll public constructor(
    public val id: Long,
    public val question: FormattedText,
    public val options: Array<PollOption>,
    public val totalVoterCount: Int,
    public val recentVoterIds: Array<MessageSender>,
    public val canGetVoters: Boolean,
    public val canSeeResults: Boolean,
    public val isAnonymous: Boolean,
    public val allowsMultipleAnswers: Boolean,
    public val allowsRevoting: Boolean,
    public val membersOnly: Boolean,
    public val countryCodes: Array<String>,
    public val optionOrder: IntArray,
    public val type: PollType,
    public val openPeriod: Int,
    public val closeDate: Int,
    public val isClosed: Boolean,
    public val voteRestrictionReason: PollVoteRestrictionReason?,
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
        if (other.canGetVoters != canGetVoters) {
            return false
        }
        if (other.canSeeResults != canSeeResults) {
            return false
        }
        if (other.isAnonymous != isAnonymous) {
            return false
        }
        if (other.allowsMultipleAnswers != allowsMultipleAnswers) {
            return false
        }
        if (other.allowsRevoting != allowsRevoting) {
            return false
        }
        if (other.membersOnly != membersOnly) {
            return false
        }
        val countryCodesEquals = other.countryCodes.contentDeepEquals(countryCodes)
        if (!countryCodesEquals) {
            return false
        }
        val optionOrderEquals = other.optionOrder.contentEquals(optionOrder)
        if (!optionOrderEquals) {
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
        if (other.isClosed != isClosed) {
            return false
        }
        return other.voteRestrictionReason == voteRestrictionReason
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + question.hashCode()
        hashCode = 31 * hashCode + options.contentDeepHashCode()
        hashCode = 31 * hashCode + totalVoterCount.hashCode()
        hashCode = 31 * hashCode + recentVoterIds.contentDeepHashCode()
        hashCode = 31 * hashCode + canGetVoters.hashCode()
        hashCode = 31 * hashCode + canSeeResults.hashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        hashCode = 31 * hashCode + allowsMultipleAnswers.hashCode()
        hashCode = 31 * hashCode + allowsRevoting.hashCode()
        hashCode = 31 * hashCode + membersOnly.hashCode()
        hashCode = 31 * hashCode + countryCodes.contentDeepHashCode()
        hashCode = 31 * hashCode + optionOrder.contentHashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + openPeriod.hashCode()
        hashCode = 31 * hashCode + closeDate.hashCode()
        hashCode = 31 * hashCode + isClosed.hashCode()
        hashCode = 31 * hashCode + voteRestrictionReason.hashCode()
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
            append("canGetVoters=")
            append(canGetVoters)
            append(", ")
            append("canSeeResults=")
            append(canSeeResults)
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(", ")
            append("allowsMultipleAnswers=")
            append(allowsMultipleAnswers)
            append(", ")
            append("allowsRevoting=")
            append(allowsRevoting)
            append(", ")
            append("membersOnly=")
            append(membersOnly)
            append(", ")
            append("countryCodes=")
            countryCodes
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("optionOrder=")
            optionOrder
                .contentToString()
                .also { append(it) }
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
            append(", ")
            append("voteRestrictionReason=")
            append(voteRestrictionReason)
            append(")")
        }
    }
}
