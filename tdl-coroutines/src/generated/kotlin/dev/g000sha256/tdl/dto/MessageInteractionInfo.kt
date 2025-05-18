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
 * Contains information about interactions with a message.
 *
 * @property viewCount Number of times the message was viewed.
 * @property forwardCount Number of times the message was forwarded.
 * @property replyInfo Information about direct or indirect replies to the message; may be null. Currently, available only in channels with a discussion supergroup and discussion supergroups for messages, which are not replies itself.
 * @property reactions The list of reactions or tags added to the message; may be null.
 */
public class MessageInteractionInfo public constructor(
    public val viewCount: Int,
    public val forwardCount: Int,
    public val replyInfo: MessageReplyInfo?,
    public val reactions: MessageReactions?,
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
        other as MessageInteractionInfo
        if (other.viewCount != viewCount) {
            return false
        }
        if (other.forwardCount != forwardCount) {
            return false
        }
        if (other.replyInfo != replyInfo) {
            return false
        }
        return other.reactions == reactions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + viewCount.hashCode()
        hashCode = 31 * hashCode + forwardCount.hashCode()
        hashCode = 31 * hashCode + replyInfo.hashCode()
        hashCode = 31 * hashCode + reactions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageInteractionInfo")
            append("(")
            append("viewCount=")
            append(viewCount)
            append(", ")
            append("forwardCount=")
            append(forwardCount)
            append(", ")
            append("replyInfo=")
            append(replyInfo)
            append(", ")
            append("reactions=")
            append(reactions)
            append(")")
        }
    }
}
