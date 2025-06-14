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
 * Instructs application to remove the keyboard once this message has been received. This kind of keyboard can't be received in an incoming message; instead, updateChatReplyMarkup with messageId == 0 will be sent.
 *
 * @property isPersonal True, if the keyboard is removed only for the mentioned users or the target user of a reply.
 */
public class ReplyMarkupRemoveKeyboard public constructor(
    public val isPersonal: Boolean,
) : ReplyMarkup() {
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
        other as ReplyMarkupRemoveKeyboard
        return other.isPersonal == isPersonal
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isPersonal.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReplyMarkupRemoveKeyboard")
            append("(")
            append("isPersonal=")
            append(isPersonal)
            append(")")
        }
    }
}
