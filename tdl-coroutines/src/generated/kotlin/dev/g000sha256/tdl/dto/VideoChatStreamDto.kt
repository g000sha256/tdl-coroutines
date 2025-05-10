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
import kotlin.Long
import kotlin.String

/**
 * Describes an available stream in a video chat.
 *
 * @property channelId Identifier of an audio/video channel.
 * @property scale Scale of segment durations in the stream. The duration is 1000/(2**scale) milliseconds.
 * @property timeOffset Point in time when the stream currently ends; Unix timestamp in milliseconds.
 */
public class VideoChatStreamDto public constructor(
    public val channelId: Int,
    public val scale: Int,
    public val timeOffset: Long,
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
        other as VideoChatStreamDto
        if (other.channelId != channelId) {
            return false
        }
        if (other.scale != scale) {
            return false
        }
        return other.timeOffset == timeOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + channelId.hashCode()
        hashCode = 31 * hashCode + scale.hashCode()
        hashCode = 31 * hashCode + timeOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoChatStreamDto")
            append("(")
            append("channelId=")
            append(channelId)
            append(", ")
            append("scale=")
            append(scale)
            append(", ")
            append("timeOffset=")
            append(timeOffset)
            append(")")
        }
    }
}
