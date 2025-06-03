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
 * A dice message.
 *
 * @property emoji Emoji on which the dice throw animation is based.
 * @property clearDraft True, if the chat message draft must be deleted.
 */
public class InputMessageDice public constructor(
    public val emoji: String,
    public val clearDraft: Boolean,
) : InputMessageContent() {
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
        other as InputMessageDice
        if (other.emoji != emoji) {
            return false
        }
        return other.clearDraft == clearDraft
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + emoji.hashCode()
        hashCode = 31 * hashCode + clearDraft.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageDice")
            append("(")
            append("emoji=")
            append(emoji)
            append(", ")
            append("clearDraft=")
            append(clearDraft)
            append(")")
        }
    }
}
