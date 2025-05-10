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
 * This class is an abstract base class.
 * Describes a stream to which TDLib internal log is written.
 */
public sealed class LogStreamDto private constructor() {
    /**
     * The log is written to stderr or an OS specific log.
     */
    public class Default public constructor() : LogStreamDto() {
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
            return "LogStreamDto.Default()"
        }
    }

    /**
     * The log is written to a file.
     *
     * @property path Path to the file to where the internal TDLib log will be written.
     * @property maxFileSize The maximum size of the file to where the internal TDLib log is written before the file will automatically be rotated, in bytes.
     * @property redirectStderr Pass true to additionally redirect stderr to the log file. Ignored on Windows.
     */
    public class File public constructor(
        public val path: String,
        public val maxFileSize: Long,
        public val redirectStderr: Boolean,
    ) : LogStreamDto() {
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
            other as File
            if (other.path != path) {
                return false
            }
            if (other.maxFileSize != maxFileSize) {
                return false
            }
            return other.redirectStderr == redirectStderr
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + path.hashCode()
            hashCode = 31 * hashCode + maxFileSize.hashCode()
            hashCode = 31 * hashCode + redirectStderr.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LogStreamDto.File")
                append("(")
                append("path=")
                append(path)
                append(", ")
                append("maxFileSize=")
                append(maxFileSize)
                append(", ")
                append("redirectStderr=")
                append(redirectStderr)
                append(")")
            }
        }
    }

    /**
     * The log is written nowhere.
     */
    public class Empty public constructor() : LogStreamDto() {
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
            return "LogStreamDto.Empty()"
        }
    }
}
