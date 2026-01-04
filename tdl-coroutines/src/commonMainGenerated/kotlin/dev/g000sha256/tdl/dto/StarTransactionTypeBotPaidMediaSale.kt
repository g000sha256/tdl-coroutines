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
 * The transaction is a sale of paid media by the bot or a business account managed by the bot; relevant for bots only.
 *
 * @property userId Identifier of the user that bought the media.
 * @property media The bought media.
 * @property payload Bot-provided payload.
 * @property affiliate Information about the affiliate which received commission from the transaction; may be null if none.
 */
public class StarTransactionTypeBotPaidMediaSale public constructor(
    public val userId: Long,
    public val media: Array<PaidMedia>,
    public val payload: String,
    public val affiliate: AffiliateInfo?,
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
        other as StarTransactionTypeBotPaidMediaSale
        if (other.userId != userId) {
            return false
        }
        val mediaEquals = other.media.contentDeepEquals(media)
        if (!mediaEquals) {
            return false
        }
        if (other.payload != payload) {
            return false
        }
        return other.affiliate == affiliate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + media.contentDeepHashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        hashCode = 31 * hashCode + affiliate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeBotPaidMediaSale")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("media=")
            media
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("payload=")
            append(payload)
            append(", ")
            append("affiliate=")
            append(affiliate)
            append(")")
        }
    }
}
