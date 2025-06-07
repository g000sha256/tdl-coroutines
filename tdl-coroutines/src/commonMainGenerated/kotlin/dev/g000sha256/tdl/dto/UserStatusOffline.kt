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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The user is offline.
 *
 * @property wasOnline Point in time (Unix timestamp) when the user was last online.
 */
@SerialName(value = "userStatusOffline")
@Serializable
public class UserStatusOffline public constructor(
    @SerialName(value = "was_online")
    public val wasOnline: Int,
) : UserStatus() {
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
        other as UserStatusOffline
        return other.wasOnline == wasOnline
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + wasOnline.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserStatusOffline")
            append("(")
            append("wasOnline=")
            append(wasOnline)
            append(")")
        }
    }
}
