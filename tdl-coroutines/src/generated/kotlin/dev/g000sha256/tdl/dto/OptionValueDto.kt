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
import kotlin.Int
import kotlin.Long

/**
 * This class is an abstract base class.
 * Represents the value of an option.
 */
public sealed class OptionValueDto private constructor() {
    /**
     * Represents a boolean option.
     *
     * @property value The value of the option.
     */
    public class Boolean public constructor(
        public val value: kotlin.Boolean,
    ) : OptionValueDto() {
        override fun equals(other: Any?): kotlin.Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Boolean
            return other.value == value
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("OptionValueDto.Boolean")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * Represents an unknown option or an option which has a default value.
     */
    public class Empty public constructor() : OptionValueDto() {
        override fun equals(other: Any?): kotlin.Boolean {
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

        override fun toString(): kotlin.String {
            return "OptionValueDto.Empty()"
        }
    }

    /**
     * Represents an integer option.
     *
     * @property value The value of the option.
     */
    public class Integer public constructor(
        public val value: Long,
    ) : OptionValueDto() {
        override fun equals(other: Any?): kotlin.Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Integer
            return other.value == value
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("OptionValueDto.Integer")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * Represents a string option.
     *
     * @property value The value of the option.
     */
    public class String public constructor(
        public val value: kotlin.String,
    ) : OptionValueDto() {
        override fun equals(other: Any?): kotlin.Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as String
            return other.value == value
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("OptionValueDto.String")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }
}
