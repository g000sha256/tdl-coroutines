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
 * Contains the description of an error in a Telegram Passport element.
 *
 * @property type Type of the Telegram Passport element which has the error.
 * @property message Error message.
 * @property source Error source.
 */
public class PassportElementError public constructor(
    public val type: PassportElementType,
    public val message: String,
    public val source: PassportElementErrorSource,
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
        other as PassportElementError
        if (other.type != type) {
            return false
        }
        if (other.message != message) {
            return false
        }
        return other.source == source
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PassportElementError")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("message=")
            append(message)
            append(", ")
            append("source=")
            append(source)
            append(")")
        }
    }
}
