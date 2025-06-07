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
 * Describes parameters used to join a group call.
 *
 * @property audioSourceId Audio channel synchronization source identifier; received from tgcalls.
 * @property payload Group call join payload; received from tgcalls.
 * @property isMuted Pass true to join the call with muted microphone.
 * @property isMyVideoEnabled Pass true if the user's video is enabled.
 */
@SerialName(value = "groupCallJoinParameters")
@Serializable
public class GroupCallJoinParameters public constructor(
    @SerialName(value = "audio_source_id")
    public val audioSourceId: Int,
    @SerialName(value = "payload")
    public val payload: String,
    @SerialName(value = "is_muted")
    public val isMuted: Boolean,
    @SerialName(value = "is_my_video_enabled")
    public val isMyVideoEnabled: Boolean,
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
        other as GroupCallJoinParameters
        if (other.audioSourceId != audioSourceId) {
            return false
        }
        if (other.payload != payload) {
            return false
        }
        if (other.isMuted != isMuted) {
            return false
        }
        return other.isMyVideoEnabled == isMyVideoEnabled
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + audioSourceId.hashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        hashCode = 31 * hashCode + isMuted.hashCode()
        hashCode = 31 * hashCode + isMyVideoEnabled.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallJoinParameters")
            append("(")
            append("audioSourceId=")
            append(audioSourceId)
            append(", ")
            append("payload=")
            append(payload)
            append(", ")
            append("isMuted=")
            append(isMuted)
            append(", ")
            append("isMyVideoEnabled=")
            append(isMyVideoEnabled)
            append(")")
        }
    }
}
