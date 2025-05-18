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
 * Describes a user that sent a join request and waits for administrator approval.
 *
 * @property userId User identifier.
 * @property date Point in time (Unix timestamp) when the user sent the join request.
 * @property bio A short bio of the user.
 */
public class ChatJoinRequest public constructor(
    public val userId: Long,
    public val date: Int,
    public val bio: String,
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
        other as ChatJoinRequest
        if (other.userId != userId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        return other.bio == bio
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + bio.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatJoinRequest")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("bio=")
            append(bio)
            append(")")
        }
    }
}
