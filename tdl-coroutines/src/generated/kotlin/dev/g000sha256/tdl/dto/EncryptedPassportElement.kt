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
 * Contains information about an encrypted Telegram Passport element; for bots only.
 *
 * @property type Type of Telegram Passport element.
 * @property data Encrypted JSON-encoded data about the user.
 * @property frontSide The front side of an identity document.
 * @property reverseSide The reverse side of an identity document; may be null.
 * @property selfie Selfie with the document; may be null.
 * @property translation List of files containing a certified English translation of the document.
 * @property files List of attached files.
 * @property value Unencrypted data, phone number or email address.
 * @property hash Hash of the entire element.
 */
public class EncryptedPassportElement public constructor(
    public val type: PassportElementType,
    public val data: ByteArray,
    public val frontSide: DatedFile,
    public val reverseSide: DatedFile?,
    public val selfie: DatedFile?,
    public val translation: Array<DatedFile>,
    public val files: Array<DatedFile>,
    public val value: String,
    public val hash: String,
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
        other as EncryptedPassportElement
        if (other.type != type) {
            return false
        }
        val dataEquals = other.data.contentEquals(data)
        if (!dataEquals) {
            return false
        }
        if (other.frontSide != frontSide) {
            return false
        }
        if (other.reverseSide != reverseSide) {
            return false
        }
        if (other.selfie != selfie) {
            return false
        }
        val translationEquals = other.translation.contentDeepEquals(translation)
        if (!translationEquals) {
            return false
        }
        val filesEquals = other.files.contentDeepEquals(files)
        if (!filesEquals) {
            return false
        }
        if (other.value != value) {
            return false
        }
        return other.hash == hash
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + data.contentHashCode()
        hashCode = 31 * hashCode + frontSide.hashCode()
        hashCode = 31 * hashCode + reverseSide.hashCode()
        hashCode = 31 * hashCode + selfie.hashCode()
        hashCode = 31 * hashCode + translation.contentDeepHashCode()
        hashCode = 31 * hashCode + files.contentDeepHashCode()
        hashCode = 31 * hashCode + value.hashCode()
        hashCode = 31 * hashCode + hash.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EncryptedPassportElement")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("data=")
            data
                .contentToString()
                .also { append(it) }
            append(", ")
            append("frontSide=")
            append(frontSide)
            append(", ")
            append("reverseSide=")
            append(reverseSide)
            append(", ")
            append("selfie=")
            append(selfie)
            append(", ")
            append("translation=")
            translation
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("files=")
            files
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("value=")
            append(value)
            append(", ")
            append("hash=")
            append(hash)
            append(")")
        }
    }
}
