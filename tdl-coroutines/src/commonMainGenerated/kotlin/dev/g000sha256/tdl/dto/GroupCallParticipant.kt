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
 * Represents a group call participant.
 *
 * @property participantId Identifier of the group call participant.
 * @property audioSourceId User's audio channel synchronization source identifier.
 * @property screenSharingAudioSourceId User's screen sharing audio channel synchronization source identifier.
 * @property videoInfo Information about user's video channel; may be null if there is no active video.
 * @property screenSharingVideoInfo Information about user's screen sharing video channel; may be null if there is no active screen sharing video.
 * @property bio The participant user's bio or the participant chat's description.
 * @property isCurrentUser True, if the participant is the current user.
 * @property isSpeaking True, if the participant is speaking as set by setGroupCallParticipantIsSpeaking.
 * @property isHandRaised True, if the participant hand is raised.
 * @property canBeMutedForAllUsers True, if the current user can mute the participant for all other group call participants.
 * @property canBeUnmutedForAllUsers True, if the current user can allow the participant to unmute themselves or unmute the participant (if the participant is the current user).
 * @property canBeMutedForCurrentUser True, if the current user can mute the participant only for self.
 * @property canBeUnmutedForCurrentUser True, if the current user can unmute the participant for self.
 * @property isMutedForAllUsers True, if the participant is muted for all users.
 * @property isMutedForCurrentUser True, if the participant is muted for the current user.
 * @property canUnmuteSelf True, if the participant is muted for all users, but can unmute themselves.
 * @property volumeLevel Participant's volume level; 1-20000 in hundreds of percents.
 * @property order User's order in the group call participant list. Orders must be compared lexicographically. The bigger is order, the higher is user in the list. If order is empty, the user must be removed from the participant list.
 */
public class GroupCallParticipant public constructor(
    public val participantId: MessageSender,
    public val audioSourceId: Int,
    public val screenSharingAudioSourceId: Int,
    public val videoInfo: GroupCallParticipantVideoInfo?,
    public val screenSharingVideoInfo: GroupCallParticipantVideoInfo?,
    public val bio: String,
    public val isCurrentUser: Boolean,
    public val isSpeaking: Boolean,
    public val isHandRaised: Boolean,
    public val canBeMutedForAllUsers: Boolean,
    public val canBeUnmutedForAllUsers: Boolean,
    public val canBeMutedForCurrentUser: Boolean,
    public val canBeUnmutedForCurrentUser: Boolean,
    public val isMutedForAllUsers: Boolean,
    public val isMutedForCurrentUser: Boolean,
    public val canUnmuteSelf: Boolean,
    public val volumeLevel: Int,
    public val order: String,
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
        other as GroupCallParticipant
        if (other.participantId != participantId) {
            return false
        }
        if (other.audioSourceId != audioSourceId) {
            return false
        }
        if (other.screenSharingAudioSourceId != screenSharingAudioSourceId) {
            return false
        }
        if (other.videoInfo != videoInfo) {
            return false
        }
        if (other.screenSharingVideoInfo != screenSharingVideoInfo) {
            return false
        }
        if (other.bio != bio) {
            return false
        }
        if (other.isCurrentUser != isCurrentUser) {
            return false
        }
        if (other.isSpeaking != isSpeaking) {
            return false
        }
        if (other.isHandRaised != isHandRaised) {
            return false
        }
        if (other.canBeMutedForAllUsers != canBeMutedForAllUsers) {
            return false
        }
        if (other.canBeUnmutedForAllUsers != canBeUnmutedForAllUsers) {
            return false
        }
        if (other.canBeMutedForCurrentUser != canBeMutedForCurrentUser) {
            return false
        }
        if (other.canBeUnmutedForCurrentUser != canBeUnmutedForCurrentUser) {
            return false
        }
        if (other.isMutedForAllUsers != isMutedForAllUsers) {
            return false
        }
        if (other.isMutedForCurrentUser != isMutedForCurrentUser) {
            return false
        }
        if (other.canUnmuteSelf != canUnmuteSelf) {
            return false
        }
        if (other.volumeLevel != volumeLevel) {
            return false
        }
        return other.order == order
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + participantId.hashCode()
        hashCode = 31 * hashCode + audioSourceId.hashCode()
        hashCode = 31 * hashCode + screenSharingAudioSourceId.hashCode()
        hashCode = 31 * hashCode + videoInfo.hashCode()
        hashCode = 31 * hashCode + screenSharingVideoInfo.hashCode()
        hashCode = 31 * hashCode + bio.hashCode()
        hashCode = 31 * hashCode + isCurrentUser.hashCode()
        hashCode = 31 * hashCode + isSpeaking.hashCode()
        hashCode = 31 * hashCode + isHandRaised.hashCode()
        hashCode = 31 * hashCode + canBeMutedForAllUsers.hashCode()
        hashCode = 31 * hashCode + canBeUnmutedForAllUsers.hashCode()
        hashCode = 31 * hashCode + canBeMutedForCurrentUser.hashCode()
        hashCode = 31 * hashCode + canBeUnmutedForCurrentUser.hashCode()
        hashCode = 31 * hashCode + isMutedForAllUsers.hashCode()
        hashCode = 31 * hashCode + isMutedForCurrentUser.hashCode()
        hashCode = 31 * hashCode + canUnmuteSelf.hashCode()
        hashCode = 31 * hashCode + volumeLevel.hashCode()
        hashCode = 31 * hashCode + order.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallParticipant")
            append("(")
            append("participantId=")
            append(participantId)
            append(", ")
            append("audioSourceId=")
            append(audioSourceId)
            append(", ")
            append("screenSharingAudioSourceId=")
            append(screenSharingAudioSourceId)
            append(", ")
            append("videoInfo=")
            append(videoInfo)
            append(", ")
            append("screenSharingVideoInfo=")
            append(screenSharingVideoInfo)
            append(", ")
            append("bio=")
            append(bio)
            append(", ")
            append("isCurrentUser=")
            append(isCurrentUser)
            append(", ")
            append("isSpeaking=")
            append(isSpeaking)
            append(", ")
            append("isHandRaised=")
            append(isHandRaised)
            append(", ")
            append("canBeMutedForAllUsers=")
            append(canBeMutedForAllUsers)
            append(", ")
            append("canBeUnmutedForAllUsers=")
            append(canBeUnmutedForAllUsers)
            append(", ")
            append("canBeMutedForCurrentUser=")
            append(canBeMutedForCurrentUser)
            append(", ")
            append("canBeUnmutedForCurrentUser=")
            append(canBeUnmutedForCurrentUser)
            append(", ")
            append("isMutedForAllUsers=")
            append(isMutedForAllUsers)
            append(", ")
            append("isMutedForCurrentUser=")
            append(isMutedForCurrentUser)
            append(", ")
            append("canUnmuteSelf=")
            append(canUnmuteSelf)
            append(", ")
            append("volumeLevel=")
            append(volumeLevel)
            append(", ")
            append("order=")
            append(order)
            append(")")
        }
    }
}
