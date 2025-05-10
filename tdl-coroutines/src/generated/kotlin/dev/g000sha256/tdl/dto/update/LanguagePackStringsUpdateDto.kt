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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.LanguagePackStringDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Some language pack strings have been updated.
 *
 * @property localizationTarget Localization target to which the language pack belongs.
 * @property languagePackId Identifier of the updated language pack.
 * @property strings List of changed language pack strings; empty if all strings have changed.
 */
public class LanguagePackStringsUpdateDto public constructor(
    public val localizationTarget: String,
    public val languagePackId: String,
    public val strings: Array<LanguagePackStringDto>,
) : UpdateDto() {
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
        other as LanguagePackStringsUpdateDto
        if (other.localizationTarget != localizationTarget) {
            return false
        }
        if (other.languagePackId != languagePackId) {
            return false
        }
        return other.strings.contentDeepEquals(strings)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + localizationTarget.hashCode()
        hashCode = 31 * hashCode + languagePackId.hashCode()
        hashCode = 31 * hashCode + strings.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LanguagePackStringsUpdateDto")
            append("(")
            append("localizationTarget=")
            append(localizationTarget)
            append(", ")
            append("languagePackId=")
            append(languagePackId)
            append(", ")
            append("strings=")
            strings
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
