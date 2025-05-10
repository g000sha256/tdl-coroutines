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
 * Contains information about notification settings for reactions.
 *
 * @property messageReactionSource Source of message reactions for which notifications are shown.
 * @property storyReactionSource Source of story reactions for which notifications are shown.
 * @property soundId Identifier of the notification sound to be played; 0 if sound is disabled.
 * @property showPreview True, if reaction sender and emoji must be displayed in notifications.
 */
public class ReactionNotificationSettingsDto public constructor(
    public val messageReactionSource: ReactionNotificationSourceDto,
    public val storyReactionSource: ReactionNotificationSourceDto,
    public val soundId: Long,
    public val showPreview: Boolean,
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
        other as ReactionNotificationSettingsDto
        if (other.messageReactionSource != messageReactionSource) {
            return false
        }
        if (other.storyReactionSource != storyReactionSource) {
            return false
        }
        if (other.soundId != soundId) {
            return false
        }
        return other.showPreview == showPreview
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageReactionSource.hashCode()
        hashCode = 31 * hashCode + storyReactionSource.hashCode()
        hashCode = 31 * hashCode + soundId.hashCode()
        hashCode = 31 * hashCode + showPreview.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ReactionNotificationSettingsDto")
            append("(")
            append("messageReactionSource=")
            append(messageReactionSource)
            append(", ")
            append("storyReactionSource=")
            append(storyReactionSource)
            append(", ")
            append("soundId=")
            append(soundId)
            append(", ")
            append("showPreview=")
            append(showPreview)
            append(")")
        }
    }
}
