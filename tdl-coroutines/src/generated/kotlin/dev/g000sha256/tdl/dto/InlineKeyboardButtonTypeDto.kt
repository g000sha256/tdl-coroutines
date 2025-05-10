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
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes the type of inline keyboard button.
 */
public sealed class InlineKeyboardButtonTypeDto private constructor() {
    /**
     * A button that opens a specified URL.
     *
     * @property url HTTP or tg:// URL to open. If the link is of the type internalLinkTypeWebApp, then the button must be marked as a Web App button.
     */
    public class Url public constructor(
        public val url: String,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as Url
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.Url")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * A button that opens a specified URL and automatically authorize the current user by calling getLoginUrlInfo.
     *
     * @property url An HTTP URL to pass to getLoginUrlInfo.
     * @property id Unique button identifier.
     * @property forwardText If non-empty, new text of the button in forwarded messages.
     */
    public class LoginUrl public constructor(
        public val url: String,
        public val id: Long,
        public val forwardText: String,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as LoginUrl
            if (other.url != url) {
                return false
            }
            if (other.id != id) {
                return false
            }
            return other.forwardText == forwardText
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + forwardText.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.LoginUrl")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("id=")
                append(id)
                append(", ")
                append("forwardText=")
                append(forwardText)
                append(")")
            }
        }
    }

    /**
     * A button that opens a Web App by calling openWebApp.
     *
     * @property url An HTTP URL to pass to openWebApp.
     */
    public class WebApp public constructor(
        public val url: String,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as WebApp
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.WebApp")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * A button that sends a callback query to a bot.
     *
     * @property data Data to be sent to the bot via a callback query.
     */
    public class Callback public constructor(
        public val data: ByteArray,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as Callback
            return other.data.contentEquals(data)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + data.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.Callback")
                append("(")
                append("data=")
                data
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A button that asks for the 2-step verification password of the current user and then sends a callback query to a bot.
     *
     * @property data Data to be sent to the bot via a callback query.
     */
    public class CallbackWithPassword public constructor(
        public val data: ByteArray,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as CallbackWithPassword
            return other.data.contentEquals(data)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + data.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.CallbackWithPassword")
                append("(")
                append("data=")
                data
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A button with a game that sends a callback query to a bot. This button must be in the first column and row of the keyboard and can be attached only to a message with content of the type messageGame.
     */
    public class CallbackGame public constructor() : InlineKeyboardButtonTypeDto() {
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
            return "InlineKeyboardButtonTypeDto.CallbackGame()"
        }
    }

    /**
     * A button that forces an inline query to the bot to be inserted in the input field.
     *
     * @property query Inline query to be sent to the bot.
     * @property targetChat Target chat from which to send the inline query.
     */
    public class SwitchInline public constructor(
        public val query: String,
        public val targetChat: TargetChatDto,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as SwitchInline
            if (other.query != query) {
                return false
            }
            return other.targetChat == targetChat
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + query.hashCode()
            hashCode = 31 * hashCode + targetChat.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.SwitchInline")
                append("(")
                append("query=")
                append(query)
                append(", ")
                append("targetChat=")
                append(targetChat)
                append(")")
            }
        }
    }

    /**
     * A button to buy something. This button must be in the first column and row of the keyboard and can be attached only to a message with content of the type messageInvoice.
     */
    public class Buy public constructor() : InlineKeyboardButtonTypeDto() {
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
            return "InlineKeyboardButtonTypeDto.Buy()"
        }
    }

    /**
     * A button with a user reference to be handled in the same way as textEntityTypeMentionName entities.
     *
     * @property userId User identifier.
     */
    public class User public constructor(
        public val userId: Long,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as User
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.User")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * A button that copies specified text to clipboard.
     *
     * @property text The text to copy to clipboard.
     */
    public class CopyText public constructor(
        public val text: String,
    ) : InlineKeyboardButtonTypeDto() {
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
            other as CopyText
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineKeyboardButtonTypeDto.CopyText")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }
}
