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
 * Contains the description of an error in a Telegram Passport element.
 */
public sealed class PassportElementErrorSourceDto private constructor() {
    /**
     * The element contains an error in an unspecified place. The error will be considered resolved when new data is added.
     */
    public class Unspecified public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.Unspecified()"
        }
    }

    /**
     * One of the data fields contains an error. The error will be considered resolved when the value of the field changes.
     *
     * @property fieldName Field name.
     */
    public class DataField public constructor(
        public val fieldName: String,
    ) : PassportElementErrorSourceDto() {
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
            other as DataField
            return other.fieldName == fieldName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fieldName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PassportElementErrorSourceDto.DataField")
                append("(")
                append("fieldName=")
                append(fieldName)
                append(")")
            }
        }
    }

    /**
     * The front side of the document contains an error. The error will be considered resolved when the file with the front side changes.
     */
    public class FrontSide public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.FrontSide()"
        }
    }

    /**
     * The reverse side of the document contains an error. The error will be considered resolved when the file with the reverse side changes.
     */
    public class ReverseSide public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.ReverseSide()"
        }
    }

    /**
     * The selfie with the document contains an error. The error will be considered resolved when the file with the selfie changes.
     */
    public class Selfie public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.Selfie()"
        }
    }

    /**
     * One of files with the translation of the document contains an error. The error will be considered resolved when the file changes.
     *
     * @property fileIndex Index of a file with the error.
     */
    public class TranslationFile public constructor(
        public val fileIndex: Int,
    ) : PassportElementErrorSourceDto() {
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
            other as TranslationFile
            return other.fileIndex == fileIndex
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileIndex.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PassportElementErrorSourceDto.TranslationFile")
                append("(")
                append("fileIndex=")
                append(fileIndex)
                append(")")
            }
        }
    }

    /**
     * The translation of the document contains an error. The error will be considered resolved when the list of translation files changes.
     */
    public class TranslationFiles public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.TranslationFiles()"
        }
    }

    /**
     * The file contains an error. The error will be considered resolved when the file changes.
     *
     * @property fileIndex Index of a file with the error.
     */
    public class File public constructor(
        public val fileIndex: Int,
    ) : PassportElementErrorSourceDto() {
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
            return other.fileIndex == fileIndex
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileIndex.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PassportElementErrorSourceDto.File")
                append("(")
                append("fileIndex=")
                append(fileIndex)
                append(")")
            }
        }
    }

    /**
     * The list of attached files contains an error. The error will be considered resolved when the list of files changes.
     */
    public class Files public constructor() : PassportElementErrorSourceDto() {
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
            return "PassportElementErrorSourceDto.Files()"
        }
    }
}
