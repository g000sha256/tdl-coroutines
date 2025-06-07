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
 * Describes a message that can be used for quick reply.
 *
 * @property id Unique message identifier among all quick replies.
 * @property sendingState The sending state of the message; may be null if the message isn't being sent and didn't fail to be sent.
 * @property canBeEdited True, if the message can be edited.
 * @property replyToMessageId The identifier of the quick reply message to which the message replies; 0 if none.
 * @property viaBotUserId If non-zero, the user identifier of the bot through which this message was sent.
 * @property mediaAlbumId Unique identifier of an album this message belongs to; 0 if none. Only audios, documents, photos and videos can be grouped together in albums.
 * @property content Content of the message.
 * @property replyMarkup Inline keyboard reply markup for the message; may be null if none.
 */
@SerialName(value = "quickReplyMessage")
@Serializable
public class QuickReplyMessage public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "sending_state")
    public val sendingState: MessageSendingState?,
    @SerialName(value = "can_be_edited")
    public val canBeEdited: Boolean,
    @SerialName(value = "reply_to_message_id")
    public val replyToMessageId: Long,
    @SerialName(value = "via_bot_user_id")
    public val viaBotUserId: Long,
    @SerialName(value = "media_album_id")
    public val mediaAlbumId: Long,
    @SerialName(value = "content")
    public val content: MessageContent,
    @SerialName(value = "reply_markup")
    public val replyMarkup: ReplyMarkup?,
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
        other as QuickReplyMessage
        if (other.id != id) {
            return false
        }
        if (other.sendingState != sendingState) {
            return false
        }
        if (other.canBeEdited != canBeEdited) {
            return false
        }
        if (other.replyToMessageId != replyToMessageId) {
            return false
        }
        if (other.viaBotUserId != viaBotUserId) {
            return false
        }
        if (other.mediaAlbumId != mediaAlbumId) {
            return false
        }
        if (other.content != content) {
            return false
        }
        return other.replyMarkup == replyMarkup
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + sendingState.hashCode()
        hashCode = 31 * hashCode + canBeEdited.hashCode()
        hashCode = 31 * hashCode + replyToMessageId.hashCode()
        hashCode = 31 * hashCode + viaBotUserId.hashCode()
        hashCode = 31 * hashCode + mediaAlbumId.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("QuickReplyMessage")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("sendingState=")
            append(sendingState)
            append(", ")
            append("canBeEdited=")
            append(canBeEdited)
            append(", ")
            append("replyToMessageId=")
            append(replyToMessageId)
            append(", ")
            append("viaBotUserId=")
            append(viaBotUserId)
            append(", ")
            append("mediaAlbumId=")
            append(mediaAlbumId)
            append(", ")
            append("content=")
            append(content)
            append(", ")
            append("replyMarkup=")
            append(replyMarkup)
            append(")")
        }
    }
}
