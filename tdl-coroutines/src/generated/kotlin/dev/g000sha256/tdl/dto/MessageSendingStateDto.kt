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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Contains information about the sending state of the message.
 */
public sealed class MessageSendingStateDto private constructor() {
    /**
     * The message is being sent now, but has not yet been delivered to the server.
     *
     * @property sendingId Non-persistent message sending identifier, specified by the application.
     */
    public class Pending public constructor(
        public val sendingId: Int,
    ) : MessageSendingStateDto() {
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
            other as Pending
            return other.sendingId == sendingId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sendingId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageSendingStateDto.Pending")
                append("(")
                append("sendingId=")
                append(sendingId)
                append(")")
            }
        }
    }

    /**
     * The message failed to be sent.
     *
     * @property error The cause of the message sending failure.
     * @property canRetry True, if the message can be re-sent using resendMessages or readdQuickReplyShortcutMessages.
     * @property needAnotherSender True, if the message can be re-sent only on behalf of a different sender.
     * @property needAnotherReplyQuote True, if the message can be re-sent only if another quote is chosen in the message that is replied by the given message.
     * @property needDropReply True, if the message can be re-sent only if the message to be replied is removed. This will be done automatically by resendMessages.
     * @property requiredPaidMessageStarCount The number of Telegram Stars that must be paid to send the message; 0 if the current amount is correct.
     * @property retryAfter Time left before the message can be re-sent, in seconds. No update is sent when this field changes.
     */
    public class Failed public constructor(
        public val error: ErrorDto,
        public val canRetry: Boolean,
        public val needAnotherSender: Boolean,
        public val needAnotherReplyQuote: Boolean,
        public val needDropReply: Boolean,
        public val requiredPaidMessageStarCount: Long,
        public val retryAfter: Double,
    ) : MessageSendingStateDto() {
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
            other as Failed
            if (other.error != error) {
                return false
            }
            if (other.canRetry != canRetry) {
                return false
            }
            if (other.needAnotherSender != needAnotherSender) {
                return false
            }
            if (other.needAnotherReplyQuote != needAnotherReplyQuote) {
                return false
            }
            if (other.needDropReply != needDropReply) {
                return false
            }
            if (other.requiredPaidMessageStarCount != requiredPaidMessageStarCount) {
                return false
            }
            return other.retryAfter == retryAfter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + error.hashCode()
            hashCode = 31 * hashCode + canRetry.hashCode()
            hashCode = 31 * hashCode + needAnotherSender.hashCode()
            hashCode = 31 * hashCode + needAnotherReplyQuote.hashCode()
            hashCode = 31 * hashCode + needDropReply.hashCode()
            hashCode = 31 * hashCode + requiredPaidMessageStarCount.hashCode()
            hashCode = 31 * hashCode + retryAfter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageSendingStateDto.Failed")
                append("(")
                append("error=")
                append(error)
                append(", ")
                append("canRetry=")
                append(canRetry)
                append(", ")
                append("needAnotherSender=")
                append(needAnotherSender)
                append(", ")
                append("needAnotherReplyQuote=")
                append(needAnotherReplyQuote)
                append(", ")
                append("needDropReply=")
                append(needDropReply)
                append(", ")
                append("requiredPaidMessageStarCount=")
                append(requiredPaidMessageStarCount)
                append(", ")
                append("retryAfter=")
                append(retryAfter)
                append(")")
            }
        }
    }
}
