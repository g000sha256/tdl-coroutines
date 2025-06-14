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
 * Number of messages in a topic has changed; for Saved Messages and channel direct messages chat topics only.
 *
 * @property chatId Identifier of the chat in topic of which the number of messages has changed.
 * @property topicId Identifier of the topic.
 * @property messageCount Approximate number of messages in the topics.
 */
public class UpdateTopicMessageCount public constructor(
    public val chatId: Long,
    public val topicId: MessageTopic,
    public val messageCount: Int,
) : Update() {
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
        other as UpdateTopicMessageCount
        if (other.chatId != chatId) {
            return false
        }
        if (other.topicId != topicId) {
            return false
        }
        return other.messageCount == messageCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + topicId.hashCode()
        hashCode = 31 * hashCode + messageCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateTopicMessageCount")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("topicId=")
            append(topicId)
            append(", ")
            append("messageCount=")
            append(messageCount)
            append(")")
        }
    }
}
