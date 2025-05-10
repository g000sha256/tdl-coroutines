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
 * Represents the type of file.
 */
public sealed class FileTypeDto private constructor() {
    /**
     * The data is not a file.
     */
    public class None public constructor() : FileTypeDto() {
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
            return "FileTypeDto.None()"
        }
    }

    /**
     * The file is an animation.
     */
    public class Animation public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Animation()"
        }
    }

    /**
     * The file is an audio file.
     */
    public class Audio public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Audio()"
        }
    }

    /**
     * The file is a document.
     */
    public class Document public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Document()"
        }
    }

    /**
     * The file is a notification sound.
     */
    public class NotificationSound public constructor() : FileTypeDto() {
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
            return "FileTypeDto.NotificationSound()"
        }
    }

    /**
     * The file is a photo.
     */
    public class Photo public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Photo()"
        }
    }

    /**
     * The file is a photo published as a story.
     */
    public class PhotoStory public constructor() : FileTypeDto() {
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
            return "FileTypeDto.PhotoStory()"
        }
    }

    /**
     * The file is a profile photo.
     */
    public class ProfilePhoto public constructor() : FileTypeDto() {
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
            return "FileTypeDto.ProfilePhoto()"
        }
    }

    /**
     * The file was sent to a secret chat (the file type is not known to the server).
     */
    public class Secret public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Secret()"
        }
    }

    /**
     * The file is a thumbnail of a file from a secret chat.
     */
    public class SecretThumbnail public constructor() : FileTypeDto() {
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
            return "FileTypeDto.SecretThumbnail()"
        }
    }

    /**
     * The file is a file from Secure storage used for storing Telegram Passport files.
     */
    public class Secure public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Secure()"
        }
    }

    /**
     * The file is a self-destructing photo in a private chat.
     */
    public class SelfDestructingPhoto public constructor() : FileTypeDto() {
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
            return "FileTypeDto.SelfDestructingPhoto()"
        }
    }

    /**
     * The file is a self-destructing video in a private chat.
     */
    public class SelfDestructingVideo public constructor() : FileTypeDto() {
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
            return "FileTypeDto.SelfDestructingVideo()"
        }
    }

    /**
     * The file is a self-destructing video note in a private chat.
     */
    public class SelfDestructingVideoNote public constructor() : FileTypeDto() {
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
            return "FileTypeDto.SelfDestructingVideoNote()"
        }
    }

    /**
     * The file is a self-destructing voice note in a private chat.
     */
    public class SelfDestructingVoiceNote public constructor() : FileTypeDto() {
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
            return "FileTypeDto.SelfDestructingVoiceNote()"
        }
    }

    /**
     * The file is a sticker.
     */
    public class Sticker public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Sticker()"
        }
    }

    /**
     * The file is a thumbnail of another file.
     */
    public class Thumbnail public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Thumbnail()"
        }
    }

    /**
     * The file type is not yet known.
     */
    public class Unknown public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Unknown()"
        }
    }

    /**
     * The file is a video.
     */
    public class Video public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Video()"
        }
    }

    /**
     * The file is a video note.
     */
    public class VideoNote public constructor() : FileTypeDto() {
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
            return "FileTypeDto.VideoNote()"
        }
    }

    /**
     * The file is a video published as a story.
     */
    public class VideoStory public constructor() : FileTypeDto() {
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
            return "FileTypeDto.VideoStory()"
        }
    }

    /**
     * The file is a voice note.
     */
    public class VoiceNote public constructor() : FileTypeDto() {
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
            return "FileTypeDto.VoiceNote()"
        }
    }

    /**
     * The file is a wallpaper or a background pattern.
     */
    public class Wallpaper public constructor() : FileTypeDto() {
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
            return "FileTypeDto.Wallpaper()"
        }
    }
}
