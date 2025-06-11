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
 * Describes settings for messages that are automatically sent by a Telegram Business account when it is away.
 *
 * @property shortcutId Unique quick reply shortcut identifier for the away messages.
 * @property recipients Chosen recipients of the away messages.
 * @property schedule Settings used to check whether the current user is away.
 * @property offlineOnly True, if the messages must not be sent if the account was online in the last 10 minutes.
 */
public class BusinessAwayMessageSettings public constructor(
    public val shortcutId: Int,
    public val recipients: BusinessRecipients,
    public val schedule: BusinessAwayMessageSchedule,
    public val offlineOnly: Boolean,
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
        other as BusinessAwayMessageSettings
        if (other.shortcutId != shortcutId) {
            return false
        }
        if (other.recipients != recipients) {
            return false
        }
        if (other.schedule != schedule) {
            return false
        }
        return other.offlineOnly == offlineOnly
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + shortcutId.hashCode()
        hashCode = 31 * hashCode + recipients.hashCode()
        hashCode = 31 * hashCode + schedule.hashCode()
        hashCode = 31 * hashCode + offlineOnly.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessAwayMessageSettings")
            append("(")
            append("shortcutId=")
            append(shortcutId)
            append(", ")
            append("recipients=")
            append(recipients)
            append(", ")
            append("schedule=")
            append(schedule)
            append(", ")
            append("offlineOnly=")
            append(offlineOnly)
            append(")")
        }
    }
}
