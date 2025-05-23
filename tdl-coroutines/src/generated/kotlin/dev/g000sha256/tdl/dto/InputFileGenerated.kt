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
import kotlin.Long
import kotlin.String

/**
 * A file generated by the application. The application must handle updates updateFileGenerationStart and updateFileGenerationStop to generate the file when asked by TDLib.
 *
 * @property originalPath Local path to a file from which the file is generated. The path doesn't have to be a valid path and is used by TDLib only to detect name and MIME type of the generated file.
 * @property conversion String specifying the conversion applied to the original file; must be persistent across application restarts. Conversions beginning with '#' are reserved for internal TDLib usage.
 * @property expectedSize Expected size of the generated file, in bytes; pass 0 if unknown.
 */
public class InputFileGenerated public constructor(
    public val originalPath: String,
    public val conversion: String,
    public val expectedSize: Long,
) : InputFile() {
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
        other as InputFileGenerated
        if (other.originalPath != originalPath) {
            return false
        }
        if (other.conversion != conversion) {
            return false
        }
        return other.expectedSize == expectedSize
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + originalPath.hashCode()
        hashCode = 31 * hashCode + conversion.hashCode()
        hashCode = 31 * hashCode + expectedSize.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputFileGenerated")
            append("(")
            append("originalPath=")
            append(originalPath)
            append(", ")
            append("conversion=")
            append(conversion)
            append(", ")
            append("expectedSize=")
            append(expectedSize)
            append(")")
        }
    }
}
