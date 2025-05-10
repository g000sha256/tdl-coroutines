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
import kotlin.ByteArray
import kotlin.Int
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * The content of a message to send.
 */
public sealed class InputMessageContentDto private constructor() {
    /**
     * A text message.
     *
     * @property text Formatted text to be sent; 0-getOption(&quot;message_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, BlockQuote, ExpandableBlockQuote, Code, Pre, PreCode, TextUrl and MentionName entities are allowed to be specified manually.
     * @property linkPreviewOptions Options to be used for generation of a link preview; may be null if none; pass null to use default link preview options.
     * @property clearDraft True, if a chat message draft must be deleted.
     */
    public class Text public constructor(
        public val text: FormattedTextDto,
        public val linkPreviewOptions: LinkPreviewOptionsDto?,
        public val clearDraft: Boolean,
    ) : InputMessageContentDto() {
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
            other as Text
            if (other.text != text) {
                return false
            }
            if (other.linkPreviewOptions != linkPreviewOptions) {
                return false
            }
            return other.clearDraft == clearDraft
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + linkPreviewOptions.hashCode()
            hashCode = 31 * hashCode + clearDraft.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Text")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("linkPreviewOptions=")
                append(linkPreviewOptions)
                append(", ")
                append("clearDraft=")
                append(clearDraft)
                append(")")
            }
        }
    }

    /**
     * An animation message (GIF-style).
     *
     * @property animation Animation file to be sent.
     * @property thumbnail Animation thumbnail; pass null to skip thumbnail uploading.
     * @property addedStickerFileIds File identifiers of the stickers added to the animation, if applicable.
     * @property duration Duration of the animation, in seconds.
     * @property width Width of the animation; may be replaced by the server.
     * @property height Height of the animation; may be replaced by the server.
     * @property caption Animation caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @property showCaptionAboveMedia True, if the caption must be shown above the animation; otherwise, the caption must be shown below the animation; not supported in secret chats.
     * @property hasSpoiler True, if the animation preview must be covered by a spoiler animation; not supported in secret chats.
     */
    public class Animation public constructor(
        public val animation: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val addedStickerFileIds: IntArray,
        public val duration: Int,
        public val width: Int,
        public val height: Int,
        public val caption: FormattedTextDto?,
        public val showCaptionAboveMedia: Boolean,
        public val hasSpoiler: Boolean,
    ) : InputMessageContentDto() {
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
            if (other.animation != animation) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
            if (!addedStickerFileIdsEquals) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            return other.hasSpoiler == hasSpoiler
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("addedStickerFileIds=")
                addedStickerFileIds
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(")")
            }
        }
    }

    /**
     * An audio message.
     *
     * @property audio Audio file to be sent.
     * @property albumCoverThumbnail Thumbnail of the cover for the album; pass null to skip thumbnail uploading.
     * @property duration Duration of the audio, in seconds; may be replaced by the server.
     * @property title Title of the audio; 0-64 characters; may be replaced by the server.
     * @property performer Performer of the audio; 0-64 characters, may be replaced by the server.
     * @property caption Audio caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     */
    public class Audio public constructor(
        public val audio: InputFileDto,
        public val albumCoverThumbnail: InputThumbnailDto?,
        public val duration: Int,
        public val title: String,
        public val performer: String,
        public val caption: FormattedTextDto?,
    ) : InputMessageContentDto() {
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
            if (other.audio != audio) {
                return false
            }
            if (other.albumCoverThumbnail != albumCoverThumbnail) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.title != title) {
                return false
            }
            if (other.performer != performer) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            hashCode = 31 * hashCode + albumCoverThumbnail.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + performer.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Audio")
                append("(")
                append("audio=")
                append(audio)
                append(", ")
                append("albumCoverThumbnail=")
                append(albumCoverThumbnail)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("performer=")
                append(performer)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A document message (general file).
     *
     * @property document Document to be sent.
     * @property thumbnail Document thumbnail; pass null to skip thumbnail uploading.
     * @property disableContentTypeDetection Pass true to disable automatic file type detection and send the document as a file. Always true for files sent to secret chats.
     * @property caption Document caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     */
    public class Document public constructor(
        public val document: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val disableContentTypeDetection: Boolean,
        public val caption: FormattedTextDto?,
    ) : InputMessageContentDto() {
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
            if (other.document != document) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.disableContentTypeDetection != disableContentTypeDetection) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + disableContentTypeDetection.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Document")
                append("(")
                append("document=")
                append(document)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("disableContentTypeDetection=")
                append(disableContentTypeDetection)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A message with paid media; can be used only in channel chats with supergroupFullInfo.hasPaidMediaAllowed.
     *
     * @property starCount The number of Telegram Stars that must be paid to see the media; 1-getOption(&quot;paid_media_message_star_count_max&quot;).
     * @property paidMedia The content of the paid media.
     * @property caption Message caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @property showCaptionAboveMedia True, if the caption must be shown above the media; otherwise, the caption must be shown below the media; not supported in secret chats.
     * @property payload Bot-provided data for the paid media; bots only.
     */
    public class PaidMedia public constructor(
        public val starCount: Long,
        public val paidMedia: Array<InputPaidMediaDto>,
        public val caption: FormattedTextDto?,
        public val showCaptionAboveMedia: Boolean,
        public val payload: String,
    ) : InputMessageContentDto() {
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
            other as PaidMedia
            if (other.starCount != starCount) {
                return false
            }
            val paidMediaEquals = other.paidMedia.contentDeepEquals(paidMedia)
            if (!paidMediaEquals) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            return other.payload == payload
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + paidMedia.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + payload.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.PaidMedia")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("paidMedia=")
                paidMedia
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("payload=")
                append(payload)
                append(")")
            }
        }
    }

    /**
     * A photo message.
     *
     * @property photo Photo to send. The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total. Width and height ratio must be at most 20.
     * @property thumbnail Photo thumbnail to be sent; pass null to skip thumbnail uploading. The thumbnail is sent to the other party only in secret chats.
     * @property addedStickerFileIds File identifiers of the stickers added to the photo, if applicable.
     * @property width Photo width.
     * @property height Photo height.
     * @property caption Photo caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @property showCaptionAboveMedia True, if the caption must be shown above the photo; otherwise, the caption must be shown below the photo; not supported in secret chats.
     * @property selfDestructType Photo self-destruct type; pass null if none; private chats only.
     * @property hasSpoiler True, if the photo preview must be covered by a spoiler animation; not supported in secret chats.
     */
    public class Photo public constructor(
        public val photo: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val addedStickerFileIds: IntArray,
        public val width: Int,
        public val height: Int,
        public val caption: FormattedTextDto?,
        public val showCaptionAboveMedia: Boolean,
        public val selfDestructType: MessageSelfDestructTypeDto?,
        public val hasSpoiler: Boolean,
    ) : InputMessageContentDto() {
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
            if (other.photo != photo) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
            if (!addedStickerFileIdsEquals) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            if (other.selfDestructType != selfDestructType) {
                return false
            }
            return other.hasSpoiler == hasSpoiler
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + selfDestructType.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("addedStickerFileIds=")
                addedStickerFileIds
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("selfDestructType=")
                append(selfDestructType)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(")")
            }
        }
    }

    /**
     * A sticker message.
     *
     * @property sticker Sticker to be sent.
     * @property thumbnail Sticker thumbnail; pass null to skip thumbnail uploading.
     * @property width Sticker width.
     * @property height Sticker height.
     * @property emoji Emoji used to choose the sticker.
     */
    public class Sticker public constructor(
        public val sticker: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val width: Int,
        public val height: Int,
        public val emoji: String,
    ) : InputMessageContentDto() {
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
            if (other.sticker != sticker) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            return other.emoji == emoji
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Sticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("emoji=")
                append(emoji)
                append(")")
            }
        }
    }

    /**
     * A video message.
     *
     * @property video Video to be sent. The video is expected to be re-encoded to MPEG4 format with H.264 codec by the sender.
     * @property thumbnail Video thumbnail; pass null to skip thumbnail uploading.
     * @property cover Cover of the video; pass null to skip cover uploading; not supported in secret chats and for self-destructing messages.
     * @property startTimestamp Timestamp from which the video playing must start, in seconds.
     * @property addedStickerFileIds File identifiers of the stickers added to the video, if applicable.
     * @property duration Duration of the video, in seconds.
     * @property width Video width.
     * @property height Video height.
     * @property supportsStreaming True, if the video is expected to be streamed.
     * @property caption Video caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @property showCaptionAboveMedia True, if the caption must be shown above the video; otherwise, the caption must be shown below the video; not supported in secret chats.
     * @property selfDestructType Video self-destruct type; pass null if none; private chats only.
     * @property hasSpoiler True, if the video preview must be covered by a spoiler animation; not supported in secret chats.
     */
    public class Video public constructor(
        public val video: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val cover: InputFileDto?,
        public val startTimestamp: Int,
        public val addedStickerFileIds: IntArray,
        public val duration: Int,
        public val width: Int,
        public val height: Int,
        public val supportsStreaming: Boolean,
        public val caption: FormattedTextDto?,
        public val showCaptionAboveMedia: Boolean,
        public val selfDestructType: MessageSelfDestructTypeDto?,
        public val hasSpoiler: Boolean,
    ) : InputMessageContentDto() {
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
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.cover != cover) {
                return false
            }
            if (other.startTimestamp != startTimestamp) {
                return false
            }
            val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
            if (!addedStickerFileIdsEquals) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            if (other.supportsStreaming != supportsStreaming) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            if (other.selfDestructType != selfDestructType) {
                return false
            }
            return other.hasSpoiler == hasSpoiler
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            hashCode = 31 * hashCode + startTimestamp.hashCode()
            hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + supportsStreaming.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + selfDestructType.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("cover=")
                append(cover)
                append(", ")
                append("startTimestamp=")
                append(startTimestamp)
                append(", ")
                append("addedStickerFileIds=")
                addedStickerFileIds
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("supportsStreaming=")
                append(supportsStreaming)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("selfDestructType=")
                append(selfDestructType)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(")")
            }
        }
    }

    /**
     * A video note message.
     *
     * @property videoNote Video note to be sent. The video is expected to be encoded to MPEG4 format with H.264 codec and have no data outside of the visible circle.
     * @property thumbnail Video thumbnail; may be null if empty; pass null to skip thumbnail uploading.
     * @property duration Duration of the video, in seconds; 0-60.
     * @property length Video width and height; must be positive and not greater than 640.
     * @property selfDestructType Video note self-destruct type; may be null if none; pass null if none; private chats only.
     */
    public class VideoNote public constructor(
        public val videoNote: InputFileDto,
        public val thumbnail: InputThumbnailDto?,
        public val duration: Int,
        public val length: Int,
        public val selfDestructType: MessageSelfDestructTypeDto?,
    ) : InputMessageContentDto() {
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
            if (other.videoNote != videoNote) {
                return false
            }
            if (other.thumbnail != thumbnail) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            if (other.length != length) {
                return false
            }
            return other.selfDestructType == selfDestructType
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + videoNote.hashCode()
            hashCode = 31 * hashCode + thumbnail.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + length.hashCode()
            hashCode = 31 * hashCode + selfDestructType.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.VideoNote")
                append("(")
                append("videoNote=")
                append(videoNote)
                append(", ")
                append("thumbnail=")
                append(thumbnail)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("length=")
                append(length)
                append(", ")
                append("selfDestructType=")
                append(selfDestructType)
                append(")")
            }
        }
    }

    /**
     * A voice note message.
     *
     * @property voiceNote Voice note to be sent. The voice note must be encoded with the Opus codec and stored inside an OGG container with a single audio channel, or be in MP3 or M4A format as regular audio.
     * @property duration Duration of the voice note, in seconds.
     * @property waveform Waveform representation of the voice note in 5-bit format.
     * @property caption Voice note caption; may be null if empty; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @property selfDestructType Voice note self-destruct type; may be null if none; pass null if none; private chats only.
     */
    public class VoiceNote public constructor(
        public val voiceNote: InputFileDto,
        public val duration: Int,
        public val waveform: ByteArray,
        public val caption: FormattedTextDto?,
        public val selfDestructType: MessageSelfDestructTypeDto?,
    ) : InputMessageContentDto() {
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
            if (other.voiceNote != voiceNote) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            val waveformEquals = other.waveform.contentEquals(waveform)
            if (!waveformEquals) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            return other.selfDestructType == selfDestructType
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + waveform.contentHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + selfDestructType.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.VoiceNote")
                append("(")
                append("voiceNote=")
                append(voiceNote)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("waveform=")
                waveform
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("selfDestructType=")
                append(selfDestructType)
                append(")")
            }
        }
    }

    /**
     * A message with a location.
     *
     * @property location Location to be sent.
     * @property livePeriod Period for which the location can be updated, in seconds; must be between 60 and 86400 for a temporary live location, 0x7FFFFFFF for permanent live location, and 0 otherwise.
     * @property heading For live locations, a direction in which the location moves, in degrees; 1-360. Pass 0 if unknown.
     * @property proximityAlertRadius For live locations, a maximum distance to another chat member for proximity alerts, in meters (0-100000). Pass 0 if the notification is disabled. Can't be enabled in channels and Saved Messages.
     */
    public class Location public constructor(
        public val location: LocationDto,
        public val livePeriod: Int,
        public val heading: Int,
        public val proximityAlertRadius: Int,
    ) : InputMessageContentDto() {
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
            if (other.location != location) {
                return false
            }
            if (other.livePeriod != livePeriod) {
                return false
            }
            if (other.heading != heading) {
                return false
            }
            return other.proximityAlertRadius == proximityAlertRadius
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + location.hashCode()
            hashCode = 31 * hashCode + livePeriod.hashCode()
            hashCode = 31 * hashCode + heading.hashCode()
            hashCode = 31 * hashCode + proximityAlertRadius.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Location")
                append("(")
                append("location=")
                append(location)
                append(", ")
                append("livePeriod=")
                append(livePeriod)
                append(", ")
                append("heading=")
                append(heading)
                append(", ")
                append("proximityAlertRadius=")
                append(proximityAlertRadius)
                append(")")
            }
        }
    }

    /**
     * A message with information about a venue.
     *
     * @property venue Venue to send.
     */
    public class Venue public constructor(
        public val venue: VenueDto,
    ) : InputMessageContentDto() {
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
            return other.venue == venue
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + venue.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Venue")
                append("(")
                append("venue=")
                append(venue)
                append(")")
            }
        }
    }

    /**
     * A message containing a user contact.
     *
     * @property contact Contact to send.
     */
    public class Contact public constructor(
        public val contact: ContactDto,
    ) : InputMessageContentDto() {
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
            return other.contact == contact
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + contact.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Contact")
                append("(")
                append("contact=")
                append(contact)
                append(")")
            }
        }
    }

    /**
     * A dice message.
     *
     * @property emoji Emoji on which the dice throw animation is based.
     * @property clearDraft True, if the chat message draft must be deleted.
     */
    public class Dice public constructor(
        public val emoji: String,
        public val clearDraft: Boolean,
    ) : InputMessageContentDto() {
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
            other as Dice
            if (other.emoji != emoji) {
                return false
            }
            return other.clearDraft == clearDraft
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            hashCode = 31 * hashCode + clearDraft.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Dice")
                append("(")
                append("emoji=")
                append(emoji)
                append(", ")
                append("clearDraft=")
                append(clearDraft)
                append(")")
            }
        }
    }

    /**
     * A message with a game; not supported for channels or secret chats.
     *
     * @property botUserId User identifier of the bot that owns the game.
     * @property gameShortName Short name of the game.
     */
    public class Game public constructor(
        public val botUserId: Long,
        public val gameShortName: String,
    ) : InputMessageContentDto() {
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
            if (other.botUserId != botUserId) {
                return false
            }
            return other.gameShortName == gameShortName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + botUserId.hashCode()
            hashCode = 31 * hashCode + gameShortName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Game")
                append("(")
                append("botUserId=")
                append(botUserId)
                append(", ")
                append("gameShortName=")
                append(gameShortName)
                append(")")
            }
        }
    }

    /**
     * A message with an invoice; can be used only by bots.
     *
     * @property invoice Invoice.
     * @property title Product title; 1-32 characters.
     * @property description Product description; 0-255 characters.
     * @property photoUrl Product photo URL; optional.
     * @property photoSize Product photo size.
     * @property photoWidth Product photo width.
     * @property photoHeight Product photo height.
     * @property payload The invoice payload.
     * @property providerToken Payment provider token; may be empty for payments in Telegram Stars.
     * @property providerData JSON-encoded data about the invoice, which will be shared with the payment provider.
     * @property startParameter Unique invoice bot deep link parameter for the generation of this invoice. If empty, it would be possible to pay directly from forwards of the invoice message.
     * @property paidMedia The content of paid media attached to the invoice; pass null if none.
     * @property paidMediaCaption Paid media caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     */
    public class Invoice public constructor(
        public val invoice: InvoiceDto,
        public val title: String,
        public val description: String,
        public val photoUrl: String,
        public val photoSize: Int,
        public val photoWidth: Int,
        public val photoHeight: Int,
        public val payload: ByteArray,
        public val providerToken: String,
        public val providerData: String,
        public val startParameter: String,
        public val paidMedia: InputPaidMediaDto?,
        public val paidMediaCaption: FormattedTextDto?,
    ) : InputMessageContentDto() {
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
            other as Invoice
            if (other.invoice != invoice) {
                return false
            }
            if (other.title != title) {
                return false
            }
            if (other.description != description) {
                return false
            }
            if (other.photoUrl != photoUrl) {
                return false
            }
            if (other.photoSize != photoSize) {
                return false
            }
            if (other.photoWidth != photoWidth) {
                return false
            }
            if (other.photoHeight != photoHeight) {
                return false
            }
            val payloadEquals = other.payload.contentEquals(payload)
            if (!payloadEquals) {
                return false
            }
            if (other.providerToken != providerToken) {
                return false
            }
            if (other.providerData != providerData) {
                return false
            }
            if (other.startParameter != startParameter) {
                return false
            }
            if (other.paidMedia != paidMedia) {
                return false
            }
            return other.paidMediaCaption == paidMediaCaption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + invoice.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + description.hashCode()
            hashCode = 31 * hashCode + photoUrl.hashCode()
            hashCode = 31 * hashCode + photoSize.hashCode()
            hashCode = 31 * hashCode + photoWidth.hashCode()
            hashCode = 31 * hashCode + photoHeight.hashCode()
            hashCode = 31 * hashCode + payload.contentHashCode()
            hashCode = 31 * hashCode + providerToken.hashCode()
            hashCode = 31 * hashCode + providerData.hashCode()
            hashCode = 31 * hashCode + startParameter.hashCode()
            hashCode = 31 * hashCode + paidMedia.hashCode()
            hashCode = 31 * hashCode + paidMediaCaption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Invoice")
                append("(")
                append("invoice=")
                append(invoice)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("description=")
                append(description)
                append(", ")
                append("photoUrl=")
                append(photoUrl)
                append(", ")
                append("photoSize=")
                append(photoSize)
                append(", ")
                append("photoWidth=")
                append(photoWidth)
                append(", ")
                append("photoHeight=")
                append(photoHeight)
                append(", ")
                append("payload=")
                payload
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("providerToken=")
                append(providerToken)
                append(", ")
                append("providerData=")
                append(providerData)
                append(", ")
                append("startParameter=")
                append(startParameter)
                append(", ")
                append("paidMedia=")
                append(paidMedia)
                append(", ")
                append("paidMediaCaption=")
                append(paidMediaCaption)
                append(")")
            }
        }
    }

    /**
     * A message with a poll. Polls can't be sent to secret chats. Polls can be sent only to a private chat with a bot.
     *
     * @property question Poll question; 1-255 characters (up to 300 characters for bots). Only custom emoji entities are allowed to be added and only by Premium users.
     * @property options List of poll answer options, 2-10 strings 1-100 characters each. Only custom emoji entities are allowed to be added and only by Premium users.
     * @property isAnonymous True, if the poll voters are anonymous. Non-anonymous polls can't be sent or forwarded to channels.
     * @property type Type of the poll.
     * @property openPeriod Amount of time the poll will be active after creation, in seconds; for bots only.
     * @property closeDate Point in time (Unix timestamp) when the poll will automatically be closed; for bots only.
     * @property isClosed True, if the poll needs to be sent already closed; for bots only.
     */
    public class Poll public constructor(
        public val question: FormattedTextDto,
        public val options: Array<FormattedTextDto>,
        public val isAnonymous: Boolean,
        public val type: PollTypeDto,
        public val openPeriod: Int,
        public val closeDate: Int,
        public val isClosed: Boolean,
    ) : InputMessageContentDto() {
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
            other as Poll
            if (other.question != question) {
                return false
            }
            val optionsEquals = other.options.contentDeepEquals(options)
            if (!optionsEquals) {
                return false
            }
            if (other.isAnonymous != isAnonymous) {
                return false
            }
            if (other.type != type) {
                return false
            }
            if (other.openPeriod != openPeriod) {
                return false
            }
            if (other.closeDate != closeDate) {
                return false
            }
            return other.isClosed == isClosed
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + question.hashCode()
            hashCode = 31 * hashCode + options.contentDeepHashCode()
            hashCode = 31 * hashCode + isAnonymous.hashCode()
            hashCode = 31 * hashCode + type.hashCode()
            hashCode = 31 * hashCode + openPeriod.hashCode()
            hashCode = 31 * hashCode + closeDate.hashCode()
            hashCode = 31 * hashCode + isClosed.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Poll")
                append("(")
                append("question=")
                append(question)
                append(", ")
                append("options=")
                options
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("isAnonymous=")
                append(isAnonymous)
                append(", ")
                append("type=")
                append(type)
                append(", ")
                append("openPeriod=")
                append(openPeriod)
                append(", ")
                append("closeDate=")
                append(closeDate)
                append(", ")
                append("isClosed=")
                append(isClosed)
                append(")")
            }
        }
    }

    /**
     * A message with a forwarded story. Stories can't be forwarded to secret chats. A story can be forwarded only if story.canBeForwarded.
     *
     * @property storyPosterChatId Identifier of the chat that posted the story.
     * @property storyId Story identifier.
     */
    public class Story public constructor(
        public val storyPosterChatId: Long,
        public val storyId: Int,
    ) : InputMessageContentDto() {
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
                append("InputMessageContentDto.Story")
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
     * A forwarded message.
     *
     * @property fromChatId Identifier for the chat this forwarded message came from.
     * @property messageId Identifier of the message to forward. A message can be forwarded only if messageProperties.canBeForwarded.
     * @property inGameShare Pass true if a game message is being shared from a launched game; applies only to game messages.
     * @property replaceVideoStartTimestamp Pass true to replace video start timestamp in the forwarded message.
     * @property newVideoStartTimestamp The new video start timestamp; ignored if replaceVideoStartTimestamp == false.
     * @property copyOptions Options to be used to copy content of the message without reference to the original sender; pass null to forward the message as usual.
     */
    public class Forwarded public constructor(
        public val fromChatId: Long,
        public val messageId: Long,
        public val inGameShare: Boolean,
        public val replaceVideoStartTimestamp: Boolean,
        public val newVideoStartTimestamp: Int,
        public val copyOptions: MessageCopyOptionsDto?,
    ) : InputMessageContentDto() {
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
            other as Forwarded
            if (other.fromChatId != fromChatId) {
                return false
            }
            if (other.messageId != messageId) {
                return false
            }
            if (other.inGameShare != inGameShare) {
                return false
            }
            if (other.replaceVideoStartTimestamp != replaceVideoStartTimestamp) {
                return false
            }
            if (other.newVideoStartTimestamp != newVideoStartTimestamp) {
                return false
            }
            return other.copyOptions == copyOptions
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + fromChatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            hashCode = 31 * hashCode + inGameShare.hashCode()
            hashCode = 31 * hashCode + replaceVideoStartTimestamp.hashCode()
            hashCode = 31 * hashCode + newVideoStartTimestamp.hashCode()
            hashCode = 31 * hashCode + copyOptions.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputMessageContentDto.Forwarded")
                append("(")
                append("fromChatId=")
                append(fromChatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(", ")
                append("inGameShare=")
                append(inGameShare)
                append(", ")
                append("replaceVideoStartTimestamp=")
                append(replaceVideoStartTimestamp)
                append(", ")
                append("newVideoStartTimestamp=")
                append(newVideoStartTimestamp)
                append(", ")
                append("copyOptions=")
                append(copyOptions)
                append(")")
            }
        }
    }
}
