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
 * Represents a single result of an inline query.
 */
public sealed class InlineQueryResultDto private constructor() {
    /**
     * Represents a link to an article or web page.
     *
     * @property id Unique identifier of the query result.
     * @property url URL of the result, if it exists.
     * @property title Title of the result.
     * @property description A short description of the result.
     * @property thumbnail Result thumbnail in JPEG format; may be null.
     */
    public class Article public constructor(
        public val id: String,
        public val url: String,
        public val title: String,
        public val description: String,
        public val thumbnail: ThumbnailDto?,
    ) : InlineQueryResultDto() {
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
            other as Article
            if (other.id != id) {
                return false
            }
            if (other.url != url) {
                return false
            }
            if (other.title != title) {
                return false
            }
            if (other.description != description) {
                return false
            }
            return other.thumbnail == thumbnail
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Article")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("url=")
                append(url)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(")")
            }
        }
    }

    /**
     * Represents a user contact.
     *
     * @property id Unique identifier of the query result.
     * @property contact A user contact.
     * @property thumbnail Result thumbnail in JPEG format; may be null.
     */
    public class Contact public constructor(
        public val id: String,
        public val contact: ContactDto,
        public val thumbnail: ThumbnailDto?,
    ) : InlineQueryResultDto() {
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
            other as Contact
            if (other.id != id) {
                return false
            }
            if (other.contact != contact) {
                return false
            }
            return other.thumbnail == thumbnail
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + contact.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Contact")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("contact=")
                append(contact)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(")")
            }
        }
    }

    /**
     * Represents a point on the map.
     *
     * @property id Unique identifier of the query result.
     * @property location Location result.
     * @property title Title of the result.
     * @property thumbnail Result thumbnail in JPEG format; may be null.
     */
    public class Location public constructor(
        public val id: String,
        public val location: LocationDto,
        public val title: String,
        public val thumbnail: ThumbnailDto?,
    ) : InlineQueryResultDto() {
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
            other as Location
            if (other.id != id) {
                return false
            }
            if (other.location != location) {
                return false
            }
            if (other.title != title) {
                return false
            }
            return other.thumbnail == thumbnail
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + location.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Location")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("location=")
                append(location)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(")")
            }
        }
    }

    /**
     * Represents information about a venue.
     *
     * @property id Unique identifier of the query result.
     * @property venue Venue result.
     * @property thumbnail Result thumbnail in JPEG format; may be null.
     */
    public class Venue public constructor(
        public val id: String,
        public val venue: VenueDto,
        public val thumbnail: ThumbnailDto?,
    ) : InlineQueryResultDto() {
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
            other as Venue
            if (other.id != id) {
                return false
            }
            if (other.venue != venue) {
                return false
            }
            return other.thumbnail == thumbnail
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + venue.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Venue")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("venue=")
                append(venue)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(")")
            }
        }
    }

    /**
     * Represents information about a game.
     *
     * @property id Unique identifier of the query result.
     * @property game Game result.
     */
    public class Game public constructor(
        public val id: String,
        public val game: GameDto,
    ) : InlineQueryResultDto() {
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
            other as Game
            if (other.id != id) {
                return false
            }
            return other.game == game
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + game.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Game")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("game=")
                append(game)
                append(")")
            }
        }
    }

    /**
     * Represents an animation file.
     *
     * @property id Unique identifier of the query result.
     * @property animation Animation file.
     * @property title Animation title.
     */
    public class Animation public constructor(
        public val id: String,
        public val animation: AnimationDto,
        public val title: String,
    ) : InlineQueryResultDto() {
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
            other as Animation
            if (other.id != id) {
                return false
            }
            if (other.animation != animation) {
                return false
            }
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Animation")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("animation=")
                append(animation)
                append(", ")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * Represents an audio file.
     *
     * @property id Unique identifier of the query result.
     * @property audio Audio file.
     */
    public class Audio public constructor(
        public val id: String,
        public val audio: AudioDto,
    ) : InlineQueryResultDto() {
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
            other as Audio
            if (other.id != id) {
                return false
            }
            return other.audio == audio
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Audio")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("audio=")
                append(audio)
                append(")")
            }
        }
    }

    /**
     * Represents a document.
     *
     * @property id Unique identifier of the query result.
     * @property document Document.
     * @property title Document title.
     * @property description Document description.
     */
    public class Document public constructor(
        public val id: String,
        public val document: DocumentDto,
        public val title: String,
        public val description: String,
    ) : InlineQueryResultDto() {
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
            other as Document
            if (other.id != id) {
                return false
            }
            if (other.document != document) {
                return false
            }
            if (other.title != title) {
                return false
            }
            return other.description == description
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Document")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("document=")
                append(document)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(")")
            }
        }
    }

    /**
     * Represents a photo.
     *
     * @property id Unique identifier of the query result.
     * @property photo Photo.
     * @property title Title of the result, if known.
     * @property description A short description of the result, if known.
     */
    public class Photo public constructor(
        public val id: String,
        public val photo: PhotoDto,
        public val title: String,
        public val description: String,
    ) : InlineQueryResultDto() {
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
            other as Photo
            if (other.id != id) {
                return false
            }
            if (other.photo != photo) {
                return false
            }
            if (other.title != title) {
                return false
            }
            return other.description == description
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Photo")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("photo=")
                append(photo)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(")")
            }
        }
    }

    /**
     * Represents a sticker.
     *
     * @property id Unique identifier of the query result.
     * @property sticker Sticker.
     */
    public class Sticker public constructor(
        public val id: String,
        public val sticker: StickerDto,
    ) : InlineQueryResultDto() {
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
            other as Sticker
            if (other.id != id) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Sticker")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * Represents a video.
     *
     * @property id Unique identifier of the query result.
     * @property video Video.
     * @property title Title of the video.
     * @property description Description of the video.
     */
    public class Video public constructor(
        public val id: String,
        public val video: VideoDto,
        public val title: String,
        public val description: String,
    ) : InlineQueryResultDto() {
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
            other as Video
            if (other.id != id) {
                return false
            }
            if (other.video != video) {
                return false
            }
            if (other.title != title) {
                return false
            }
            return other.description == description
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.Video")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("video=")
                append(video)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(")")
            }
        }
    }

    /**
     * Represents a voice note.
     *
     * @property id Unique identifier of the query result.
     * @property voiceNote Voice note.
     * @property title Title of the voice note.
     */
    public class VoiceNote public constructor(
        public val id: String,
        public val voiceNote: VoiceNoteDto,
        public val title: String,
    ) : InlineQueryResultDto() {
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
            other as VoiceNote
            if (other.id != id) {
                return false
            }
            if (other.voiceNote != voiceNote) {
                return false
            }
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultDto.VoiceNote")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("voiceNote=")
                append(voiceNote)
                append(", ")
                append("title=")
                append(title)
                append(")")
            }
        }
    }
}
