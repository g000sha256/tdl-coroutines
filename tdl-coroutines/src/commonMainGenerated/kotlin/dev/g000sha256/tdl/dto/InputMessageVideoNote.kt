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
 * A video note message.
 *
 * @property videoNote Video note to be sent.
 * @property selfDestructType Video note self-destruct type; may be null if none; pass null if none; private chats only.
 */
public class InputMessageVideoNote public constructor(
    public val videoNote: InputVideoNote,
    public val selfDestructType: MessageSelfDestructType?,
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
        other as InputMessageVideoNote
        if (other.videoNote != videoNote) {
            return false
        }
        return other.selfDestructType == selfDestructType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + videoNote.hashCode()
        hashCode = 31 * hashCode + selfDestructType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageVideoNote")
            append("(")
            append("videoNote=")
            append(videoNote)
            append(", ")
            append("selfDestructType=")
            append(selfDestructType)
            append(")")
        }
    }
}
