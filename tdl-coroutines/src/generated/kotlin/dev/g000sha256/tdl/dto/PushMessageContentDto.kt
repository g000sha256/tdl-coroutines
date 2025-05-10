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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Contains content of a push message notification.
 */
public sealed class PushMessageContentDto private constructor() {
    /**
     * A general message with hidden content.
     *
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Hidden public constructor(
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            other as Hidden
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Hidden")
                append("(")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * An animation message (GIF-style).
     *
     * @property animation Message content; may be null.
     * @property caption Animation caption.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Animation public constructor(
        public val animation: AnimationDto?,
        public val caption: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * An audio message.
     *
     * @property audio Message content; may be null.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Audio public constructor(
        public val audio: AudioDto?,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Audio")
                append("(")
                append("audio=")
                append(audio)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a user contact.
     *
     * @property name Contact's name.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Contact public constructor(
        public val name: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.name != name) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Contact")
                append("(")
                append("name=")
                append(name)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A contact has registered with Telegram.
     */
    public class ContactRegistered public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.ContactRegistered()"
        }
    }

    /**
     * A document message (a general file).
     *
     * @property document Message content; may be null.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Document public constructor(
        public val document: DocumentDto?,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Document")
                append("(")
                append("document=")
                append(document)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a game.
     *
     * @property title Game title, empty for pinned game message.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Game public constructor(
        public val title: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.title != title) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Game")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A new high score was achieved in a game.
     *
     * @property title Game title, empty for pinned message.
     * @property score New score, 0 for pinned message.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class GameScore public constructor(
        public val title: String,
        public val score: Int,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.title != title) {
                return false
            }
            if (other.score != score) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + score.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.GameScore")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("score=")
                append(score)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with an invoice from a bot.
     *
     * @property price Product price.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Invoice public constructor(
        public val price: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.price != price) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + price.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Invoice")
                append("(")
                append("price=")
                append(price)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a location.
     *
     * @property isLive True, if the location is live.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Location public constructor(
        public val isLive: Boolean,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.isLive != isLive) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isLive.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Location")
                append("(")
                append("isLive=")
                append(isLive)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with paid media.
     *
     * @property starCount Number of Telegram Stars needed to buy access to the media in the message; 0 for pinned message.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class PaidMedia public constructor(
        public val starCount: Long,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.PaidMedia")
                append("(")
                append("starCount=")
                append(starCount)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A photo message.
     *
     * @property photo Message content; may be null.
     * @property caption Photo caption.
     * @property isSecret True, if the photo is secret.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Photo public constructor(
        public val photo: PhotoDto?,
        public val caption: String,
        public val isSecret: Boolean,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.isSecret != isSecret) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a poll.
     *
     * @property question Poll question.
     * @property isRegular True, if the poll is regular and not in quiz mode.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Poll public constructor(
        public val question: String,
        public val isRegular: Boolean,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.isRegular != isRegular) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + question.hashCode()
            hashCode = 31 * hashCode + isRegular.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Poll")
                append("(")
                append("question=")
                append(question)
                append(", ")
                append("isRegular=")
                append(isRegular)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a Telegram Premium gift code created for the user.
     *
     * @property monthCount Number of months the Telegram Premium subscription will be active after code activation.
     */
    public class PremiumGiftCode public constructor(
        public val monthCount: Int,
    ) : PushMessageContentDto() {
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
            return other.monthCount == monthCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + monthCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.PremiumGiftCode")
                append("(")
                append("monthCount=")
                append(monthCount)
                append(")")
            }
        }
    }

    /**
     * A message with a giveaway.
     *
     * @property winnerCount Number of users which will receive giveaway prizes; 0 for pinned message.
     * @property prize Prize of the giveaway; may be null for pinned message.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Giveaway public constructor(
        public val winnerCount: Int,
        public val prize: GiveawayPrizeDto?,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.winnerCount != winnerCount) {
                return false
            }
            if (other.prize != prize) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + winnerCount.hashCode()
            hashCode = 31 * hashCode + prize.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Giveaway")
                append("(")
                append("winnerCount=")
                append(winnerCount)
                append(", ")
                append("prize=")
                append(prize)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a gift.
     *
     * @property starCount Number of Telegram Stars that sender paid for the gift.
     */
    public class Gift public constructor(
        public val starCount: Long,
    ) : PushMessageContentDto() {
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
            return other.starCount == starCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + starCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Gift")
                append("(")
                append("starCount=")
                append(starCount)
                append(")")
            }
        }
    }

    /**
     * A message with an upgraded gift.
     *
     * @property isUpgrade True, if the gift was obtained by upgrading of a previously received gift; otherwise, this is a transferred gift.
     */
    public class UpgradedGift public constructor(
        public val isUpgrade: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isUpgrade == isUpgrade
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isUpgrade.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.UpgradedGift")
                append("(")
                append("isUpgrade=")
                append(isUpgrade)
                append(")")
            }
        }
    }

    /**
     * A screenshot of a message in the chat has been taken.
     */
    public class ScreenshotTaken public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.ScreenshotTaken()"
        }
    }

    /**
     * A message with a sticker.
     *
     * @property sticker Message content; may be null.
     * @property emoji Emoji corresponding to the sticker; may be empty.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Sticker public constructor(
        public val sticker: StickerDto?,
        public val emoji: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.emoji != emoji) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + sticker.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Sticker")
                append("(")
                append("sticker=")
                append(sticker)
                append(", ")
                append("emoji=")
                append(emoji)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A message with a story.
     *
     * @property isMention True, if the user was mentioned in the story.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Story public constructor(
        public val isMention: Boolean,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.isMention != isMention) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isMention.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Story")
                append("(")
                append("isMention=")
                append(isMention)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A text message.
     *
     * @property text Message text.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Text public constructor(
        public val text: String,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Text")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A video message.
     *
     * @property video Message content; may be null.
     * @property caption Video caption.
     * @property isSecret True, if the video is secret.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class Video public constructor(
        public val video: VideoDto?,
        public val caption: String,
        public val isSecret: Boolean,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.caption != caption) {
                return false
            }
            if (other.isSecret != isSecret) {
                return false
            }
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + isSecret.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("isSecret=")
                append(isSecret)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A video note message.
     *
     * @property videoNote Message content; may be null.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class VideoNote public constructor(
        public val videoNote: VideoNoteDto?,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + videoNote.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.VideoNote")
                append("(")
                append("videoNote=")
                append(videoNote)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A voice note message.
     *
     * @property voiceNote Message content; may be null.
     * @property isPinned True, if the message is a pinned message with the specified content.
     */
    public class VoiceNote public constructor(
        public val voiceNote: VoiceNoteDto?,
        public val isPinned: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isPinned == isPinned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            hashCode = 31 * hashCode + isPinned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.VoiceNote")
                append("(")
                append("voiceNote=")
                append(voiceNote)
                append(", ")
                append("isPinned=")
                append(isPinned)
                append(")")
            }
        }
    }

    /**
     * A newly created basic group.
     */
    public class BasicGroupChatCreate public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.BasicGroupChatCreate()"
        }
    }

    /**
     * A video chat or live stream was started.
     */
    public class VideoChatStarted public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.VideoChatStarted()"
        }
    }

    /**
     * A video chat or live stream has ended.
     */
    public class VideoChatEnded public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.VideoChatEnded()"
        }
    }

    /**
     * An invitation of participants to a video chat or live stream.
     *
     * @property isCurrentUser True, if the current user was invited to the video chat or the live stream.
     */
    public class InviteVideoChatParticipants public constructor(
        public val isCurrentUser: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isCurrentUser == isCurrentUser
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isCurrentUser.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.InviteVideoChatParticipants")
                append("(")
                append("isCurrentUser=")
                append(isCurrentUser)
                append(")")
            }
        }
    }

    /**
     * New chat members were invited to a group.
     *
     * @property memberName Name of the added member.
     * @property isCurrentUser True, if the current user was added to the group.
     * @property isReturned True, if the user has returned to the group themselves.
     */
    public class ChatAddMembers public constructor(
        public val memberName: String,
        public val isCurrentUser: Boolean,
        public val isReturned: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.memberName != memberName) {
                return false
            }
            if (other.isCurrentUser != isCurrentUser) {
                return false
            }
            return other.isReturned == isReturned
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + memberName.hashCode()
            hashCode = 31 * hashCode + isCurrentUser.hashCode()
            hashCode = 31 * hashCode + isReturned.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.ChatAddMembers")
                append("(")
                append("memberName=")
                append(memberName)
                append(", ")
                append("isCurrentUser=")
                append(isCurrentUser)
                append(", ")
                append("isReturned=")
                append(isReturned)
                append(")")
            }
        }
    }

    /**
     * A chat photo was edited.
     */
    public class ChatChangePhoto public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.ChatChangePhoto()"
        }
    }

    /**
     * A chat title was edited.
     *
     * @property title New chat title.
     */
    public class ChatChangeTitle public constructor(
        public val title: String,
    ) : PushMessageContentDto() {
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
                append("PushMessageContentDto.ChatChangeTitle")
                append("(")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * A chat background was edited.
     *
     * @property isSame True, if the set background is the same as the background of the current user.
     */
    public class ChatSetBackground public constructor(
        public val isSame: Boolean,
    ) : PushMessageContentDto() {
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
            return other.isSame == isSame
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isSame.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.ChatSetBackground")
                append("(")
                append("isSame=")
                append(isSame)
                append(")")
            }
        }
    }

    /**
     * A chat theme was edited.
     *
     * @property themeName If non-empty, name of a new theme, set for the chat. Otherwise, the chat theme was reset to the default one.
     */
    public class ChatSetTheme public constructor(
        public val themeName: String,
    ) : PushMessageContentDto() {
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
                append("PushMessageContentDto.ChatSetTheme")
                append("(")
                append("themeName=")
                append(themeName)
                append(")")
            }
        }
    }

    /**
     * A chat member was deleted.
     *
     * @property memberName Name of the deleted member.
     * @property isCurrentUser True, if the current user was deleted from the group.
     * @property isLeft True, if the user has left the group themselves.
     */
    public class ChatDeleteMember public constructor(
        public val memberName: String,
        public val isCurrentUser: Boolean,
        public val isLeft: Boolean,
    ) : PushMessageContentDto() {
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
            if (other.memberName != memberName) {
                return false
            }
            if (other.isCurrentUser != isCurrentUser) {
                return false
            }
            return other.isLeft == isLeft
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + memberName.hashCode()
            hashCode = 31 * hashCode + isCurrentUser.hashCode()
            hashCode = 31 * hashCode + isLeft.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.ChatDeleteMember")
                append("(")
                append("memberName=")
                append(memberName)
                append(", ")
                append("isCurrentUser=")
                append(isCurrentUser)
                append(", ")
                append("isLeft=")
                append(isLeft)
                append(")")
            }
        }
    }

    /**
     * A new member joined the chat via an invite link.
     */
    public class ChatJoinByLink public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.ChatJoinByLink()"
        }
    }

    /**
     * A new member was accepted to the chat by an administrator.
     */
    public class ChatJoinByRequest public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.ChatJoinByRequest()"
        }
    }

    /**
     * A new recurring payment was made by the current user.
     *
     * @property amount The paid amount.
     */
    public class RecurringPayment public constructor(
        public val amount: String,
    ) : PushMessageContentDto() {
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
            other as RecurringPayment
            return other.amount == amount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + amount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.RecurringPayment")
                append("(")
                append("amount=")
                append(amount)
                append(")")
            }
        }
    }

    /**
     * A profile photo was suggested to the user.
     */
    public class SuggestProfilePhoto public constructor() : PushMessageContentDto() {
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
            return "PushMessageContentDto.SuggestProfilePhoto()"
        }
    }

    /**
     * A user in the chat came within proximity alert range from the current user.
     *
     * @property distance The distance to the user.
     */
    public class ProximityAlertTriggered public constructor(
        public val distance: Int,
    ) : PushMessageContentDto() {
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
            return other.distance == distance
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + distance.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.ProximityAlertTriggered")
                append("(")
                append("distance=")
                append(distance)
                append(")")
            }
        }
    }

    /**
     * A forwarded messages.
     *
     * @property totalCount Number of forwarded messages.
     */
    public class MessageForwards public constructor(
        public val totalCount: Int,
    ) : PushMessageContentDto() {
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
            other as MessageForwards
            return other.totalCount == totalCount
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + totalCount.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.MessageForwards")
                append("(")
                append("totalCount=")
                append(totalCount)
                append(")")
            }
        }
    }

    /**
     * A media album.
     *
     * @property totalCount Number of messages in the album.
     * @property hasPhotos True, if the album has at least one photo.
     * @property hasVideos True, if the album has at least one video file.
     * @property hasAudios True, if the album has at least one audio file.
     * @property hasDocuments True, if the album has at least one document.
     */
    public class MediaAlbum public constructor(
        public val totalCount: Int,
        public val hasPhotos: Boolean,
        public val hasVideos: Boolean,
        public val hasAudios: Boolean,
        public val hasDocuments: Boolean,
    ) : PushMessageContentDto() {
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
            other as MediaAlbum
            if (other.totalCount != totalCount) {
                return false
            }
            if (other.hasPhotos != hasPhotos) {
                return false
            }
            if (other.hasVideos != hasVideos) {
                return false
            }
            if (other.hasAudios != hasAudios) {
                return false
            }
            return other.hasDocuments == hasDocuments
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + totalCount.hashCode()
            hashCode = 31 * hashCode + hasPhotos.hashCode()
            hashCode = 31 * hashCode + hasVideos.hashCode()
            hashCode = 31 * hashCode + hasAudios.hashCode()
            hashCode = 31 * hashCode + hasDocuments.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PushMessageContentDto.MediaAlbum")
                append("(")
                append("totalCount=")
                append(totalCount)
                append(", ")
                append("hasPhotos=")
                append(hasPhotos)
                append(", ")
                append("hasVideos=")
                append(hasVideos)
                append(", ")
                append("hasAudios=")
                append(hasAudios)
                append(", ")
                append("hasDocuments=")
                append(hasDocuments)
                append(")")
            }
        }
    }
}
