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
 * A new paid reaction was received in a live story group call.
 *
 * @property groupCallId Identifier of the group call.
 * @property senderId Identifier of the sender of the reaction.
 * @property starCount The number of Telegram Stars that were paid to send the reaction.
 */
public class UpdateNewGroupCallPaidReaction public constructor(
    public val groupCallId: Int,
    public val senderId: MessageSender,
    public val starCount: Long,
) : Update() {
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
        other as UpdateNewGroupCallPaidReaction
        if (other.groupCallId != groupCallId) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        return other.starCount == starCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + starCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewGroupCallPaidReaction")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("starCount=")
            append(starCount)
            append(")")
        }
    }
}
