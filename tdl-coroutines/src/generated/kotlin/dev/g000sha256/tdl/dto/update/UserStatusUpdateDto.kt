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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.UserStatusDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * The user went online or offline.
 *
 * @property userId User identifier.
 * @property status New status of the user.
 */
public class UserStatusUpdateDto public constructor(
    public val userId: Long,
    public val status: UserStatusDto,
) : UpdateDto() {
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
        other as UserStatusUpdateDto
        if (other.userId != userId) {
            return false
        }
        return other.status == status
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserStatusUpdateDto")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("status=")
            append(status)
            append(")")
        }
    }
}
