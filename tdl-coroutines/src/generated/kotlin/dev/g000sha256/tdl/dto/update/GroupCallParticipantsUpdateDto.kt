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

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.LongArray
import kotlin.String

/**
 * The list of group call participants that can send and receive encrypted call data has changed; for group calls not bound to a chat only.
 *
 * @property groupCallId Identifier of the group call.
 * @property participantUserIds New list of group call participant user identifiers. The identifiers may be invalid or the corresponding users may be unknown. The participants must be shown in the list of group call participants even there is no information about them.
 */
public class GroupCallParticipantsUpdateDto public constructor(
    public val groupCallId: Int,
    public val participantUserIds: LongArray,
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
        other as GroupCallParticipantsUpdateDto
        if (other.groupCallId != groupCallId) {
            return false
        }
        return other.participantUserIds.contentEquals(participantUserIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + participantUserIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallParticipantsUpdateDto")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("participantUserIds=")
            participantUserIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
