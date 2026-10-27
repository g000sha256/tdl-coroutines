/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * The link is a link to a user by a temporary token. Call searchUserByToken with the given token to process the link. If the user is found, then call createPrivateChat and open the chat.
 *
 * @property token The token.
 * @property unpaidMessagesToken Token, which allows the current user to send unpaid messages to the user; may be empty if none. If the token isn't empty and the user is found, then call applyUnpaidMessagesToken with the user and the token.
 */
public class InternalLinkTypeUserToken public constructor(
    public val token: String,
    public val unpaidMessagesToken: String,
) : InternalLinkType() {
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
        other as InternalLinkTypeUserToken
        if (other.token != token) {
            return false
        }
        return other.unpaidMessagesToken == unpaidMessagesToken
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + token.hashCode()
        hashCode = 31 * hashCode + unpaidMessagesToken.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeUserToken")
            append("(")
            append("token=")
            append(token)
            append(", ")
            append("unpaidMessagesToken=")
            append(unpaidMessagesToken)
            append(")")
        }
    }
}
