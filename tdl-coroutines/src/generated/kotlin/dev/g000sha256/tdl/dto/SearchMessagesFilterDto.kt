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
 * Represents a filter for message search results.
 */
public sealed class SearchMessagesFilterDto private constructor() {
    /**
     * Returns all found messages, no filter is applied.
     */
    public class Empty public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Empty()"
        }
    }

    /**
     * Returns only animation messages.
     */
    public class Animation public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Animation()"
        }
    }

    /**
     * Returns only audio messages.
     */
    public class Audio public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Audio()"
        }
    }

    /**
     * Returns only document messages.
     */
    public class Document public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Document()"
        }
    }

    /**
     * Returns only photo messages.
     */
    public class Photo public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Photo()"
        }
    }

    /**
     * Returns only video messages.
     */
    public class Video public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Video()"
        }
    }

    /**
     * Returns only voice note messages.
     */
    public class VoiceNote public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.VoiceNote()"
        }
    }

    /**
     * Returns only photo and video messages.
     */
    public class PhotoAndVideo public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.PhotoAndVideo()"
        }
    }

    /**
     * Returns only messages containing URLs.
     */
    public class Url public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Url()"
        }
    }

    /**
     * Returns only messages containing chat photos.
     */
    public class ChatPhoto public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.ChatPhoto()"
        }
    }

    /**
     * Returns only video note messages.
     */
    public class VideoNote public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.VideoNote()"
        }
    }

    /**
     * Returns only voice and video note messages.
     */
    public class VoiceAndVideoNote public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.VoiceAndVideoNote()"
        }
    }

    /**
     * Returns only messages with mentions of the current user, or messages that are replies to their messages.
     */
    public class Mention public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Mention()"
        }
    }

    /**
     * Returns only messages with unread mentions of the current user, or messages that are replies to their messages. When using this filter the results can't be additionally filtered by a query, a message thread or by the sending user.
     */
    public class UnreadMention public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.UnreadMention()"
        }
    }

    /**
     * Returns only messages with unread reactions for the current user. When using this filter the results can't be additionally filtered by a query, a message thread or by the sending user.
     */
    public class UnreadReaction public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.UnreadReaction()"
        }
    }

    /**
     * Returns only failed to send messages. This filter can be used only if the message database is used.
     */
    public class FailedToSend public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.FailedToSend()"
        }
    }

    /**
     * Returns only pinned messages.
     */
    public class Pinned public constructor() : SearchMessagesFilterDto() {
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
            return "SearchMessagesFilterDto.Pinned()"
        }
    }
}
