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
import kotlin.Double
import kotlin.Int

/**
 * This class is an abstract base class.
 * Represents a JSON value.
 */
public sealed class JsonValueDto private constructor() {
    /**
     * Represents a null JSON value.
     */
    public class Null public constructor() : JsonValueDto() {
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
            return "JsonValueDto.Null()"
        }
    }

    /**
     * Represents a boolean JSON value.
     *
     * @property value The value.
     */
    public class Boolean public constructor(
        public val value: kotlin.Boolean,
    ) : JsonValueDto() {
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
                append("JsonValueDto.Boolean")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * Represents a numeric JSON value.
     *
     * @property value The value.
     */
    public class Number public constructor(
        public val value: Double,
    ) : JsonValueDto() {
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
            other as Number
            return other.value == value
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("JsonValueDto.Number")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * Represents a string JSON value.
     *
     * @property value The value.
     */
    public class String public constructor(
        public val value: kotlin.String,
    ) : JsonValueDto() {
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
                append("JsonValueDto.String")
                append("(")
                append("value=")
                append(value)
                append(")")
            }
        }
    }

    /**
     * Represents a JSON array.
     *
     * @property values The list of array elements.
     */
    public class Array public constructor(
        public val values: kotlin.Array<JsonValueDto>,
    ) : JsonValueDto() {
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
            other as Array
            return other.values.contentDeepEquals(values)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + values.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("JsonValueDto.Array")
                append("(")
                append("values=")
                values
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * Represents a JSON object.
     *
     * @property members The list of object members.
     */
    public class Object public constructor(
        public val members: kotlin.Array<JsonObjectMemberDto>,
    ) : JsonValueDto() {
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
            other as Object
            return other.members.contentDeepEquals(members)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + members.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): kotlin.String {
            return buildString {
                append("JsonValueDto.Object")
                append("(")
                append("members=")
                members
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }
}
