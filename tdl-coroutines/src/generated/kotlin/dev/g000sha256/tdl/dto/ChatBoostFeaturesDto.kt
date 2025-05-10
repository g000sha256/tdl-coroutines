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
import kotlin.String

/**
 * Contains a list of features available on the first chat boost levels.
 *
 * @property features The list of features.
 * @property minProfileBackgroundCustomEmojiBoostLevel The minimum boost level required to set custom emoji for profile background.
 * @property minBackgroundCustomEmojiBoostLevel The minimum boost level required to set custom emoji for reply header and link preview background; for channel chats only.
 * @property minEmojiStatusBoostLevel The minimum boost level required to set emoji status.
 * @property minChatThemeBackgroundBoostLevel The minimum boost level required to set a chat theme background as chat background.
 * @property minCustomBackgroundBoostLevel The minimum boost level required to set custom chat background.
 * @property minCustomEmojiStickerSetBoostLevel The minimum boost level required to set custom emoji sticker set for the chat; for supergroup chats only.
 * @property minSpeechRecognitionBoostLevel The minimum boost level allowing to recognize speech in video note and voice note messages for non-Premium users; for supergroup chats only.
 * @property minSponsoredMessageDisableBoostLevel The minimum boost level allowing to disable sponsored messages in the chat; for channel chats only.
 */
public class ChatBoostFeaturesDto public constructor(
    public val features: Array<ChatBoostLevelFeaturesDto>,
    public val minProfileBackgroundCustomEmojiBoostLevel: Int,
    public val minBackgroundCustomEmojiBoostLevel: Int,
    public val minEmojiStatusBoostLevel: Int,
    public val minChatThemeBackgroundBoostLevel: Int,
    public val minCustomBackgroundBoostLevel: Int,
    public val minCustomEmojiStickerSetBoostLevel: Int,
    public val minSpeechRecognitionBoostLevel: Int,
    public val minSponsoredMessageDisableBoostLevel: Int,
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
        other as ChatBoostFeaturesDto
        val featuresEquals = other.features.contentDeepEquals(features)
        if (!featuresEquals) {
            return false
        }
        if (other.minProfileBackgroundCustomEmojiBoostLevel != minProfileBackgroundCustomEmojiBoostLevel) {
            return false
        }
        if (other.minBackgroundCustomEmojiBoostLevel != minBackgroundCustomEmojiBoostLevel) {
            return false
        }
        if (other.minEmojiStatusBoostLevel != minEmojiStatusBoostLevel) {
            return false
        }
        if (other.minChatThemeBackgroundBoostLevel != minChatThemeBackgroundBoostLevel) {
            return false
        }
        if (other.minCustomBackgroundBoostLevel != minCustomBackgroundBoostLevel) {
            return false
        }
        if (other.minCustomEmojiStickerSetBoostLevel != minCustomEmojiStickerSetBoostLevel) {
            return false
        }
        if (other.minSpeechRecognitionBoostLevel != minSpeechRecognitionBoostLevel) {
            return false
        }
        return other.minSponsoredMessageDisableBoostLevel == minSponsoredMessageDisableBoostLevel
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + features.contentDeepHashCode()
        hashCode = 31 * hashCode + minProfileBackgroundCustomEmojiBoostLevel.hashCode()
        hashCode = 31 * hashCode + minBackgroundCustomEmojiBoostLevel.hashCode()
        hashCode = 31 * hashCode + minEmojiStatusBoostLevel.hashCode()
        hashCode = 31 * hashCode + minChatThemeBackgroundBoostLevel.hashCode()
        hashCode = 31 * hashCode + minCustomBackgroundBoostLevel.hashCode()
        hashCode = 31 * hashCode + minCustomEmojiStickerSetBoostLevel.hashCode()
        hashCode = 31 * hashCode + minSpeechRecognitionBoostLevel.hashCode()
        hashCode = 31 * hashCode + minSponsoredMessageDisableBoostLevel.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoostFeaturesDto")
            append("(")
            append("features=")
            features
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("minProfileBackgroundCustomEmojiBoostLevel=")
            append(minProfileBackgroundCustomEmojiBoostLevel)
            append(", ")
            append("minBackgroundCustomEmojiBoostLevel=")
            append(minBackgroundCustomEmojiBoostLevel)
            append(", ")
            append("minEmojiStatusBoostLevel=")
            append(minEmojiStatusBoostLevel)
            append(", ")
            append("minChatThemeBackgroundBoostLevel=")
            append(minChatThemeBackgroundBoostLevel)
            append(", ")
            append("minCustomBackgroundBoostLevel=")
            append(minCustomBackgroundBoostLevel)
            append(", ")
            append("minCustomEmojiStickerSetBoostLevel=")
            append(minCustomEmojiStickerSetBoostLevel)
            append(", ")
            append("minSpeechRecognitionBoostLevel=")
            append(minSpeechRecognitionBoostLevel)
            append(", ")
            append("minSponsoredMessageDisableBoostLevel=")
            append(minSponsoredMessageDisableBoostLevel)
            append(")")
        }
    }
}
