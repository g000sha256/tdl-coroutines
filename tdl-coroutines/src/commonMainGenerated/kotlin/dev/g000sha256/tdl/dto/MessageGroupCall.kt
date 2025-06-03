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
import kotlin.String

/**
 * A message with information about a group call not bound to a chat. If the message is incoming, the call isn't active, isn't missed, and has no duration, and getOption(&quot;can_accept_calls&quot;) is true, then incoming call screen must be shown to the user. Use joinGroupCall to accept the call or declineGroupCallInvitation to decline it. If the call become active or missed, then the call screen must be hidden.
 *
 * @property isActive True, if the call is active, i.e. the called user joined the call.
 * @property wasMissed True, if the called user missed or declined the call.
 * @property isVideo True, if the call is a video call.
 * @property duration Call duration, in seconds; for left calls only.
 * @property otherParticipantIds Identifiers of some other call participants.
 */
public class MessageGroupCall public constructor(
    public val isActive: Boolean,
    public val wasMissed: Boolean,
    public val isVideo: Boolean,
    public val duration: Int,
    public val otherParticipantIds: Array<MessageSender>,
) : MessageContent() {
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
        other as MessageGroupCall
        if (other.isActive != isActive) {
            return false
        }
        if (other.wasMissed != wasMissed) {
            return false
        }
        if (other.isVideo != isVideo) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        return other.otherParticipantIds.contentDeepEquals(otherParticipantIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isActive.hashCode()
        hashCode = 31 * hashCode + wasMissed.hashCode()
        hashCode = 31 * hashCode + isVideo.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + otherParticipantIds.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGroupCall")
            append("(")
            append("isActive=")
            append(isActive)
            append(", ")
            append("wasMissed=")
            append(wasMissed)
            append(", ")
            append("isVideo=")
            append(isVideo)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("otherParticipantIds=")
            otherParticipantIds
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
