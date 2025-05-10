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
 * Describes a feature available to Premium users.
 */
public sealed class PremiumFeatureDto private constructor() {
    /**
     * Increased limits.
     */
    public class IncreasedLimits public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.IncreasedLimits()"
        }
    }

    /**
     * Increased maximum upload file size.
     */
    public class IncreasedUploadFileSize public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.IncreasedUploadFileSize()"
        }
    }

    /**
     * Improved download speed.
     */
    public class ImprovedDownloadSpeed public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.ImprovedDownloadSpeed()"
        }
    }

    /**
     * The ability to convert voice notes to text.
     */
    public class VoiceRecognition public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.VoiceRecognition()"
        }
    }

    /**
     * Disabled ads.
     */
    public class DisabledAds public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.DisabledAds()"
        }
    }

    /**
     * Allowed to use more reactions.
     */
    public class UniqueReactions public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.UniqueReactions()"
        }
    }

    /**
     * Allowed to use premium stickers with unique effects.
     */
    public class UniqueStickers public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.UniqueStickers()"
        }
    }

    /**
     * Allowed to use custom emoji stickers in message texts and captions.
     */
    public class CustomEmoji public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.CustomEmoji()"
        }
    }

    /**
     * Ability to change position of the main chat list, archive and mute all new chats from non-contacts, and completely disable notifications about the user's contacts joined Telegram.
     */
    public class AdvancedChatManagement public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.AdvancedChatManagement()"
        }
    }

    /**
     * A badge in the user's profile.
     */
    public class ProfileBadge public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.ProfileBadge()"
        }
    }

    /**
     * The ability to show an emoji status along with the user's name.
     */
    public class EmojiStatus public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.EmojiStatus()"
        }
    }

    /**
     * Profile photo animation on message and chat screens.
     */
    public class AnimatedProfilePhoto public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.AnimatedProfilePhoto()"
        }
    }

    /**
     * The ability to set a custom emoji as a forum topic icon.
     */
    public class ForumTopicIcon public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.ForumTopicIcon()"
        }
    }

    /**
     * Allowed to set a premium application icons.
     */
    public class AppIcons public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.AppIcons()"
        }
    }

    /**
     * Allowed to translate chat messages real-time.
     */
    public class RealTimeChatTranslation public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.RealTimeChatTranslation()"
        }
    }

    /**
     * Allowed to use many additional features for stories.
     */
    public class UpgradedStories public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.UpgradedStories()"
        }
    }

    /**
     * The ability to boost chats.
     */
    public class ChatBoost public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.ChatBoost()"
        }
    }

    /**
     * The ability to choose accent color for replies and user profile.
     */
    public class AccentColor public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.AccentColor()"
        }
    }

    /**
     * The ability to set private chat background for both users.
     */
    public class BackgroundForBoth public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.BackgroundForBoth()"
        }
    }

    /**
     * The ability to use tags in Saved Messages.
     */
    public class SavedMessagesTags public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.SavedMessagesTags()"
        }
    }

    /**
     * The ability to disallow incoming voice and video note messages in private chats using setUserPrivacySettingRules with userPrivacySettingAllowPrivateVoiceAndVideoNoteMessages and to restrict incoming messages from non-contacts using setNewChatPrivacySettings.
     */
    public class MessagePrivacy public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.MessagePrivacy()"
        }
    }

    /**
     * The ability to view last seen and read times of other users even they can't view last seen or read time for the current user.
     */
    public class LastSeenTimes public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.LastSeenTimes()"
        }
    }

    /**
     * The ability to use Business features.
     */
    public class Business public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.Business()"
        }
    }

    /**
     * The ability to use all available message effects.
     */
    public class MessageEffects public constructor() : PremiumFeatureDto() {
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
            return "PremiumFeatureDto.MessageEffects()"
        }
    }
}
