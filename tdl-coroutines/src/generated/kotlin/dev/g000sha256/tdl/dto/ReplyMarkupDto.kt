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
 * Contains a description of a custom keyboard and actions that can be done with it to quickly reply to bots.
 */
public sealed class ReplyMarkupDto private constructor() {
    /**
     * Instructs application to remove the keyboard once this message has been received. This kind of keyboard can't be received in an incoming message; instead, updateChatReplyMarkup with messageId == 0 will be sent.
     *
     * @property isPersonal True, if the keyboard is removed only for the mentioned users or the target user of a reply.
     */
    public class RemoveKeyboard public constructor(
        public val isPersonal: Boolean,
    ) : ReplyMarkupDto() {
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
            other as RemoveKeyboard
            return other.isPersonal == isPersonal
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isPersonal.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReplyMarkupDto.RemoveKeyboard")
                append("(")
                append("isPersonal=")
                append(isPersonal)
                append(")")
            }
        }
    }

    /**
     * Instructs application to force a reply to this message.
     *
     * @property isPersonal True, if a forced reply must automatically be shown to the current user. For outgoing messages, specify true to show the forced reply only for the mentioned users and for the target user of a reply.
     * @property inputFieldPlaceholder If non-empty, the placeholder to be shown in the input field when the reply is active; 0-64 characters.
     */
    public class ForceReply public constructor(
        public val isPersonal: Boolean,
        public val inputFieldPlaceholder: String,
    ) : ReplyMarkupDto() {
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
            other as ForceReply
            if (other.isPersonal != isPersonal) {
                return false
            }
            return other.inputFieldPlaceholder == inputFieldPlaceholder
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isPersonal.hashCode()
            hashCode = 31 * hashCode + inputFieldPlaceholder.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReplyMarkupDto.ForceReply")
                append("(")
                append("isPersonal=")
                append(isPersonal)
                append(", ")
                append("inputFieldPlaceholder=")
                append(inputFieldPlaceholder)
                append(")")
            }
        }
    }

    /**
     * Contains a custom keyboard layout to quickly reply to bots.
     *
     * @property rows A list of rows of bot keyboard buttons.
     * @property isPersistent True, if the keyboard is expected to always be shown when the ordinary keyboard is hidden.
     * @property resizeKeyboard True, if the application needs to resize the keyboard vertically.
     * @property oneTime True, if the application needs to hide the keyboard after use.
     * @property isPersonal True, if the keyboard must automatically be shown to the current user. For outgoing messages, specify true to show the keyboard only for the mentioned users and for the target user of a reply.
     * @property inputFieldPlaceholder If non-empty, the placeholder to be shown in the input field when the keyboard is active; 0-64 characters.
     */
    public class ShowKeyboard public constructor(
        public val rows: Array<Array<KeyboardButtonDto>>,
        public val isPersistent: Boolean,
        public val resizeKeyboard: Boolean,
        public val oneTime: Boolean,
        public val isPersonal: Boolean,
        public val inputFieldPlaceholder: String,
    ) : ReplyMarkupDto() {
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
            other as ShowKeyboard
            val rowsEquals = other.rows.contentDeepEquals(rows)
            if (!rowsEquals) {
                return false
            }
            if (other.isPersistent != isPersistent) {
                return false
            }
            if (other.resizeKeyboard != resizeKeyboard) {
                return false
            }
            if (other.oneTime != oneTime) {
                return false
            }
            if (other.isPersonal != isPersonal) {
                return false
            }
            return other.inputFieldPlaceholder == inputFieldPlaceholder
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + rows.contentDeepHashCode()
            hashCode = 31 * hashCode + isPersistent.hashCode()
            hashCode = 31 * hashCode + resizeKeyboard.hashCode()
            hashCode = 31 * hashCode + oneTime.hashCode()
            hashCode = 31 * hashCode + isPersonal.hashCode()
            hashCode = 31 * hashCode + inputFieldPlaceholder.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReplyMarkupDto.ShowKeyboard")
                append("(")
                append("rows=")
                rows
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("isPersistent=")
                append(isPersistent)
                append(", ")
                append("resizeKeyboard=")
                append(resizeKeyboard)
                append(", ")
                append("oneTime=")
                append(oneTime)
                append(", ")
                append("isPersonal=")
                append(isPersonal)
                append(", ")
                append("inputFieldPlaceholder=")
                append(inputFieldPlaceholder)
                append(")")
            }
        }
    }

    /**
     * Contains an inline keyboard layout.
     *
     * @property rows A list of rows of inline keyboard buttons.
     */
    public class InlineKeyboard public constructor(
        public val rows: Array<Array<InlineKeyboardButtonDto>>,
    ) : ReplyMarkupDto() {
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
            other as InlineKeyboard
            return other.rows.contentDeepEquals(rows)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + rows.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReplyMarkupDto.InlineKeyboard")
                append("(")
                append("rows=")
                rows
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }
}
