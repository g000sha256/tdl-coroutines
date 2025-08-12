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
 * Contains basic information about a forum topic.
 *
 * @property chatId Identifier of the forum chat to which the topic belongs.
 * @property forumTopicId Forum topic identifier of the topic.
 * @property messageThreadId Message thread identifier of the topic.
 * @property name Name of the topic.
 * @property icon Icon of the topic.
 * @property creationDate Point in time (Unix timestamp) when the topic was created.
 * @property creatorId Identifier of the creator of the topic.
 * @property isGeneral True, if the topic is the General topic list.
 * @property isOutgoing True, if the topic was created by the current user.
 * @property isClosed True, if the topic is closed. If the topic is closed, then the user must have canManageTopics administrator right in the supergroup or must be the creator of the topic to send messages there.
 * @property isHidden True, if the topic is hidden above the topic list and closed; for General topic only.
 */
public class ForumTopicInfo public constructor(
    public val chatId: Long,
    public val forumTopicId: Long,
    public val messageThreadId: Long,
    public val name: String,
    public val icon: ForumTopicIcon,
    public val creationDate: Int,
    public val creatorId: MessageSender,
    public val isGeneral: Boolean,
    public val isOutgoing: Boolean,
    public val isClosed: Boolean,
    public val isHidden: Boolean,
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
        other as ForumTopicInfo
        if (other.chatId != chatId) {
            return false
        }
        if (other.forumTopicId != forumTopicId) {
            return false
        }
        if (other.messageThreadId != messageThreadId) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.icon != icon) {
            return false
        }
        if (other.creationDate != creationDate) {
            return false
        }
        if (other.creatorId != creatorId) {
            return false
        }
        if (other.isGeneral != isGeneral) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        if (other.isClosed != isClosed) {
            return false
        }
        return other.isHidden == isHidden
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + forumTopicId.hashCode()
        hashCode = 31 * hashCode + messageThreadId.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + icon.hashCode()
        hashCode = 31 * hashCode + creationDate.hashCode()
        hashCode = 31 * hashCode + creatorId.hashCode()
        hashCode = 31 * hashCode + isGeneral.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + isClosed.hashCode()
        hashCode = 31 * hashCode + isHidden.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ForumTopicInfo")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("forumTopicId=")
            append(forumTopicId)
            append(", ")
            append("messageThreadId=")
            append(messageThreadId)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("icon=")
            append(icon)
            append(", ")
            append("creationDate=")
            append(creationDate)
            append(", ")
            append("creatorId=")
            append(creatorId)
            append(", ")
            append("isGeneral=")
            append(isGeneral)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("isClosed=")
            append(isClosed)
            append(", ")
            append("isHidden=")
            append(isHidden)
            append(")")
        }
    }
}
