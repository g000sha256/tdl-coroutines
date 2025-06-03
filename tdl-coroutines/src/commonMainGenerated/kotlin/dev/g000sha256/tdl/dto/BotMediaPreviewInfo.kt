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
 * Contains a list of media previews of a bot for the given language and the list of languages for which the bot has dedicated previews.
 *
 * @property previews List of media previews.
 * @property languageCodes List of language codes for which the bot has dedicated previews.
 */
public class BotMediaPreviewInfo public constructor(
    public val previews: Array<BotMediaPreview>,
    public val languageCodes: Array<String>,
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
        other as BotMediaPreviewInfo
        val previewsEquals = other.previews.contentDeepEquals(previews)
        if (!previewsEquals) {
            return false
        }
        return other.languageCodes.contentDeepEquals(languageCodes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + previews.contentDeepHashCode()
        hashCode = 31 * hashCode + languageCodes.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BotMediaPreviewInfo")
            append("(")
            append("previews=")
            previews
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("languageCodes=")
            languageCodes
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
