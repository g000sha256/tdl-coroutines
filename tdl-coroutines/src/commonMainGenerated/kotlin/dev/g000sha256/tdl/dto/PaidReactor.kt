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
 * Contains information about a user that added paid reactions.
 *
 * @property senderId Identifier of the user or chat that added the reactions; may be null for anonymous reactors that aren't the current user.
 * @property starCount Number of Telegram Stars added.
 * @property isTop True, if the reactor is one of the most active reactors; may be false if the reactor is the current user.
 * @property isMe True, if the paid reaction was added by the current user.
 * @property isAnonymous True, if the reactor is anonymous.
 */
public class PaidReactor public constructor(
    public val senderId: MessageSender?,
    public val starCount: Long,
    public val isTop: Boolean,
    public val isMe: Boolean,
    public val isAnonymous: Boolean,
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
        other as PaidReactor
        if (other.senderId != senderId) {
            return false
        }
        if (other.starCount != starCount) {
            return false
        }
        if (other.isTop != isTop) {
            return false
        }
        if (other.isMe != isMe) {
            return false
        }
        return other.isAnonymous == isAnonymous
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        hashCode = 31 * hashCode + isTop.hashCode()
        hashCode = 31 * hashCode + isMe.hashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PaidReactor")
            append("(")
            append("senderId=")
            append(senderId)
            append(", ")
            append("starCount=")
            append(starCount)
            append(", ")
            append("isTop=")
            append(isTop)
            append(", ")
            append("isMe=")
            append(isMe)
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(")")
        }
    }
}
