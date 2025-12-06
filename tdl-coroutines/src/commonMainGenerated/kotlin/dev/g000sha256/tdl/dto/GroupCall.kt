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
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a group call.
 *
 * @property id Group call identifier.
 * @property title Group call title; for video chats only.
 * @property inviteLink Invite link for the group call; for group calls that aren't bound to a chat. For video chats call getVideoChatInviteLink to get the link. For live stories in chats with username call getInternalLink with internalLinkTypeLiveStory.
 * @property paidMessageStarCount The minimum number of Telegram Stars that must be paid by general participant for each sent message to the call; for live stories only.
 * @property scheduledStartDate Point in time (Unix timestamp) when the group call is expected to be started by an administrator; 0 if it is already active or was ended; for video chats only.
 * @property enabledStartNotification True, if the group call is scheduled and the current user will receive a notification when the group call starts; for video chats only.
 * @property isActive True, if the call is active.
 * @property isVideoChat True, if the call is bound to a chat.
 * @property isLiveStory True, if the call is a live story of a chat.
 * @property isRtmpStream True, if the call is an RTMP stream instead of an ordinary video chat; for video chats and live stories only.
 * @property isJoined True, if the call is joined.
 * @property needRejoin True, if user was kicked from the call because of network loss and the call needs to be rejoined.
 * @property isOwned True, if the user is the owner of the call and can end the call, change volume level of other users, or ban users there; for group calls that aren't bound to a chat.
 * @property canBeManaged True, if the current user can manage the group call; for video chats and live stories only.
 * @property participantCount Number of participants in the group call.
 * @property hasHiddenListeners True, if group call participants, which are muted, aren't returned in participant list; for video chats only.
 * @property loadedAllParticipants True, if all group call participants are loaded.
 * @property messageSenderId Message sender chosen to send messages to the group call; for live stories only; may be null if the call isn't a live story.
 * @property recentSpeakers At most 3 recently speaking users in the group call.
 * @property isMyVideoEnabled True, if the current user's video is enabled.
 * @property isMyVideoPaused True, if the current user's video is paused.
 * @property canEnableVideo True, if the current user can broadcast video or share screen.
 * @property muteNewParticipants True, if only group call administrators can unmute new participants; for video chats only.
 * @property canToggleMuteNewParticipants True, if the current user can enable or disable muteNewParticipants setting; for video chats only.
 * @property canSendMessages True, if the current user can send messages to the group call.
 * @property areMessagesAllowed True, if sending of messages is allowed in the group call.
 * @property canToggleAreMessagesAllowed True, if the current user can enable or disable sending of messages in the group call.
 * @property canDeleteMessages True, if the user can delete messages in the group call.
 * @property recordDuration Duration of the ongoing group call recording, in seconds; 0 if none. An updateGroupCall update is not triggered when value of this field changes, but the same recording goes on.
 * @property isVideoRecorded True, if a video file is being recorded for the call.
 * @property duration Call duration, in seconds; for ended calls only.
 */
public class GroupCall public constructor(
    public val id: Int,
    public val title: String,
    public val inviteLink: String,
    public val paidMessageStarCount: Long,
    public val scheduledStartDate: Int,
    public val enabledStartNotification: Boolean,
    public val isActive: Boolean,
    public val isVideoChat: Boolean,
    public val isLiveStory: Boolean,
    public val isRtmpStream: Boolean,
    public val isJoined: Boolean,
    public val needRejoin: Boolean,
    public val isOwned: Boolean,
    public val canBeManaged: Boolean,
    public val participantCount: Int,
    public val hasHiddenListeners: Boolean,
    public val loadedAllParticipants: Boolean,
    public val messageSenderId: MessageSender?,
    public val recentSpeakers: Array<GroupCallRecentSpeaker>,
    public val isMyVideoEnabled: Boolean,
    public val isMyVideoPaused: Boolean,
    public val canEnableVideo: Boolean,
    public val muteNewParticipants: Boolean,
    public val canToggleMuteNewParticipants: Boolean,
    public val canSendMessages: Boolean,
    public val areMessagesAllowed: Boolean,
    public val canToggleAreMessagesAllowed: Boolean,
    public val canDeleteMessages: Boolean,
    public val recordDuration: Int,
    public val isVideoRecorded: Boolean,
    public val duration: Int,
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
        other as GroupCall
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.inviteLink != inviteLink) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.scheduledStartDate != scheduledStartDate) {
            return false
        }
        if (other.enabledStartNotification != enabledStartNotification) {
            return false
        }
        if (other.isActive != isActive) {
            return false
        }
        if (other.isVideoChat != isVideoChat) {
            return false
        }
        if (other.isLiveStory != isLiveStory) {
            return false
        }
        if (other.isRtmpStream != isRtmpStream) {
            return false
        }
        if (other.isJoined != isJoined) {
            return false
        }
        if (other.needRejoin != needRejoin) {
            return false
        }
        if (other.isOwned != isOwned) {
            return false
        }
        if (other.canBeManaged != canBeManaged) {
            return false
        }
        if (other.participantCount != participantCount) {
            return false
        }
        if (other.hasHiddenListeners != hasHiddenListeners) {
            return false
        }
        if (other.loadedAllParticipants != loadedAllParticipants) {
            return false
        }
        if (other.messageSenderId != messageSenderId) {
            return false
        }
        val recentSpeakersEquals = other.recentSpeakers.contentDeepEquals(recentSpeakers)
        if (!recentSpeakersEquals) {
            return false
        }
        if (other.isMyVideoEnabled != isMyVideoEnabled) {
            return false
        }
        if (other.isMyVideoPaused != isMyVideoPaused) {
            return false
        }
        if (other.canEnableVideo != canEnableVideo) {
            return false
        }
        if (other.muteNewParticipants != muteNewParticipants) {
            return false
        }
        if (other.canToggleMuteNewParticipants != canToggleMuteNewParticipants) {
            return false
        }
        if (other.canSendMessages != canSendMessages) {
            return false
        }
        if (other.areMessagesAllowed != areMessagesAllowed) {
            return false
        }
        if (other.canToggleAreMessagesAllowed != canToggleAreMessagesAllowed) {
            return false
        }
        if (other.canDeleteMessages != canDeleteMessages) {
            return false
        }
        if (other.recordDuration != recordDuration) {
            return false
        }
        if (other.isVideoRecorded != isVideoRecorded) {
            return false
        }
        return other.duration == duration
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + scheduledStartDate.hashCode()
        hashCode = 31 * hashCode + enabledStartNotification.hashCode()
        hashCode = 31 * hashCode + isActive.hashCode()
        hashCode = 31 * hashCode + isVideoChat.hashCode()
        hashCode = 31 * hashCode + isLiveStory.hashCode()
        hashCode = 31 * hashCode + isRtmpStream.hashCode()
        hashCode = 31 * hashCode + isJoined.hashCode()
        hashCode = 31 * hashCode + needRejoin.hashCode()
        hashCode = 31 * hashCode + isOwned.hashCode()
        hashCode = 31 * hashCode + canBeManaged.hashCode()
        hashCode = 31 * hashCode + participantCount.hashCode()
        hashCode = 31 * hashCode + hasHiddenListeners.hashCode()
        hashCode = 31 * hashCode + loadedAllParticipants.hashCode()
        hashCode = 31 * hashCode + messageSenderId.hashCode()
        hashCode = 31 * hashCode + recentSpeakers.contentDeepHashCode()
        hashCode = 31 * hashCode + isMyVideoEnabled.hashCode()
        hashCode = 31 * hashCode + isMyVideoPaused.hashCode()
        hashCode = 31 * hashCode + canEnableVideo.hashCode()
        hashCode = 31 * hashCode + muteNewParticipants.hashCode()
        hashCode = 31 * hashCode + canToggleMuteNewParticipants.hashCode()
        hashCode = 31 * hashCode + canSendMessages.hashCode()
        hashCode = 31 * hashCode + areMessagesAllowed.hashCode()
        hashCode = 31 * hashCode + canToggleAreMessagesAllowed.hashCode()
        hashCode = 31 * hashCode + canDeleteMessages.hashCode()
        hashCode = 31 * hashCode + recordDuration.hashCode()
        hashCode = 31 * hashCode + isVideoRecorded.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCall")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("inviteLink=")
            append(inviteLink)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("scheduledStartDate=")
            append(scheduledStartDate)
            append(", ")
            append("enabledStartNotification=")
            append(enabledStartNotification)
            append(", ")
            append("isActive=")
            append(isActive)
            append(", ")
            append("isVideoChat=")
            append(isVideoChat)
            append(", ")
            append("isLiveStory=")
            append(isLiveStory)
            append(", ")
            append("isRtmpStream=")
            append(isRtmpStream)
            append(", ")
            append("isJoined=")
            append(isJoined)
            append(", ")
            append("needRejoin=")
            append(needRejoin)
            append(", ")
            append("isOwned=")
            append(isOwned)
            append(", ")
            append("canBeManaged=")
            append(canBeManaged)
            append(", ")
            append("participantCount=")
            append(participantCount)
            append(", ")
            append("hasHiddenListeners=")
            append(hasHiddenListeners)
            append(", ")
            append("loadedAllParticipants=")
            append(loadedAllParticipants)
            append(", ")
            append("messageSenderId=")
            append(messageSenderId)
            append(", ")
            append("recentSpeakers=")
            recentSpeakers
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("isMyVideoEnabled=")
            append(isMyVideoEnabled)
            append(", ")
            append("isMyVideoPaused=")
            append(isMyVideoPaused)
            append(", ")
            append("canEnableVideo=")
            append(canEnableVideo)
            append(", ")
            append("muteNewParticipants=")
            append(muteNewParticipants)
            append(", ")
            append("canToggleMuteNewParticipants=")
            append(canToggleMuteNewParticipants)
            append(", ")
            append("canSendMessages=")
            append(canSendMessages)
            append(", ")
            append("areMessagesAllowed=")
            append(areMessagesAllowed)
            append(", ")
            append("canToggleAreMessagesAllowed=")
            append(canToggleAreMessagesAllowed)
            append(", ")
            append("canDeleteMessages=")
            append(canDeleteMessages)
            append(", ")
            append("recordDuration=")
            append(recordDuration)
            append(", ")
            append("isVideoRecorded=")
            append(isVideoRecorded)
            append(", ")
            append("duration=")
            append(duration)
            append(")")
        }
    }
}
