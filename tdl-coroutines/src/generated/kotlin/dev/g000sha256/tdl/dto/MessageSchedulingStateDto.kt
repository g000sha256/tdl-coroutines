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
 * Contains information about the time when a scheduled message will be sent.
 */
public sealed class MessageSchedulingStateDto private constructor() {
    /**
     * The message will be sent at the specified date.
     *
     * @property sendDate Point in time (Unix timestamp) when the message will be sent. The date must be within 367 days in the future.
     */
    public class SendAtDate public constructor(
        public val sendDate: Int,
    ) : MessageSchedulingStateDto() {
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
            other as SendAtDate
            return other.sendDate == sendDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sendDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageSchedulingStateDto.SendAtDate")
                append("(")
                append("sendDate=")
                append(sendDate)
                append(")")
            }
        }
    }

    /**
     * The message will be sent when the other user is online. Applicable to private chats only and when the exact online status of the other user is known.
     */
    public class SendWhenOnline public constructor() : MessageSchedulingStateDto() {
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
            return "MessageSchedulingStateDto.SendWhenOnline()"
        }
    }

    /**
     * The message will be sent when the video in the message is converted and optimized; can be used only by the server.
     *
     * @property sendDate Approximate point in time (Unix timestamp) when the message is expected to be sent.
     */
    public class SendWhenVideoProcessed public constructor(
        public val sendDate: Int,
    ) : MessageSchedulingStateDto() {
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
            other as SendWhenVideoProcessed
            return other.sendDate == sendDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sendDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageSchedulingStateDto.SendWhenVideoProcessed")
                append("(")
                append("sendDate=")
                append(sendDate)
                append(")")
            }
        }
    }
}
