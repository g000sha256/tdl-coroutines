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
 * Contains information about a group call participant's video channel.
 *
 * @property sourceGroups List of synchronization source groups of the video.
 * @property endpointId Video channel endpoint identifier.
 * @property isPaused True, if the video is paused. This flag needs to be ignored, if new video frames are received.
 */
public class GroupCallParticipantVideoInfo public constructor(
    public val sourceGroups: Array<GroupCallVideoSourceGroup>,
    public val endpointId: String,
    public val isPaused: Boolean,
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
        other as GroupCallParticipantVideoInfo
        val sourceGroupsEquals = other.sourceGroups.contentDeepEquals(sourceGroups)
        if (!sourceGroupsEquals) {
            return false
        }
        if (other.endpointId != endpointId) {
            return false
        }
        return other.isPaused == isPaused
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sourceGroups.contentDeepHashCode()
        hashCode = 31 * hashCode + endpointId.hashCode()
        hashCode = 31 * hashCode + isPaused.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallParticipantVideoInfo")
            append("(")
            append("sourceGroups=")
            sourceGroups
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("endpointId=")
            append(endpointId)
            append(", ")
            append("isPaused=")
            append(isPaused)
            append(")")
        }
    }
}
