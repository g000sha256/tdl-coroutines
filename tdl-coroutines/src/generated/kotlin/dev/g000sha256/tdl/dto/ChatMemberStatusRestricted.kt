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
 * The user is under certain restrictions in the chat. Not supported in basic groups and channels.
 *
 * @property isMember True, if the user is a member of the chat.
 * @property restrictedUntilDate Point in time (Unix timestamp) when restrictions will be lifted from the user; 0 if never. If the user is restricted for more than 366 days or for less than 30 seconds from the current time, the user is considered to be restricted forever.
 * @property permissions User permissions in the chat.
 */
public class ChatMemberStatusRestricted public constructor(
    public val isMember: Boolean,
    public val restrictedUntilDate: Int,
    public val permissions: ChatPermissions,
) : ChatMemberStatus() {
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
        other as ChatMemberStatusRestricted
        if (other.isMember != isMember) {
            return false
        }
        if (other.restrictedUntilDate != restrictedUntilDate) {
            return false
        }
        return other.permissions == permissions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isMember.hashCode()
        hashCode = 31 * hashCode + restrictedUntilDate.hashCode()
        hashCode = 31 * hashCode + permissions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatMemberStatusRestricted")
            append("(")
            append("isMember=")
            append(isMember)
            append(", ")
            append("restrictedUntilDate=")
            append(restrictedUntilDate)
            append(", ")
            append("permissions=")
            append(permissions)
            append(")")
        }
    }
}
