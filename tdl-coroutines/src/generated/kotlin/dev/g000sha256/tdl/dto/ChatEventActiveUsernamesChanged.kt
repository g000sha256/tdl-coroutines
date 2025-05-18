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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The chat active usernames were changed.
 *
 * @property oldUsernames Previous list of active usernames.
 * @property newUsernames New list of active usernames.
 */
public class ChatEventActiveUsernamesChanged public constructor(
    public val oldUsernames: Array<String>,
    public val newUsernames: Array<String>,
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
        other as ChatEventActiveUsernamesChanged
        val oldUsernamesEquals = other.oldUsernames.contentDeepEquals(oldUsernames)
        if (!oldUsernamesEquals) {
            return false
        }
        return other.newUsernames.contentDeepEquals(newUsernames)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldUsernames.contentDeepHashCode()
        hashCode = 31 * hashCode + newUsernames.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventActiveUsernamesChanged")
            append("(")
            append("oldUsernames=")
            oldUsernames
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("newUsernames=")
            newUsernames
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
