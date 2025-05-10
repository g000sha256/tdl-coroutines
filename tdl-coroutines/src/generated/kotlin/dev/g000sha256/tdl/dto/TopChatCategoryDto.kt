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
 * Represents the categories of chats for which a list of frequently used chats can be retrieved.
 */
public sealed class TopChatCategoryDto private constructor() {
    /**
     * A category containing frequently used private chats with non-bot users.
     */
    public class Users public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.Users()"
        }
    }

    /**
     * A category containing frequently used private chats with bot users.
     */
    public class Bots public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.Bots()"
        }
    }

    /**
     * A category containing frequently used basic groups and supergroups.
     */
    public class Groups public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.Groups()"
        }
    }

    /**
     * A category containing frequently used channels.
     */
    public class Channels public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.Channels()"
        }
    }

    /**
     * A category containing frequently used chats with inline bots sorted by their usage in inline mode.
     */
    public class InlineBots public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.InlineBots()"
        }
    }

    /**
     * A category containing frequently used chats with bots, which Web Apps were opened.
     */
    public class WebAppBots public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.WebAppBots()"
        }
    }

    /**
     * A category containing frequently used chats used for calls.
     */
    public class Calls public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.Calls()"
        }
    }

    /**
     * A category containing frequently used chats used to forward messages.
     */
    public class ForwardChats public constructor() : TopChatCategoryDto() {
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
            return "TopChatCategoryDto.ForwardChats()"
        }
    }
}
