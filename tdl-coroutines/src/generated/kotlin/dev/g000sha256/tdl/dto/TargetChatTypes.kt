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
 * Describes allowed types for the target chat.
 *
 * @property allowUserChats True, if private chats with ordinary users are allowed.
 * @property allowBotChats True, if private chats with other bots are allowed.
 * @property allowGroupChats True, if basic group and supergroup chats are allowed.
 * @property allowChannelChats True, if channel chats are allowed.
 */
public class TargetChatTypes public constructor(
    public val allowUserChats: Boolean,
    public val allowBotChats: Boolean,
    public val allowGroupChats: Boolean,
    public val allowChannelChats: Boolean,
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
        other as TargetChatTypes
        if (other.allowUserChats != allowUserChats) {
            return false
        }
        if (other.allowBotChats != allowBotChats) {
            return false
        }
        if (other.allowGroupChats != allowGroupChats) {
            return false
        }
        return other.allowChannelChats == allowChannelChats
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + allowUserChats.hashCode()
        hashCode = 31 * hashCode + allowBotChats.hashCode()
        hashCode = 31 * hashCode + allowGroupChats.hashCode()
        hashCode = 31 * hashCode + allowChannelChats.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TargetChatTypes")
            append("(")
            append("allowUserChats=")
            append(allowUserChats)
            append(", ")
            append("allowBotChats=")
            append(allowBotChats)
            append(", ")
            append("allowGroupChats=")
            append(allowGroupChats)
            append(", ")
            append("allowChannelChats=")
            append(allowChannelChats)
            append(")")
        }
    }
}
