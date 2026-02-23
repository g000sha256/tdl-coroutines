/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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

/**
 * Describes a call.
 *
 * @property id Call identifier, not persistent.
 * @property uniqueId Persistent unique call identifier; 0 if isn't assigned yet by the server.
 * @property userId User identifier of the other call participant.
 * @property isOutgoing True, if the call is outgoing.
 * @property isVideo True, if the call is a video call.
 * @property state Call state.
 */
public class Call public constructor(
    public val id: Int,
    public val uniqueId: Long,
    public val userId: Long,
    public val isOutgoing: Boolean,
    public val isVideo: Boolean,
    public val state: CallState,
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
        other as Call
        if (other.id != id) {
            return false
        }
        if (other.uniqueId != uniqueId) {
            return false
        }
        if (other.userId != userId) {
            return false
        }
        if (other.isOutgoing != isOutgoing) {
            return false
        }
        if (other.isVideo != isVideo) {
            return false
        }
        return other.state == state
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + uniqueId.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + isOutgoing.hashCode()
        hashCode = 31 * hashCode + isVideo.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Call")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("uniqueId=")
            append(uniqueId)
            append(", ")
            append("userId=")
            append(userId)
            append(", ")
            append("isOutgoing=")
            append(isOutgoing)
            append(", ")
            append("isVideo=")
            append(isVideo)
            append(", ")
            append("state=")
            append(state)
            append(")")
        }
    }
}
