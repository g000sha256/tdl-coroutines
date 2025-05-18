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
 * The link is a link to a cloud theme. TDLib has no theme support yet.
 *
 * @property documents The list of files with theme description.
 * @property settings Settings for the cloud theme; may be null if unknown.
 */
public class LinkPreviewTypeTheme public constructor(
    public val documents: Array<Document>,
    public val settings: ThemeSettings?,
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
        other as LinkPreviewTypeTheme
        val documentsEquals = other.documents.contentDeepEquals(documents)
        if (!documentsEquals) {
            return false
        }
        return other.settings == settings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + documents.contentDeepHashCode()
        hashCode = 31 * hashCode + settings.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeTheme")
            append("(")
            append("documents=")
            documents
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("settings=")
            append(settings)
            append(")")
        }
    }
}
