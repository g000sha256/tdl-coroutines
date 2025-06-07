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
 * A detailed statistics about a supergroup chat.
 *
 * @property period A period to which the statistics applies.
 * @property memberCount Number of members in the chat.
 * @property messageCount Number of messages sent to the chat.
 * @property viewerCount Number of users who viewed messages in the chat.
 * @property senderCount Number of users who sent messages to the chat.
 * @property memberCountGraph A graph containing number of members in the chat.
 * @property joinGraph A graph containing number of members joined and left the chat.
 * @property joinBySourceGraph A graph containing number of new member joins per source.
 * @property languageGraph A graph containing distribution of active users per language.
 * @property messageContentGraph A graph containing distribution of sent messages by content type.
 * @property actionGraph A graph containing number of different actions in the chat.
 * @property dayGraph A graph containing distribution of message views per hour.
 * @property weekGraph A graph containing distribution of message views per day of week.
 * @property topSenders List of users sent most messages in the last week.
 * @property topAdministrators List of most active administrators in the last week.
 * @property topInviters List of most active inviters of new members in the last week.
 */
@SerialName(value = "chatStatisticsSupergroup")
@Serializable
public class ChatStatisticsSupergroup public constructor(
    @SerialName(value = "period")
    public val period: DateRange,
    @SerialName(value = "member_count")
    public val memberCount: StatisticalValue,
    @SerialName(value = "message_count")
    public val messageCount: StatisticalValue,
    @SerialName(value = "viewer_count")
    public val viewerCount: StatisticalValue,
    @SerialName(value = "sender_count")
    public val senderCount: StatisticalValue,
    @SerialName(value = "member_count_graph")
    public val memberCountGraph: StatisticalGraph,
    @SerialName(value = "join_graph")
    public val joinGraph: StatisticalGraph,
    @SerialName(value = "join_by_source_graph")
    public val joinBySourceGraph: StatisticalGraph,
    @SerialName(value = "language_graph")
    public val languageGraph: StatisticalGraph,
    @SerialName(value = "message_content_graph")
    public val messageContentGraph: StatisticalGraph,
    @SerialName(value = "action_graph")
    public val actionGraph: StatisticalGraph,
    @SerialName(value = "day_graph")
    public val dayGraph: StatisticalGraph,
    @SerialName(value = "week_graph")
    public val weekGraph: StatisticalGraph,
    @SerialName(value = "top_senders")
    public val topSenders: Array<ChatStatisticsMessageSenderInfo>,
    @SerialName(value = "top_administrators")
    public val topAdministrators: Array<ChatStatisticsAdministratorActionsInfo>,
    @SerialName(value = "top_inviters")
    public val topInviters: Array<ChatStatisticsInviterInfo>,
) : ChatStatistics() {
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
        other as ChatStatisticsSupergroup
        if (other.period != period) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.messageCount != messageCount) {
            return false
        }
        if (other.viewerCount != viewerCount) {
            return false
        }
        if (other.senderCount != senderCount) {
            return false
        }
        if (other.memberCountGraph != memberCountGraph) {
            return false
        }
        if (other.joinGraph != joinGraph) {
            return false
        }
        if (other.joinBySourceGraph != joinBySourceGraph) {
            return false
        }
        if (other.languageGraph != languageGraph) {
            return false
        }
        if (other.messageContentGraph != messageContentGraph) {
            return false
        }
        if (other.actionGraph != actionGraph) {
            return false
        }
        if (other.dayGraph != dayGraph) {
            return false
        }
        if (other.weekGraph != weekGraph) {
            return false
        }
        val topSendersEquals = other.topSenders.contentDeepEquals(topSenders)
        if (!topSendersEquals) {
            return false
        }
        val topAdministratorsEquals = other.topAdministrators.contentDeepEquals(topAdministrators)
        if (!topAdministratorsEquals) {
            return false
        }
        return other.topInviters.contentDeepEquals(topInviters)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + period.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + messageCount.hashCode()
        hashCode = 31 * hashCode + viewerCount.hashCode()
        hashCode = 31 * hashCode + senderCount.hashCode()
        hashCode = 31 * hashCode + memberCountGraph.hashCode()
        hashCode = 31 * hashCode + joinGraph.hashCode()
        hashCode = 31 * hashCode + joinBySourceGraph.hashCode()
        hashCode = 31 * hashCode + languageGraph.hashCode()
        hashCode = 31 * hashCode + messageContentGraph.hashCode()
        hashCode = 31 * hashCode + actionGraph.hashCode()
        hashCode = 31 * hashCode + dayGraph.hashCode()
        hashCode = 31 * hashCode + weekGraph.hashCode()
        hashCode = 31 * hashCode + topSenders.contentDeepHashCode()
        hashCode = 31 * hashCode + topAdministrators.contentDeepHashCode()
        hashCode = 31 * hashCode + topInviters.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatStatisticsSupergroup")
            append("(")
            append("period=")
            append(period)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("messageCount=")
            append(messageCount)
            append(", ")
            append("viewerCount=")
            append(viewerCount)
            append(", ")
            append("senderCount=")
            append(senderCount)
            append(", ")
            append("memberCountGraph=")
            append(memberCountGraph)
            append(", ")
            append("joinGraph=")
            append(joinGraph)
            append(", ")
            append("joinBySourceGraph=")
            append(joinBySourceGraph)
            append(", ")
            append("languageGraph=")
            append(languageGraph)
            append(", ")
            append("messageContentGraph=")
            append(messageContentGraph)
            append(", ")
            append("actionGraph=")
            append(actionGraph)
            append(", ")
            append("dayGraph=")
            append(dayGraph)
            append(", ")
            append("weekGraph=")
            append(weekGraph)
            append(", ")
            append("topSenders=")
            topSenders
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("topAdministrators=")
            topAdministrators
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("topInviters=")
            topInviters
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
