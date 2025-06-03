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
 * The file contains an error. The error is considered resolved when the file changes.
 *
 * @property fileHash Current hash of the file which has the error.
 */
public class InputPassportElementErrorSourceFile public constructor(
    public val fileHash: ByteArray,
) : InputPassportElementErrorSource() {
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
        other as InputPassportElementErrorSourceFile
        return other.fileHash.contentEquals(fileHash)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileHash.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPassportElementErrorSourceFile")
            append("(")
            append("fileHash=")
            fileHash
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
