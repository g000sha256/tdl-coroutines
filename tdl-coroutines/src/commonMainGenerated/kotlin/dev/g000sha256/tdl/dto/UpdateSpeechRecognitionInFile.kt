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
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Speech in an audio file was partially recognized. The final result will be returned by the corresponding recognizeSpeechInFile request.
 *
 * @property recognitionId Identifier of the speech recognition as specified in recognizeSpeechInFile.
 * @property partialText Partially recognized text.
 */
public class UpdateSpeechRecognitionInFile public constructor(
    public val recognitionId: Long,
    public val partialText: String,
) : Update() {
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
        other as UpdateSpeechRecognitionInFile
        if (other.recognitionId != recognitionId) {
            return false
        }
        return other.partialText == partialText
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + recognitionId.hashCode()
        hashCode = 31 * hashCode + partialText.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateSpeechRecognitionInFile")
            append("(")
            append("recognitionId=")
            append(recognitionId)
            append(", ")
            append("partialText=")
            append(partialText)
            append(")")
        }
    }
}
