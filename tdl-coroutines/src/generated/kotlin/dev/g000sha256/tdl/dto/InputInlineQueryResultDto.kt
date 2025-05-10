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
 * Represents a single result of an inline query; for bots only.
 */
public sealed class InputInlineQueryResultDto private constructor() {
    /**
     * Represents a link to an animated GIF or an animated (i.e., without sound) H.264/MPEG-4 AVC video.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the query result.
     * @property thumbnailUrl URL of the result thumbnail (JPEG, GIF, or MPEG4), if it exists.
     * @property thumbnailMimeType MIME type of the video thumbnail. If non-empty, must be one of &quot;image/jpeg&quot;, &quot;image/gif&quot; and &quot;video/mp4&quot;.
     * @property videoUrl The URL of the video file (file size must not exceed 1MB).
     * @property videoMimeType MIME type of the video file. Must be one of &quot;image/gif&quot; and &quot;video/mp4&quot;.
     * @property videoDuration Duration of the video, in seconds.
     * @property videoWidth Width of the video.
     * @property videoHeight Height of the video.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageAnimation, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Animation public constructor(
        public val id: String,
        public val title: String,
        public val thumbnailUrl: String,
        public val thumbnailMimeType: String,
        public val videoUrl: String,
        public val videoMimeType: String,
        public val videoDuration: Int,
        public val videoWidth: Int,
        public val videoHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailMimeType != thumbnailMimeType) {
                return false
            }
            if (other.videoUrl != videoUrl) {
                return false
            }
            if (other.videoMimeType != videoMimeType) {
                return false
            }
            if (other.videoDuration != videoDuration) {
                return false
            }
            if (other.videoWidth != videoWidth) {
                return false
            }
            if (other.videoHeight != videoHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailMimeType.hashCode()
            hashCode = 31 * hashCode + videoUrl.hashCode()
            hashCode = 31 * hashCode + videoMimeType.hashCode()
            hashCode = 31 * hashCode + videoDuration.hashCode()
            hashCode = 31 * hashCode + videoWidth.hashCode()
            hashCode = 31 * hashCode + videoHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Animation")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailMimeType=")
                append(thumbnailMimeType)
                append(", ")
                append("videoUrl=")
                append(videoUrl)
                append(", ")
                append("videoMimeType=")
                append(videoMimeType)
                append(", ")
                append("videoDuration=")
                append(videoDuration)
                append(", ")
                append("videoWidth=")
                append(videoWidth)
                append(", ")
                append("videoHeight=")
                append(videoHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to an article or web page.
     *
     * @property id Unique identifier of the query result.
     * @property url URL of the result, if it exists.
     * @property title Title of the result.
     * @property description A short description of the result.
     * @property thumbnailUrl URL of the result thumbnail, if it exists.
     * @property thumbnailWidth Thumbnail width, if known.
     * @property thumbnailHeight Thumbnail height, if known.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Article public constructor(
        public val id: String,
        public val url: String,
        public val title: String,
        public val description: String,
        public val thumbnailUrl: String,
        public val thumbnailWidth: Int,
        public val thumbnailHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailWidth != thumbnailWidth) {
                return false
            }
            if (other.thumbnailHeight != thumbnailHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailWidth.hashCode()
            hashCode = 31 * hashCode + thumbnailHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Article")
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
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailWidth=")
                append(thumbnailWidth)
                append(", ")
                append("thumbnailHeight=")
                append(thumbnailHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to an MP3 audio file.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the audio file.
     * @property performer Performer of the audio file.
     * @property audioUrl The URL of the audio file.
     * @property audioDuration Audio file duration, in seconds.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageAudio, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Audio public constructor(
        public val id: String,
        public val title: String,
        public val performer: String,
        public val audioUrl: String,
        public val audioDuration: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.performer != performer) {
                return false
            }
            if (other.audioUrl != audioUrl) {
                return false
            }
            if (other.audioDuration != audioDuration) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + performer.hashCode()
            hashCode = 31 * hashCode + audioUrl.hashCode()
            hashCode = 31 * hashCode + audioDuration.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Audio")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("performer=")
                append(performer)
                append(", ")
                append("audioUrl=")
                append(audioUrl)
                append(", ")
                append("audioDuration=")
                append(audioDuration)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a user contact.
     *
     * @property id Unique identifier of the query result.
     * @property contact User contact.
     * @property thumbnailUrl URL of the result thumbnail, if it exists.
     * @property thumbnailWidth Thumbnail width, if known.
     * @property thumbnailHeight Thumbnail height, if known.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Contact public constructor(
        public val id: String,
        public val contact: ContactDto,
        public val thumbnailUrl: String,
        public val thumbnailWidth: Int,
        public val thumbnailHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailWidth != thumbnailWidth) {
                return false
            }
            if (other.thumbnailHeight != thumbnailHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + contact.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailWidth.hashCode()
            hashCode = 31 * hashCode + thumbnailHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Contact")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("contact=")
                append(contact)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailWidth=")
                append(thumbnailWidth)
                append(", ")
                append("thumbnailHeight=")
                append(thumbnailHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to a file.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the resulting file.
     * @property description Short description of the result, if known.
     * @property documentUrl URL of the file.
     * @property mimeType MIME type of the file content; only &quot;application/pdf&quot; and &quot;application/zip&quot; are currently allowed.
     * @property thumbnailUrl The URL of the file thumbnail, if it exists.
     * @property thumbnailWidth Width of the thumbnail.
     * @property thumbnailHeight Height of the thumbnail.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageDocument, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Document public constructor(
        public val id: String,
        public val title: String,
        public val description: String,
        public val documentUrl: String,
        public val mimeType: String,
        public val thumbnailUrl: String,
        public val thumbnailWidth: Int,
        public val thumbnailHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.description != description) {
                return false
            }
            if (other.documentUrl != documentUrl) {
                return false
            }
            if (other.mimeType != mimeType) {
                return false
            }
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailWidth != thumbnailWidth) {
                return false
            }
            if (other.thumbnailHeight != thumbnailHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + documentUrl.hashCode()
            hashCode = 31 * hashCode + mimeType.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailWidth.hashCode()
            hashCode = 31 * hashCode + thumbnailHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Document")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(", ")
                append("documentUrl=")
                append(documentUrl)
                append(", ")
                append("mimeType=")
                append(mimeType)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailWidth=")
                append(thumbnailWidth)
                append(", ")
                append("thumbnailHeight=")
                append(thumbnailHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a game.
     *
     * @property id Unique identifier of the query result.
     * @property gameShortName Short name of the game.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     */
    public class Game public constructor(
        public val id: String,
        public val gameShortName: String,
        public val replyMarkup: ReplyMarkupDto?,
    ) : InputInlineQueryResultDto() {
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
            if (other.gameShortName != gameShortName) {
                return false
            }
            return other.replyMarkup == replyMarkup
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + gameShortName.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Game")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("gameShortName=")
                append(gameShortName)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(")")
            }
        }
    }

    /**
     * Represents a point on the map.
     *
     * @property id Unique identifier of the query result.
     * @property location Location result.
     * @property livePeriod Amount of time relative to the message sent time until the location can be updated, in seconds.
     * @property title Title of the result.
     * @property thumbnailUrl URL of the result thumbnail, if it exists.
     * @property thumbnailWidth Thumbnail width, if known.
     * @property thumbnailHeight Thumbnail height, if known.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Location public constructor(
        public val id: String,
        public val location: LocationDto,
        public val livePeriod: Int,
        public val title: String,
        public val thumbnailUrl: String,
        public val thumbnailWidth: Int,
        public val thumbnailHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.livePeriod != livePeriod) {
                return false
            }
            if (other.title != title) {
                return false
            }
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailWidth != thumbnailWidth) {
                return false
            }
            if (other.thumbnailHeight != thumbnailHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + location.hashCode()
            hashCode = 31 * hashCode + livePeriod.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailWidth.hashCode()
            hashCode = 31 * hashCode + thumbnailHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Location")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("location=")
                append(location)
                append(", ")
                append("livePeriod=")
                append(livePeriod)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailWidth=")
                append(thumbnailWidth)
                append(", ")
                append("thumbnailHeight=")
                append(thumbnailHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents link to a JPEG image.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the result, if known.
     * @property description A short description of the result, if known.
     * @property thumbnailUrl URL of the photo thumbnail, if it exists.
     * @property photoUrl The URL of the JPEG photo (photo size must not exceed 5MB).
     * @property photoWidth Width of the photo.
     * @property photoHeight Height of the photo.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessagePhoto, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Photo public constructor(
        public val id: String,
        public val title: String,
        public val description: String,
        public val thumbnailUrl: String,
        public val photoUrl: String,
        public val photoWidth: Int,
        public val photoHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.description != description) {
                return false
            }
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.photoUrl != photoUrl) {
                return false
            }
            if (other.photoWidth != photoWidth) {
                return false
            }
            if (other.photoHeight != photoHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + photoUrl.hashCode()
            hashCode = 31 * hashCode + photoWidth.hashCode()
            hashCode = 31 * hashCode + photoHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Photo")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("photoUrl=")
                append(photoUrl)
                append(", ")
                append("photoWidth=")
                append(photoWidth)
                append(", ")
                append("photoHeight=")
                append(photoHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to a WEBP, TGS, or WEBM sticker.
     *
     * @property id Unique identifier of the query result.
     * @property thumbnailUrl URL of the sticker thumbnail, if it exists.
     * @property stickerUrl The URL of the WEBP, TGS, or WEBM sticker (sticker file size must not exceed 5MB).
     * @property stickerWidth Width of the sticker.
     * @property stickerHeight Height of the sticker.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageSticker, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Sticker public constructor(
        public val id: String,
        public val thumbnailUrl: String,
        public val stickerUrl: String,
        public val stickerWidth: Int,
        public val stickerHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.stickerUrl != stickerUrl) {
                return false
            }
            if (other.stickerWidth != stickerWidth) {
                return false
            }
            if (other.stickerHeight != stickerHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + stickerUrl.hashCode()
            hashCode = 31 * hashCode + stickerWidth.hashCode()
            hashCode = 31 * hashCode + stickerHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Sticker")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("stickerUrl=")
                append(stickerUrl)
                append(", ")
                append("stickerWidth=")
                append(stickerWidth)
                append(", ")
                append("stickerHeight=")
                append(stickerHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents information about a venue.
     *
     * @property id Unique identifier of the query result.
     * @property venue Venue result.
     * @property thumbnailUrl URL of the result thumbnail, if it exists.
     * @property thumbnailWidth Thumbnail width, if known.
     * @property thumbnailHeight Thumbnail height, if known.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Venue public constructor(
        public val id: String,
        public val venue: VenueDto,
        public val thumbnailUrl: String,
        public val thumbnailWidth: Int,
        public val thumbnailHeight: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.thumbnailWidth != thumbnailWidth) {
                return false
            }
            if (other.thumbnailHeight != thumbnailHeight) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + venue.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + thumbnailWidth.hashCode()
            hashCode = 31 * hashCode + thumbnailHeight.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Venue")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("venue=")
                append(venue)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("thumbnailWidth=")
                append(thumbnailWidth)
                append(", ")
                append("thumbnailHeight=")
                append(thumbnailHeight)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to a page containing an embedded video player or a video file.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the result.
     * @property description A short description of the result, if known.
     * @property thumbnailUrl The URL of the video thumbnail (JPEG), if it exists.
     * @property videoUrl URL of the embedded video player or video file.
     * @property mimeType MIME type of the content of the video URL, only &quot;text/html&quot; or &quot;video/mp4&quot; are currently supported.
     * @property videoWidth Width of the video.
     * @property videoHeight Height of the video.
     * @property videoDuration Video duration, in seconds.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageVideo, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class Video public constructor(
        public val id: String,
        public val title: String,
        public val description: String,
        public val thumbnailUrl: String,
        public val videoUrl: String,
        public val mimeType: String,
        public val videoWidth: Int,
        public val videoHeight: Int,
        public val videoDuration: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.description != description) {
                return false
            }
            if (other.thumbnailUrl != thumbnailUrl) {
                return false
            }
            if (other.videoUrl != videoUrl) {
                return false
            }
            if (other.mimeType != mimeType) {
                return false
            }
            if (other.videoWidth != videoWidth) {
                return false
            }
            if (other.videoHeight != videoHeight) {
                return false
            }
            if (other.videoDuration != videoDuration) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + thumbnailUrl.hashCode()
            hashCode = 31 * hashCode + videoUrl.hashCode()
            hashCode = 31 * hashCode + mimeType.hashCode()
            hashCode = 31 * hashCode + videoWidth.hashCode()
            hashCode = 31 * hashCode + videoHeight.hashCode()
            hashCode = 31 * hashCode + videoDuration.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.Video")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(", ")
                append("thumbnailUrl=")
                append(thumbnailUrl)
                append(", ")
                append("videoUrl=")
                append(videoUrl)
                append(", ")
                append("mimeType=")
                append(mimeType)
                append(", ")
                append("videoWidth=")
                append(videoWidth)
                append(", ")
                append("videoHeight=")
                append(videoHeight)
                append(", ")
                append("videoDuration=")
                append(videoDuration)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }

    /**
     * Represents a link to an opus-encoded audio file within an OGG container, single channel audio.
     *
     * @property id Unique identifier of the query result.
     * @property title Title of the voice note.
     * @property voiceNoteUrl The URL of the voice note file.
     * @property voiceNoteDuration Duration of the voice note, in seconds.
     * @property replyMarkup The message reply markup; pass null if none. Must be of type replyMarkupInlineKeyboard or null.
     * @property inputMessageContent The content of the message to be sent. Must be one of the following types: inputMessageText, inputMessageVoiceNote, inputMessageInvoice, inputMessageLocation, inputMessageVenue or inputMessageContact.
     */
    public class VoiceNote public constructor(
        public val id: String,
        public val title: String,
        public val voiceNoteUrl: String,
        public val voiceNoteDuration: Int,
        public val replyMarkup: ReplyMarkupDto?,
        public val inputMessageContent: InputMessageContentDto,
    ) : InputInlineQueryResultDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.voiceNoteUrl != voiceNoteUrl) {
                return false
            }
            if (other.voiceNoteDuration != voiceNoteDuration) {
                return false
            }
            if (other.replyMarkup != replyMarkup) {
                return false
            }
            return other.inputMessageContent == inputMessageContent
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + id.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + voiceNoteUrl.hashCode()
            hashCode = 31 * hashCode + voiceNoteDuration.hashCode()
            hashCode = 31 * hashCode + replyMarkup.hashCode()
            hashCode = 31 * hashCode + inputMessageContent.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputInlineQueryResultDto.VoiceNote")
                append("(")
                append("id=")
                append(id)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("voiceNoteUrl=")
                append(voiceNoteUrl)
                append(", ")
                append("voiceNoteDuration=")
                append(voiceNoteDuration)
                append(", ")
                append("replyMarkup=")
                append(replyMarkup)
                append(", ")
                append("inputMessageContent=")
                append(inputMessageContent)
                append(")")
            }
        }
    }
}
