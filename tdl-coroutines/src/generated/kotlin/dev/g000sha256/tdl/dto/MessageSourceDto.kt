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
 * Describes source of a message.
 */
public sealed class MessageSourceDto private constructor() {
    /**
     * The message is from a chat history.
     */
    public class ChatHistory public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.ChatHistory()"
        }
    }

    /**
     * The message is from a message thread history.
     */
    public class MessageThreadHistory public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.MessageThreadHistory()"
        }
    }

    /**
     * The message is from a forum topic history.
     */
    public class ForumTopicHistory public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.ForumTopicHistory()"
        }
    }

    /**
     * The message is from chat, message thread or forum topic history preview.
     */
    public class HistoryPreview public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.HistoryPreview()"
        }
    }

    /**
     * The message is from a chat list or a forum topic list.
     */
    public class ChatList public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.ChatList()"
        }
    }

    /**
     * The message is from search results, including file downloads, local file list, outgoing document messages, calendar.
     */
    public class Search public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.Search()"
        }
    }

    /**
     * The message is from a chat event log.
     */
    public class ChatEventLog public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.ChatEventLog()"
        }
    }

    /**
     * The message is from a notification.
     */
    public class Notification public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.Notification()"
        }
    }

    /**
     * The message was screenshotted; the source must be used only if the message content was visible during the screenshot.
     */
    public class Screenshot public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.Screenshot()"
        }
    }

    /**
     * The message is from some other source.
     */
    public class Other public constructor() : MessageSourceDto() {
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
            return "MessageSourceDto.Other()"
        }
    }
}
