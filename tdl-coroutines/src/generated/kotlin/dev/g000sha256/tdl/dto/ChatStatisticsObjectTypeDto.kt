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
 * Describes type of object, for which statistics are provided.
 */
public sealed class ChatStatisticsObjectTypeDto private constructor() {
    /**
     * Describes a message sent in the chat.
     *
     * @property messageId Message identifier.
     */
    public class Message public constructor(
        public val messageId: Long,
    ) : ChatStatisticsObjectTypeDto() {
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
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatStatisticsObjectTypeDto.Message")
                append("(")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * Describes a story posted on behalf of the chat.
     *
     * @property storyId Story identifier.
     */
    public class Story public constructor(
        public val storyId: Int,
    ) : ChatStatisticsObjectTypeDto() {
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
            other as Story
            return other.storyId == storyId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatStatisticsObjectTypeDto.Story")
                append("(")
                append("storyId=")
                append(storyId)
                append(")")
            }
        }
    }
}
