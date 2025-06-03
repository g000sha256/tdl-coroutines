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
 * Describes a document of any type.
 *
 * @property fileName Original name of the file; as defined by the sender.
 * @property mimeType MIME type of the file; as defined by the sender.
 * @property minithumbnail Document minithumbnail; may be null.
 * @property thumbnail Document thumbnail in JPEG or PNG format (PNG will be used only for background patterns); as defined by the sender; may be null.
 * @property document File containing the document.
 */
public class Document public constructor(
    public val fileName: String,
    public val mimeType: String,
    public val minithumbnail: Minithumbnail?,
    public val thumbnail: Thumbnail?,
    public val document: File,
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
        other as Document
        if (other.fileName != fileName) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        return other.document == document
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileName.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + document.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Document")
            append("(")
            append("fileName=")
            append(fileName)
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("document=")
            append(document)
            append(")")
        }
    }
}
