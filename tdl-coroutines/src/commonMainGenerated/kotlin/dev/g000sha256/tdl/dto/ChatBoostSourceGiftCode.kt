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
 * The chat created a Telegram Premium gift code for a user.
 *
 * @property userId Identifier of a user, for which the gift code was created.
 * @property giftCode The created Telegram Premium gift code, which is known only if this is a gift code for the current user, or it has already been claimed.
 */
public class ChatBoostSourceGiftCode public constructor(
    public val userId: Long,
    public val giftCode: String,
) : ChatBoostSource() {
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
        other as ChatBoostSourceGiftCode
        if (other.userId != userId) {
            return false
        }
        return other.giftCode == giftCode
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + giftCode.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostSourceGiftCode")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("giftCode=")
            append(giftCode)
            append(")")
        }
    }
}
