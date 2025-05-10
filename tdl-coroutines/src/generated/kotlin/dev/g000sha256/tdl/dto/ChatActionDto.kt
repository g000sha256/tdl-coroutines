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
 * Describes the different types of activity in a chat.
 */
public sealed class ChatActionDto private constructor() {
    /**
     * The user is typing a message.
     */
    public class Typing public constructor() : ChatActionDto() {
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
            return "ChatActionDto.Typing()"
        }
    }

    /**
     * The user is recording a video.
     */
    public class RecordingVideo public constructor() : ChatActionDto() {
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
            return "ChatActionDto.RecordingVideo()"
        }
    }

    /**
     * The user is uploading a video.
     *
     * @property progress Upload progress, as a percentage.
     */
    public class UploadingVideo public constructor(
        public val progress: Int,
    ) : ChatActionDto() {
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
            other as UploadingVideo
            return other.progress == progress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + progress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.UploadingVideo")
                append("(")
                append("progress=")
                append(progress)
                append(")")
            }
        }
    }

    /**
     * The user is recording a voice note.
     */
    public class RecordingVoiceNote public constructor() : ChatActionDto() {
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
            return "ChatActionDto.RecordingVoiceNote()"
        }
    }

    /**
     * The user is uploading a voice note.
     *
     * @property progress Upload progress, as a percentage.
     */
    public class UploadingVoiceNote public constructor(
        public val progress: Int,
    ) : ChatActionDto() {
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
            other as UploadingVoiceNote
            return other.progress == progress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + progress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.UploadingVoiceNote")
                append("(")
                append("progress=")
                append(progress)
                append(")")
            }
        }
    }

    /**
     * The user is uploading a photo.
     *
     * @property progress Upload progress, as a percentage.
     */
    public class UploadingPhoto public constructor(
        public val progress: Int,
    ) : ChatActionDto() {
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
            other as UploadingPhoto
            return other.progress == progress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + progress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.UploadingPhoto")
                append("(")
                append("progress=")
                append(progress)
                append(")")
            }
        }
    }

    /**
     * The user is uploading a document.
     *
     * @property progress Upload progress, as a percentage.
     */
    public class UploadingDocument public constructor(
        public val progress: Int,
    ) : ChatActionDto() {
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
            other as UploadingDocument
            return other.progress == progress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + progress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.UploadingDocument")
                append("(")
                append("progress=")
                append(progress)
                append(")")
            }
        }
    }

    /**
     * The user is picking a sticker to send.
     */
    public class ChoosingSticker public constructor() : ChatActionDto() {
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
            return "ChatActionDto.ChoosingSticker()"
        }
    }

    /**
     * The user is picking a location or venue to send.
     */
    public class ChoosingLocation public constructor() : ChatActionDto() {
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
            return "ChatActionDto.ChoosingLocation()"
        }
    }

    /**
     * The user is picking a contact to send.
     */
    public class ChoosingContact public constructor() : ChatActionDto() {
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
            return "ChatActionDto.ChoosingContact()"
        }
    }

    /**
     * The user has started to play a game.
     */
    public class StartPlayingGame public constructor() : ChatActionDto() {
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
            return "ChatActionDto.StartPlayingGame()"
        }
    }

    /**
     * The user is recording a video note.
     */
    public class RecordingVideoNote public constructor() : ChatActionDto() {
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
            return "ChatActionDto.RecordingVideoNote()"
        }
    }

    /**
     * The user is uploading a video note.
     *
     * @property progress Upload progress, as a percentage.
     */
    public class UploadingVideoNote public constructor(
        public val progress: Int,
    ) : ChatActionDto() {
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
            other as UploadingVideoNote
            return other.progress == progress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + progress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.UploadingVideoNote")
                append("(")
                append("progress=")
                append(progress)
                append(")")
            }
        }
    }

    /**
     * The user is watching animations sent by the other party by clicking on an animated emoji.
     *
     * @property emoji The animated emoji.
     */
    public class WatchingAnimations public constructor(
        public val emoji: String,
    ) : ChatActionDto() {
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
            other as WatchingAnimations
            return other.emoji == emoji
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatActionDto.WatchingAnimations")
                append("(")
                append("emoji=")
                append(emoji)
                append(")")
            }
        }
    }

    /**
     * The user has canceled the previous action.
     */
    public class Cancel public constructor() : ChatActionDto() {
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
            return "ChatActionDto.Cancel()"
        }
    }
}
