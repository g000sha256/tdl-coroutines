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
 * Contains information about an unread reaction to a message.
 *
 * @property type Type of the reaction.
 * @property senderId Identifier of the sender, added the reaction.
 * @property isBig True, if the reaction was added with a big animation.
 */
public class UnreadReaction public constructor(
    public val type: ReactionType,
    public val senderId: MessageSender,
    public val isBig: Boolean,
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
        other as UnreadReaction
        if (other.type != type) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        return other.isBig == isBig
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + isBig.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UnreadReaction")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("isBig=")
            append(isBig)
            append(")")
        }
    }
}
