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
 * Contains information about a chat administrator.
 *
 * @property userId User identifier of the administrator.
 * @property customTitle Custom title of the administrator.
 * @property isOwner True, if the user is the owner of the chat.
 */
public class ChatAdministratorDto public constructor(
    public val userId: Long,
    public val customTitle: String,
    public val isOwner: Boolean,
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
        other as ChatAdministratorDto
        if (other.userId != userId) {
            return false
        }
        if (other.customTitle != customTitle) {
            return false
        }
        return other.isOwner == isOwner
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + customTitle.hashCode()
        hashCode = 31 * hashCode + isOwner.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatAdministratorDto")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("customTitle=")
            append(customTitle)
            append(", ")
            append("isOwner=")
            append(isOwner)
            append(")")
        }
    }
}
