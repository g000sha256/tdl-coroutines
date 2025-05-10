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
 * Describes type of Saved Messages topic.
 */
public sealed class SavedMessagesTopicTypeDto private constructor() {
    /**
     * Topic containing messages sent by the current user of forwarded from an unknown chat.
     */
    public class MyNotes public constructor() : SavedMessagesTopicTypeDto() {
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
            return "SavedMessagesTopicTypeDto.MyNotes()"
        }
    }

    /**
     * Topic containing messages forwarded from a user with hidden privacy.
     */
    public class AuthorHidden public constructor() : SavedMessagesTopicTypeDto() {
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
            return "SavedMessagesTopicTypeDto.AuthorHidden()"
        }
    }

    /**
     * Topic containing messages forwarded from a specific chat.
     *
     * @property chatId Identifier of the chat.
     */
    public class SavedFromChat public constructor(
        public val chatId: Long,
    ) : SavedMessagesTopicTypeDto() {
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
            other as SavedFromChat
            return other.chatId == chatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SavedMessagesTopicTypeDto.SavedFromChat")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }
}
