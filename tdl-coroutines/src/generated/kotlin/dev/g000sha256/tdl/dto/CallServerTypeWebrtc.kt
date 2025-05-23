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
 * A WebRTC server.
 *
 * @property username Username to be used for authentication.
 * @property password Authentication password.
 * @property supportsTurn True, if the server supports TURN.
 * @property supportsStun True, if the server supports STUN.
 */
public class CallServerTypeWebrtc public constructor(
    public val username: String,
    public val password: String,
    public val supportsTurn: Boolean,
    public val supportsStun: Boolean,
) : CallServerType() {
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
        other as CallServerTypeWebrtc
        if (other.username != username) {
            return false
        }
        if (other.password != password) {
            return false
        }
        if (other.supportsTurn != supportsTurn) {
            return false
        }
        return other.supportsStun == supportsStun
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + username.hashCode()
        hashCode = 31 * hashCode + password.hashCode()
        hashCode = 31 * hashCode + supportsTurn.hashCode()
        hashCode = 31 * hashCode + supportsStun.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallServerTypeWebrtc")
            append("(")
            append("username=")
            append(username)
            append(", ")
            append("password=")
            append(password)
            append(", ")
            append("supportsTurn=")
            append(supportsTurn)
            append(", ")
            append("supportsStun=")
            append(supportsStun)
            append(")")
        }
    }
}
