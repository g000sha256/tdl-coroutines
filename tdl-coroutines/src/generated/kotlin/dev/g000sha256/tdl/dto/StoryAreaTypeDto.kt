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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes type of clickable area on a story media.
 */
public sealed class StoryAreaTypeDto private constructor() {
    /**
     * An area pointing to a location.
     *
     * @property location The location.
     * @property address Address of the location; may be null if unknown.
     */
    public class Location public constructor(
        public val location: LocationDto,
        public val address: LocationAddressDto?,
    ) : StoryAreaTypeDto() {
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
            return other.address == address
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + location.hashCode()
            hashCode = 31 * hashCode + address.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.Location")
                append("(")
                append("location=")
                append(location)
                append(", ")
                append("address=")
                append(address)
                append(")")
            }
        }
    }

    /**
     * An area pointing to a venue.
     *
     * @property venue Information about the venue.
     */
    public class Venue public constructor(
        public val venue: VenueDto,
    ) : StoryAreaTypeDto() {
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
                append("StoryAreaTypeDto.Venue")
                append("(")
                append("venue=")
                append(venue)
                append(")")
            }
        }
    }

    /**
     * An area pointing to a suggested reaction. App needs to show a clickable reaction on the area and call setStoryReaction when the are is clicked.
     *
     * @property reactionType Type of the reaction.
     * @property totalCount Number of times the reaction was added.
     * @property isDark True, if reaction has a dark background.
     * @property isFlipped True, if reaction corner is flipped.
     */
    public class SuggestedReaction public constructor(
        public val reactionType: ReactionTypeDto,
        public val totalCount: Int,
        public val isDark: Boolean,
        public val isFlipped: Boolean,
    ) : StoryAreaTypeDto() {
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
            other as SuggestedReaction
            if (other.reactionType != reactionType) {
                return false
            }
            if (other.totalCount != totalCount) {
                return false
            }
            if (other.isDark != isDark) {
                return false
            }
            return other.isFlipped == isFlipped
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + reactionType.hashCode()
            hashCode = 31 * hashCode + totalCount.hashCode()
            hashCode = 31 * hashCode + isDark.hashCode()
            hashCode = 31 * hashCode + isFlipped.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.SuggestedReaction")
                append("(")
                append("reactionType=")
                append(reactionType)
                append(", ")
                append("totalCount=")
                append(totalCount)
                append(", ")
                append("isDark=")
                append(isDark)
                append(", ")
                append("isFlipped=")
                append(isFlipped)
                append(")")
            }
        }
    }

    /**
     * An area pointing to a message.
     *
     * @property chatId Identifier of the chat with the message.
     * @property messageId Identifier of the message.
     */
    public class Message public constructor(
        public val chatId: Long,
        public val messageId: Long,
    ) : StoryAreaTypeDto() {
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
            other as Message
            if (other.chatId != chatId) {
                return false
            }
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.Message")
                append("(")
                append("chatId=")
                append(chatId)
                append(", ")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }

    /**
     * An area pointing to a HTTP or tg:// link.
     *
     * @property url HTTP or tg:// URL to be opened when the area is clicked.
     */
    public class Link public constructor(
        public val url: String,
    ) : StoryAreaTypeDto() {
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
            other as Link
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.Link")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * An area with information about weather.
     *
     * @property temperature Temperature, in degree Celsius.
     * @property emoji Emoji representing the weather.
     * @property backgroundColor A color of the area background in the ARGB format.
     */
    public class Weather public constructor(
        public val temperature: Double,
        public val emoji: String,
        public val backgroundColor: Int,
    ) : StoryAreaTypeDto() {
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
            other as Weather
            if (other.temperature != temperature) {
                return false
            }
            if (other.emoji != emoji) {
                return false
            }
            return other.backgroundColor == backgroundColor
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + temperature.hashCode()
            hashCode = 31 * hashCode + emoji.hashCode()
            hashCode = 31 * hashCode + backgroundColor.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.Weather")
                append("(")
                append("temperature=")
                append(temperature)
                append(", ")
                append("emoji=")
                append(emoji)
                append(", ")
                append("backgroundColor=")
                append(backgroundColor)
                append(")")
            }
        }
    }

    /**
     * An area with an upgraded gift.
     *
     * @property giftName Unique name of the upgraded gift.
     */
    public class UpgradedGift public constructor(
        public val giftName: String,
    ) : StoryAreaTypeDto() {
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
            return other.giftName == giftName
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + giftName.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoryAreaTypeDto.UpgradedGift")
                append("(")
                append("giftName=")
                append(giftName)
                append(")")
            }
        }
    }
}
