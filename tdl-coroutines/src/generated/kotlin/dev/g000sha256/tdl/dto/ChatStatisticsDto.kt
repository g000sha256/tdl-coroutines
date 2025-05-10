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
 * This class is an abstract base class.
 * Contains a detailed statistics about a chat.
 */
public sealed class ChatStatisticsDto private constructor() {
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
    public class Supergroup public constructor(
        public val period: DateRangeDto,
        public val memberCount: StatisticalValueDto,
        public val messageCount: StatisticalValueDto,
        public val viewerCount: StatisticalValueDto,
        public val senderCount: StatisticalValueDto,
        public val memberCountGraph: StatisticalGraphDto,
        public val joinGraph: StatisticalGraphDto,
        public val joinBySourceGraph: StatisticalGraphDto,
        public val languageGraph: StatisticalGraphDto,
        public val messageContentGraph: StatisticalGraphDto,
        public val actionGraph: StatisticalGraphDto,
        public val dayGraph: StatisticalGraphDto,
        public val weekGraph: StatisticalGraphDto,
        public val topSenders: Array<ChatStatisticsMessageSenderInfoDto>,
        public val topAdministrators: Array<ChatStatisticsAdministratorActionsInfoDto>,
        public val topInviters: Array<ChatStatisticsInviterInfoDto>,
    ) : ChatStatisticsDto() {
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
            other as Supergroup
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
                append("ChatStatisticsDto.Supergroup")
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
    public class Channel public constructor(
        public val period: DateRangeDto,
        public val memberCount: StatisticalValueDto,
        public val meanMessageViewCount: StatisticalValueDto,
        public val meanMessageShareCount: StatisticalValueDto,
        public val meanMessageReactionCount: StatisticalValueDto,
        public val meanStoryViewCount: StatisticalValueDto,
        public val meanStoryShareCount: StatisticalValueDto,
        public val meanStoryReactionCount: StatisticalValueDto,
        public val enabledNotificationsPercentage: Double,
        public val memberCountGraph: StatisticalGraphDto,
        public val joinGraph: StatisticalGraphDto,
        public val muteGraph: StatisticalGraphDto,
        public val viewCountByHourGraph: StatisticalGraphDto,
        public val viewCountBySourceGraph: StatisticalGraphDto,
        public val joinBySourceGraph: StatisticalGraphDto,
        public val languageGraph: StatisticalGraphDto,
        public val messageInteractionGraph: StatisticalGraphDto,
        public val messageReactionGraph: StatisticalGraphDto,
        public val storyInteractionGraph: StatisticalGraphDto,
        public val storyReactionGraph: StatisticalGraphDto,
        public val instantViewInteractionGraph: StatisticalGraphDto,
        public val recentInteractions: Array<ChatStatisticsInteractionInfoDto>,
    ) : ChatStatisticsDto() {
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
            other as Channel
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
                append("ChatStatisticsDto.Channel")
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
}
