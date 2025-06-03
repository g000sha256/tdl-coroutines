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
 * Represents one language pack string.
 *
 * @property key String key.
 * @property value String value; pass null if the string needs to be taken from the built-in English language pack.
 */
public class LanguagePackString public constructor(
    public val key: String,
    public val value: LanguagePackStringValue?,
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
        other as LanguagePackString
        if (other.key != key) {
            return false
        }
        return other.value == value
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + key.hashCode()
        hashCode = 31 * hashCode + value.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LanguagePackString")
            append("(")
            append("key=")
            append(key)
            append(", ")
            append("value=")
            append(value)
            append(")")
        }
    }
}
