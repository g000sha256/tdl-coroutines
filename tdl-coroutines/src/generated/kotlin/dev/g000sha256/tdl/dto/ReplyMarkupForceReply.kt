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
 * Instructs application to force a reply to this message.
 *
 * @property isPersonal True, if a forced reply must automatically be shown to the current user. For outgoing messages, specify true to show the forced reply only for the mentioned users and for the target user of a reply.
 * @property inputFieldPlaceholder If non-empty, the placeholder to be shown in the input field when the reply is active; 0-64 characters.
 */
public class ReplyMarkupForceReply public constructor(
    public val isPersonal: Boolean,
    public val inputFieldPlaceholder: String,
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
        other as ReplyMarkupForceReply
        if (other.isPersonal != isPersonal) {
            return false
        }
        return other.inputFieldPlaceholder == inputFieldPlaceholder
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isPersonal.hashCode()
        hashCode = 31 * hashCode + inputFieldPlaceholder.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReplyMarkupForceReply")
            append("(")
            append("isPersonal=")
            append(isPersonal)
            append(", ")
            append("inputFieldPlaceholder=")
            append(inputFieldPlaceholder)
            append(")")
        }
    }
}
