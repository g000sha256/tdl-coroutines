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
 * Contains privacy settings for message read date in private chats. Read dates are always shown to the users that can see online status of the current user regardless of this setting.
 *
 * @property showReadDate True, if message read date is shown to other users in private chats. If false and the current user isn't a Telegram Premium user, then they will not be able to see other's message read date.
 */
public class ReadDatePrivacySettingsDto public constructor(
    public val showReadDate: Boolean,
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
        other as ReadDatePrivacySettingsDto
        return other.showReadDate == showReadDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + showReadDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReadDatePrivacySettingsDto")
            append("(")
            append("showReadDate=")
            append(showReadDate)
            append(")")
        }
    }
}
