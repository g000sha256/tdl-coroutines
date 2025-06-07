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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about a link to a message or a forum topic in a chat.
 *
 * @property isPublic True, if the link is a public link for a message or a forum topic in a chat.
 * @property chatId If found, identifier of the chat to which the link points, 0 otherwise.
 * @property messageThreadId If found, identifier of the message thread in which to open the message, or a forum topic to open if the message is missing.
 * @property message If found, the linked message; may be null.
 * @property mediaTimestamp Timestamp from which the video/audio/video note/voice note/story playing must start, in seconds; 0 if not specified. The media can be in the message content or in its link preview.
 * @property forAlbum True, if the whole media album to which the message belongs is linked.
 */
@SerialName(value = "messageLinkInfo")
@Serializable
public class MessageLinkInfo public constructor(
    @SerialName(value = "is_public")
    public val isPublic: Boolean,
    @SerialName(value = "chat_id")
    public val chatId: Long,
    @SerialName(value = "message_thread_id")
    public val messageThreadId: Long,
    @SerialName(value = "message")
    public val message: Message?,
    @SerialName(value = "media_timestamp")
    public val mediaTimestamp: Int,
    @SerialName(value = "for_album")
    public val forAlbum: Boolean,
) : Model() {
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
        if (other.messageThreadId != messageThreadId) {
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
        hashCode = 31 * hashCode + messageThreadId.hashCode()
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
            append("messageThreadId=")
            append(messageThreadId)
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
