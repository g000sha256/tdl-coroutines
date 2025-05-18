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
 * A new background was set in the chat.
 *
 * @property oldBackgroundMessageId Identifier of the message with a previously set same background; 0 if none. Can be an identifier of a deleted message.
 * @property background The new background.
 * @property onlyForSelf True, if the background was set only for self.
 */
public class MessageChatSetBackground public constructor(
    public val oldBackgroundMessageId: Long,
    public val background: ChatBackground,
    public val onlyForSelf: Boolean,
) : MessageContent() {
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
        other as MessageChatSetBackground
        if (other.oldBackgroundMessageId != oldBackgroundMessageId) {
            return false
        }
        if (other.background != background) {
            return false
        }
        return other.onlyForSelf == onlyForSelf
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldBackgroundMessageId.hashCode()
        hashCode = 31 * hashCode + background.hashCode()
        hashCode = 31 * hashCode + onlyForSelf.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChatSetBackground")
            append("(")
            append("oldBackgroundMessageId=")
            append(oldBackgroundMessageId)
            append(", ")
            append("background=")
            append(background)
            append(", ")
            append("onlyForSelf=")
            append(onlyForSelf)
            append(")")
        }
    }
}
