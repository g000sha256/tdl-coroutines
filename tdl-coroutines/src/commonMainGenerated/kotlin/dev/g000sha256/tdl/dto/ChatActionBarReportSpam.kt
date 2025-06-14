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
 * The chat can be reported as spam using the method reportChat with an empty optionId and messageIds. If the chat is a private chat with a user with an emoji status, then a notice about emoji status usage must be shown.
 *
 * @property canUnarchive If true, the chat was automatically archived and can be moved back to the main chat list using addChatToList simultaneously with setting chat notification settings to default using setChatNotificationSettings.
 */
public class ChatActionBarReportSpam public constructor(
    public val canUnarchive: Boolean,
) : ChatActionBar() {
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
        other as ChatActionBarReportSpam
        return other.canUnarchive == canUnarchive
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canUnarchive.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatActionBarReportSpam")
            append("(")
            append("canUnarchive=")
            append(canUnarchive)
            append(")")
        }
    }
}
