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
 * The chat is a private chat with an administrator of a chat to which the user sent join request.
 *
 * @property title Title of the chat to which the join request was sent.
 * @property isChannel True, if the join request was sent to a channel chat.
 * @property requestDate Point in time (Unix timestamp) when the join request was sent.
 */
@SerialName(value = "chatActionBarJoinRequest")
@Serializable
public class ChatActionBarJoinRequest public constructor(
    @SerialName(value = "title")
    public val title: String,
    @SerialName(value = "is_channel")
    public val isChannel: Boolean,
    @SerialName(value = "request_date")
    public val requestDate: Int,
) : ChatActionBar() {
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
        other as ChatActionBarJoinRequest
        if (other.title != title) {
            return false
        }
        if (other.isChannel != isChannel) {
            return false
        }
        return other.requestDate == requestDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + isChannel.hashCode()
        hashCode = 31 * hashCode + requestDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatActionBarJoinRequest")
            append("(")
            append("title=")
            append(title)
            append(", ")
            append("isChannel=")
            append(isChannel)
            append(", ")
            append("requestDate=")
            append(requestDate)
            append(")")
        }
    }
}
