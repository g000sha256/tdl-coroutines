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
 * A chat member was deleted.
 *
 * @property memberName Name of the deleted member.
 * @property isCurrentUser True, if the current user was deleted from the group.
 * @property isLeft True, if the user has left the group themselves.
 */
public class PushMessageContentChatDeleteMember public constructor(
    public val memberName: String,
    public val isCurrentUser: Boolean,
    public val isLeft: Boolean,
) : PushMessageContent() {
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
        other as PushMessageContentChatDeleteMember
        if (other.memberName != memberName) {
            return false
        }
        if (other.isCurrentUser != isCurrentUser) {
            return false
        }
        return other.isLeft == isLeft
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + memberName.hashCode()
        hashCode = 31 * hashCode + isCurrentUser.hashCode()
        hashCode = 31 * hashCode + isLeft.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PushMessageContentChatDeleteMember")
            append("(")
            append("memberName=")
            append(memberName)
            append(", ")
            append("isCurrentUser=")
            append(isCurrentUser)
            append(", ")
            append("isLeft=")
            append(isLeft)
            append(")")
        }
    }
}
