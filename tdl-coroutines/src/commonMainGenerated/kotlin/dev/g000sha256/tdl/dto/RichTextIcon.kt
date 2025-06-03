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
 * A small image inside the text.
 *
 * @property document The image represented as a document. The image can be in GIF, JPEG or PNG format.
 * @property width Width of a bounding box in which the image must be shown; 0 if unknown.
 * @property height Height of a bounding box in which the image must be shown; 0 if unknown.
 */
public class RichTextIcon public constructor(
    public val document: Document,
    public val width: Int,
    public val height: Int,
) : RichText() {
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
        other as RichTextIcon
        if (other.document != document) {
            return false
        }
        if (other.width != width) {
            return false
        }
        return other.height == height
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + document.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("RichTextIcon")
            append("(")
            append("document=")
            append(document)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(")")
        }
    }
}
