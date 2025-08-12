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
 * Contains information about a suggested post. If the post can be approved or declined, then changes to the post can be also suggested. Use sendMessage with reply to the message and suggested post information to suggest message changes. Use addOffer to suggest price or time changes.
 *
 * @property price Price of the suggested post; may be null if the post is non-paid.
 * @property sendDate Point in time (Unix timestamp) when the post is expected to be published; 0 if the specific date isn't set yet.
 * @property state State of the post.
 * @property canBeApproved True, if the suggested post can be approved by the current user using approveSuggestedPost; updates aren't sent when value of this field changes.
 * @property canBeDeclined True, if the suggested post can be declined by the current user using declineSuggestedPost; updates aren't sent when value of this field changes.
 */
public class SuggestedPostInfo public constructor(
    public val price: SuggestedPostPrice?,
    public val sendDate: Int,
    public val state: SuggestedPostState,
    public val canBeApproved: Boolean,
    public val canBeDeclined: Boolean,
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
        other as SuggestedPostInfo
        if (other.price != price) {
            return false
        }
        if (other.sendDate != sendDate) {
            return false
        }
        if (other.state != state) {
            return false
        }
        if (other.canBeApproved != canBeApproved) {
            return false
        }
        return other.canBeDeclined == canBeDeclined
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + price.hashCode()
        hashCode = 31 * hashCode + sendDate.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + canBeApproved.hashCode()
        hashCode = 31 * hashCode + canBeDeclined.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SuggestedPostInfo")
            append("(")
            append("price=")
            append(price)
            append(", ")
            append("sendDate=")
            append(sendDate)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("canBeApproved=")
            append(canBeApproved)
            append(", ")
            append("canBeDeclined=")
            append(canBeDeclined)
            append(")")
        }
    }
}
