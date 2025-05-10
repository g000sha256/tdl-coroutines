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
 * Represents the value of a string in a language pack.
 */
public sealed class LanguagePackStringValueDto private constructor() {
    /**
     * An ordinary language pack string.
     *
     * @property value String value.
     */
    public class Ordinary public constructor(
        public val value: String,
    ) : LanguagePackStringValueDto() {
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
            other as Ordinary
            return other.value == value
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LanguagePackStringValueDto.Ordinary")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * A language pack string which has different forms based on the number of some object it mentions. See https://www.unicode.org/cldr/charts/latest/supplemental/language_plural_rules.html for more information.
     *
     * @property zeroValue Value for zero objects.
     * @property oneValue Value for one object.
     * @property twoValue Value for two objects.
     * @property fewValue Value for few objects.
     * @property manyValue Value for many objects.
     * @property otherValue Default value.
     */
    public class Pluralized public constructor(
        public val zeroValue: String,
        public val oneValue: String,
        public val twoValue: String,
        public val fewValue: String,
        public val manyValue: String,
        public val otherValue: String,
    ) : LanguagePackStringValueDto() {
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
            other as Pluralized
            if (other.zeroValue != zeroValue) {
                return false
            }
            if (other.oneValue != oneValue) {
                return false
            }
            if (other.twoValue != twoValue) {
                return false
            }
            if (other.fewValue != fewValue) {
                return false
            }
            if (other.manyValue != manyValue) {
                return false
            }
            return other.otherValue == otherValue
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + zeroValue.hashCode()
            hashCode = 31 * hashCode + oneValue.hashCode()
            hashCode = 31 * hashCode + twoValue.hashCode()
            hashCode = 31 * hashCode + fewValue.hashCode()
            hashCode = 31 * hashCode + manyValue.hashCode()
            hashCode = 31 * hashCode + otherValue.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LanguagePackStringValueDto.Pluralized")
                append("(")
                append("zeroValue=")
                append(zeroValue)
                append(", ")
                append("oneValue=")
                append(oneValue)
                append(", ")
                append("twoValue=")
                append(twoValue)
                append(", ")
                append("fewValue=")
                append(fewValue)
                append(", ")
                append("manyValue=")
                append(manyValue)
                append(", ")
                append("otherValue=")
                append(otherValue)
                append(")")
            }
        }
    }

    /**
     * A deleted language pack string, the value must be taken from the built-in English language pack.
     */
    public class Deleted public constructor() : LanguagePackStringValueDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "LanguagePackStringValueDto.Deleted()"
        }
    }
}
