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
 * A live story.
 *
 * @property groupCallId Identifier of the corresponding group call. The group call can be received through the method getGroupCall.
 * @property isRtmpStream True, if the call is an RTMP stream instead of an ordinary group call.
 */
public class StoryContentLive public constructor(
    public val groupCallId: Int,
    public val isRtmpStream: Boolean,
) : StoryContent() {
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
        other as StoryContentLive
        if (other.groupCallId != groupCallId) {
            return false
        }
        return other.isRtmpStream == isRtmpStream
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + isRtmpStream.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryContentLive")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("isRtmpStream=")
            append(isRtmpStream)
            append(")")
        }
    }
}
