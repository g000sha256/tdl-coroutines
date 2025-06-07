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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains a list of features available on a specific chat boost level.
 *
 * @property level Target chat boost level.
 * @property storyPerDayCount Number of stories that the chat can publish daily.
 * @property customEmojiReactionCount Number of custom emoji reactions that can be added to the list of available reactions.
 * @property titleColorCount Number of custom colors for chat title.
 * @property profileAccentColorCount Number of custom colors for profile photo background.
 * @property canSetProfileBackgroundCustomEmoji True, if custom emoji for profile background can be set.
 * @property accentColorCount Number of custom colors for background of empty chat photo, replies to messages and link previews.
 * @property canSetBackgroundCustomEmoji True, if custom emoji for reply header and link preview background can be set.
 * @property canSetEmojiStatus True, if emoji status can be set.
 * @property chatThemeBackgroundCount Number of chat theme backgrounds that can be set as chat background.
 * @property canSetCustomBackground True, if custom background can be set in the chat for all users.
 * @property canSetCustomEmojiStickerSet True, if custom emoji sticker set can be set for the chat.
 * @property canEnableAutomaticTranslation True, if automatic translation of messages can be enabled in the chat.
 * @property canRecognizeSpeech True, if speech recognition can be used for video note and voice note messages by all users.
 * @property canDisableSponsoredMessages True, if sponsored messages can be disabled in the chat.
 */
@SerialName(value = "chatBoostLevelFeatures")
@Serializable
public class ChatBoostLevelFeatures public constructor(
    @SerialName(value = "level")
    public val level: Int,
    @SerialName(value = "story_per_day_count")
    public val storyPerDayCount: Int,
    @SerialName(value = "custom_emoji_reaction_count")
    public val customEmojiReactionCount: Int,
    @SerialName(value = "title_color_count")
    public val titleColorCount: Int,
    @SerialName(value = "profile_accent_color_count")
    public val profileAccentColorCount: Int,
    @SerialName(value = "can_set_profile_background_custom_emoji")
    public val canSetProfileBackgroundCustomEmoji: Boolean,
    @SerialName(value = "accent_color_count")
    public val accentColorCount: Int,
    @SerialName(value = "can_set_background_custom_emoji")
    public val canSetBackgroundCustomEmoji: Boolean,
    @SerialName(value = "can_set_emoji_status")
    public val canSetEmojiStatus: Boolean,
    @SerialName(value = "chat_theme_background_count")
    public val chatThemeBackgroundCount: Int,
    @SerialName(value = "can_set_custom_background")
    public val canSetCustomBackground: Boolean,
    @SerialName(value = "can_set_custom_emoji_sticker_set")
    public val canSetCustomEmojiStickerSet: Boolean,
    @SerialName(value = "can_enable_automatic_translation")
    public val canEnableAutomaticTranslation: Boolean,
    @SerialName(value = "can_recognize_speech")
    public val canRecognizeSpeech: Boolean,
    @SerialName(value = "can_disable_sponsored_messages")
    public val canDisableSponsoredMessages: Boolean,
) : Model() {
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
        other as ChatBoostLevelFeatures
        if (other.level != level) {
            return false
        }
        if (other.storyPerDayCount != storyPerDayCount) {
            return false
        }
        if (other.customEmojiReactionCount != customEmojiReactionCount) {
            return false
        }
        if (other.titleColorCount != titleColorCount) {
            return false
        }
        if (other.profileAccentColorCount != profileAccentColorCount) {
            return false
        }
        if (other.canSetProfileBackgroundCustomEmoji != canSetProfileBackgroundCustomEmoji) {
            return false
        }
        if (other.accentColorCount != accentColorCount) {
            return false
        }
        if (other.canSetBackgroundCustomEmoji != canSetBackgroundCustomEmoji) {
            return false
        }
        if (other.canSetEmojiStatus != canSetEmojiStatus) {
            return false
        }
        if (other.chatThemeBackgroundCount != chatThemeBackgroundCount) {
            return false
        }
        if (other.canSetCustomBackground != canSetCustomBackground) {
            return false
        }
        if (other.canSetCustomEmojiStickerSet != canSetCustomEmojiStickerSet) {
            return false
        }
        if (other.canEnableAutomaticTranslation != canEnableAutomaticTranslation) {
            return false
        }
        if (other.canRecognizeSpeech != canRecognizeSpeech) {
            return false
        }
        return other.canDisableSponsoredMessages == canDisableSponsoredMessages
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + level.hashCode()
        hashCode = 31 * hashCode + storyPerDayCount.hashCode()
        hashCode = 31 * hashCode + customEmojiReactionCount.hashCode()
        hashCode = 31 * hashCode + titleColorCount.hashCode()
        hashCode = 31 * hashCode + profileAccentColorCount.hashCode()
        hashCode = 31 * hashCode + canSetProfileBackgroundCustomEmoji.hashCode()
        hashCode = 31 * hashCode + accentColorCount.hashCode()
        hashCode = 31 * hashCode + canSetBackgroundCustomEmoji.hashCode()
        hashCode = 31 * hashCode + canSetEmojiStatus.hashCode()
        hashCode = 31 * hashCode + chatThemeBackgroundCount.hashCode()
        hashCode = 31 * hashCode + canSetCustomBackground.hashCode()
        hashCode = 31 * hashCode + canSetCustomEmojiStickerSet.hashCode()
        hashCode = 31 * hashCode + canEnableAutomaticTranslation.hashCode()
        hashCode = 31 * hashCode + canRecognizeSpeech.hashCode()
        hashCode = 31 * hashCode + canDisableSponsoredMessages.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostLevelFeatures")
            append("(")
            append("level=")
            append(level)
            append(", ")
            append("storyPerDayCount=")
            append(storyPerDayCount)
            append(", ")
            append("customEmojiReactionCount=")
            append(customEmojiReactionCount)
            append(", ")
            append("titleColorCount=")
            append(titleColorCount)
            append(", ")
            append("profileAccentColorCount=")
            append(profileAccentColorCount)
            append(", ")
            append("canSetProfileBackgroundCustomEmoji=")
            append(canSetProfileBackgroundCustomEmoji)
            append(", ")
            append("accentColorCount=")
            append(accentColorCount)
            append(", ")
            append("canSetBackgroundCustomEmoji=")
            append(canSetBackgroundCustomEmoji)
            append(", ")
            append("canSetEmojiStatus=")
            append(canSetEmojiStatus)
            append(", ")
            append("chatThemeBackgroundCount=")
            append(chatThemeBackgroundCount)
            append(", ")
            append("canSetCustomBackground=")
            append(canSetCustomBackground)
            append(", ")
            append("canSetCustomEmojiStickerSet=")
            append(canSetCustomEmojiStickerSet)
            append(", ")
            append("canEnableAutomaticTranslation=")
            append(canEnableAutomaticTranslation)
            append(", ")
            append("canRecognizeSpeech=")
            append(canRecognizeSpeech)
            append(", ")
            append("canDisableSponsoredMessages=")
            append(canDisableSponsoredMessages)
            append(")")
        }
    }
}
