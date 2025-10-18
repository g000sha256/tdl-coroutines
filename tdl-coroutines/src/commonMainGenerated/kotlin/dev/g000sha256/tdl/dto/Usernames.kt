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
 * Describes usernames assigned to a user, a supergroup, or a channel.
 *
 * @property activeUsernames List of active usernames; the first one must be shown as the primary username. The order of active usernames can be changed with reorderActiveUsernames, reorderBotActiveUsernames or reorderSupergroupActiveUsernames.
 * @property disabledUsernames List of currently disabled usernames; the username can be activated with toggleUsernameIsActive, toggleBotUsernameIsActive, or toggleSupergroupUsernameIsActive.
 * @property editableUsername Active or disabled username, which may be changed with setUsername or setSupergroupUsername. Information about other active usernames can be received using getCollectibleItemInfo.
 */
public class Usernames public constructor(
    public val activeUsernames: Array<String>,
    public val disabledUsernames: Array<String>,
    public val editableUsername: String,
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
        other as Usernames
        val activeUsernamesEquals = other.activeUsernames.contentDeepEquals(activeUsernames)
        if (!activeUsernamesEquals) {
            return false
        }
        val disabledUsernamesEquals = other.disabledUsernames.contentDeepEquals(disabledUsernames)
        if (!disabledUsernamesEquals) {
            return false
        }
        return other.editableUsername == editableUsername
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + activeUsernames.contentDeepHashCode()
        hashCode = 31 * hashCode + disabledUsernames.contentDeepHashCode()
        hashCode = 31 * hashCode + editableUsername.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Usernames")
            append("(")
            append("activeUsernames=")
            activeUsernames
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("disabledUsernames=")
            disabledUsernames
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("editableUsername=")
            append(editableUsername)
            append(")")
        }
    }
}
