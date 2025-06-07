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
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a message.
 *
 * @property id Message identifier; unique for the chat to which the message belongs.
 * @property senderId Identifier of the sender of the message.
 * @property chatId Chat identifier.
 * @property sendingState The sending state of the message; may be null if the message isn't being sent and didn't fail to be sent.
 * @property schedulingState The scheduling state of the message; may be null if the message isn't scheduled.
 * @property isOutgoing True, if the message is outgoing.
 * @property isPinned True, if the message is pinned.
 * @property isFromOffline True, if the message was sent because of a scheduled action by the message sender, for example, as away, or greeting service message.
 * @property canBeSaved True, if content of the message can be saved locally or copied using inputMessageForwarded or forwardMessages with copy options.
 * @property hasTimestampedMedia True, if media timestamp entities refers to a media in this message as opposed to a media in the replied message.
 * @property isChannelPost True, if the message is a channel post. All messages to channels are channel posts, all other messages are not channel posts.
 * @property isTopicMessage True, if the message is a forum topic message.
 * @property containsUnreadMention True, if the message contains an unread mention for the current user.
 * @property date Point in time (Unix timestamp) when the message was sent; 0 for scheduled messages.
 * @property editDate Point in time (Unix timestamp) when the message was last edited; 0 for scheduled messages.
 * @property forwardInfo Information about the initial message sender; may be null if none or unknown.
 * @property importInfo Information about the initial message for messages created with importMessages; may be null if the message isn't imported.
 * @property interactionInfo Information about interactions with the message; may be null if none.
 * @property unreadReactions Information about unread reactions added to the message.
 * @property factCheck Information about fact-check added to the message; may be null if none.
 * @property replyTo Information about the message or the story this message is replying to; may be null if none.
 * @property messageThreadId If non-zero, the identifier of the message thread the message belongs to; unique within the chat to which the message belongs.
 * @property savedMessagesTopicId Identifier of the Saved Messages topic for the message; 0 for messages not from Saved Messages.
 * @property selfDestructType The message's self-destruct type; may be null if none.
 * @property selfDestructIn Time left before the message self-destruct timer expires, in seconds; 0 if self-destruction isn't scheduled yet.
 * @property autoDeleteIn Time left before the message will be automatically deleted by messageAutoDeleteTime setting of the chat, in seconds; 0 if never.
 * @property viaBotUserId If non-zero, the user identifier of the inline bot through which this message was sent.
 * @property senderBusinessBotUserId If non-zero, the user identifier of the business bot that sent this message.
 * @property senderBoostCount Number of times the sender of the message boosted the supergroup at the time the message was sent; 0 if none or unknown. For messages sent by the current user, supergroupFullInfo.myBoostCount must be used instead.
 * @property paidMessageStarCount The number of Telegram Stars the sender paid to send the message.
 * @property authorSignature For channel posts and anonymous group messages, optional author signature.
 * @property mediaAlbumId Unique identifier of an album this message belongs to; 0 if none. Only audios, documents, photos and videos can be grouped together in albums.
 * @property effectId Unique identifier of the effect added to the message; 0 if none.
 * @property hasSensitiveContent True, if media content of the message must be hidden with 18+ spoiler.
 * @property restrictionReason If non-empty, contains a human-readable description of the reason why access to this message must be restricted.
 * @property content Content of the message.
 * @property replyMarkup Reply markup for the message; may be null if none.
 */
@SerialName(value = "message")
@Serializable
public class Message public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "sender_id")
    public val senderId: MessageSender,
    @SerialName(value = "chat_id")
    public val chatId: Long,
    @SerialName(value = "sending_state")
    public val sendingState: MessageSendingState?,
    @SerialName(value = "scheduling_state")
    public val schedulingState: MessageSchedulingState?,
    @SerialName(value = "is_outgoing")
    public val isOutgoing: Boolean,
    @SerialName(value = "is_pinned")
    public val isPinned: Boolean,
    @SerialName(value = "is_from_offline")
    public val isFromOffline: Boolean,
    @SerialName(value = "can_be_saved")
    public val canBeSaved: Boolean,
    @SerialName(value = "has_timestamped_media")
    public val hasTimestampedMedia: Boolean,
    @SerialName(value = "is_channel_post")
    public val isChannelPost: Boolean,
    @SerialName(value = "is_topic_message")
    public val isTopicMessage: Boolean,
    @SerialName(value = "contains_unread_mention")
    public val containsUnreadMention: Boolean,
    @SerialName(value = "date")
    public val date: Int,
    @SerialName(value = "edit_date")
    public val editDate: Int,
    @SerialName(value = "forward_info")
    public val forwardInfo: MessageForwardInfo?,
    @SerialName(value = "import_info")
    public val importInfo: MessageImportInfo?,
    @SerialName(value = "interaction_info")
    public val interactionInfo: MessageInteractionInfo?,
    @SerialName(value = "unread_reactions")
    public val unreadReactions: Array<UnreadReaction>,
    @SerialName(value = "fact_check")
    public val factCheck: FactCheck?,
    @SerialName(value = "reply_to")
    public val replyTo: MessageReplyTo?,
    @SerialName(value = "message_thread_id")
    public val messageThreadId: Long,
    @SerialName(value = "saved_messages_topic_id")
    public val savedMessagesTopicId: Long,
    @SerialName(value = "self_destruct_type")
    public val selfDestructType: MessageSelfDestructType?,
    @SerialName(value = "self_destruct_in")
    public val selfDestructIn: Double,
    @SerialName(value = "auto_delete_in")
    public val autoDeleteIn: Double,
    @SerialName(value = "via_bot_user_id")
    public val viaBotUserId: Long,
    @SerialName(value = "sender_business_bot_user_id")
    public val senderBusinessBotUserId: Long,
    @SerialName(value = "sender_boost_count")
    public val senderBoostCount: Int,
    @SerialName(value = "paid_message_star_count")
    public val paidMessageStarCount: Long,
    @SerialName(value = "author_signature")
    public val authorSignature: String,
    @SerialName(value = "media_album_id")
    public val mediaAlbumId: Long,
    @SerialName(value = "effect_id")
    public val effectId: Long,
    @SerialName(value = "has_sensitive_content")
    public val hasSensitiveContent: Boolean,
    @SerialName(value = "restriction_reason")
    public val restrictionReason: String,
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
        other as Message
        if (other.id != id) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.sendingState != sendingState) {
            return false
        }
        if (other.schedulingState != schedulingState) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        if (other.isPinned != isPinned) {
            return false
        }
        if (other.isFromOffline != isFromOffline) {
            return false
        }
        if (other.canBeSaved != canBeSaved) {
            return false
        }
        if (other.hasTimestampedMedia != hasTimestampedMedia) {
            return false
        }
        if (other.isChannelPost != isChannelPost) {
            return false
        }
        if (other.isTopicMessage != isTopicMessage) {
            return false
        }
        if (other.containsUnreadMention != containsUnreadMention) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.editDate != editDate) {
            return false
        }
        if (other.forwardInfo != forwardInfo) {
            return false
        }
        if (other.importInfo != importInfo) {
            return false
        }
        if (other.interactionInfo != interactionInfo) {
            return false
        }
        val unreadReactionsEquals = other.unreadReactions.contentDeepEquals(unreadReactions)
        if (!unreadReactionsEquals) {
            return false
        }
        if (other.factCheck != factCheck) {
            return false
        }
        if (other.replyTo != replyTo) {
            return false
        }
        if (other.messageThreadId != messageThreadId) {
            return false
        }
        if (other.savedMessagesTopicId != savedMessagesTopicId) {
            return false
        }
        if (other.selfDestructType != selfDestructType) {
            return false
        }
        if (other.selfDestructIn != selfDestructIn) {
            return false
        }
        if (other.autoDeleteIn != autoDeleteIn) {
            return false
        }
        if (other.viaBotUserId != viaBotUserId) {
            return false
        }
        if (other.senderBusinessBotUserId != senderBusinessBotUserId) {
            return false
        }
        if (other.senderBoostCount != senderBoostCount) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.authorSignature != authorSignature) {
            return false
        }
        if (other.mediaAlbumId != mediaAlbumId) {
            return false
        }
        if (other.effectId != effectId) {
            return false
        }
        if (other.hasSensitiveContent != hasSensitiveContent) {
            return false
        }
        if (other.restrictionReason != restrictionReason) {
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
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + sendingState.hashCode()
        hashCode = 31 * hashCode + schedulingState.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + isPinned.hashCode()
        hashCode = 31 * hashCode + isFromOffline.hashCode()
        hashCode = 31 * hashCode + canBeSaved.hashCode()
        hashCode = 31 * hashCode + hasTimestampedMedia.hashCode()
        hashCode = 31 * hashCode + isChannelPost.hashCode()
        hashCode = 31 * hashCode + isTopicMessage.hashCode()
        hashCode = 31 * hashCode + containsUnreadMention.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + editDate.hashCode()
        hashCode = 31 * hashCode + forwardInfo.hashCode()
        hashCode = 31 * hashCode + importInfo.hashCode()
        hashCode = 31 * hashCode + interactionInfo.hashCode()
        hashCode = 31 * hashCode + unreadReactions.contentDeepHashCode()
        hashCode = 31 * hashCode + factCheck.hashCode()
        hashCode = 31 * hashCode + replyTo.hashCode()
        hashCode = 31 * hashCode + messageThreadId.hashCode()
        hashCode = 31 * hashCode + savedMessagesTopicId.hashCode()
        hashCode = 31 * hashCode + selfDestructType.hashCode()
        hashCode = 31 * hashCode + selfDestructIn.hashCode()
        hashCode = 31 * hashCode + autoDeleteIn.hashCode()
        hashCode = 31 * hashCode + viaBotUserId.hashCode()
        hashCode = 31 * hashCode + senderBusinessBotUserId.hashCode()
        hashCode = 31 * hashCode + senderBoostCount.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + authorSignature.hashCode()
        hashCode = 31 * hashCode + mediaAlbumId.hashCode()
        hashCode = 31 * hashCode + effectId.hashCode()
        hashCode = 31 * hashCode + hasSensitiveContent.hashCode()
        hashCode = 31 * hashCode + restrictionReason.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + replyMarkup.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Message")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("sendingState=")
            append(sendingState)
            append(", ")
            append("schedulingState=")
            append(schedulingState)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("isPinned=")
            append(isPinned)
            append(", ")
            append("isFromOffline=")
            append(isFromOffline)
            append(", ")
            append("canBeSaved=")
            append(canBeSaved)
            append(", ")
            append("hasTimestampedMedia=")
            append(hasTimestampedMedia)
            append(", ")
            append("isChannelPost=")
            append(isChannelPost)
            append(", ")
            append("isTopicMessage=")
            append(isTopicMessage)
            append(", ")
            append("containsUnreadMention=")
            append(containsUnreadMention)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("editDate=")
            append(editDate)
            append(", ")
            append("forwardInfo=")
            append(forwardInfo)
            append(", ")
            append("importInfo=")
            append(importInfo)
            append(", ")
            append("interactionInfo=")
            append(interactionInfo)
            append(", ")
            append("unreadReactions=")
            unreadReactions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("factCheck=")
            append(factCheck)
            append(", ")
            append("replyTo=")
            append(replyTo)
            append(", ")
            append("messageThreadId=")
            append(messageThreadId)
            append(", ")
            append("savedMessagesTopicId=")
            append(savedMessagesTopicId)
            append(", ")
            append("selfDestructType=")
            append(selfDestructType)
            append(", ")
            append("selfDestructIn=")
            append(selfDestructIn)
            append(", ")
            append("autoDeleteIn=")
            append(autoDeleteIn)
            append(", ")
            append("viaBotUserId=")
            append(viaBotUserId)
            append(", ")
            append("senderBusinessBotUserId=")
            append(senderBusinessBotUserId)
            append(", ")
            append("senderBoostCount=")
            append(senderBoostCount)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("authorSignature=")
            append(authorSignature)
            append(", ")
            append("mediaAlbumId=")
            append(mediaAlbumId)
            append(", ")
            append("effectId=")
            append(effectId)
            append(", ")
            append("hasSensitiveContent=")
            append(hasSensitiveContent)
            append(", ")
            append("restrictionReason=")
            append(restrictionReason)
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
