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
 * A chat invite link was edited.
 *
 * @property oldInviteLink Previous information about the invite link.
 * @property newInviteLink New information about the invite link.
 */
public class ChatEventInviteLinkEdited public constructor(
    public val oldInviteLink: ChatInviteLink,
    public val newInviteLink: ChatInviteLink,
) : ChatEventAction() {
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
        other as ChatEventInviteLinkEdited
        if (other.oldInviteLink != oldInviteLink) {
            return false
        }
        return other.newInviteLink == newInviteLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldInviteLink.hashCode()
        hashCode = 31 * hashCode + newInviteLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventInviteLinkEdited")
            append("(")
            append("oldInviteLink=")
            append(oldInviteLink)
            append(", ")
            append("newInviteLink=")
            append(newInviteLink)
            append(")")
        }
    }
}
