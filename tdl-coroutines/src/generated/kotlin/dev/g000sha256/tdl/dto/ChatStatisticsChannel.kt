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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * A detailed statistics about a channel chat.
 *
 * @property period A period to which the statistics applies.
 * @property memberCount Number of members in the chat.
 * @property meanMessageViewCount Mean number of times the recently sent messages were viewed.
 * @property meanMessageShareCount Mean number of times the recently sent messages were shared.
 * @property meanMessageReactionCount Mean number of times reactions were added to the recently sent messages.
 * @property meanStoryViewCount Mean number of times the recently posted stories were viewed.
 * @property meanStoryShareCount Mean number of times the recently posted stories were shared.
 * @property meanStoryReactionCount Mean number of times reactions were added to the recently posted stories.
 * @property enabledNotificationsPercentage A percentage of users with enabled notifications for the chat; 0-100.
 * @property memberCountGraph A graph containing number of members in the chat.
 * @property joinGraph A graph containing number of members joined and left the chat.
 * @property muteGraph A graph containing number of members muted and unmuted the chat.
 * @property viewCountByHourGraph A graph containing number of message views in a given hour in the last two weeks.
 * @property viewCountBySourceGraph A graph containing number of message views per source.
 * @property joinBySourceGraph A graph containing number of new member joins per source.
 * @property languageGraph A graph containing number of users viewed chat messages per language.
 * @property messageInteractionGraph A graph containing number of chat message views and shares.
 * @property messageReactionGraph A graph containing number of reactions on messages.
 * @property storyInteractionGraph A graph containing number of story views and shares.
 * @property storyReactionGraph A graph containing number of reactions on stories.
 * @property instantViewInteractionGraph A graph containing number of views of associated with the chat instant views.
 * @property recentInteractions Detailed statistics about number of views and shares of recently sent messages and posted stories.
 */
public class ChatStatisticsChannel public constructor(
    public val period: DateRange,
    public val memberCount: StatisticalValue,
    public val meanMessageViewCount: StatisticalValue,
    public val meanMessageShareCount: StatisticalValue,
    public val meanMessageReactionCount: StatisticalValue,
    public val meanStoryViewCount: StatisticalValue,
    public val meanStoryShareCount: StatisticalValue,
    public val meanStoryReactionCount: StatisticalValue,
    public val enabledNotificationsPercentage: Double,
    public val memberCountGraph: StatisticalGraph,
    public val joinGraph: StatisticalGraph,
    public val muteGraph: StatisticalGraph,
    public val viewCountByHourGraph: StatisticalGraph,
    public val viewCountBySourceGraph: StatisticalGraph,
    public val joinBySourceGraph: StatisticalGraph,
    public val languageGraph: StatisticalGraph,
    public val messageInteractionGraph: StatisticalGraph,
    public val messageReactionGraph: StatisticalGraph,
    public val storyInteractionGraph: StatisticalGraph,
    public val storyReactionGraph: StatisticalGraph,
    public val instantViewInteractionGraph: StatisticalGraph,
    public val recentInteractions: Array<ChatStatisticsInteractionInfo>,
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
        other as ChatStatisticsChannel
        if (other.period != period) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.meanMessageViewCount != meanMessageViewCount) {
            return false
        }
        if (other.meanMessageShareCount != meanMessageShareCount) {
            return false
        }
        if (other.meanMessageReactionCount != meanMessageReactionCount) {
            return false
        }
        if (other.meanStoryViewCount != meanStoryViewCount) {
            return false
        }
        if (other.meanStoryShareCount != meanStoryShareCount) {
            return false
        }
        if (other.meanStoryReactionCount != meanStoryReactionCount) {
            return false
        }
        if (other.enabledNotificationsPercentage != enabledNotificationsPercentage) {
            return false
        }
        if (other.memberCountGraph != memberCountGraph) {
            return false
        }
        if (other.joinGraph != joinGraph) {
            return false
        }
        if (other.muteGraph != muteGraph) {
            return false
        }
        if (other.viewCountByHourGraph != viewCountByHourGraph) {
            return false
        }
        if (other.viewCountBySourceGraph != viewCountBySourceGraph) {
            return false
        }
        if (other.joinBySourceGraph != joinBySourceGraph) {
            return false
        }
        if (other.languageGraph != languageGraph) {
            return false
        }
        if (other.messageInteractionGraph != messageInteractionGraph) {
            return false
        }
        if (other.messageReactionGraph != messageReactionGraph) {
            return false
        }
        if (other.storyInteractionGraph != storyInteractionGraph) {
            return false
        }
        if (other.storyReactionGraph != storyReactionGraph) {
            return false
        }
        if (other.instantViewInteractionGraph != instantViewInteractionGraph) {
            return false
        }
        return other.recentInteractions.contentDeepEquals(recentInteractions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + period.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + meanMessageViewCount.hashCode()
        hashCode = 31 * hashCode + meanMessageShareCount.hashCode()
        hashCode = 31 * hashCode + meanMessageReactionCount.hashCode()
        hashCode = 31 * hashCode + meanStoryViewCount.hashCode()
        hashCode = 31 * hashCode + meanStoryShareCount.hashCode()
        hashCode = 31 * hashCode + meanStoryReactionCount.hashCode()
        hashCode = 31 * hashCode + enabledNotificationsPercentage.hashCode()
        hashCode = 31 * hashCode + memberCountGraph.hashCode()
        hashCode = 31 * hashCode + joinGraph.hashCode()
        hashCode = 31 * hashCode + muteGraph.hashCode()
        hashCode = 31 * hashCode + viewCountByHourGraph.hashCode()
        hashCode = 31 * hashCode + viewCountBySourceGraph.hashCode()
        hashCode = 31 * hashCode + joinBySourceGraph.hashCode()
        hashCode = 31 * hashCode + languageGraph.hashCode()
        hashCode = 31 * hashCode + messageInteractionGraph.hashCode()
        hashCode = 31 * hashCode + messageReactionGraph.hashCode()
        hashCode = 31 * hashCode + storyInteractionGraph.hashCode()
        hashCode = 31 * hashCode + storyReactionGraph.hashCode()
        hashCode = 31 * hashCode + instantViewInteractionGraph.hashCode()
        hashCode = 31 * hashCode + recentInteractions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatStatisticsChannel")
            append("(")
            append("period=")
            append(period)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("meanMessageViewCount=")
            append(meanMessageViewCount)
            append(", ")
            append("meanMessageShareCount=")
            append(meanMessageShareCount)
            append(", ")
            append("meanMessageReactionCount=")
            append(meanMessageReactionCount)
            append(", ")
            append("meanStoryViewCount=")
            append(meanStoryViewCount)
            append(", ")
            append("meanStoryShareCount=")
            append(meanStoryShareCount)
            append(", ")
            append("meanStoryReactionCount=")
            append(meanStoryReactionCount)
            append(", ")
            append("enabledNotificationsPercentage=")
            append(enabledNotificationsPercentage)
            append(", ")
            append("memberCountGraph=")
            append(memberCountGraph)
            append(", ")
            append("joinGraph=")
            append(joinGraph)
            append(", ")
            append("muteGraph=")
            append(muteGraph)
            append(", ")
            append("viewCountByHourGraph=")
            append(viewCountByHourGraph)
            append(", ")
            append("viewCountBySourceGraph=")
            append(viewCountBySourceGraph)
            append(", ")
            append("joinBySourceGraph=")
            append(joinBySourceGraph)
            append(", ")
            append("languageGraph=")
            append(languageGraph)
            append(", ")
            append("messageInteractionGraph=")
            append(messageInteractionGraph)
            append(", ")
            append("messageReactionGraph=")
            append(messageReactionGraph)
            append(", ")
            append("storyInteractionGraph=")
            append(storyInteractionGraph)
            append(", ")
            append("storyReactionGraph=")
            append(storyReactionGraph)
            append(", ")
            append("instantViewInteractionGraph=")
            append(instantViewInteractionGraph)
            append(", ")
            append("recentInteractions=")
            recentInteractions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
