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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.GroupCallParticipantDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Information about a group call participant was changed. The updates are sent only after the group call is received through getGroupCall and only if the call is joined or being joined.
 *
 * @property groupCallId Identifier of the group call.
 * @property participant New data about the participant.
 */
public class GroupCallParticipantUpdateDto public constructor(
    public val groupCallId: Int,
    public val participant: GroupCallParticipantDto,
) : UpdateDto() {
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
        other as GroupCallParticipantUpdateDto
        if (other.groupCallId != groupCallId) {
            return false
        }
        return other.participant == participant
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + participant.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallParticipantUpdateDto")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("participant=")
            append(participant)
            append(")")
        }
    }
}
