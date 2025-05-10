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
 * Represents a part of the text which must be formatted differently.
 */
public sealed class TextEntityTypeDto private constructor() {
    /**
     * A mention of a user, a supergroup, or a channel by their username.
     */
    public class Mention public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Mention()"
        }
    }

    /**
     * A hashtag text, beginning with &quot;#&quot; and optionally containing a chat username at the end.
     */
    public class Hashtag public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Hashtag()"
        }
    }

    /**
     * A cashtag text, beginning with &quot;$&quot;, consisting of capital English letters (e.g., &quot;$USD&quot;), and optionally containing a chat username at the end.
     */
    public class Cashtag public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Cashtag()"
        }
    }

    /**
     * A bot command, beginning with &quot;/&quot;.
     */
    public class BotCommand public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.BotCommand()"
        }
    }

    /**
     * An HTTP URL.
     */
    public class Url public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Url()"
        }
    }

    /**
     * An email address.
     */
    public class EmailAddress public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.EmailAddress()"
        }
    }

    /**
     * A phone number.
     */
    public class PhoneNumber public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.PhoneNumber()"
        }
    }

    /**
     * A bank card number. The getBankCardInfo method can be used to get information about the bank card.
     */
    public class BankCardNumber public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.BankCardNumber()"
        }
    }

    /**
     * A bold text.
     */
    public class Bold public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Bold()"
        }
    }

    /**
     * An italic text.
     */
    public class Italic public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Italic()"
        }
    }

    /**
     * An underlined text.
     */
    public class Underline public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Underline()"
        }
    }

    /**
     * A strikethrough text.
     */
    public class Strikethrough public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Strikethrough()"
        }
    }

    /**
     * A spoiler text.
     */
    public class Spoiler public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Spoiler()"
        }
    }

    /**
     * Text that must be formatted as if inside a code HTML tag.
     */
    public class Code public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Code()"
        }
    }

    /**
     * Text that must be formatted as if inside a pre HTML tag.
     */
    public class Pre public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.Pre()"
        }
    }

    /**
     * Text that must be formatted as if inside pre, and code HTML tags.
     *
     * @property language Programming language of the code; as defined by the sender.
     */
    public class PreCode public constructor(
        public val language: String,
    ) : TextEntityTypeDto() {
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
            other as PreCode
            return other.language == language
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + language.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TextEntityTypeDto.PreCode")
                append("(")
                append("language=")
                append(language)
                append(")")
            }
        }
    }

    /**
     * Text that must be formatted as if inside a blockquote HTML tag; not supported in secret chats.
     */
    public class BlockQuote public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.BlockQuote()"
        }
    }

    /**
     * Text that must be formatted as if inside a blockquote HTML tag and collapsed by default to 3 lines with the ability to show full text; not supported in secret chats.
     */
    public class ExpandableBlockQuote public constructor() : TextEntityTypeDto() {
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
            return "TextEntityTypeDto.ExpandableBlockQuote()"
        }
    }

    /**
     * A text description shown instead of a raw URL.
     *
     * @property url HTTP or tg:// URL to be opened when the link is clicked.
     */
    public class TextUrl public constructor(
        public val url: String,
    ) : TextEntityTypeDto() {
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
            other as TextUrl
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TextEntityTypeDto.TextUrl")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * A text shows instead of a raw mention of the user (e.g., when the user has no username).
     *
     * @property userId Identifier of the mentioned user.
     */
    public class MentionName public constructor(
        public val userId: Long,
    ) : TextEntityTypeDto() {
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
            other as MentionName
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TextEntityTypeDto.MentionName")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * A custom emoji. The text behind a custom emoji must be an emoji. Only premium users can use premium custom emoji.
     *
     * @property customEmojiId Unique identifier of the custom emoji.
     */
    public class CustomEmoji public constructor(
        public val customEmojiId: Long,
    ) : TextEntityTypeDto() {
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
                append("TextEntityTypeDto.CustomEmoji")
                append("(")
                append("customEmojiId=")
                append(customEmojiId)
                append(")")
            }
        }
    }

    /**
     * A media timestamp.
     *
     * @property mediaTimestamp Timestamp from which a video/audio/video note/voice note/story playing must start, in seconds. The media can be in the content or the link preview of the current message, or in the same places in the replied message.
     */
    public class MediaTimestamp public constructor(
        public val mediaTimestamp: Int,
    ) : TextEntityTypeDto() {
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
            other as MediaTimestamp
            return other.mediaTimestamp == mediaTimestamp
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + mediaTimestamp.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TextEntityTypeDto.MediaTimestamp")
                append("(")
                append("mediaTimestamp=")
                append(mediaTimestamp)
                append(")")
            }
        }
    }
}
