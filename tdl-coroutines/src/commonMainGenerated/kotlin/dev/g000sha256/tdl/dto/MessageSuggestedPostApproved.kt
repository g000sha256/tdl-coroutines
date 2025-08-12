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
 * A suggested post was approved.
 *
 * @property suggestedPostMessageId Identifier of the message with the suggested post; can be 0 if the message was deleted.
 * @property price Price of the suggested post; may be null if the post is non-paid.
 * @property sendDate Point in time (Unix timestamp) when the post is expected to be published.
 */
public class MessageSuggestedPostApproved public constructor(
    public val suggestedPostMessageId: Long,
    public val price: SuggestedPostPrice?,
    public val sendDate: Int,
) : MessageContent() {
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
        other as MessageSuggestedPostApproved
        if (other.suggestedPostMessageId != suggestedPostMessageId) {
            return false
        }
        if (other.price != price) {
            return false
        }
        return other.sendDate == sendDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + suggestedPostMessageId.hashCode()
        hashCode = 31 * hashCode + price.hashCode()
        hashCode = 31 * hashCode + sendDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageSuggestedPostApproved")
            append("(")
            append("suggestedPostMessageId=")
            append(suggestedPostMessageId)
            append(", ")
            append("price=")
            append(price)
            append(", ")
            append("sendDate=")
            append(sendDate)
            append(")")
        }
    }
}
