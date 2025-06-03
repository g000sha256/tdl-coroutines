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
 * The link is a link to a background. Link preview title and description are available only for filled backgrounds.
 *
 * @property document Document with the background; may be null for filled backgrounds.
 * @property backgroundType Type of the background; may be null if unknown.
 */
public class LinkPreviewTypeBackground public constructor(
    public val document: Document?,
    public val backgroundType: BackgroundType?,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeBackground
        if (other.document != document) {
            return false
        }
        return other.backgroundType == backgroundType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + document.hashCode()
        hashCode = 31 * hashCode + backgroundType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeBackground")
            append("(")
            append("document=")
            append(document)
            append(", ")
            append("backgroundType=")
            append(backgroundType)
            append(")")
        }
    }
}
