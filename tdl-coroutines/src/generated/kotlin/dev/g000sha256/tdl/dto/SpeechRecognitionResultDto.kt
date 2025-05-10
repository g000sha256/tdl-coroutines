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
 * This class is an abstract base class.
 * Describes result of speech recognition in a voice note.
 */
public sealed class SpeechRecognitionResultDto private constructor() {
    /**
     * The speech recognition is ongoing.
     *
     * @property partialText Partially recognized text.
     */
    public class Pending public constructor(
        public val partialText: String,
    ) : SpeechRecognitionResultDto() {
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
            other as Pending
            return other.partialText == partialText
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + partialText.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SpeechRecognitionResultDto.Pending")
                append("(")
                append("partialText=")
                append(partialText)
                append(")")
            }
        }
    }

    /**
     * The speech recognition successfully finished.
     *
     * @property text Recognized text.
     */
    public class Text public constructor(
        public val text: String,
    ) : SpeechRecognitionResultDto() {
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
            other as Text
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SpeechRecognitionResultDto.Text")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * The speech recognition failed.
     *
     * @property error Recognition error. An error with a message &quot;MSG_VOICE_TOO_LONG&quot; is returned when media duration is too big to be recognized.
     */
    public class Error public constructor(
        public val error: ErrorDto,
    ) : SpeechRecognitionResultDto() {
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
            other as Error
            return other.error == error
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + error.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SpeechRecognitionResultDto.Error")
                append("(")
                append("error=")
                append(error)
                append(")")
            }
        }
    }
}
