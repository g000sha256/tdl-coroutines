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
 * The message will be sent at the specified date.
 *
 * @property sendDate Point in time (Unix timestamp) when the message will be sent. The date must be within 367 days in the future.
 * @property repeatPeriod Period after which the message will be sent again; in seconds; 0 if never; for Telegram Premium users only; may be non-zero only in sendMessage and forwardMessages with one message requests; must be one of 0, 86400, 7 * 86400, 14 * 86400, 30 * 86400, 91 * 86400, 182 * 86400, 365 * 86400, or additionally 60, or 300 in the Test DC.
 */
public class MessageSchedulingStateSendAtDate public constructor(
    public val sendDate: Int,
    public val repeatPeriod: Int,
) : MessageSchedulingState() {
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
        other as MessageSchedulingStateSendAtDate
        if (other.sendDate != sendDate) {
            return false
        }
        return other.repeatPeriod == repeatPeriod
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sendDate.hashCode()
        hashCode = 31 * hashCode + repeatPeriod.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageSchedulingStateSendAtDate")
            append("(")
            append("sendDate=")
            append(sendDate)
            append(", ")
            append("repeatPeriod=")
            append(repeatPeriod)
            append(")")
        }
    }
}
