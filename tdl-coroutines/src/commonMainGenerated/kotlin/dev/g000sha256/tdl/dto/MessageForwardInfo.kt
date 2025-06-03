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
 * Contains information about a forwarded message.
 *
 * @property origin Origin of the forwarded message.
 * @property date Point in time (Unix timestamp) when the message was originally sent.
 * @property source For messages forwarded to the chat with the current user (Saved Messages), to the Replies bot chat, or to the channel's discussion group, information about the source message from which the message was forwarded last time; may be null for other forwards or if unknown.
 * @property publicServiceAnnouncementType The type of public service announcement for the forwarded message.
 */
public class MessageForwardInfo public constructor(
    public val origin: MessageOrigin,
    public val date: Int,
    public val source: ForwardSource?,
    public val publicServiceAnnouncementType: String,
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
        other as MessageForwardInfo
        if (other.origin != origin) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.source != source) {
            return false
        }
        return other.publicServiceAnnouncementType == publicServiceAnnouncementType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + origin.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        hashCode = 31 * hashCode + publicServiceAnnouncementType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageForwardInfo")
            append("(")
            append("origin=")
            append(origin)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("source=")
            append(source)
            append(", ")
            append("publicServiceAnnouncementType=")
            append(publicServiceAnnouncementType)
            append(")")
        }
    }
}
