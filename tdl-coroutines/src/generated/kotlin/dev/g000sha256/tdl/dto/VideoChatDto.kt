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
 * Describes a video chat, i.e. a group call bound to a chat.
 *
 * @property groupCallId Group call identifier of an active video chat; 0 if none. Full information about the video chat can be received through the method getGroupCall.
 * @property hasParticipants True, if the video chat has participants.
 * @property defaultParticipantId Default group call participant identifier to join the video chat; may be null.
 */
public class VideoChatDto public constructor(
    public val groupCallId: Int,
    public val hasParticipants: Boolean,
    public val defaultParticipantId: MessageSenderDto?,
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
        other as VideoChatDto
        if (other.groupCallId != groupCallId) {
            return false
        }
        if (other.hasParticipants != hasParticipants) {
            return false
        }
        return other.defaultParticipantId == defaultParticipantId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + hasParticipants.hashCode()
        hashCode = 31 * hashCode + defaultParticipantId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoChatDto")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("hasParticipants=")
            append(hasParticipants)
            append(", ")
            append("defaultParticipantId=")
            append(defaultParticipantId)
            append(")")
        }
    }
}
