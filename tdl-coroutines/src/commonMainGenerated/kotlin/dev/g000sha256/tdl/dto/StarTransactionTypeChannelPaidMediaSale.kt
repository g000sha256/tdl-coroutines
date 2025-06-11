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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * The transaction is a sale of paid media by the channel chat; for channel chats only.
 *
 * @property userId Identifier of the user that bought the media.
 * @property messageId Identifier of the corresponding message with paid media; can be 0 or an identifier of a deleted message.
 * @property media The bought media.
 */
public class StarTransactionTypeChannelPaidMediaSale public constructor(
    public val userId: Long,
    public val messageId: Long,
    public val media: Array<PaidMedia>,
) : StarTransactionType() {
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
        other as StarTransactionTypeChannelPaidMediaSale
        if (other.userId != userId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        return other.media.contentDeepEquals(media)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + media.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeChannelPaidMediaSale")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("media=")
            media
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
