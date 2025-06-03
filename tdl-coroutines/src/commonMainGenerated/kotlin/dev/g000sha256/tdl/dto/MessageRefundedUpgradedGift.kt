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
 * A gift which purchase, upgrade or transfer were refunded.
 *
 * @property gift The gift.
 * @property senderId Sender of the gift.
 * @property isUpgrade True, if the gift was obtained by upgrading of a previously received gift; otherwise, this is a transferred or resold gift.
 */
public class MessageRefundedUpgradedGift public constructor(
    public val gift: Gift,
    public val senderId: MessageSender,
    public val isUpgrade: Boolean,
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
        other as MessageRefundedUpgradedGift
        if (other.gift != gift) {
            return false
        }
        if (other.senderId != senderId) {
            return false
        }
        return other.isUpgrade == isUpgrade
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        hashCode = 31 * hashCode + senderId.hashCode()
        hashCode = 31 * hashCode + isUpgrade.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageRefundedUpgradedGift")
            append("(")
            append("gift=")
            append(gift)
            append(", ")
            append("senderId=")
            append(senderId)
            append(", ")
            append("isUpgrade=")
            append(isUpgrade)
            append(")")
        }
    }
}
