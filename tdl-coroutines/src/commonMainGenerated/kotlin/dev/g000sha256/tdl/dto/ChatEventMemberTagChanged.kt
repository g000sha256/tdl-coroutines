/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A chat member tag has been changed.
 *
 * @property userId Affected chat member user identifier.
 * @property oldTag Previous tag of the chat member.
 * @property newTag New tag of the chat member.
 */
public class ChatEventMemberTagChanged public constructor(
    public val userId: Long,
    public val oldTag: String,
    public val newTag: String,
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
        other as ChatEventMemberTagChanged
        if (other.userId != userId) {
            return false
        }
        if (other.oldTag != oldTag) {
            return false
        }
        return other.newTag == newTag
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + oldTag.hashCode()
        hashCode = 31 * hashCode + newTag.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventMemberTagChanged")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("oldTag=")
            append(oldTag)
            append(", ")
            append("newTag=")
            append(newTag)
            append(")")
        }
    }
}
