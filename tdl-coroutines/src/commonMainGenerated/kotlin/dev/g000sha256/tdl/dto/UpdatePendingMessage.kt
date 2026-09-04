/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A new pending text or rich message was received in a chat with a bot. The message must be shown in the chat for at most getOption(&quot;pending_text_message_period&quot;) seconds, replace any other pending message with the same draftId with animation, and be deleted whenever any incoming message or a pending message with another draftId is received in the message thread.
 *
 * @property chatId Chat identifier.
 * @property forumTopicId The forum topic identifier in which the message will be sent; 0 if none.
 * @property draftId Unique identifier of the message draft within the message thread.
 * @property canStop True, if a button that calls stopPendingMessage to stop further message generation must be shown.
 * @property keepOnStop True, if the pending message must not be automatically deleted when the user presses the Stop button.
 * @property content Content of the message; always of the type messageText or messageRichMessage.
 */
public class UpdatePendingMessage public constructor(
    public val chatId: Long,
    public val forumTopicId: Int,
    public val draftId: Long,
    public val canStop: Boolean,
    public val keepOnStop: Boolean,
    public val content: MessageContent,
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
        other as UpdatePendingMessage
        if (other.chatId != chatId) {
            return false
        }
        if (other.forumTopicId != forumTopicId) {
            return false
        }
        if (other.draftId != draftId) {
            return false
        }
        if (other.canStop != canStop) {
            return false
        }
        if (other.keepOnStop != keepOnStop) {
            return false
        }
        return other.content == content
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + forumTopicId.hashCode()
        hashCode = 31 * hashCode + draftId.hashCode()
        hashCode = 31 * hashCode + canStop.hashCode()
        hashCode = 31 * hashCode + keepOnStop.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdatePendingMessage")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("forumTopicId=")
            append(forumTopicId)
            append(", ")
            append("draftId=")
            append(draftId)
            append(", ")
            append("canStop=")
            append(canStop)
            append(", ")
            append("keepOnStop=")
            append(keepOnStop)
            append(", ")
            append("content=")
            append(content)
            append(")")
        }
    }
}
