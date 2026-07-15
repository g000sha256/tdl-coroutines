/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * A video note to be sent.
 *
 * @property voiceNote Voice note file to be sent. The voice note must be encoded with the Opus codec and stored inside an OGG container with a single audio channel, or be in MP3 or M4A format as regular audio.
 * @property duration Duration of the voice note, in seconds.
 * @property waveform Waveform representation of the voice note in 5-bit format.
 */
public class InputVoiceNote public constructor(
    public val voiceNote: InputFile,
    public val duration: Int,
    public val waveform: ByteArray,
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
        other as InputVoiceNote
        if (other.voiceNote != voiceNote) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        return other.waveform.contentEquals(waveform)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + voiceNote.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + waveform.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputVoiceNote")
            append("(")
            append("voiceNote=")
            append(voiceNote)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("waveform=")
            waveform
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
