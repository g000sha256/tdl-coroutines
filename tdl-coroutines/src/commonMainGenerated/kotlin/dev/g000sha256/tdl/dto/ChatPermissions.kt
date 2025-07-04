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
 * Describes actions that a user is allowed to take in a chat.
 *
 * @property canSendBasicMessages True, if the user can send text messages, contacts, giveaways, giveaway winners, invoices, locations, and venues.
 * @property canSendAudios True, if the user can send music files.
 * @property canSendDocuments True, if the user can send documents.
 * @property canSendPhotos True, if the user can send photos.
 * @property canSendVideos True, if the user can send videos.
 * @property canSendVideoNotes True, if the user can send video notes.
 * @property canSendVoiceNotes True, if the user can send voice notes.
 * @property canSendPolls True, if the user can send polls and checklists.
 * @property canSendOtherMessages True, if the user can send animations, games, stickers, and dice and use inline bots.
 * @property canAddLinkPreviews True, if the user may add a link preview to their messages.
 * @property canChangeInfo True, if the user can change the chat title, photo, and other settings.
 * @property canInviteUsers True, if the user can invite new users to the chat.
 * @property canPinMessages True, if the user can pin messages.
 * @property canCreateTopics True, if the user can create topics.
 */
public class ChatPermissions public constructor(
    public val canSendBasicMessages: Boolean,
    public val canSendAudios: Boolean,
    public val canSendDocuments: Boolean,
    public val canSendPhotos: Boolean,
    public val canSendVideos: Boolean,
    public val canSendVideoNotes: Boolean,
    public val canSendVoiceNotes: Boolean,
    public val canSendPolls: Boolean,
    public val canSendOtherMessages: Boolean,
    public val canAddLinkPreviews: Boolean,
    public val canChangeInfo: Boolean,
    public val canInviteUsers: Boolean,
    public val canPinMessages: Boolean,
    public val canCreateTopics: Boolean,
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
        other as ChatPermissions
        if (other.canSendBasicMessages != canSendBasicMessages) {
            return false
        }
        if (other.canSendAudios != canSendAudios) {
            return false
        }
        if (other.canSendDocuments != canSendDocuments) {
            return false
        }
        if (other.canSendPhotos != canSendPhotos) {
            return false
        }
        if (other.canSendVideos != canSendVideos) {
            return false
        }
        if (other.canSendVideoNotes != canSendVideoNotes) {
            return false
        }
        if (other.canSendVoiceNotes != canSendVoiceNotes) {
            return false
        }
        if (other.canSendPolls != canSendPolls) {
            return false
        }
        if (other.canSendOtherMessages != canSendOtherMessages) {
            return false
        }
        if (other.canAddLinkPreviews != canAddLinkPreviews) {
            return false
        }
        if (other.canChangeInfo != canChangeInfo) {
            return false
        }
        if (other.canInviteUsers != canInviteUsers) {
            return false
        }
        if (other.canPinMessages != canPinMessages) {
            return false
        }
        return other.canCreateTopics == canCreateTopics
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canSendBasicMessages.hashCode()
        hashCode = 31 * hashCode + canSendAudios.hashCode()
        hashCode = 31 * hashCode + canSendDocuments.hashCode()
        hashCode = 31 * hashCode + canSendPhotos.hashCode()
        hashCode = 31 * hashCode + canSendVideos.hashCode()
        hashCode = 31 * hashCode + canSendVideoNotes.hashCode()
        hashCode = 31 * hashCode + canSendVoiceNotes.hashCode()
        hashCode = 31 * hashCode + canSendPolls.hashCode()
        hashCode = 31 * hashCode + canSendOtherMessages.hashCode()
        hashCode = 31 * hashCode + canAddLinkPreviews.hashCode()
        hashCode = 31 * hashCode + canChangeInfo.hashCode()
        hashCode = 31 * hashCode + canInviteUsers.hashCode()
        hashCode = 31 * hashCode + canPinMessages.hashCode()
        hashCode = 31 * hashCode + canCreateTopics.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatPermissions")
            append("(")
            append("canSendBasicMessages=")
            append(canSendBasicMessages)
            append(", ")
            append("canSendAudios=")
            append(canSendAudios)
            append(", ")
            append("canSendDocuments=")
            append(canSendDocuments)
            append(", ")
            append("canSendPhotos=")
            append(canSendPhotos)
            append(", ")
            append("canSendVideos=")
            append(canSendVideos)
            append(", ")
            append("canSendVideoNotes=")
            append(canSendVideoNotes)
            append(", ")
            append("canSendVoiceNotes=")
            append(canSendVoiceNotes)
            append(", ")
            append("canSendPolls=")
            append(canSendPolls)
            append(", ")
            append("canSendOtherMessages=")
            append(canSendOtherMessages)
            append(", ")
            append("canAddLinkPreviews=")
            append(canAddLinkPreviews)
            append(", ")
            append("canChangeInfo=")
            append(canChangeInfo)
            append(", ")
            append("canInviteUsers=")
            append(canInviteUsers)
            append(", ")
            append("canPinMessages=")
            append(canPinMessages)
            append(", ")
            append("canCreateTopics=")
            append(canCreateTopics)
            append(")")
        }
    }
}
