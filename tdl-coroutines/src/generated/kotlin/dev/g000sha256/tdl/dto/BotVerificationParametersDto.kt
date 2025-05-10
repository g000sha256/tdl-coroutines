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
 * Describes parameters of verification that is provided by a bot.
 *
 * @property iconCustomEmojiId Identifier of the custom emoji that is used as the verification sign.
 * @property organizationName Name of the organization that provides verification.
 * @property defaultCustomDescription Default custom description of verification reason to be used as placeholder in setMessageSenderBotVerification; may be null if none.
 * @property canSetCustomDescription True, if the bot is allowed to provide custom description for verified entities.
 */
public class BotVerificationParametersDto public constructor(
    public val iconCustomEmojiId: Long,
    public val organizationName: String,
    public val defaultCustomDescription: FormattedTextDto?,
    public val canSetCustomDescription: Boolean,
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
        other as BotVerificationParametersDto
        if (other.iconCustomEmojiId != iconCustomEmojiId) {
            return false
        }
        if (other.organizationName != organizationName) {
            return false
        }
        if (other.defaultCustomDescription != defaultCustomDescription) {
            return false
        }
        return other.canSetCustomDescription == canSetCustomDescription
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + iconCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + organizationName.hashCode()
        hashCode = 31 * hashCode + defaultCustomDescription.hashCode()
        hashCode = 31 * hashCode + canSetCustomDescription.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BotVerificationParametersDto")
            append("(")
            append("iconCustomEmojiId=")
            append(iconCustomEmojiId)
            append(", ")
            append("organizationName=")
            append(organizationName)
            append(", ")
            append("defaultCustomDescription=")
            append(defaultCustomDescription)
            append(", ")
            append("canSetCustomDescription=")
            append(canSetCustomDescription)
            append(")")
        }
    }
}
