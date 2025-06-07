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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains properties of a message and describes actions that can be done with the message right now.
 *
 * @property canBeCopiedToSecretChat True, if content of the message can be copied to a secret chat using inputMessageForwarded or forwardMessages with copy options.
 * @property canBeDeletedOnlyForSelf True, if the message can be deleted only for the current user while other users will continue to see it using the method deleteMessages with revoke == false.
 * @property canBeDeletedForAllUsers True, if the message can be deleted for all users using the method deleteMessages with revoke == true.
 * @property canBeEdited True, if the message can be edited using the methods editMessageText, editMessageCaption, or editMessageReplyMarkup. For live location and poll messages this fields shows whether editMessageLiveLocation or stopPoll can be used with this message.
 * @property canBeForwarded True, if the message can be forwarded using inputMessageForwarded or forwardMessages.
 * @property canBePaid True, if the message can be paid using inputInvoiceMessage.
 * @property canBePinned True, if the message can be pinned or unpinned in the chat using pinChatMessage or unpinChatMessage.
 * @property canBeReplied True, if the message can be replied in the same chat and forum topic using inputMessageReplyToMessage.
 * @property canBeRepliedInAnotherChat True, if the message can be replied in another chat or forum topic using inputMessageReplyToExternalMessage.
 * @property canBeSaved True, if content of the message can be saved locally or copied using inputMessageForwarded or forwardMessages with copy options.
 * @property canBeSharedInStory True, if the message can be shared in a story using inputStoryAreaTypeMessage.
 * @property canEditMedia True, if the message can be edited using the method editMessageMedia.
 * @property canEditSchedulingState True, if scheduling state of the message can be edited.
 * @property canGetEmbeddingCode True, if code for message embedding can be received using getMessageEmbeddingCode.
 * @property canGetLink True, if a link can be generated for the message using getMessageLink.
 * @property canGetMediaTimestampLinks True, if media timestamp links can be generated for media timestamp entities in the message text, caption or link preview description using getMessageLink.
 * @property canGetMessageThread True, if information about the message thread is available through getMessageThread and getMessageThreadHistory.
 * @property canGetReadDate True, if read date of the message can be received through getMessageReadDate.
 * @property canGetStatistics True, if message statistics are available through getMessageStatistics and message forwards can be received using getMessagePublicForwards.
 * @property canGetViewers True, if chat members already viewed the message can be received through getMessageViewers.
 * @property canRecognizeSpeech True, if speech can be recognized for the message through recognizeSpeech.
 * @property canReportChat True, if the message can be reported using reportChat.
 * @property canReportReactions True, if reactions on the message can be reported through reportMessageReactions.
 * @property canReportSupergroupSpam True, if the message can be reported using reportSupergroupSpam.
 * @property canSetFactCheck True, if fact check for the message can be changed through setMessageFactCheck.
 * @property needShowStatistics True, if message statistics must be available from context menu of the message.
 */
@SerialName(value = "messageProperties")
@Serializable
public class MessageProperties public constructor(
    @SerialName(value = "can_be_copied_to_secret_chat")
    public val canBeCopiedToSecretChat: Boolean,
    @SerialName(value = "can_be_deleted_only_for_self")
    public val canBeDeletedOnlyForSelf: Boolean,
    @SerialName(value = "can_be_deleted_for_all_users")
    public val canBeDeletedForAllUsers: Boolean,
    @SerialName(value = "can_be_edited")
    public val canBeEdited: Boolean,
    @SerialName(value = "can_be_forwarded")
    public val canBeForwarded: Boolean,
    @SerialName(value = "can_be_paid")
    public val canBePaid: Boolean,
    @SerialName(value = "can_be_pinned")
    public val canBePinned: Boolean,
    @SerialName(value = "can_be_replied")
    public val canBeReplied: Boolean,
    @SerialName(value = "can_be_replied_in_another_chat")
    public val canBeRepliedInAnotherChat: Boolean,
    @SerialName(value = "can_be_saved")
    public val canBeSaved: Boolean,
    @SerialName(value = "can_be_shared_in_story")
    public val canBeSharedInStory: Boolean,
    @SerialName(value = "can_edit_media")
    public val canEditMedia: Boolean,
    @SerialName(value = "can_edit_scheduling_state")
    public val canEditSchedulingState: Boolean,
    @SerialName(value = "can_get_embedding_code")
    public val canGetEmbeddingCode: Boolean,
    @SerialName(value = "can_get_link")
    public val canGetLink: Boolean,
    @SerialName(value = "can_get_media_timestamp_links")
    public val canGetMediaTimestampLinks: Boolean,
    @SerialName(value = "can_get_message_thread")
    public val canGetMessageThread: Boolean,
    @SerialName(value = "can_get_read_date")
    public val canGetReadDate: Boolean,
    @SerialName(value = "can_get_statistics")
    public val canGetStatistics: Boolean,
    @SerialName(value = "can_get_viewers")
    public val canGetViewers: Boolean,
    @SerialName(value = "can_recognize_speech")
    public val canRecognizeSpeech: Boolean,
    @SerialName(value = "can_report_chat")
    public val canReportChat: Boolean,
    @SerialName(value = "can_report_reactions")
    public val canReportReactions: Boolean,
    @SerialName(value = "can_report_supergroup_spam")
    public val canReportSupergroupSpam: Boolean,
    @SerialName(value = "can_set_fact_check")
    public val canSetFactCheck: Boolean,
    @SerialName(value = "need_show_statistics")
    public val needShowStatistics: Boolean,
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
        other as MessageProperties
        if (other.canBeCopiedToSecretChat != canBeCopiedToSecretChat) {
            return false
        }
        if (other.canBeDeletedOnlyForSelf != canBeDeletedOnlyForSelf) {
            return false
        }
        if (other.canBeDeletedForAllUsers != canBeDeletedForAllUsers) {
            return false
        }
        if (other.canBeEdited != canBeEdited) {
            return false
        }
        if (other.canBeForwarded != canBeForwarded) {
            return false
        }
        if (other.canBePaid != canBePaid) {
            return false
        }
        if (other.canBePinned != canBePinned) {
            return false
        }
        if (other.canBeReplied != canBeReplied) {
            return false
        }
        if (other.canBeRepliedInAnotherChat != canBeRepliedInAnotherChat) {
            return false
        }
        if (other.canBeSaved != canBeSaved) {
            return false
        }
        if (other.canBeSharedInStory != canBeSharedInStory) {
            return false
        }
        if (other.canEditMedia != canEditMedia) {
            return false
        }
        if (other.canEditSchedulingState != canEditSchedulingState) {
            return false
        }
        if (other.canGetEmbeddingCode != canGetEmbeddingCode) {
            return false
        }
        if (other.canGetLink != canGetLink) {
            return false
        }
        if (other.canGetMediaTimestampLinks != canGetMediaTimestampLinks) {
            return false
        }
        if (other.canGetMessageThread != canGetMessageThread) {
            return false
        }
        if (other.canGetReadDate != canGetReadDate) {
            return false
        }
        if (other.canGetStatistics != canGetStatistics) {
            return false
        }
        if (other.canGetViewers != canGetViewers) {
            return false
        }
        if (other.canRecognizeSpeech != canRecognizeSpeech) {
            return false
        }
        if (other.canReportChat != canReportChat) {
            return false
        }
        if (other.canReportReactions != canReportReactions) {
            return false
        }
        if (other.canReportSupergroupSpam != canReportSupergroupSpam) {
            return false
        }
        if (other.canSetFactCheck != canSetFactCheck) {
            return false
        }
        return other.needShowStatistics == needShowStatistics
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canBeCopiedToSecretChat.hashCode()
        hashCode = 31 * hashCode + canBeDeletedOnlyForSelf.hashCode()
        hashCode = 31 * hashCode + canBeDeletedForAllUsers.hashCode()
        hashCode = 31 * hashCode + canBeEdited.hashCode()
        hashCode = 31 * hashCode + canBeForwarded.hashCode()
        hashCode = 31 * hashCode + canBePaid.hashCode()
        hashCode = 31 * hashCode + canBePinned.hashCode()
        hashCode = 31 * hashCode + canBeReplied.hashCode()
        hashCode = 31 * hashCode + canBeRepliedInAnotherChat.hashCode()
        hashCode = 31 * hashCode + canBeSaved.hashCode()
        hashCode = 31 * hashCode + canBeSharedInStory.hashCode()
        hashCode = 31 * hashCode + canEditMedia.hashCode()
        hashCode = 31 * hashCode + canEditSchedulingState.hashCode()
        hashCode = 31 * hashCode + canGetEmbeddingCode.hashCode()
        hashCode = 31 * hashCode + canGetLink.hashCode()
        hashCode = 31 * hashCode + canGetMediaTimestampLinks.hashCode()
        hashCode = 31 * hashCode + canGetMessageThread.hashCode()
        hashCode = 31 * hashCode + canGetReadDate.hashCode()
        hashCode = 31 * hashCode + canGetStatistics.hashCode()
        hashCode = 31 * hashCode + canGetViewers.hashCode()
        hashCode = 31 * hashCode + canRecognizeSpeech.hashCode()
        hashCode = 31 * hashCode + canReportChat.hashCode()
        hashCode = 31 * hashCode + canReportReactions.hashCode()
        hashCode = 31 * hashCode + canReportSupergroupSpam.hashCode()
        hashCode = 31 * hashCode + canSetFactCheck.hashCode()
        hashCode = 31 * hashCode + needShowStatistics.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageProperties")
            append("(")
            append("canBeCopiedToSecretChat=")
            append(canBeCopiedToSecretChat)
            append(", ")
            append("canBeDeletedOnlyForSelf=")
            append(canBeDeletedOnlyForSelf)
            append(", ")
            append("canBeDeletedForAllUsers=")
            append(canBeDeletedForAllUsers)
            append(", ")
            append("canBeEdited=")
            append(canBeEdited)
            append(", ")
            append("canBeForwarded=")
            append(canBeForwarded)
            append(", ")
            append("canBePaid=")
            append(canBePaid)
            append(", ")
            append("canBePinned=")
            append(canBePinned)
            append(", ")
            append("canBeReplied=")
            append(canBeReplied)
            append(", ")
            append("canBeRepliedInAnotherChat=")
            append(canBeRepliedInAnotherChat)
            append(", ")
            append("canBeSaved=")
            append(canBeSaved)
            append(", ")
            append("canBeSharedInStory=")
            append(canBeSharedInStory)
            append(", ")
            append("canEditMedia=")
            append(canEditMedia)
            append(", ")
            append("canEditSchedulingState=")
            append(canEditSchedulingState)
            append(", ")
            append("canGetEmbeddingCode=")
            append(canGetEmbeddingCode)
            append(", ")
            append("canGetLink=")
            append(canGetLink)
            append(", ")
            append("canGetMediaTimestampLinks=")
            append(canGetMediaTimestampLinks)
            append(", ")
            append("canGetMessageThread=")
            append(canGetMessageThread)
            append(", ")
            append("canGetReadDate=")
            append(canGetReadDate)
            append(", ")
            append("canGetStatistics=")
            append(canGetStatistics)
            append(", ")
            append("canGetViewers=")
            append(canGetViewers)
            append(", ")
            append("canRecognizeSpeech=")
            append(canRecognizeSpeech)
            append(", ")
            append("canReportChat=")
            append(canReportChat)
            append(", ")
            append("canReportReactions=")
            append(canReportReactions)
            append(", ")
            append("canReportSupergroupSpam=")
            append(canReportSupergroupSpam)
            append(", ")
            append("canSetFactCheck=")
            append(canSetFactCheck)
            append(", ")
            append("needShowStatistics=")
            append(needShowStatistics)
            append(")")
        }
    }
}
