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
 * A voice note message.
 *
 * @property voiceNote The voice note description.
 * @property caption Voice note caption.
 * @property isListened True, if at least one of the recipients has listened to the voice note.
 */
public class MessageVoiceNote public constructor(
    public val voiceNote: VoiceNote,
    public val caption: FormattedText,
    public val isListened: Boolean,
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
        other as MessageVoiceNote
        if (other.voiceNote != voiceNote) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        return other.isListened == isListened
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + voiceNote.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + isListened.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageVoiceNote")
            append("(")
            append("voiceNote=")
            append(voiceNote)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("isListened=")
            append(isListened)
            append(")")
        }
    }
}
