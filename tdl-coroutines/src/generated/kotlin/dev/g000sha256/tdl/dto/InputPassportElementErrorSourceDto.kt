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
import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * This class is an abstract base class.
 * Contains the description of an error in a Telegram Passport element; for bots only.
 */
public sealed class InputPassportElementErrorSourceDto private constructor() {
    /**
     * The element contains an error in an unspecified place. The error will be considered resolved when new data is added.
     *
     * @property elementHash Current hash of the entire element.
     */
    public class Unspecified public constructor(
        public val elementHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            other as Unspecified
            return other.elementHash.contentEquals(elementHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + elementHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.Unspecified")
                append("(")
                append("elementHash=")
                elementHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A data field contains an error. The error is considered resolved when the field's value changes.
     *
     * @property fieldName Field name.
     * @property dataHash Current data hash.
     */
    public class DataField public constructor(
        public val fieldName: String,
        public val dataHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            if (other.fieldName != fieldName) {
                return false
            }
            return other.dataHash.contentEquals(dataHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fieldName.hashCode()
            hashCode = 31 * hashCode + dataHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.DataField")
                append("(")
                append("fieldName=")
                append(fieldName)
                append(", ")
                append("dataHash=")
                dataHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The front side of the document contains an error. The error is considered resolved when the file with the front side of the document changes.
     *
     * @property fileHash Current hash of the file containing the front side.
     */
    public class FrontSide public constructor(
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            other as FrontSide
            return other.fileHash.contentEquals(fileHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.FrontSide")
                append("(")
                append("fileHash=")
                fileHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The reverse side of the document contains an error. The error is considered resolved when the file with the reverse side of the document changes.
     *
     * @property fileHash Current hash of the file containing the reverse side.
     */
    public class ReverseSide public constructor(
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            other as ReverseSide
            return other.fileHash.contentEquals(fileHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.ReverseSide")
                append("(")
                append("fileHash=")
                fileHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The selfie contains an error. The error is considered resolved when the file with the selfie changes.
     *
     * @property fileHash Current hash of the file containing the selfie.
     */
    public class Selfie public constructor(
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            other as Selfie
            return other.fileHash.contentEquals(fileHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.Selfie")
                append("(")
                append("fileHash=")
                fileHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * One of the files containing the translation of the document contains an error. The error is considered resolved when the file with the translation changes.
     *
     * @property fileHash Current hash of the file containing the translation.
     */
    public class TranslationFile public constructor(
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            return other.fileHash.contentEquals(fileHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.TranslationFile")
                append("(")
                append("fileHash=")
                fileHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The translation of the document contains an error. The error is considered resolved when the list of files changes.
     *
     * @property fileHashes Current hashes of all files with the translation.
     */
    public class TranslationFiles public constructor(
        public val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSourceDto() {
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
            other as TranslationFiles
            return other.fileHashes.contentDeepEquals(fileHashes)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHashes.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.TranslationFiles")
                append("(")
                append("fileHashes=")
                fileHashes
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The file contains an error. The error is considered resolved when the file changes.
     *
     * @property fileHash Current hash of the file which has the error.
     */
    public class File public constructor(
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSourceDto() {
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
            return other.fileHash.contentEquals(fileHash)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHash.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.File")
                append("(")
                append("fileHash=")
                fileHash
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The list of attached files contains an error. The error is considered resolved when the file list changes.
     *
     * @property fileHashes Current hashes of all attached files.
     */
    public class Files public constructor(
        public val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSourceDto() {
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
            other as Files
            return other.fileHashes.contentDeepEquals(fileHashes)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fileHashes.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputPassportElementErrorSourceDto.Files")
                append("(")
                append("fileHashes=")
                fileHashes
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }
}
