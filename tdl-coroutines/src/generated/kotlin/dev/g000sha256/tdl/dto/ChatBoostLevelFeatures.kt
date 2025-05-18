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
 * @property canRecognizeSpeech True, if speech recognition can be used for video note and voice note messages by all users.
 * @property canDisableSponsoredMessages True, if sponsored messages can be disabled in the chat.
 */
public class ChatBoostLevelFeatures public constructor(
    public val level: Int,
    public val storyPerDayCount: Int,
    public val customEmojiReactionCount: Int,
    public val titleColorCount: Int,
    public val profileAccentColorCount: Int,
    public val canSetProfileBackgroundCustomEmoji: Boolean,
    public val accentColorCount: Int,
    public val canSetBackgroundCustomEmoji: Boolean,
    public val canSetEmojiStatus: Boolean,
    public val chatThemeBackgroundCount: Int,
    public val canSetCustomBackground: Boolean,
    public val canSetCustomEmojiStickerSet: Boolean,
    public val canRecognizeSpeech: Boolean,
    public val canDisableSponsoredMessages: Boolean,
) {
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
            append("canRecognizeSpeech=")
            append(canRecognizeSpeech)
            append(", ")
            append("canDisableSponsoredMessages=")
            append(canDisableSponsoredMessages)
            append(")")
        }
    }
}
