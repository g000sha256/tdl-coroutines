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
 * The gift was obtained by upgrading of a previously received gift.
 *
 * @property giftMessageId Identifier of the message with the regular gift that was upgraded; can be 0 or an identifier of a deleted message.
 */
public class UpgradedGiftOriginUpgrade public constructor(
    public val giftMessageId: Long,
) : UpgradedGiftOrigin() {
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
        other as UpgradedGiftOriginUpgrade
        return other.giftMessageId == giftMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + giftMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftOriginUpgrade")
            append("(")
            append("giftMessageId=")
            append(giftMessageId)
            append(")")
        }
    }
}
