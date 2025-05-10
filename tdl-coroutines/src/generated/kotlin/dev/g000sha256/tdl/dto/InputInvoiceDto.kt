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
 * Describes an invoice to process.
 */
public sealed class InputInvoiceDto private constructor() {
    /**
     * An invoice from a message of the type messageInvoice or paid media purchase from messagePaidMedia.
     *
     * @property chatId Chat identifier of the message.
     * @property messageId Message identifier. Use messageProperties.canBePaid to check whether the message can be used in the method.
     */
    public class Message public constructor(
        public val chatId: Long,
        public val messageId: Long,
    ) : InputInvoiceDto() {
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
            other as Message
            if (other.chatId != chatId) {
                return false
            }
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInvoiceDto.Message")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * An invoice from a link of the type internalLinkTypeInvoice.
     *
     * @property name Name of the invoice.
     */
    public class Name public constructor(
        public val name: String,
    ) : InputInvoiceDto() {
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
            other as Name
            return other.name == name
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInvoiceDto.Name")
                append("(")
                append("name=")
                append(name)
                append(")")
            }
        }
    }

    /**
     * An invoice for a payment toward Telegram; must not be used in the in-store apps.
     *
     * @property purpose Transaction purpose.
     */
    public class Telegram public constructor(
        public val purpose: TelegramPaymentPurposeDto,
    ) : InputInvoiceDto() {
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
            other as Telegram
            return other.purpose == purpose
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + purpose.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInvoiceDto.Telegram")
                append("(")
                append("purpose=")
                append(purpose)
                append(")")
            }
        }
    }
}
