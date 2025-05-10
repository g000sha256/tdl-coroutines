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
 * Contains privacy settings for chats with non-contacts.
 *
 * @property allowNewChatsFromUnknownUsers True, if non-contacts users are able to write first to the current user. Telegram Premium subscribers are able to write first regardless of this setting.
 * @property incomingPaidMessageStarCount Number of Telegram Stars that must be paid for every incoming private message by non-contacts; 0-getOption(&quot;paid_message_star_count_max&quot;). If positive, then allowNewChatsFromUnknownUsers must be true. The current user will receive getOption(&quot;paid_message_earnings_per_mille&quot;) Telegram Stars for each 1000 Telegram Stars paid for message sending. Can be positive, only if getOption(&quot;can_enable_paid_messages&quot;) is true.
 */
public class NewChatPrivacySettingsDto public constructor(
    public val allowNewChatsFromUnknownUsers: Boolean,
    public val incomingPaidMessageStarCount: Long,
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
        other as NewChatPrivacySettingsDto
        if (other.allowNewChatsFromUnknownUsers != allowNewChatsFromUnknownUsers) {
            return false
        }
        return other.incomingPaidMessageStarCount == incomingPaidMessageStarCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + allowNewChatsFromUnknownUsers.hashCode()
        hashCode = 31 * hashCode + incomingPaidMessageStarCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NewChatPrivacySettingsDto")
            append("(")
            append("allowNewChatsFromUnknownUsers=")
            append(allowNewChatsFromUnknownUsers)
            append(", ")
            append("incomingPaidMessageStarCount=")
            append(incomingPaidMessageStarCount)
            append(")")
        }
    }
}
