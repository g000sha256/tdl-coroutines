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
 * Describes a video note. The video must be equal in width and height, cropped to a circle, and stored in MPEG4 format.
 *
 * @property duration Duration of the video, in seconds; as defined by the sender.
 * @property waveform A waveform representation of the video note's audio in 5-bit format; may be empty if unknown.
 * @property length Video width and height; as defined by the sender.
 * @property minithumbnail Video minithumbnail; may be null.
 * @property thumbnail Video thumbnail in JPEG format; as defined by the sender; may be null.
 * @property speechRecognitionResult Result of speech recognition in the video note; may be null.
 * @property video File containing the video.
 */
public class VideoNoteDto public constructor(
    public val duration: Int,
    public val waveform: ByteArray,
    public val length: Int,
    public val minithumbnail: MinithumbnailDto?,
    public val thumbnail: ThumbnailDto?,
    public val speechRecognitionResult: SpeechRecognitionResultDto?,
    public val video: FileDto,
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
        other as VideoNoteDto
        if (other.duration != duration) {
            return false
        }
        val waveformEquals = other.waveform.contentEquals(waveform)
        if (!waveformEquals) {
            return false
        }
        if (other.length != length) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.speechRecognitionResult != speechRecognitionResult) {
            return false
        }
        return other.video == video
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + waveform.contentHashCode()
        hashCode = 31 * hashCode + length.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + speechRecognitionResult.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoNoteDto")
            append("(")
            append("duration=")
            append(duration)
            append(", ")
            append("waveform=")
            waveform
                .contentToString()
                .also { append(it) }
            append(", ")
            append("length=")
            append(length)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("speechRecognitionResult=")
            append(speechRecognitionResult)
            append(", ")
            append("video=")
            append(video)
            append(")")
        }
    }
}
