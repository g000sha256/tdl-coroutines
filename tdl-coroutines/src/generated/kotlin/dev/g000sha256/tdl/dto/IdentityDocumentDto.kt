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
import kotlin.Int
import kotlin.String

/**
 * An identity document.
 *
 * @property number Document number; 1-24 characters.
 * @property expirationDate Document expiration date; may be null if not applicable.
 * @property frontSide Front side of the document.
 * @property reverseSide Reverse side of the document; only for driver license and identity card; may be null.
 * @property selfie Selfie with the document; may be null.
 * @property translation List of files containing a certified English translation of the document.
 */
public class IdentityDocumentDto public constructor(
    public val number: String,
    public val expirationDate: DateDto?,
    public val frontSide: DatedFileDto,
    public val reverseSide: DatedFileDto?,
    public val selfie: DatedFileDto?,
    public val translation: Array<DatedFileDto>,
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
        other as IdentityDocumentDto
        if (other.number != number) {
            return false
        }
        if (other.expirationDate != expirationDate) {
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
        return other.translation.contentDeepEquals(translation)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + number.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + frontSide.hashCode()
        hashCode = 31 * hashCode + reverseSide.hashCode()
        hashCode = 31 * hashCode + selfie.hashCode()
        hashCode = 31 * hashCode + translation.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("IdentityDocumentDto")
            append("(")
            append("number=")
            append(number)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
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
            append(")")
        }
    }
}
