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
 * Describes the original details about the gift.
 *
 * @property senderId Identifier of the user or the chat that sent the gift; may be null if the gift was private.
 * @property receiverId Identifier of the user or the chat that received the gift.
 * @property text Message added to the gift.
 * @property date Point in time (Unix timestamp) when the gift was sent.
 */
public class UpgradedGiftOriginalDetails public constructor(
    public val senderId: MessageSender?,
    public val receiverId: MessageSender,
    public val text: FormattedText,
    public val date: Int,
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
        other as UpgradedGiftOriginalDetails
        if (other.senderId != senderId) {
            return false
        }
        if (other.receiverId != receiverId) {
            return false
        }
        if (other.text != text) {
            return false
        }
        return other.date == date
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + receiverId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftOriginalDetails")
            append("(")
            append("senderId=")
            append(senderId)
            append(", ")
            append("receiverId=")
            append(receiverId)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("date=")
            append(date)
            append(")")
        }
    }
}
