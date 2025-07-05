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
 * Describes a sponsored message.
 *
 * @property messageId Message identifier; unique for the chat to which the sponsored message belongs among both ordinary and sponsored messages.
 * @property isRecommended True, if the message needs to be labeled as &quot;recommended&quot; instead of &quot;sponsored&quot;.
 * @property canBeReported True, if the message can be reported to Telegram moderators through reportChatSponsoredMessage.
 * @property content Content of the message. Currently, can be only of the types messageText, messageAnimation, messagePhoto, or messageVideo. Video messages can be viewed fullscreen.
 * @property sponsor Information about the sponsor of the message.
 * @property title Title of the sponsored message.
 * @property buttonText Text for the message action button.
 * @property accentColorId Identifier of the accent color for title, button text and message background.
 * @property backgroundCustomEmojiId Identifier of a custom emoji to be shown on the message background; 0 if none.
 * @property additionalInfo If non-empty, additional information about the sponsored message to be shown along with the message.
 */
public class SponsoredMessage public constructor(
    public val messageId: Long,
    public val isRecommended: Boolean,
    public val canBeReported: Boolean,
    public val content: MessageContent,
    public val sponsor: AdvertisementSponsor,
    public val title: String,
    public val buttonText: String,
    public val accentColorId: Int,
    public val backgroundCustomEmojiId: Long,
    public val additionalInfo: String,
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
        other as SponsoredMessage
        if (other.messageId != messageId) {
            return false
        }
        if (other.isRecommended != isRecommended) {
            return false
        }
        if (other.canBeReported != canBeReported) {
            return false
        }
        if (other.content != content) {
            return false
        }
        if (other.sponsor != sponsor) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.buttonText != buttonText) {
            return false
        }
        if (other.accentColorId != accentColorId) {
            return false
        }
        if (other.backgroundCustomEmojiId != backgroundCustomEmojiId) {
            return false
        }
        return other.additionalInfo == additionalInfo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + isRecommended.hashCode()
        hashCode = 31 * hashCode + canBeReported.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + sponsor.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + buttonText.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + backgroundCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + additionalInfo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SponsoredMessage")
            append("(")
            append("messageId=")
            append(messageId)
            append(", ")
            append("isRecommended=")
            append(isRecommended)
            append(", ")
            append("canBeReported=")
            append(canBeReported)
            append(", ")
            append("content=")
            append(content)
            append(", ")
            append("sponsor=")
            append(sponsor)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("buttonText=")
            append(buttonText)
            append(", ")
            append("accentColorId=")
            append(accentColorId)
            append(", ")
            append("backgroundCustomEmojiId=")
            append(backgroundCustomEmojiId)
            append(", ")
            append("additionalInfo=")
            append(additionalInfo)
            append(")")
        }
    }
}
