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
 * Contains information about a link to a message or a forum topic in a chat.
 *
 * @property isPublic True, if the link is a public link for a message or a forum topic in a chat.
 * @property chatId If found, identifier of the chat to which the link points, 0 otherwise.
 * @property topicId Identifier of the specific topic in which the message must be opened, or a topic to open if the message is missing; may be null if none.
 * @property message If found, the linked message; may be null.
 * @property mediaTimestamp Timestamp from which the video/audio/video note/voice note/story playing must start, in seconds; 0 if not specified. The media can be in the message content or in its link preview.
 * @property forAlbum True, if the whole media album to which the message belongs is linked.
 */
public class MessageLinkInfo public constructor(
    public val isPublic: Boolean,
    public val chatId: Long,
    public val topicId: MessageTopic?,
    public val message: Message?,
    public val mediaTimestamp: Int,
    public val forAlbum: Boolean,
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
        other as MessageLinkInfo
        if (other.isPublic != isPublic) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.topicId != topicId) {
            return false
        }
        if (other.message != message) {
            return false
        }
        if (other.mediaTimestamp != mediaTimestamp) {
            return false
        }
        return other.forAlbum == forAlbum
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isPublic.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + topicId.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + mediaTimestamp.hashCode()
        hashCode = 31 * hashCode + forAlbum.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageLinkInfo")
            append("(")
            append("isPublic=")
            append(isPublic)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("topicId=")
            append(topicId)
            append(", ")
            append("message=")
            append(message)
            append(", ")
            append("mediaTimestamp=")
            append(mediaTimestamp)
            append(", ")
            append("forAlbum=")
            append(forAlbum)
            append(")")
        }
    }
}
