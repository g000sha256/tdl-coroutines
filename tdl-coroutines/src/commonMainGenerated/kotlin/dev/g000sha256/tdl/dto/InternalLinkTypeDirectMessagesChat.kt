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
 * The link is a link to a channel direct messages chat by username of the channel. Call searchPublicChat with the given chat username to process the link. If the chat is found and is channel, open the direct messages chat of the channel.
 *
 * @property channelUsername Username of the channel.
 */
public class InternalLinkTypeDirectMessagesChat public constructor(
    public val channelUsername: String,
) : InternalLinkType() {
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
        other as InternalLinkTypeDirectMessagesChat
        return other.channelUsername == channelUsername
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + channelUsername.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeDirectMessagesChat")
            append("(")
            append("channelUsername=")
            append(channelUsername)
            append(")")
        }
    }
}
