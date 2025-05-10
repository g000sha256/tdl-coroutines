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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes type of link preview.
 */
public sealed class LinkPreviewTypeDto private constructor() {
    /**
     * The link is a link to a media album consisting of photos and videos.
     *
     * @property media The list of album media.
     * @property caption Album caption.
     */
    public class Album public constructor(
        public val media: Array<LinkPreviewAlbumMediaDto>,
        public val caption: String,
    ) : LinkPreviewTypeDto() {
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
            other as Album
            val mediaEquals = other.media.contentDeepEquals(media)
            if (!mediaEquals) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Album")
                append("(")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an animation.
     *
     * @property animation The animation.
     */
    public class Animation public constructor(
        public val animation: AnimationDto,
    ) : LinkPreviewTypeDto() {
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
            return other.animation == animation
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an app at App Store or Google Play.
     *
     * @property photo Photo for the app.
     */
    public class App public constructor(
        public val photo: PhotoDto,
    ) : LinkPreviewTypeDto() {
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
            other as App
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.App")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a web site.
     *
     * @property photo Article's main photo; may be null.
     */
    public class Article public constructor(
        public val photo: PhotoDto?,
    ) : LinkPreviewTypeDto() {
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
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Article")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an audio.
     *
     * @property audio The audio description.
     */
    public class Audio public constructor(
        public val audio: AudioDto,
    ) : LinkPreviewTypeDto() {
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
            return other.audio == audio
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Audio")
                append("(")
                append("audio=")
                append(audio)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a background. Link preview title and description are available only for filled backgrounds.
     *
     * @property document Document with the background; may be null for filled backgrounds.
     * @property backgroundType Type of the background; may be null if unknown.
     */
    public class Background public constructor(
        public val document: DocumentDto?,
        public val backgroundType: BackgroundTypeDto?,
    ) : LinkPreviewTypeDto() {
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
            other as Background
            if (other.document != document) {
                return false
            }
            return other.backgroundType == backgroundType
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + backgroundType.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Background")
                append("(")
                append("document=")
                append(document)
                append(", ")
                append("backgroundType=")
                append(backgroundType)
                append(")")
            }
        }
    }

    /**
     * The link is a link to boost a channel chat.
     *
     * @property photo Photo of the chat; may be null.
     */
    public class ChannelBoost public constructor(
        public val photo: ChatPhotoDto?,
    ) : LinkPreviewTypeDto() {
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
            other as ChannelBoost
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.ChannelBoost")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a chat.
     *
     * @property type Type of the chat.
     * @property photo Photo of the chat; may be null.
     * @property createsJoinRequest True, if the link only creates join request.
     */
    public class Chat public constructor(
        public val type: InviteLinkChatTypeDto,
        public val photo: ChatPhotoDto?,
        public val createsJoinRequest: Boolean,
    ) : LinkPreviewTypeDto() {
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
            other as Chat
            if (other.type != type) {
                return false
            }
            if (other.photo != photo) {
                return false
            }
            return other.createsJoinRequest == createsJoinRequest
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + type.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + createsJoinRequest.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Chat")
                append("(")
                append("type=")
                append(type)
                append(", ")
                append("photo=")
                append(photo)
                append(", ")
                append("createsJoinRequest=")
                append(createsJoinRequest)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a general file.
     *
     * @property document The document description.
     */
    public class Document public constructor(
        public val document: DocumentDto,
    ) : LinkPreviewTypeDto() {
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
            return other.document == document
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Document")
                append("(")
                append("document=")
                append(document)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an animation player.
     *
     * @property url URL of the external animation player.
     * @property thumbnail Thumbnail of the animation; may be null if unknown.
     * @property duration Duration of the animation, in seconds.
     * @property width Expected width of the embedded player.
     * @property height Expected height of the embedded player.
     */
    public class EmbeddedAnimationPlayer public constructor(
        public val url: String,
        public val thumbnail: PhotoDto?,
        public val duration: Int,
        public val width: Int,
        public val height: Int,
    ) : LinkPreviewTypeDto() {
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
            other as EmbeddedAnimationPlayer
            if (other.url != url) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.width != width) {
                return false
            }
            return other.height == height
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.EmbeddedAnimationPlayer")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an audio player.
     *
     * @property url URL of the external audio player.
     * @property thumbnail Thumbnail of the audio; may be null if unknown.
     * @property duration Duration of the audio, in seconds.
     * @property width Expected width of the embedded player.
     * @property height Expected height of the embedded player.
     */
    public class EmbeddedAudioPlayer public constructor(
        public val url: String,
        public val thumbnail: PhotoDto?,
        public val duration: Int,
        public val width: Int,
        public val height: Int,
    ) : LinkPreviewTypeDto() {
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
            other as EmbeddedAudioPlayer
            if (other.url != url) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.width != width) {
                return false
            }
            return other.height == height
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.EmbeddedAudioPlayer")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video player.
     *
     * @property url URL of the external video player.
     * @property thumbnail Thumbnail of the video; may be null if unknown.
     * @property duration Duration of the video, in seconds.
     * @property width Expected width of the embedded player.
     * @property height Expected height of the embedded player.
     */
    public class EmbeddedVideoPlayer public constructor(
        public val url: String,
        public val thumbnail: PhotoDto?,
        public val duration: Int,
        public val width: Int,
        public val height: Int,
    ) : LinkPreviewTypeDto() {
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
            other as EmbeddedVideoPlayer
            if (other.url != url) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.width != width) {
                return false
            }
            return other.height == height
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.EmbeddedVideoPlayer")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(")")
            }
        }
    }

    /**
     * The link is a link to an audio file.
     *
     * @property url URL of the audio file.
     * @property mimeType MIME type of the audio file.
     * @property duration Duration of the audio, in seconds; 0 if unknown.
     */
    public class ExternalAudio public constructor(
        public val url: String,
        public val mimeType: String,
        public val duration: Int,
    ) : LinkPreviewTypeDto() {
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
            other as ExternalAudio
            if (other.url != url) {
                return false
            }
            if (other.mimeType != mimeType) {
                return false
            }
            return other.duration == duration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + mimeType.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.ExternalAudio")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("mimeType=")
                append(mimeType)
                append(", ")
                append("duration=")
                append(duration)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video file.
     *
     * @property url URL of the video file.
     * @property mimeType MIME type of the video file.
     * @property width Expected width of the video preview; 0 if unknown.
     * @property height Expected height of the video preview; 0 if unknown.
     * @property duration Duration of the video, in seconds; 0 if unknown.
     */
    public class ExternalVideo public constructor(
        public val url: String,
        public val mimeType: String,
        public val width: Int,
        public val height: Int,
        public val duration: Int,
    ) : LinkPreviewTypeDto() {
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
            other as ExternalVideo
            if (other.url != url) {
                return false
            }
            if (other.mimeType != mimeType) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            return other.duration == duration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + mimeType.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.ExternalVideo")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("mimeType=")
                append(mimeType)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("duration=")
                append(duration)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a group call that isn't bound to a chat.
     */
    public class GroupCall public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.GroupCall()"
        }
    }

    /**
     * The link is a link to an invoice.
     */
    public class Invoice public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.Invoice()"
        }
    }

    /**
     * The link is a link to a text or a poll Telegram message.
     */
    public class Message public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.Message()"
        }
    }

    /**
     * The link is a link to a photo.
     *
     * @property photo The photo.
     */
    public class Photo public constructor(
        public val photo: PhotoDto,
    ) : LinkPreviewTypeDto() {
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
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a Telegram Premium gift code.
     */
    public class PremiumGiftCode public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.PremiumGiftCode()"
        }
    }

    /**
     * The link is a link to a shareable chat folder.
     */
    public class ShareableChatFolder public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.ShareableChatFolder()"
        }
    }

    /**
     * The link is a link to a sticker.
     *
     * @property sticker The sticker. It can be an arbitrary WEBP image and can have dimensions bigger than 512.
     */
    public class Sticker public constructor(
        public val sticker: StickerDto,
    ) : LinkPreviewTypeDto() {
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
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Sticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a sticker set.
     *
     * @property stickers Up to 4 stickers from the sticker set.
     */
    public class StickerSet public constructor(
        public val stickers: Array<StickerDto>,
    ) : LinkPreviewTypeDto() {
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
            other as StickerSet
            return other.stickers.contentDeepEquals(stickers)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + stickers.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.StickerSet")
                append("(")
                append("stickers=")
                stickers
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * The link is a link to a story. Link preview description is unavailable.
     *
     * @property storyPosterChatId The identifier of the chat that posted the story.
     * @property storyId Story identifier.
     */
    public class Story public constructor(
        public val storyPosterChatId: Long,
        public val storyId: Int,
    ) : LinkPreviewTypeDto() {
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
            if (other.storyPosterChatId != storyPosterChatId) {
                return false
            }
            return other.storyId == storyId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storyPosterChatId.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Story")
                append("(")
                append("storyPosterChatId=")
                append(storyPosterChatId)
                append(", ")
                append("storyId=")
                append(storyId)
                append(")")
            }
        }
    }

    /**
     * The link is a link to boost a supergroup chat.
     *
     * @property photo Photo of the chat; may be null.
     */
    public class SupergroupBoost public constructor(
        public val photo: ChatPhotoDto?,
    ) : LinkPreviewTypeDto() {
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
            other as SupergroupBoost
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.SupergroupBoost")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a cloud theme. TDLib has no theme support yet.
     *
     * @property documents The list of files with theme description.
     * @property settings Settings for the cloud theme; may be null if unknown.
     */
    public class Theme public constructor(
        public val documents: Array<DocumentDto>,
        public val settings: ThemeSettingsDto?,
    ) : LinkPreviewTypeDto() {
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
            other as Theme
            val documentsEquals = other.documents.contentDeepEquals(documents)
            if (!documentsEquals) {
                return false
            }
            return other.settings == settings
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + documents.contentDeepHashCode()
            hashCode = 31 * hashCode + settings.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Theme")
                append("(")
                append("documents=")
                documents
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("settings=")
                append(settings)
                append(")")
            }
        }
    }

    /**
     * The link preview type is unsupported yet.
     */
    public class Unsupported public constructor() : LinkPreviewTypeDto() {
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
            return "LinkPreviewTypeDto.Unsupported()"
        }
    }

    /**
     * The link is a link to an upgraded gift.
     *
     * @property gift The gift.
     */
    public class UpgradedGift public constructor(
        public val gift: UpgradedGiftDto,
    ) : LinkPreviewTypeDto() {
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
            other as UpgradedGift
            return other.gift == gift
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.UpgradedGift")
                append("(")
                append("gift=")
                append(gift)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a user.
     *
     * @property photo Photo of the user; may be null if none.
     * @property isBot True, if the user is a bot.
     */
    public class User public constructor(
        public val photo: ChatPhotoDto?,
        public val isBot: Boolean,
    ) : LinkPreviewTypeDto() {
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
            other as User
            if (other.photo != photo) {
                return false
            }
            return other.isBot == isBot
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + isBot.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.User")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("isBot=")
                append(isBot)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video.
     *
     * @property video The video description.
     * @property cover Cover of the video; may be null if none.
     * @property startTimestamp Timestamp from which the video playing must start, in seconds.
     */
    public class Video public constructor(
        public val video: VideoDto,
        public val cover: PhotoDto?,
        public val startTimestamp: Int,
    ) : LinkPreviewTypeDto() {
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
            if (other.video != video) {
                return false
            }
            if (other.cover != cover) {
                return false
            }
            return other.startTimestamp == startTimestamp
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            hashCode = 31 * hashCode + startTimestamp.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("cover=")
                append(cover)
                append(", ")
                append("startTimestamp=")
                append(startTimestamp)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video chat.
     *
     * @property photo Photo of the chat with the video chat; may be null if none.
     * @property isLiveStream True, if the video chat is expected to be a live stream in a channel or a broadcast group.
     */
    public class VideoChat public constructor(
        public val photo: ChatPhotoDto?,
        public val isLiveStream: Boolean,
    ) : LinkPreviewTypeDto() {
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
            other as VideoChat
            if (other.photo != photo) {
                return false
            }
            return other.isLiveStream == isLiveStream
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + isLiveStream.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.VideoChat")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("isLiveStream=")
                append(isLiveStream)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a video note message.
     *
     * @property videoNote The video note.
     */
    public class VideoNote public constructor(
        public val videoNote: VideoNoteDto,
    ) : LinkPreviewTypeDto() {
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
            other as VideoNote
            return other.videoNote == videoNote
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + videoNote.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.VideoNote")
                append("(")
                append("videoNote=")
                append(videoNote)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a voice note message.
     *
     * @property voiceNote The voice note.
     */
    public class VoiceNote public constructor(
        public val voiceNote: VoiceNoteDto,
    ) : LinkPreviewTypeDto() {
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
            return other.voiceNote == voiceNote
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.VoiceNote")
                append("(")
                append("voiceNote=")
                append(voiceNote)
                append(")")
            }
        }
    }

    /**
     * The link is a link to a Web App.
     *
     * @property photo Web App photo; may be null if none.
     */
    public class WebApp public constructor(
        public val photo: PhotoDto?,
    ) : LinkPreviewTypeDto() {
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
            other as WebApp
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("LinkPreviewTypeDto.WebApp")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }
}
