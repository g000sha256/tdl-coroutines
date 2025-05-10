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
 * Describes type of emoji category.
 */
public sealed class EmojiCategoryTypeDto private constructor() {
    /**
     * The category must be used by default (e.g., for custom emoji or animation search).
     */
    public class Default public constructor() : EmojiCategoryTypeDto() {
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
            return "EmojiCategoryTypeDto.Default()"
        }
    }

    /**
     * The category must be used by default for regular sticker selection. It may contain greeting emoji category and premium stickers.
     */
    public class RegularStickers public constructor() : EmojiCategoryTypeDto() {
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
            return "EmojiCategoryTypeDto.RegularStickers()"
        }
    }

    /**
     * The category must be used for emoji status selection.
     */
    public class EmojiStatus public constructor() : EmojiCategoryTypeDto() {
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
            return "EmojiCategoryTypeDto.EmojiStatus()"
        }
    }

    /**
     * The category must be used for chat photo emoji selection.
     */
    public class ChatPhoto public constructor() : EmojiCategoryTypeDto() {
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
            return "EmojiCategoryTypeDto.ChatPhoto()"
        }
    }
}
