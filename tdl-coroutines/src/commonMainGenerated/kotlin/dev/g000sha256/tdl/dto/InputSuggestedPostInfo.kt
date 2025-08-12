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
 * Contains information about a post to suggest.
 *
 * @property price Price of the suggested post; pass null to suggest a post without payment. If the current user isn't an administrator of the channel direct messages chat and has no enough funds to pay for the post, then the error &quot;BALANCE_TOO_LOW&quot; will be returned immediately.
 * @property sendDate Point in time (Unix timestamp) when the post is expected to be published; pass 0 if the date isn't restricted. If specified, then the date must be getOption(&quot;suggested_post_send_delay_min&quot;)-getOption(&quot;suggested_post_send_delay_max&quot;) seconds in the future.
 */
public class InputSuggestedPostInfo public constructor(
    public val price: SuggestedPostPrice?,
    public val sendDate: Int,
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
        other as InputSuggestedPostInfo
        if (other.price != price) {
            return false
        }
        return other.sendDate == sendDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + price.hashCode()
        hashCode = 31 * hashCode + sendDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputSuggestedPostInfo")
            append("(")
            append("price=")
            append(price)
            append(", ")
            append("sendDate=")
            append(sendDate)
            append(")")
        }
    }
}
