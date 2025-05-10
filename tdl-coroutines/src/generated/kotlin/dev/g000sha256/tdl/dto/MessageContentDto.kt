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
import kotlin.Long
import kotlin.LongArray
import kotlin.String

/**
 * This class is an abstract base class.
 * Contains the content of a message.
 */
public sealed class MessageContentDto private constructor() {
    /**
     * A text message.
     *
     * @property text Text of the message.
     * @property linkPreview A link preview attached to the message; may be null.
     * @property linkPreviewOptions Options which were used for generation of the link preview; may be null if default options were used.
     */
    public class Text public constructor(
        public val text: FormattedTextDto,
        public val linkPreview: LinkPreviewDto?,
        public val linkPreviewOptions: LinkPreviewOptionsDto?,
    ) : MessageContentDto() {
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
            if (other.linkPreview != linkPreview) {
                return false
            }
            return other.linkPreviewOptions == linkPreviewOptions
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + linkPreview.hashCode()
            hashCode = 31 * hashCode + linkPreviewOptions.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Text")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("linkPreview=")
                append(linkPreview)
                append(", ")
                append("linkPreviewOptions=")
                append(linkPreviewOptions)
                append(")")
            }
        }
    }

    /**
     * An animation message (GIF-style).
     *
     * @property animation The animation description.
     * @property caption Animation caption.
     * @property showCaptionAboveMedia True, if the caption must be shown above the animation; otherwise, the caption must be shown below the animation.
     * @property hasSpoiler True, if the animation preview must be covered by a spoiler animation.
     * @property isSecret True, if the animation thumbnail must be blurred and the animation must be shown only while tapped.
     */
    public class Animation public constructor(
        public val animation: AnimationDto,
        public val caption: FormattedTextDto,
        public val showCaptionAboveMedia: Boolean,
        public val hasSpoiler: Boolean,
        public val isSecret: Boolean,
    ) : MessageContentDto() {
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
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            if (other.hasSpoiler != hasSpoiler) {
                return false
            }
            return other.isSecret == isSecret
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(")")
            }
        }
    }

    /**
     * An audio message.
     *
     * @property audio The audio description.
     * @property caption Audio caption.
     */
    public class Audio public constructor(
        public val audio: AudioDto,
        public val caption: FormattedTextDto,
    ) : MessageContentDto() {
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
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Audio")
                append("(")
                append("audio=")
                append(audio)
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
     * @property document The document description.
     * @property caption Document caption.
     */
    public class Document public constructor(
        public val document: DocumentDto,
        public val caption: FormattedTextDto,
    ) : MessageContentDto() {
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
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Document")
                append("(")
                append("document=")
                append(document)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A message with paid media.
     *
     * @property starCount Number of Telegram Stars needed to buy access to the media in the message.
     * @property media Information about the media.
     * @property caption Media caption.
     * @property showCaptionAboveMedia True, if the caption must be shown above the media; otherwise, the caption must be shown below the media.
     */
    public class PaidMedia public constructor(
        public val starCount: Long,
        public val media: Array<PaidMediaDto>,
        public val caption: FormattedTextDto,
        public val showCaptionAboveMedia: Boolean,
    ) : MessageContentDto() {
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
            val mediaEquals = other.media.contentDeepEquals(media)
            if (!mediaEquals) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            return other.showCaptionAboveMedia == showCaptionAboveMedia
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + media.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaidMedia")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("media=")
                media
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(")")
            }
        }
    }

    /**
     * A photo message.
     *
     * @property photo The photo.
     * @property caption Photo caption.
     * @property showCaptionAboveMedia True, if the caption must be shown above the photo; otherwise, the caption must be shown below the photo.
     * @property hasSpoiler True, if the photo preview must be covered by a spoiler animation.
     * @property isSecret True, if the photo must be blurred and must be shown only while tapped.
     */
    public class Photo public constructor(
        public val photo: PhotoDto,
        public val caption: FormattedTextDto,
        public val showCaptionAboveMedia: Boolean,
        public val hasSpoiler: Boolean,
        public val isSecret: Boolean,
    ) : MessageContentDto() {
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
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            if (other.hasSpoiler != hasSpoiler) {
                return false
            }
            return other.isSecret == isSecret
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(")")
            }
        }
    }

    /**
     * A sticker message.
     *
     * @property sticker The sticker description.
     * @property isPremium True, if premium animation of the sticker must be played.
     */
    public class Sticker public constructor(
        public val sticker: StickerDto,
        public val isPremium: Boolean,
    ) : MessageContentDto() {
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
            return other.isPremium == isPremium
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            hashCode = 31 * hashCode + isPremium.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Sticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(", ")
                append("isPremium=")
                append(isPremium)
                append(")")
            }
        }
    }

    /**
     * A video message.
     *
     * @property video The video description.
     * @property alternativeVideos Alternative qualities of the video.
     * @property cover Cover of the video; may be null if none.
     * @property startTimestamp Timestamp from which the video playing must start, in seconds.
     * @property caption Video caption.
     * @property showCaptionAboveMedia True, if the caption must be shown above the video; otherwise, the caption must be shown below the video.
     * @property hasSpoiler True, if the video preview must be covered by a spoiler animation.
     * @property isSecret True, if the video thumbnail must be blurred and the video must be shown only while tapped.
     */
    public class Video public constructor(
        public val video: VideoDto,
        public val alternativeVideos: Array<AlternativeVideoDto>,
        public val cover: PhotoDto?,
        public val startTimestamp: Int,
        public val caption: FormattedTextDto,
        public val showCaptionAboveMedia: Boolean,
        public val hasSpoiler: Boolean,
        public val isSecret: Boolean,
    ) : MessageContentDto() {
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
            val alternativeVideosEquals = other.alternativeVideos.contentDeepEquals(alternativeVideos)
            if (!alternativeVideosEquals) {
                return false
            }
            if (other.cover != cover) {
                return false
            }
            if (other.startTimestamp != startTimestamp) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
                return false
            }
            if (other.hasSpoiler != hasSpoiler) {
                return false
            }
            return other.isSecret == isSecret
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + alternativeVideos.contentDeepHashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            hashCode = 31 * hashCode + startTimestamp.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
            hashCode = 31 * hashCode + hasSpoiler.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("alternativeVideos=")
                alternativeVideos
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("cover=")
                append(cover)
                append(", ")
                append("startTimestamp=")
                append(startTimestamp)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("showCaptionAboveMedia=")
                append(showCaptionAboveMedia)
                append(", ")
                append("hasSpoiler=")
                append(hasSpoiler)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(")")
            }
        }
    }

    /**
     * A video note message.
     *
     * @property videoNote The video note description.
     * @property isViewed True, if at least one of the recipients has viewed the video note.
     * @property isSecret True, if the video note thumbnail must be blurred and the video note must be shown only while tapped.
     */
    public class VideoNote public constructor(
        public val videoNote: VideoNoteDto,
        public val isViewed: Boolean,
        public val isSecret: Boolean,
    ) : MessageContentDto() {
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
            if (other.isViewed != isViewed) {
                return false
            }
            return other.isSecret == isSecret
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + videoNote.hashCode()
            hashCode = 31 * hashCode + isViewed.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.VideoNote")
                append("(")
                append("videoNote=")
                append(videoNote)
                append(", ")
                append("isViewed=")
                append(isViewed)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(")")
            }
        }
    }

    /**
     * A voice note message.
     *
     * @property voiceNote The voice note description.
     * @property caption Voice note caption.
     * @property isListened True, if at least one of the recipients has listened to the voice note.
     */
    public class VoiceNote public constructor(
        public val voiceNote: VoiceNoteDto,
        public val caption: FormattedTextDto,
        public val isListened: Boolean,
    ) : MessageContentDto() {
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
            if (other.caption != caption) {
                return false
            }
            return other.isListened == isListened
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + isListened.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.VoiceNote")
                append("(")
                append("voiceNote=")
                append(voiceNote)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("isListened=")
                append(isListened)
                append(")")
            }
        }
    }

    /**
     * A self-destructed photo message.
     */
    public class ExpiredPhoto public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ExpiredPhoto()"
        }
    }

    /**
     * A self-destructed video message.
     */
    public class ExpiredVideo public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ExpiredVideo()"
        }
    }

    /**
     * A self-destructed video note message.
     */
    public class ExpiredVideoNote public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ExpiredVideoNote()"
        }
    }

    /**
     * A self-destructed voice note message.
     */
    public class ExpiredVoiceNote public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ExpiredVoiceNote()"
        }
    }

    /**
     * A message with a location.
     *
     * @property location The location description.
     * @property livePeriod Time relative to the message send date, for which the location can be updated, in seconds; if 0x7FFFFFFF, then location can be updated forever.
     * @property expiresIn Left time for which the location can be updated, in seconds. If 0, then the location can't be updated anymore. The update updateMessageContent is not sent when this field changes.
     * @property heading For live locations, a direction in which the location moves, in degrees; 1-360. If 0 the direction is unknown.
     * @property proximityAlertRadius For live locations, a maximum distance to another chat member for proximity alerts, in meters (0-100000). 0 if the notification is disabled. Available only to the message sender.
     */
    public class Location public constructor(
        public val location: LocationDto,
        public val livePeriod: Int,
        public val expiresIn: Int,
        public val heading: Int,
        public val proximityAlertRadius: Int,
    ) : MessageContentDto() {
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
            if (other.expiresIn != expiresIn) {
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
            hashCode = 31 * hashCode + expiresIn.hashCode()
            hashCode = 31 * hashCode + heading.hashCode()
            hashCode = 31 * hashCode + proximityAlertRadius.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Location")
                append("(")
                append("location=")
                append(location)
                append(", ")
                append("livePeriod=")
                append(livePeriod)
                append(", ")
                append("expiresIn=")
                append(expiresIn)
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
     * @property venue The venue description.
     */
    public class Venue public constructor(
        public val venue: VenueDto,
    ) : MessageContentDto() {
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
                append("MessageContentDto.Venue")
                append("(")
                append("venue=")
                append(venue)
                append(")")
            }
        }
    }

    /**
     * A message with a user contact.
     *
     * @property contact The contact description.
     */
    public class Contact public constructor(
        public val contact: ContactDto,
    ) : MessageContentDto() {
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
                append("MessageContentDto.Contact")
                append("(")
                append("contact=")
                append(contact)
                append(")")
            }
        }
    }

    /**
     * A message with an animated emoji.
     *
     * @property animatedEmoji The animated emoji.
     * @property emoji The corresponding emoji.
     */
    public class AnimatedEmoji public constructor(
        public val animatedEmoji: AnimatedEmojiDto,
        public val emoji: String,
    ) : MessageContentDto() {
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
            other as AnimatedEmoji
            if (other.animatedEmoji != animatedEmoji) {
                return false
            }
            return other.emoji == emoji
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animatedEmoji.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.AnimatedEmoji")
                append("(")
                append("animatedEmoji=")
                append(animatedEmoji)
                append(", ")
                append("emoji=")
                append(emoji)
                append(")")
            }
        }
    }

    /**
     * A dice message. The dice value is randomly generated by the server.
     *
     * @property initialState The animated stickers with the initial dice animation; may be null if unknown. The update updateMessageContent will be sent when the sticker became known.
     * @property finalState The animated stickers with the final dice animation; may be null if unknown. The update updateMessageContent will be sent when the sticker became known.
     * @property emoji Emoji on which the dice throw animation is based.
     * @property value The dice value. If the value is 0, the dice don't have final state yet.
     * @property successAnimationFrameNumber Number of frame after which a success animation like a shower of confetti needs to be shown on updateMessageSendSucceeded.
     */
    public class Dice public constructor(
        public val initialState: DiceStickersDto?,
        public val finalState: DiceStickersDto?,
        public val emoji: String,
        public val value: Int,
        public val successAnimationFrameNumber: Int,
    ) : MessageContentDto() {
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
            if (other.initialState != initialState) {
                return false
            }
            if (other.finalState != finalState) {
                return false
            }
            if (other.emoji != emoji) {
                return false
            }
            if (other.value != value) {
                return false
            }
            return other.successAnimationFrameNumber == successAnimationFrameNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + initialState.hashCode()
            hashCode = 31 * hashCode + finalState.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            hashCode = 31 * hashCode + value.hashCode()
            hashCode = 31 * hashCode + successAnimationFrameNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Dice")
                append("(")
                append("initialState=")
                append(initialState)
                append(", ")
                append("finalState=")
                append(finalState)
                append(", ")
                append("emoji=")
                append(emoji)
                append(", ")
                append("value=")
                append(value)
                append(", ")
                append("successAnimationFrameNumber=")
                append(successAnimationFrameNumber)
                append(")")
            }
        }
    }

    /**
     * A message with a game.
     *
     * @property game The game description.
     */
    public class Game public constructor(
        public val game: GameDto,
    ) : MessageContentDto() {
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
            return other.game == game
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + game.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Game")
                append("(")
                append("game=")
                append(game)
                append(")")
            }
        }
    }

    /**
     * A message with a poll.
     *
     * @property poll The poll description.
     */
    public class Poll public constructor(
        public val poll: PollDto,
    ) : MessageContentDto() {
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
            return other.poll == poll
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + poll.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Poll")
                append("(")
                append("poll=")
                append(poll)
                append(")")
            }
        }
    }

    /**
     * A message with a forwarded story.
     *
     * @property storyPosterChatId Identifier of the chat that posted the story.
     * @property storyId Story identifier.
     * @property viaMention True, if the story was automatically forwarded because of a mention of the user.
     */
    public class Story public constructor(
        public val storyPosterChatId: Long,
        public val storyId: Int,
        public val viaMention: Boolean,
    ) : MessageContentDto() {
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
            if (other.storyId != storyId) {
                return false
            }
            return other.viaMention == viaMention
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + storyPosterChatId.hashCode()
            hashCode = 31 * hashCode + storyId.hashCode()
            hashCode = 31 * hashCode + viaMention.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Story")
                append("(")
                append("storyPosterChatId=")
                append(storyPosterChatId)
                append(", ")
                append("storyId=")
                append(storyId)
                append(", ")
                append("viaMention=")
                append(viaMention)
                append(")")
            }
        }
    }

    /**
     * A message with an invoice from a bot. Use getInternalLink with internalLinkTypeBotStart to share the invoice.
     *
     * @property productInfo Information about the product.
     * @property currency Currency for the product price.
     * @property totalAmount Product total price in the smallest units of the currency.
     * @property startParameter Unique invoice bot startParameter to be passed to getInternalLink.
     * @property isTest True, if the invoice is a test invoice.
     * @property needShippingAddress True, if the shipping address must be specified.
     * @property receiptMessageId The identifier of the message with the receipt, after the product has been purchased.
     * @property paidMedia Extended media attached to the invoice; may be null if none.
     * @property paidMediaCaption Extended media caption; may be null if none.
     */
    public class Invoice public constructor(
        public val productInfo: ProductInfoDto,
        public val currency: String,
        public val totalAmount: Long,
        public val startParameter: String,
        public val isTest: Boolean,
        public val needShippingAddress: Boolean,
        public val receiptMessageId: Long,
        public val paidMedia: PaidMediaDto?,
        public val paidMediaCaption: FormattedTextDto?,
    ) : MessageContentDto() {
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
            if (other.productInfo != productInfo) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.totalAmount != totalAmount) {
                return false
            }
            if (other.startParameter != startParameter) {
                return false
            }
            if (other.isTest != isTest) {
                return false
            }
            if (other.needShippingAddress != needShippingAddress) {
                return false
            }
            if (other.receiptMessageId != receiptMessageId) {
                return false
            }
            if (other.paidMedia != paidMedia) {
                return false
            }
            return other.paidMediaCaption == paidMediaCaption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + productInfo.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + totalAmount.hashCode()
            hashCode = 31 * hashCode + startParameter.hashCode()
            hashCode = 31 * hashCode + isTest.hashCode()
            hashCode = 31 * hashCode + needShippingAddress.hashCode()
            hashCode = 31 * hashCode + receiptMessageId.hashCode()
            hashCode = 31 * hashCode + paidMedia.hashCode()
            hashCode = 31 * hashCode + paidMediaCaption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Invoice")
                append("(")
                append("productInfo=")
                append(productInfo)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("totalAmount=")
                append(totalAmount)
                append(", ")
                append("startParameter=")
                append(startParameter)
                append(", ")
                append("isTest=")
                append(isTest)
                append(", ")
                append("needShippingAddress=")
                append(needShippingAddress)
                append(", ")
                append("receiptMessageId=")
                append(receiptMessageId)
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
     * A message with information about an ended call.
     *
     * @property isVideo True, if the call was a video call.
     * @property discardReason Reason why the call was discarded.
     * @property duration Call duration, in seconds.
     */
    public class Call public constructor(
        public val isVideo: Boolean,
        public val discardReason: CallDiscardReasonDto,
        public val duration: Int,
    ) : MessageContentDto() {
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
            other as Call
            if (other.isVideo != isVideo) {
                return false
            }
            if (other.discardReason != discardReason) {
                return false
            }
            return other.duration == duration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isVideo.hashCode()
            hashCode = 31 * hashCode + discardReason.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Call")
                append("(")
                append("isVideo=")
                append(isVideo)
                append(", ")
                append("discardReason=")
                append(discardReason)
                append(", ")
                append("duration=")
                append(duration)
                append(")")
            }
        }
    }

    /**
     * A message with information about a group call not bound to a chat. If the message is incoming, the call isn't active, isn't missed, and has no duration, and getOption(&quot;can_accept_calls&quot;) is true, then incoming call screen must be shown to the user. Use joinGroupCall to accept the call or declineGroupCallInvitation to decline it. If the call become active or missed, then the call screen must be hidden.
     *
     * @property isActive True, if the call is active, i.e. the called user joined the call.
     * @property wasMissed True, if the called user missed or declined the call.
     * @property isVideo True, if the call is a video call.
     * @property duration Call duration, in seconds; for left calls only.
     * @property otherParticipantIds Identifiers of some other call participants.
     */
    public class GroupCall public constructor(
        public val isActive: Boolean,
        public val wasMissed: Boolean,
        public val isVideo: Boolean,
        public val duration: Int,
        public val otherParticipantIds: Array<MessageSenderDto>,
    ) : MessageContentDto() {
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
            other as GroupCall
            if (other.isActive != isActive) {
                return false
            }
            if (other.wasMissed != wasMissed) {
                return false
            }
            if (other.isVideo != isVideo) {
                return false
            }
            if (other.duration != duration) {
                return false
            }
            return other.otherParticipantIds.contentDeepEquals(otherParticipantIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isActive.hashCode()
            hashCode = 31 * hashCode + wasMissed.hashCode()
            hashCode = 31 * hashCode + isVideo.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            hashCode = 31 * hashCode + otherParticipantIds.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GroupCall")
                append("(")
                append("isActive=")
                append(isActive)
                append(", ")
                append("wasMissed=")
                append(wasMissed)
                append(", ")
                append("isVideo=")
                append(isVideo)
                append(", ")
                append("duration=")
                append(duration)
                append(", ")
                append("otherParticipantIds=")
                otherParticipantIds
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A new video chat was scheduled.
     *
     * @property groupCallId Identifier of the video chat. The video chat can be received through the method getGroupCall.
     * @property startDate Point in time (Unix timestamp) when the group call is expected to be started by an administrator.
     */
    public class VideoChatScheduled public constructor(
        public val groupCallId: Int,
        public val startDate: Int,
    ) : MessageContentDto() {
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
            other as VideoChatScheduled
            if (other.groupCallId != groupCallId) {
                return false
            }
            return other.startDate == startDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + groupCallId.hashCode()
            hashCode = 31 * hashCode + startDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.VideoChatScheduled")
                append("(")
                append("groupCallId=")
                append(groupCallId)
                append(", ")
                append("startDate=")
                append(startDate)
                append(")")
            }
        }
    }

    /**
     * A newly created video chat.
     *
     * @property groupCallId Identifier of the video chat. The video chat can be received through the method getGroupCall.
     */
    public class VideoChatStarted public constructor(
        public val groupCallId: Int,
    ) : MessageContentDto() {
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
            other as VideoChatStarted
            return other.groupCallId == groupCallId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + groupCallId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.VideoChatStarted")
                append("(")
                append("groupCallId=")
                append(groupCallId)
                append(")")
            }
        }
    }

    /**
     * A message with information about an ended video chat.
     *
     * @property duration Call duration, in seconds.
     */
    public class VideoChatEnded public constructor(
        public val duration: Int,
    ) : MessageContentDto() {
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
            other as VideoChatEnded
            return other.duration == duration
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + duration.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.VideoChatEnded")
                append("(")
                append("duration=")
                append(duration)
                append(")")
            }
        }
    }

    /**
     * A message with information about an invitation to a video chat.
     *
     * @property groupCallId Identifier of the video chat. The video chat can be received through the method getGroupCall.
     * @property userIds Invited user identifiers.
     */
    public class InviteVideoChatParticipants public constructor(
        public val groupCallId: Int,
        public val userIds: LongArray,
    ) : MessageContentDto() {
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
            other as InviteVideoChatParticipants
            if (other.groupCallId != groupCallId) {
                return false
            }
            return other.userIds.contentEquals(userIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + groupCallId.hashCode()
            hashCode = 31 * hashCode + userIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.InviteVideoChatParticipants")
                append("(")
                append("groupCallId=")
                append(groupCallId)
                append(", ")
                append("userIds=")
                userIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A newly created basic group.
     *
     * @property title Title of the basic group.
     * @property memberUserIds User identifiers of members in the basic group.
     */
    public class BasicGroupChatCreate public constructor(
        public val title: String,
        public val memberUserIds: LongArray,
    ) : MessageContentDto() {
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
            other as BasicGroupChatCreate
            if (other.title != title) {
                return false
            }
            return other.memberUserIds.contentEquals(memberUserIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + memberUserIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.BasicGroupChatCreate")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("memberUserIds=")
                memberUserIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A newly created supergroup or channel.
     *
     * @property title Title of the supergroup or channel.
     */
    public class SupergroupChatCreate public constructor(
        public val title: String,
    ) : MessageContentDto() {
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
            other as SupergroupChatCreate
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.SupergroupChatCreate")
                append("(")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * An updated chat title.
     *
     * @property title New chat title.
     */
    public class ChatChangeTitle public constructor(
        public val title: String,
    ) : MessageContentDto() {
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
            other as ChatChangeTitle
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatChangeTitle")
                append("(")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * An updated chat photo.
     *
     * @property photo New chat photo.
     */
    public class ChatChangePhoto public constructor(
        public val photo: ChatPhotoDto,
    ) : MessageContentDto() {
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
            other as ChatChangePhoto
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatChangePhoto")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * A deleted chat photo.
     */
    public class ChatDeletePhoto public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ChatDeletePhoto()"
        }
    }

    /**
     * New chat members were added.
     *
     * @property memberUserIds User identifiers of the new members.
     */
    public class ChatAddMembers public constructor(
        public val memberUserIds: LongArray,
    ) : MessageContentDto() {
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
            other as ChatAddMembers
            return other.memberUserIds.contentEquals(memberUserIds)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + memberUserIds.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatAddMembers")
                append("(")
                append("memberUserIds=")
                memberUserIds
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A new member joined the chat via an invite link.
     */
    public class ChatJoinByLink public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ChatJoinByLink()"
        }
    }

    /**
     * A new member was accepted to the chat by an administrator.
     */
    public class ChatJoinByRequest public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ChatJoinByRequest()"
        }
    }

    /**
     * A chat member was deleted.
     *
     * @property userId User identifier of the deleted chat member.
     */
    public class ChatDeleteMember public constructor(
        public val userId: Long,
    ) : MessageContentDto() {
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
            other as ChatDeleteMember
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatDeleteMember")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * A basic group was upgraded to a supergroup and was deactivated as the result.
     *
     * @property supergroupId Identifier of the supergroup to which the basic group was upgraded.
     */
    public class ChatUpgradeTo public constructor(
        public val supergroupId: Long,
    ) : MessageContentDto() {
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
            other as ChatUpgradeTo
            return other.supergroupId == supergroupId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + supergroupId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatUpgradeTo")
                append("(")
                append("supergroupId=")
                append(supergroupId)
                append(")")
            }
        }
    }

    /**
     * A supergroup has been created from a basic group.
     *
     * @property title Title of the newly created supergroup.
     * @property basicGroupId The identifier of the original basic group.
     */
    public class ChatUpgradeFrom public constructor(
        public val title: String,
        public val basicGroupId: Long,
    ) : MessageContentDto() {
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
            other as ChatUpgradeFrom
            if (other.title != title) {
                return false
            }
            return other.basicGroupId == basicGroupId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + basicGroupId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatUpgradeFrom")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("basicGroupId=")
                append(basicGroupId)
                append(")")
            }
        }
    }

    /**
     * A message has been pinned.
     *
     * @property messageId Identifier of the pinned message, can be an identifier of a deleted message or 0.
     */
    public class PinMessage public constructor(
        public val messageId: Long,
    ) : MessageContentDto() {
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
            other as PinMessage
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PinMessage")
                append("(")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * A screenshot of a message in the chat has been taken.
     */
    public class ScreenshotTaken public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ScreenshotTaken()"
        }
    }

    /**
     * A new background was set in the chat.
     *
     * @property oldBackgroundMessageId Identifier of the message with a previously set same background; 0 if none. Can be an identifier of a deleted message.
     * @property background The new background.
     * @property onlyForSelf True, if the background was set only for self.
     */
    public class ChatSetBackground public constructor(
        public val oldBackgroundMessageId: Long,
        public val background: ChatBackgroundDto,
        public val onlyForSelf: Boolean,
    ) : MessageContentDto() {
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
            other as ChatSetBackground
            if (other.oldBackgroundMessageId != oldBackgroundMessageId) {
                return false
            }
            if (other.background != background) {
                return false
            }
            return other.onlyForSelf == onlyForSelf
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + oldBackgroundMessageId.hashCode()
            hashCode = 31 * hashCode + background.hashCode()
            hashCode = 31 * hashCode + onlyForSelf.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatSetBackground")
                append("(")
                append("oldBackgroundMessageId=")
                append(oldBackgroundMessageId)
                append(", ")
                append("background=")
                append(background)
                append(", ")
                append("onlyForSelf=")
                append(onlyForSelf)
                append(")")
            }
        }
    }

    /**
     * A theme in the chat has been changed.
     *
     * @property themeName If non-empty, name of a new theme, set for the chat. Otherwise, chat theme was reset to the default one.
     */
    public class ChatSetTheme public constructor(
        public val themeName: String,
    ) : MessageContentDto() {
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
            other as ChatSetTheme
            return other.themeName == themeName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + themeName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatSetTheme")
                append("(")
                append("themeName=")
                append(themeName)
                append(")")
            }
        }
    }

    /**
     * The auto-delete or self-destruct timer for messages in the chat has been changed.
     *
     * @property messageAutoDeleteTime New value auto-delete or self-destruct time, in seconds; 0 if disabled.
     * @property fromUserId If not 0, a user identifier, which default setting was automatically applied.
     */
    public class ChatSetMessageAutoDeleteTime public constructor(
        public val messageAutoDeleteTime: Int,
        public val fromUserId: Long,
    ) : MessageContentDto() {
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
            other as ChatSetMessageAutoDeleteTime
            if (other.messageAutoDeleteTime != messageAutoDeleteTime) {
                return false
            }
            return other.fromUserId == fromUserId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageAutoDeleteTime.hashCode()
            hashCode = 31 * hashCode + fromUserId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatSetMessageAutoDeleteTime")
                append("(")
                append("messageAutoDeleteTime=")
                append(messageAutoDeleteTime)
                append(", ")
                append("fromUserId=")
                append(fromUserId)
                append(")")
            }
        }
    }

    /**
     * The chat was boosted by the sender of the message.
     *
     * @property boostCount Number of times the chat was boosted.
     */
    public class ChatBoost public constructor(
        public val boostCount: Int,
    ) : MessageContentDto() {
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
            other as ChatBoost
            return other.boostCount == boostCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + boostCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatBoost")
                append("(")
                append("boostCount=")
                append(boostCount)
                append(")")
            }
        }
    }

    /**
     * A forum topic has been created.
     *
     * @property name Name of the topic.
     * @property icon Icon of the topic.
     */
    public class ForumTopicCreated public constructor(
        public val name: String,
        public val icon: ForumTopicIconDto,
    ) : MessageContentDto() {
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
            other as ForumTopicCreated
            if (other.name != name) {
                return false
            }
            return other.icon == icon
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            hashCode = 31 * hashCode + icon.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ForumTopicCreated")
                append("(")
                append("name=")
                append(name)
                append(", ")
                append("icon=")
                append(icon)
                append(")")
            }
        }
    }

    /**
     * A forum topic has been edited.
     *
     * @property name If non-empty, the new name of the topic.
     * @property editIconCustomEmojiId True, if icon's customEmojiId is changed.
     * @property iconCustomEmojiId New unique identifier of the custom emoji shown on the topic icon; 0 if none. Must be ignored if editIconCustomEmojiId is false.
     */
    public class ForumTopicEdited public constructor(
        public val name: String,
        public val editIconCustomEmojiId: Boolean,
        public val iconCustomEmojiId: Long,
    ) : MessageContentDto() {
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
            other as ForumTopicEdited
            if (other.name != name) {
                return false
            }
            if (other.editIconCustomEmojiId != editIconCustomEmojiId) {
                return false
            }
            return other.iconCustomEmojiId == iconCustomEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            hashCode = 31 * hashCode + editIconCustomEmojiId.hashCode()
            hashCode = 31 * hashCode + iconCustomEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ForumTopicEdited")
                append("(")
                append("name=")
                append(name)
                append(", ")
                append("editIconCustomEmojiId=")
                append(editIconCustomEmojiId)
                append(", ")
                append("iconCustomEmojiId=")
                append(iconCustomEmojiId)
                append(")")
            }
        }
    }

    /**
     * A forum topic has been closed or opened.
     *
     * @property isClosed True, if the topic was closed; otherwise, the topic was reopened.
     */
    public class ForumTopicIsClosedToggled public constructor(
        public val isClosed: Boolean,
    ) : MessageContentDto() {
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
            other as ForumTopicIsClosedToggled
            return other.isClosed == isClosed
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isClosed.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ForumTopicIsClosedToggled")
                append("(")
                append("isClosed=")
                append(isClosed)
                append(")")
            }
        }
    }

    /**
     * A General forum topic has been hidden or unhidden.
     *
     * @property isHidden True, if the topic was hidden; otherwise, the topic was unhidden.
     */
    public class ForumTopicIsHiddenToggled public constructor(
        public val isHidden: Boolean,
    ) : MessageContentDto() {
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
            other as ForumTopicIsHiddenToggled
            return other.isHidden == isHidden
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isHidden.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ForumTopicIsHiddenToggled")
                append("(")
                append("isHidden=")
                append(isHidden)
                append(")")
            }
        }
    }

    /**
     * A profile photo was suggested to a user in a private chat.
     *
     * @property photo The suggested chat photo. Use the method setProfilePhoto with inputChatPhotoPrevious to apply the photo.
     */
    public class SuggestProfilePhoto public constructor(
        public val photo: ChatPhotoDto,
    ) : MessageContentDto() {
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
            other as SuggestProfilePhoto
            return other.photo == photo
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.SuggestProfilePhoto")
                append("(")
                append("photo=")
                append(photo)
                append(")")
            }
        }
    }

    /**
     * A non-standard action has happened in the chat.
     *
     * @property text Message text to be shown in the chat.
     */
    public class CustomServiceAction public constructor(
        public val text: String,
    ) : MessageContentDto() {
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
            other as CustomServiceAction
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.CustomServiceAction")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A new high score was achieved in a game.
     *
     * @property gameMessageId Identifier of the message with the game, can be an identifier of a deleted message.
     * @property gameId Identifier of the game; may be different from the games presented in the message with the game.
     * @property score New score.
     */
    public class GameScore public constructor(
        public val gameMessageId: Long,
        public val gameId: Long,
        public val score: Int,
    ) : MessageContentDto() {
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
            other as GameScore
            if (other.gameMessageId != gameMessageId) {
                return false
            }
            if (other.gameId != gameId) {
                return false
            }
            return other.score == score
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gameMessageId.hashCode()
            hashCode = 31 * hashCode + gameId.hashCode()
            hashCode = 31 * hashCode + score.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GameScore")
                append("(")
                append("gameMessageId=")
                append(gameMessageId)
                append(", ")
                append("gameId=")
                append(gameId)
                append(", ")
                append("score=")
                append(score)
                append(")")
            }
        }
    }

    /**
     * A payment has been sent to a bot or a business account.
     *
     * @property invoiceChatId Identifier of the chat, containing the corresponding invoice message.
     * @property invoiceMessageId Identifier of the message with the corresponding invoice; can be 0 or an identifier of a deleted message.
     * @property currency Currency for the price of the product.
     * @property totalAmount Total price for the product, in the smallest units of the currency.
     * @property subscriptionUntilDate Point in time (Unix timestamp) when the subscription will expire; 0 if unknown or the payment isn't recurring.
     * @property isRecurring True, if this is a recurring payment.
     * @property isFirstRecurring True, if this is the first recurring payment.
     * @property invoiceName Name of the invoice; may be empty if unknown.
     */
    public class PaymentSuccessful public constructor(
        public val invoiceChatId: Long,
        public val invoiceMessageId: Long,
        public val currency: String,
        public val totalAmount: Long,
        public val subscriptionUntilDate: Int,
        public val isRecurring: Boolean,
        public val isFirstRecurring: Boolean,
        public val invoiceName: String,
    ) : MessageContentDto() {
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
            other as PaymentSuccessful
            if (other.invoiceChatId != invoiceChatId) {
                return false
            }
            if (other.invoiceMessageId != invoiceMessageId) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.totalAmount != totalAmount) {
                return false
            }
            if (other.subscriptionUntilDate != subscriptionUntilDate) {
                return false
            }
            if (other.isRecurring != isRecurring) {
                return false
            }
            if (other.isFirstRecurring != isFirstRecurring) {
                return false
            }
            return other.invoiceName == invoiceName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + invoiceChatId.hashCode()
            hashCode = 31 * hashCode + invoiceMessageId.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + totalAmount.hashCode()
            hashCode = 31 * hashCode + subscriptionUntilDate.hashCode()
            hashCode = 31 * hashCode + isRecurring.hashCode()
            hashCode = 31 * hashCode + isFirstRecurring.hashCode()
            hashCode = 31 * hashCode + invoiceName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaymentSuccessful")
                append("(")
                append("invoiceChatId=")
                append(invoiceChatId)
                append(", ")
                append("invoiceMessageId=")
                append(invoiceMessageId)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("totalAmount=")
                append(totalAmount)
                append(", ")
                append("subscriptionUntilDate=")
                append(subscriptionUntilDate)
                append(", ")
                append("isRecurring=")
                append(isRecurring)
                append(", ")
                append("isFirstRecurring=")
                append(isFirstRecurring)
                append(", ")
                append("invoiceName=")
                append(invoiceName)
                append(")")
            }
        }
    }

    /**
     * A payment has been received by the bot or the business account.
     *
     * @property currency Currency for price of the product.
     * @property totalAmount Total price for the product, in the smallest units of the currency.
     * @property subscriptionUntilDate Point in time (Unix timestamp) when the subscription will expire; 0 if unknown or the payment isn't recurring.
     * @property isRecurring True, if this is a recurring payment.
     * @property isFirstRecurring True, if this is the first recurring payment.
     * @property invoicePayload Invoice payload.
     * @property shippingOptionId Identifier of the shipping option chosen by the user; may be empty if not applicable; for bots only.
     * @property orderInfo Information about the order; may be null; for bots only.
     * @property telegramPaymentChargeId Telegram payment identifier.
     * @property providerPaymentChargeId Provider payment identifier.
     */
    public class PaymentSuccessfulBot public constructor(
        public val currency: String,
        public val totalAmount: Long,
        public val subscriptionUntilDate: Int,
        public val isRecurring: Boolean,
        public val isFirstRecurring: Boolean,
        public val invoicePayload: ByteArray,
        public val shippingOptionId: String,
        public val orderInfo: OrderInfoDto?,
        public val telegramPaymentChargeId: String,
        public val providerPaymentChargeId: String,
    ) : MessageContentDto() {
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
            other as PaymentSuccessfulBot
            if (other.currency != currency) {
                return false
            }
            if (other.totalAmount != totalAmount) {
                return false
            }
            if (other.subscriptionUntilDate != subscriptionUntilDate) {
                return false
            }
            if (other.isRecurring != isRecurring) {
                return false
            }
            if (other.isFirstRecurring != isFirstRecurring) {
                return false
            }
            val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
            if (!invoicePayloadEquals) {
                return false
            }
            if (other.shippingOptionId != shippingOptionId) {
                return false
            }
            if (other.orderInfo != orderInfo) {
                return false
            }
            if (other.telegramPaymentChargeId != telegramPaymentChargeId) {
                return false
            }
            return other.providerPaymentChargeId == providerPaymentChargeId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + totalAmount.hashCode()
            hashCode = 31 * hashCode + subscriptionUntilDate.hashCode()
            hashCode = 31 * hashCode + isRecurring.hashCode()
            hashCode = 31 * hashCode + isFirstRecurring.hashCode()
            hashCode = 31 * hashCode + invoicePayload.contentHashCode()
            hashCode = 31 * hashCode + shippingOptionId.hashCode()
            hashCode = 31 * hashCode + orderInfo.hashCode()
            hashCode = 31 * hashCode + telegramPaymentChargeId.hashCode()
            hashCode = 31 * hashCode + providerPaymentChargeId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaymentSuccessfulBot")
                append("(")
                append("currency=")
                append(currency)
                append(", ")
                append("totalAmount=")
                append(totalAmount)
                append(", ")
                append("subscriptionUntilDate=")
                append(subscriptionUntilDate)
                append(", ")
                append("isRecurring=")
                append(isRecurring)
                append(", ")
                append("isFirstRecurring=")
                append(isFirstRecurring)
                append(", ")
                append("invoicePayload=")
                invoicePayload
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("shippingOptionId=")
                append(shippingOptionId)
                append(", ")
                append("orderInfo=")
                append(orderInfo)
                append(", ")
                append("telegramPaymentChargeId=")
                append(telegramPaymentChargeId)
                append(", ")
                append("providerPaymentChargeId=")
                append(providerPaymentChargeId)
                append(")")
            }
        }
    }

    /**
     * A payment has been refunded.
     *
     * @property ownerId Identifier of the previous owner of the Telegram Stars that refunds them.
     * @property currency Currency for the price of the product.
     * @property totalAmount Total price for the product, in the smallest units of the currency.
     * @property invoicePayload Invoice payload; only for bots.
     * @property telegramPaymentChargeId Telegram payment identifier.
     * @property providerPaymentChargeId Provider payment identifier.
     */
    public class PaymentRefunded public constructor(
        public val ownerId: MessageSenderDto,
        public val currency: String,
        public val totalAmount: Long,
        public val invoicePayload: ByteArray,
        public val telegramPaymentChargeId: String,
        public val providerPaymentChargeId: String,
    ) : MessageContentDto() {
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
            other as PaymentRefunded
            if (other.ownerId != ownerId) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.totalAmount != totalAmount) {
                return false
            }
            val invoicePayloadEquals = other.invoicePayload.contentEquals(invoicePayload)
            if (!invoicePayloadEquals) {
                return false
            }
            if (other.telegramPaymentChargeId != telegramPaymentChargeId) {
                return false
            }
            return other.providerPaymentChargeId == providerPaymentChargeId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + ownerId.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + totalAmount.hashCode()
            hashCode = 31 * hashCode + invoicePayload.contentHashCode()
            hashCode = 31 * hashCode + telegramPaymentChargeId.hashCode()
            hashCode = 31 * hashCode + providerPaymentChargeId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaymentRefunded")
                append("(")
                append("ownerId=")
                append(ownerId)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("totalAmount=")
                append(totalAmount)
                append(", ")
                append("invoicePayload=")
                invoicePayload
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("telegramPaymentChargeId=")
                append(telegramPaymentChargeId)
                append(", ")
                append("providerPaymentChargeId=")
                append(providerPaymentChargeId)
                append(")")
            }
        }
    }

    /**
     * Telegram Premium was gifted to a user.
     *
     * @property gifterUserId The identifier of a user that gifted Telegram Premium; 0 if the gift was anonymous or is outgoing.
     * @property receiverUserId The identifier of a user that received Telegram Premium; 0 if the gift is incoming.
     * @property text Message added to the gifted Telegram Premium by the sender.
     * @property currency Currency for the paid amount.
     * @property amount The paid amount, in the smallest units of the currency.
     * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none.
     * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if none.
     * @property monthCount Number of months the Telegram Premium subscription will be active.
     * @property sticker A sticker to be shown in the message; may be null if unknown.
     */
    public class GiftedPremium public constructor(
        public val gifterUserId: Long,
        public val receiverUserId: Long,
        public val text: FormattedTextDto,
        public val currency: String,
        public val amount: Long,
        public val cryptocurrency: String,
        public val cryptocurrencyAmount: Long,
        public val monthCount: Int,
        public val sticker: StickerDto?,
    ) : MessageContentDto() {
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
            other as GiftedPremium
            if (other.gifterUserId != gifterUserId) {
                return false
            }
            if (other.receiverUserId != receiverUserId) {
                return false
            }
            if (other.text != text) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.amount != amount) {
                return false
            }
            if (other.cryptocurrency != cryptocurrency) {
                return false
            }
            if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
                return false
            }
            if (other.monthCount != monthCount) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gifterUserId.hashCode()
            hashCode = 31 * hashCode + receiverUserId.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + cryptocurrency.hashCode()
            hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiftedPremium")
                append("(")
                append("gifterUserId=")
                append(gifterUserId)
                append(", ")
                append("receiverUserId=")
                append(receiverUserId)
                append(", ")
                append("text=")
                append(text)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("amount=")
                append(amount)
                append(", ")
                append("cryptocurrency=")
                append(cryptocurrency)
                append(", ")
                append("cryptocurrencyAmount=")
                append(cryptocurrencyAmount)
                append(", ")
                append("monthCount=")
                append(monthCount)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * A Telegram Premium gift code was created for the user.
     *
     * @property creatorId Identifier of a chat or a user that created the gift code; may be null if unknown.
     * @property text Message added to the gift.
     * @property isFromGiveaway True, if the gift code was created for a giveaway.
     * @property isUnclaimed True, if the winner for the corresponding Telegram Premium subscription wasn't chosen.
     * @property currency Currency for the paid amount; empty if unknown.
     * @property amount The paid amount, in the smallest units of the currency; 0 if unknown.
     * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none or unknown.
     * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if unknown.
     * @property monthCount Number of months the Telegram Premium subscription will be active after code activation.
     * @property sticker A sticker to be shown in the message; may be null if unknown.
     * @property code The gift code.
     */
    public class PremiumGiftCode public constructor(
        public val creatorId: MessageSenderDto?,
        public val text: FormattedTextDto,
        public val isFromGiveaway: Boolean,
        public val isUnclaimed: Boolean,
        public val currency: String,
        public val amount: Long,
        public val cryptocurrency: String,
        public val cryptocurrencyAmount: Long,
        public val monthCount: Int,
        public val sticker: StickerDto?,
        public val code: String,
    ) : MessageContentDto() {
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
            other as PremiumGiftCode
            if (other.creatorId != creatorId) {
                return false
            }
            if (other.text != text) {
                return false
            }
            if (other.isFromGiveaway != isFromGiveaway) {
                return false
            }
            if (other.isUnclaimed != isUnclaimed) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.amount != amount) {
                return false
            }
            if (other.cryptocurrency != cryptocurrency) {
                return false
            }
            if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
                return false
            }
            if (other.monthCount != monthCount) {
                return false
            }
            if (other.sticker != sticker) {
                return false
            }
            return other.code == code
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + creatorId.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + isFromGiveaway.hashCode()
            hashCode = 31 * hashCode + isUnclaimed.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + cryptocurrency.hashCode()
            hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            hashCode = 31 * hashCode + code.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PremiumGiftCode")
                append("(")
                append("creatorId=")
                append(creatorId)
                append(", ")
                append("text=")
                append(text)
                append(", ")
                append("isFromGiveaway=")
                append(isFromGiveaway)
                append(", ")
                append("isUnclaimed=")
                append(isUnclaimed)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("amount=")
                append(amount)
                append(", ")
                append("cryptocurrency=")
                append(cryptocurrency)
                append(", ")
                append("cryptocurrencyAmount=")
                append(cryptocurrencyAmount)
                append(", ")
                append("monthCount=")
                append(monthCount)
                append(", ")
                append("sticker=")
                append(sticker)
                append(", ")
                append("code=")
                append(code)
                append(")")
            }
        }
    }

    /**
     * A giveaway was created for the chat. Use telegramPaymentPurposePremiumGiveaway, storePaymentPurposePremiumGiveaway, telegramPaymentPurposeStarGiveaway, or storePaymentPurposeStarGiveaway to create a giveaway.
     *
     * @property starCount Number of Telegram Stars that will be shared by winners of the giveaway; 0 for Telegram Premium giveaways.
     */
    public class GiveawayCreated public constructor(
        public val starCount: Long,
    ) : MessageContentDto() {
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
            other as GiveawayCreated
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiveawayCreated")
                append("(")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }

    /**
     * A giveaway.
     *
     * @property parameters Giveaway parameters.
     * @property winnerCount Number of users which will receive Telegram Premium subscription gift codes.
     * @property prize Prize of the giveaway.
     * @property sticker A sticker to be shown in the message; may be null if unknown.
     */
    public class Giveaway public constructor(
        public val parameters: GiveawayParametersDto,
        public val winnerCount: Int,
        public val prize: GiveawayPrizeDto,
        public val sticker: StickerDto?,
    ) : MessageContentDto() {
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
            other as Giveaway
            if (other.parameters != parameters) {
                return false
            }
            if (other.winnerCount != winnerCount) {
                return false
            }
            if (other.prize != prize) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + parameters.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + prize.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Giveaway")
                append("(")
                append("parameters=")
                append(parameters)
                append(", ")
                append("winnerCount=")
                append(winnerCount)
                append(", ")
                append("prize=")
                append(prize)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * A giveaway without public winners has been completed for the chat.
     *
     * @property giveawayMessageId Identifier of the message with the giveaway; can be 0 if the message was deleted.
     * @property winnerCount Number of winners in the giveaway.
     * @property isStarGiveaway True, if the giveaway is a Telegram Star giveaway.
     * @property unclaimedPrizeCount Number of undistributed prizes; for Telegram Premium giveaways only.
     */
    public class GiveawayCompleted public constructor(
        public val giveawayMessageId: Long,
        public val winnerCount: Int,
        public val isStarGiveaway: Boolean,
        public val unclaimedPrizeCount: Int,
    ) : MessageContentDto() {
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
            other as GiveawayCompleted
            if (other.giveawayMessageId != giveawayMessageId) {
                return false
            }
            if (other.winnerCount != winnerCount) {
                return false
            }
            if (other.isStarGiveaway != isStarGiveaway) {
                return false
            }
            return other.unclaimedPrizeCount == unclaimedPrizeCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + giveawayMessageId.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + isStarGiveaway.hashCode()
            hashCode = 31 * hashCode + unclaimedPrizeCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiveawayCompleted")
                append("(")
                append("giveawayMessageId=")
                append(giveawayMessageId)
                append(", ")
                append("winnerCount=")
                append(winnerCount)
                append(", ")
                append("isStarGiveaway=")
                append(isStarGiveaway)
                append(", ")
                append("unclaimedPrizeCount=")
                append(unclaimedPrizeCount)
                append(")")
            }
        }
    }

    /**
     * A giveaway with public winners has been completed for the chat.
     *
     * @property boostedChatId Identifier of the supergroup or channel chat, which was automatically boosted by the winners of the giveaway.
     * @property giveawayMessageId Identifier of the message with the giveaway in the boosted chat.
     * @property additionalChatCount Number of other chats that participated in the giveaway.
     * @property actualWinnersSelectionDate Point in time (Unix timestamp) when the winners were selected. May be bigger than winners selection date specified in parameters of the giveaway.
     * @property onlyNewMembers True, if only new members of the chats were eligible for the giveaway.
     * @property wasRefunded True, if the giveaway was canceled and was fully refunded.
     * @property prize Prize of the giveaway.
     * @property prizeDescription Additional description of the giveaway prize.
     * @property winnerCount Total number of winners in the giveaway.
     * @property winnerUserIds Up to 100 user identifiers of the winners of the giveaway.
     * @property unclaimedPrizeCount Number of undistributed prizes; for Telegram Premium giveaways only.
     */
    public class GiveawayWinners public constructor(
        public val boostedChatId: Long,
        public val giveawayMessageId: Long,
        public val additionalChatCount: Int,
        public val actualWinnersSelectionDate: Int,
        public val onlyNewMembers: Boolean,
        public val wasRefunded: Boolean,
        public val prize: GiveawayPrizeDto,
        public val prizeDescription: String,
        public val winnerCount: Int,
        public val winnerUserIds: LongArray,
        public val unclaimedPrizeCount: Int,
    ) : MessageContentDto() {
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
            other as GiveawayWinners
            if (other.boostedChatId != boostedChatId) {
                return false
            }
            if (other.giveawayMessageId != giveawayMessageId) {
                return false
            }
            if (other.additionalChatCount != additionalChatCount) {
                return false
            }
            if (other.actualWinnersSelectionDate != actualWinnersSelectionDate) {
                return false
            }
            if (other.onlyNewMembers != onlyNewMembers) {
                return false
            }
            if (other.wasRefunded != wasRefunded) {
                return false
            }
            if (other.prize != prize) {
                return false
            }
            if (other.prizeDescription != prizeDescription) {
                return false
            }
            if (other.winnerCount != winnerCount) {
                return false
            }
            val winnerUserIdsEquals = other.winnerUserIds.contentEquals(winnerUserIds)
            if (!winnerUserIdsEquals) {
                return false
            }
            return other.unclaimedPrizeCount == unclaimedPrizeCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + boostedChatId.hashCode()
            hashCode = 31 * hashCode + giveawayMessageId.hashCode()
            hashCode = 31 * hashCode + additionalChatCount.hashCode()
            hashCode = 31 * hashCode + actualWinnersSelectionDate.hashCode()
            hashCode = 31 * hashCode + onlyNewMembers.hashCode()
            hashCode = 31 * hashCode + wasRefunded.hashCode()
            hashCode = 31 * hashCode + prize.hashCode()
            hashCode = 31 * hashCode + prizeDescription.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + winnerUserIds.contentHashCode()
            hashCode = 31 * hashCode + unclaimedPrizeCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiveawayWinners")
                append("(")
                append("boostedChatId=")
                append(boostedChatId)
                append(", ")
                append("giveawayMessageId=")
                append(giveawayMessageId)
                append(", ")
                append("additionalChatCount=")
                append(additionalChatCount)
                append(", ")
                append("actualWinnersSelectionDate=")
                append(actualWinnersSelectionDate)
                append(", ")
                append("onlyNewMembers=")
                append(onlyNewMembers)
                append(", ")
                append("wasRefunded=")
                append(wasRefunded)
                append(", ")
                append("prize=")
                append(prize)
                append(", ")
                append("prizeDescription=")
                append(prizeDescription)
                append(", ")
                append("winnerCount=")
                append(winnerCount)
                append(", ")
                append("winnerUserIds=")
                winnerUserIds
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("unclaimedPrizeCount=")
                append(unclaimedPrizeCount)
                append(")")
            }
        }
    }

    /**
     * Telegram Stars were gifted to a user.
     *
     * @property gifterUserId The identifier of a user that gifted Telegram Stars; 0 if the gift was anonymous or is outgoing.
     * @property receiverUserId The identifier of a user that received Telegram Stars; 0 if the gift is incoming.
     * @property currency Currency for the paid amount.
     * @property amount The paid amount, in the smallest units of the currency.
     * @property cryptocurrency Cryptocurrency used to pay for the gift; may be empty if none.
     * @property cryptocurrencyAmount The paid amount, in the smallest units of the cryptocurrency; 0 if none.
     * @property starCount Number of Telegram Stars that were gifted.
     * @property transactionId Identifier of the transaction for Telegram Stars purchase; for receiver only.
     * @property sticker A sticker to be shown in the message; may be null if unknown.
     */
    public class GiftedStars public constructor(
        public val gifterUserId: Long,
        public val receiverUserId: Long,
        public val currency: String,
        public val amount: Long,
        public val cryptocurrency: String,
        public val cryptocurrencyAmount: Long,
        public val starCount: Long,
        public val transactionId: String,
        public val sticker: StickerDto?,
    ) : MessageContentDto() {
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
            other as GiftedStars
            if (other.gifterUserId != gifterUserId) {
                return false
            }
            if (other.receiverUserId != receiverUserId) {
                return false
            }
            if (other.currency != currency) {
                return false
            }
            if (other.amount != amount) {
                return false
            }
            if (other.cryptocurrency != cryptocurrency) {
                return false
            }
            if (other.cryptocurrencyAmount != cryptocurrencyAmount) {
                return false
            }
            if (other.starCount != starCount) {
                return false
            }
            if (other.transactionId != transactionId) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gifterUserId.hashCode()
            hashCode = 31 * hashCode + receiverUserId.hashCode()
            hashCode = 31 * hashCode + currency.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            hashCode = 31 * hashCode + cryptocurrency.hashCode()
            hashCode = 31 * hashCode + cryptocurrencyAmount.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + transactionId.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiftedStars")
                append("(")
                append("gifterUserId=")
                append(gifterUserId)
                append(", ")
                append("receiverUserId=")
                append(receiverUserId)
                append(", ")
                append("currency=")
                append(currency)
                append(", ")
                append("amount=")
                append(amount)
                append(", ")
                append("cryptocurrency=")
                append(cryptocurrency)
                append(", ")
                append("cryptocurrencyAmount=")
                append(cryptocurrencyAmount)
                append(", ")
                append("starCount=")
                append(starCount)
                append(", ")
                append("transactionId=")
                append(transactionId)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * A Telegram Stars were received by the current user from a giveaway.
     *
     * @property starCount Number of Telegram Stars that were received.
     * @property transactionId Identifier of the transaction for Telegram Stars credit.
     * @property boostedChatId Identifier of the supergroup or channel chat, which was automatically boosted by the winners of the giveaway.
     * @property giveawayMessageId Identifier of the message with the giveaway in the boosted chat; can be 0 if the message was deleted.
     * @property isUnclaimed True, if the corresponding winner wasn't chosen and the Telegram Stars were received by the owner of the boosted chat.
     * @property sticker A sticker to be shown in the message; may be null if unknown.
     */
    public class GiveawayPrizeStars public constructor(
        public val starCount: Long,
        public val transactionId: String,
        public val boostedChatId: Long,
        public val giveawayMessageId: Long,
        public val isUnclaimed: Boolean,
        public val sticker: StickerDto?,
    ) : MessageContentDto() {
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
            other as GiveawayPrizeStars
            if (other.starCount != starCount) {
                return false
            }
            if (other.transactionId != transactionId) {
                return false
            }
            if (other.boostedChatId != boostedChatId) {
                return false
            }
            if (other.giveawayMessageId != giveawayMessageId) {
                return false
            }
            if (other.isUnclaimed != isUnclaimed) {
                return false
            }
            return other.sticker == sticker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + transactionId.hashCode()
            hashCode = 31 * hashCode + boostedChatId.hashCode()
            hashCode = 31 * hashCode + giveawayMessageId.hashCode()
            hashCode = 31 * hashCode + isUnclaimed.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.GiveawayPrizeStars")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("transactionId=")
                append(transactionId)
                append(", ")
                append("boostedChatId=")
                append(boostedChatId)
                append(", ")
                append("giveawayMessageId=")
                append(giveawayMessageId)
                append(", ")
                append("isUnclaimed=")
                append(isUnclaimed)
                append(", ")
                append("sticker=")
                append(sticker)
                append(")")
            }
        }
    }

    /**
     * A regular gift was received or sent by the current user, or the current user was notified about a channel gift.
     *
     * @property gift The gift.
     * @property senderId Sender of the gift.
     * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
     * @property text Message added to the gift.
     * @property sellStarCount Number of Telegram Stars that can be claimed by the receiver instead of the regular gift; 0 if the gift can't be sold by the receiver.
     * @property prepaidUpgradeStarCount Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift.
     * @property isPrivate True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them.
     * @property isSaved True, if the gift is displayed on the user's or the channel's profile page; only for the receiver of the gift.
     * @property canBeUpgraded True, if the gift can be upgraded to a unique gift; only for the receiver of the gift.
     * @property wasConverted True, if the gift was converted to Telegram Stars; only for the receiver of the gift.
     * @property wasUpgraded True, if the gift was upgraded to a unique gift.
     * @property wasRefunded True, if the gift was refunded and isn't available anymore.
     * @property upgradedReceivedGiftId Identifier of the corresponding upgraded gift; may be empty if unknown. Use getReceivedGift to get information about the gift.
     */
    public class Gift public constructor(
        public val gift: GiftDto,
        public val senderId: MessageSenderDto,
        public val receivedGiftId: String,
        public val text: FormattedTextDto,
        public val sellStarCount: Long,
        public val prepaidUpgradeStarCount: Long,
        public val isPrivate: Boolean,
        public val isSaved: Boolean,
        public val canBeUpgraded: Boolean,
        public val wasConverted: Boolean,
        public val wasUpgraded: Boolean,
        public val wasRefunded: Boolean,
        public val upgradedReceivedGiftId: String,
    ) : MessageContentDto() {
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
            other as Gift
            if (other.gift != gift) {
                return false
            }
            if (other.senderId != senderId) {
                return false
            }
            if (other.receivedGiftId != receivedGiftId) {
                return false
            }
            if (other.text != text) {
                return false
            }
            if (other.sellStarCount != sellStarCount) {
                return false
            }
            if (other.prepaidUpgradeStarCount != prepaidUpgradeStarCount) {
                return false
            }
            if (other.isPrivate != isPrivate) {
                return false
            }
            if (other.isSaved != isSaved) {
                return false
            }
            if (other.canBeUpgraded != canBeUpgraded) {
                return false
            }
            if (other.wasConverted != wasConverted) {
                return false
            }
            if (other.wasUpgraded != wasUpgraded) {
                return false
            }
            if (other.wasRefunded != wasRefunded) {
                return false
            }
            return other.upgradedReceivedGiftId == upgradedReceivedGiftId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            hashCode = 31 * hashCode + senderId.hashCode()
            hashCode = 31 * hashCode + receivedGiftId.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + sellStarCount.hashCode()
            hashCode = 31 * hashCode + prepaidUpgradeStarCount.hashCode()
            hashCode = 31 * hashCode + isPrivate.hashCode()
            hashCode = 31 * hashCode + isSaved.hashCode()
            hashCode = 31 * hashCode + canBeUpgraded.hashCode()
            hashCode = 31 * hashCode + wasConverted.hashCode()
            hashCode = 31 * hashCode + wasUpgraded.hashCode()
            hashCode = 31 * hashCode + wasRefunded.hashCode()
            hashCode = 31 * hashCode + upgradedReceivedGiftId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.Gift")
                append("(")
                append("gift=")
                append(gift)
                append(", ")
                append("senderId=")
                append(senderId)
                append(", ")
                append("receivedGiftId=")
                append(receivedGiftId)
                append(", ")
                append("text=")
                append(text)
                append(", ")
                append("sellStarCount=")
                append(sellStarCount)
                append(", ")
                append("prepaidUpgradeStarCount=")
                append(prepaidUpgradeStarCount)
                append(", ")
                append("isPrivate=")
                append(isPrivate)
                append(", ")
                append("isSaved=")
                append(isSaved)
                append(", ")
                append("canBeUpgraded=")
                append(canBeUpgraded)
                append(", ")
                append("wasConverted=")
                append(wasConverted)
                append(", ")
                append("wasUpgraded=")
                append(wasUpgraded)
                append(", ")
                append("wasRefunded=")
                append(wasRefunded)
                append(", ")
                append("upgradedReceivedGiftId=")
                append(upgradedReceivedGiftId)
                append(")")
            }
        }
    }

    /**
     * An upgraded gift was received or sent by the current user, or the current user was notified about a channel gift.
     *
     * @property gift The gift.
     * @property senderId Sender of the gift; may be null for anonymous gifts.
     * @property receivedGiftId Unique identifier of the received gift for the current user; only for the receiver of the gift.
     * @property isUpgrade True, if the gift was obtained by upgrading of a previously received gift; otherwise, this is a transferred gift.
     * @property isSaved True, if the gift is displayed on the user's or the channel's profile page; only for the receiver of the gift.
     * @property canBeTransferred True, if the gift can be transferred to another owner; only for the receiver of the gift.
     * @property wasTransferred True, if the gift was transferred to another owner; only for the receiver of the gift.
     * @property transferStarCount Number of Telegram Stars that must be paid to transfer the upgraded gift; only for the receiver of the gift.
     * @property exportDate Point in time (Unix timestamp) when the gift can be transferred to the TON blockchain as an NFT; 0 if NFT export isn't possible; only for the receiver of the gift.
     */
    public class UpgradedGift public constructor(
        public val gift: UpgradedGiftDto,
        public val senderId: MessageSenderDto?,
        public val receivedGiftId: String,
        public val isUpgrade: Boolean,
        public val isSaved: Boolean,
        public val canBeTransferred: Boolean,
        public val wasTransferred: Boolean,
        public val transferStarCount: Long,
        public val exportDate: Int,
    ) : MessageContentDto() {
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
            if (other.gift != gift) {
                return false
            }
            if (other.senderId != senderId) {
                return false
            }
            if (other.receivedGiftId != receivedGiftId) {
                return false
            }
            if (other.isUpgrade != isUpgrade) {
                return false
            }
            if (other.isSaved != isSaved) {
                return false
            }
            if (other.canBeTransferred != canBeTransferred) {
                return false
            }
            if (other.wasTransferred != wasTransferred) {
                return false
            }
            if (other.transferStarCount != transferStarCount) {
                return false
            }
            return other.exportDate == exportDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            hashCode = 31 * hashCode + senderId.hashCode()
            hashCode = 31 * hashCode + receivedGiftId.hashCode()
            hashCode = 31 * hashCode + isUpgrade.hashCode()
            hashCode = 31 * hashCode + isSaved.hashCode()
            hashCode = 31 * hashCode + canBeTransferred.hashCode()
            hashCode = 31 * hashCode + wasTransferred.hashCode()
            hashCode = 31 * hashCode + transferStarCount.hashCode()
            hashCode = 31 * hashCode + exportDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.UpgradedGift")
                append("(")
                append("gift=")
                append(gift)
                append(", ")
                append("senderId=")
                append(senderId)
                append(", ")
                append("receivedGiftId=")
                append(receivedGiftId)
                append(", ")
                append("isUpgrade=")
                append(isUpgrade)
                append(", ")
                append("isSaved=")
                append(isSaved)
                append(", ")
                append("canBeTransferred=")
                append(canBeTransferred)
                append(", ")
                append("wasTransferred=")
                append(wasTransferred)
                append(", ")
                append("transferStarCount=")
                append(transferStarCount)
                append(", ")
                append("exportDate=")
                append(exportDate)
                append(")")
            }
        }
    }

    /**
     * A gift which purchase, upgrade or transfer were refunded.
     *
     * @property gift The gift.
     * @property senderId Sender of the gift.
     * @property isUpgrade True, if the gift was obtained by upgrading of a previously received gift.
     */
    public class RefundedUpgradedGift public constructor(
        public val gift: GiftDto,
        public val senderId: MessageSenderDto,
        public val isUpgrade: Boolean,
    ) : MessageContentDto() {
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
            other as RefundedUpgradedGift
            if (other.gift != gift) {
                return false
            }
            if (other.senderId != senderId) {
                return false
            }
            return other.isUpgrade == isUpgrade
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + gift.hashCode()
            hashCode = 31 * hashCode + senderId.hashCode()
            hashCode = 31 * hashCode + isUpgrade.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.RefundedUpgradedGift")
                append("(")
                append("gift=")
                append(gift)
                append(", ")
                append("senderId=")
                append(senderId)
                append(", ")
                append("isUpgrade=")
                append(isUpgrade)
                append(")")
            }
        }
    }

    /**
     * Paid messages were refunded.
     *
     * @property messageCount The number of refunded messages.
     * @property starCount The number of refunded Telegram Stars.
     */
    public class PaidMessagesRefunded public constructor(
        public val messageCount: Int,
        public val starCount: Long,
    ) : MessageContentDto() {
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
            other as PaidMessagesRefunded
            if (other.messageCount != messageCount) {
                return false
            }
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageCount.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaidMessagesRefunded")
                append("(")
                append("messageCount=")
                append(messageCount)
                append(", ")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }

    /**
     * A price for paid messages was changed in the supergroup chat.
     *
     * @property paidMessageStarCount The new number of Telegram Stars that must be paid by non-administrator users of the supergroup chat for each sent message.
     */
    public class PaidMessagePriceChanged public constructor(
        public val paidMessageStarCount: Long,
    ) : MessageContentDto() {
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
            other as PaidMessagePriceChanged
            return other.paidMessageStarCount == paidMessageStarCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PaidMessagePriceChanged")
                append("(")
                append("paidMessageStarCount=")
                append(paidMessageStarCount)
                append(")")
            }
        }
    }

    /**
     * A contact has registered with Telegram.
     */
    public class ContactRegistered public constructor() : MessageContentDto() {
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
            return "MessageContentDto.ContactRegistered()"
        }
    }

    /**
     * The current user shared users, which were requested by the bot.
     *
     * @property users The shared users.
     * @property buttonId Identifier of the keyboard button with the request.
     */
    public class UsersShared public constructor(
        public val users: Array<SharedUserDto>,
        public val buttonId: Int,
    ) : MessageContentDto() {
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
            other as UsersShared
            val usersEquals = other.users.contentDeepEquals(users)
            if (!usersEquals) {
                return false
            }
            return other.buttonId == buttonId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + users.contentDeepHashCode()
            hashCode = 31 * hashCode + buttonId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.UsersShared")
                append("(")
                append("users=")
                users
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("buttonId=")
                append(buttonId)
                append(")")
            }
        }
    }

    /**
     * The current user shared a chat, which was requested by the bot.
     *
     * @property chat The shared chat.
     * @property buttonId Identifier of the keyboard button with the request.
     */
    public class ChatShared public constructor(
        public val chat: SharedChatDto,
        public val buttonId: Int,
    ) : MessageContentDto() {
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
            other as ChatShared
            if (other.chat != chat) {
                return false
            }
            return other.buttonId == buttonId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chat.hashCode()
            hashCode = 31 * hashCode + buttonId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ChatShared")
                append("(")
                append("chat=")
                append(chat)
                append(", ")
                append("buttonId=")
                append(buttonId)
                append(")")
            }
        }
    }

    /**
     * The user allowed the bot to send messages.
     *
     * @property reason The reason why the bot was allowed to write messages.
     */
    public class BotWriteAccessAllowed public constructor(
        public val reason: BotWriteAccessAllowReasonDto,
    ) : MessageContentDto() {
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
            other as BotWriteAccessAllowed
            return other.reason == reason
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + reason.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.BotWriteAccessAllowed")
                append("(")
                append("reason=")
                append(reason)
                append(")")
            }
        }
    }

    /**
     * Data from a Web App has been sent to a bot.
     *
     * @property buttonText Text of the keyboardButtonTypeWebApp button, which opened the Web App.
     */
    public class WebAppDataSent public constructor(
        public val buttonText: String,
    ) : MessageContentDto() {
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
            other as WebAppDataSent
            return other.buttonText == buttonText
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + buttonText.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.WebAppDataSent")
                append("(")
                append("buttonText=")
                append(buttonText)
                append(")")
            }
        }
    }

    /**
     * Data from a Web App has been received; for bots only.
     *
     * @property buttonText Text of the keyboardButtonTypeWebApp button, which opened the Web App.
     * @property data The data.
     */
    public class WebAppDataReceived public constructor(
        public val buttonText: String,
        public val data: String,
    ) : MessageContentDto() {
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
            other as WebAppDataReceived
            if (other.buttonText != buttonText) {
                return false
            }
            return other.data == data
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + buttonText.hashCode()
            hashCode = 31 * hashCode + data.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.WebAppDataReceived")
                append("(")
                append("buttonText=")
                append(buttonText)
                append(", ")
                append("data=")
                append(data)
                append(")")
            }
        }
    }

    /**
     * Telegram Passport data has been sent to a bot.
     *
     * @property types List of Telegram Passport element types sent.
     */
    public class PassportDataSent public constructor(
        public val types: Array<PassportElementTypeDto>,
    ) : MessageContentDto() {
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
            other as PassportDataSent
            return other.types.contentDeepEquals(types)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + types.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PassportDataSent")
                append("(")
                append("types=")
                types
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * Telegram Passport data has been received; for bots only.
     *
     * @property elements List of received Telegram Passport elements.
     * @property credentials Encrypted data credentials.
     */
    public class PassportDataReceived public constructor(
        public val elements: Array<EncryptedPassportElementDto>,
        public val credentials: EncryptedCredentialsDto,
    ) : MessageContentDto() {
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
            other as PassportDataReceived
            val elementsEquals = other.elements.contentDeepEquals(elements)
            if (!elementsEquals) {
                return false
            }
            return other.credentials == credentials
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + elements.contentDeepHashCode()
            hashCode = 31 * hashCode + credentials.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.PassportDataReceived")
                append("(")
                append("elements=")
                elements
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("credentials=")
                append(credentials)
                append(")")
            }
        }
    }

    /**
     * A user in the chat came within proximity alert range.
     *
     * @property travelerId The identifier of a user or chat that triggered the proximity alert.
     * @property watcherId The identifier of a user or chat that subscribed for the proximity alert.
     * @property distance The distance between the users.
     */
    public class ProximityAlertTriggered public constructor(
        public val travelerId: MessageSenderDto,
        public val watcherId: MessageSenderDto,
        public val distance: Int,
    ) : MessageContentDto() {
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
            other as ProximityAlertTriggered
            if (other.travelerId != travelerId) {
                return false
            }
            if (other.watcherId != watcherId) {
                return false
            }
            return other.distance == distance
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + travelerId.hashCode()
            hashCode = 31 * hashCode + watcherId.hashCode()
            hashCode = 31 * hashCode + distance.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageContentDto.ProximityAlertTriggered")
                append("(")
                append("travelerId=")
                append(travelerId)
                append(", ")
                append("watcherId=")
                append(watcherId)
                append(", ")
                append("distance=")
                append(distance)
                append(")")
            }
        }
    }

    /**
     * A message content that is not supported in the current TDLib version.
     */
    public class Unsupported public constructor() : MessageContentDto() {
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
            return "MessageContentDto.Unsupported()"
        }
    }
}
