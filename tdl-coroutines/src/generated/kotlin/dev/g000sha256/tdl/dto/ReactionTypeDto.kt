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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes type of message reaction.
 */
public sealed class ReactionTypeDto private constructor() {
    /**
     * A reaction with an emoji.
     *
     * @property emoji Text representation of the reaction.
     */
    public class Emoji public constructor(
        public val emoji: String,
    ) : ReactionTypeDto() {
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
            other as Emoji
            return other.emoji == emoji
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReactionTypeDto.Emoji")
                append("(")
                append("emoji=")
                append(emoji)
                append(")")
            }
        }
    }

    /**
     * A reaction with a custom emoji.
     *
     * @property customEmojiId Unique identifier of the custom emoji.
     */
    public class CustomEmoji public constructor(
        public val customEmojiId: Long,
    ) : ReactionTypeDto() {
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
            other as CustomEmoji
            return other.customEmojiId == customEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + customEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReactionTypeDto.CustomEmoji")
                append("(")
                append("customEmojiId=")
                append(customEmojiId)
                append(")")
            }
        }
    }

    /**
     * The paid reaction in a channel chat.
     */
    public class Paid public constructor() : ReactionTypeDto() {
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
            return "ReactionTypeDto.Paid()"
        }
    }
}
