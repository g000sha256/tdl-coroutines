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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * Describes a voice note.
 *
 * @property duration Duration of the voice note, in seconds; as defined by the sender.
 * @property waveform A waveform representation of the voice note in 5-bit format.
 * @property mimeType MIME type of the file; as defined by the sender. Usually, one of &quot;audio/ogg&quot; for Opus in an OGG container, &quot;audio/mpeg&quot; for an MP3 audio, or &quot;audio/mp4&quot; for an M4A audio.
 * @property speechRecognitionResult Result of speech recognition in the voice note; may be null.
 * @property voice File containing the voice note.
 */
public class VoiceNote public constructor(
    public val duration: Int,
    public val waveform: ByteArray,
    public val mimeType: String,
    public val speechRecognitionResult: SpeechRecognitionResult?,
    public val voice: File,
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
        other as VoiceNote
        if (other.duration != duration) {
            return false
        }
        val waveformEquals = other.waveform.contentEquals(waveform)
        if (!waveformEquals) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        if (other.speechRecognitionResult != speechRecognitionResult) {
            return false
        }
        return other.voice == voice
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + waveform.contentHashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + speechRecognitionResult.hashCode()
        hashCode = 31 * hashCode + voice.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VoiceNote")
            append("(")
            append("duration=")
            append(duration)
            append(", ")
            append("waveform=")
            waveform
                .contentToString()
                .also { append(it) }
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("speechRecognitionResult=")
            append(speechRecognitionResult)
            append(", ")
            append("voice=")
            append(voice)
            append(")")
        }
    }
}
