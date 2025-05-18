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
 * Describes a slot for chat boost.
 *
 * @property slotId Unique identifier of the slot.
 * @property currentlyBoostedChatId Identifier of the currently boosted chat; 0 if none.
 * @property startDate Point in time (Unix timestamp) when the chat was boosted; 0 if none.
 * @property expirationDate Point in time (Unix timestamp) when the boost will expire.
 * @property cooldownUntilDate Point in time (Unix timestamp) after which the boost can be used for another chat.
 */
public class ChatBoostSlot public constructor(
    public val slotId: Int,
    public val currentlyBoostedChatId: Long,
    public val startDate: Int,
    public val expirationDate: Int,
    public val cooldownUntilDate: Int,
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
        other as ChatBoostSlot
        if (other.slotId != slotId) {
            return false
        }
        if (other.currentlyBoostedChatId != currentlyBoostedChatId) {
            return false
        }
        if (other.startDate != startDate) {
            return false
        }
        if (other.expirationDate != expirationDate) {
            return false
        }
        return other.cooldownUntilDate == cooldownUntilDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + slotId.hashCode()
        hashCode = 31 * hashCode + currentlyBoostedChatId.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + cooldownUntilDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostSlot")
            append("(")
            append("slotId=")
            append(slotId)
            append(", ")
            append("currentlyBoostedChatId=")
            append(currentlyBoostedChatId)
            append(", ")
            append("startDate=")
            append(startDate)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(", ")
            append("cooldownUntilDate=")
            append(cooldownUntilDate)
            append(")")
        }
    }
}
