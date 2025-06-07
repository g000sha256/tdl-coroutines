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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about verification status of a chat or a user.
 *
 * @property isVerified True, if the chat or the user is verified by Telegram.
 * @property isScam True, if the chat or the user is marked as scam by Telegram.
 * @property isFake True, if the chat or the user is marked as fake by Telegram.
 * @property botVerificationIconCustomEmojiId Identifier of the custom emoji to be shown as verification sign provided by a bot for the user; 0 if none.
 */
@SerialName(value = "verificationStatus")
@Serializable
public class VerificationStatus public constructor(
    @SerialName(value = "is_verified")
    public val isVerified: Boolean,
    @SerialName(value = "is_scam")
    public val isScam: Boolean,
    @SerialName(value = "is_fake")
    public val isFake: Boolean,
    @SerialName(value = "bot_verification_icon_custom_emoji_id")
    public val botVerificationIconCustomEmojiId: Long,
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
        other as VerificationStatus
        if (other.isVerified != isVerified) {
            return false
        }
        if (other.isScam != isScam) {
            return false
        }
        if (other.isFake != isFake) {
            return false
        }
        return other.botVerificationIconCustomEmojiId == botVerificationIconCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isVerified.hashCode()
        hashCode = 31 * hashCode + isScam.hashCode()
        hashCode = 31 * hashCode + isFake.hashCode()
        hashCode = 31 * hashCode + botVerificationIconCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VerificationStatus")
            append("(")
            append("isVerified=")
            append(isVerified)
            append(", ")
            append("isScam=")
            append(isScam)
            append(", ")
            append("isFake=")
            append(isFake)
            append(", ")
            append("botVerificationIconCustomEmojiId=")
            append(botVerificationIconCustomEmojiId)
            append(")")
        }
    }
}
