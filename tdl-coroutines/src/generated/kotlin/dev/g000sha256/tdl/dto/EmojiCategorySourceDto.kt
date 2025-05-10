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
 * This class is an abstract base class.
 * Describes source of stickers for an emoji category.
 */
public sealed class EmojiCategorySourceDto private constructor() {
    /**
     * The category contains a list of similar emoji to search for in getStickers and searchStickers for stickers, or getInlineQueryResults with the bot getOption(&quot;animation_search_bot_username&quot;) for animations.
     *
     * @property emojis List of emojis to search for.
     */
    public class Search public constructor(
        public val emojis: Array<String>,
    ) : EmojiCategorySourceDto() {
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
            other as Search
            return other.emojis.contentDeepEquals(emojis)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + emojis.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("EmojiCategorySourceDto.Search")
                append("(")
                append("emojis=")
                emojis
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The category contains premium stickers that must be found by getPremiumStickers.
     */
    public class Premium public constructor() : EmojiCategorySourceDto() {
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
            return "EmojiCategorySourceDto.Premium()"
        }
    }
}
