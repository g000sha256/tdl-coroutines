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
 * Contains information about notification settings for several chats.
 *
 * @property muteFor Time left before notifications will be unmuted, in seconds.
 * @property soundId Identifier of the notification sound to be played; 0 if sound is disabled.
 * @property showPreview True, if message content must be displayed in notifications.
 * @property useDefaultMuteStories If true, story notifications are received only for the first 5 chats from topChatCategoryUsers regardless of the value of muteStories.
 * @property muteStories True, if story notifications are disabled.
 * @property storySoundId Identifier of the notification sound to be played for stories; 0 if sound is disabled.
 * @property showStoryPoster True, if the chat that posted a story must be displayed in notifications.
 * @property disablePinnedMessageNotifications True, if notifications for incoming pinned messages will be created as for an ordinary unread message.
 * @property disableMentionNotifications True, if notifications for messages with mentions will be created as for an ordinary unread message.
 */
public class ScopeNotificationSettings public constructor(
    public val muteFor: Int,
    public val soundId: Long,
    public val showPreview: Boolean,
    public val useDefaultMuteStories: Boolean,
    public val muteStories: Boolean,
    public val storySoundId: Long,
    public val showStoryPoster: Boolean,
    public val disablePinnedMessageNotifications: Boolean,
    public val disableMentionNotifications: Boolean,
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
        other as ScopeNotificationSettings
        if (other.muteFor != muteFor) {
            return false
        }
        if (other.soundId != soundId) {
            return false
        }
        if (other.showPreview != showPreview) {
            return false
        }
        if (other.useDefaultMuteStories != useDefaultMuteStories) {
            return false
        }
        if (other.muteStories != muteStories) {
            return false
        }
        if (other.storySoundId != storySoundId) {
            return false
        }
        if (other.showStoryPoster != showStoryPoster) {
            return false
        }
        if (other.disablePinnedMessageNotifications != disablePinnedMessageNotifications) {
            return false
        }
        return other.disableMentionNotifications == disableMentionNotifications
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + muteFor.hashCode()
        hashCode = 31 * hashCode + soundId.hashCode()
        hashCode = 31 * hashCode + showPreview.hashCode()
        hashCode = 31 * hashCode + useDefaultMuteStories.hashCode()
        hashCode = 31 * hashCode + muteStories.hashCode()
        hashCode = 31 * hashCode + storySoundId.hashCode()
        hashCode = 31 * hashCode + showStoryPoster.hashCode()
        hashCode = 31 * hashCode + disablePinnedMessageNotifications.hashCode()
        hashCode = 31 * hashCode + disableMentionNotifications.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ScopeNotificationSettings")
            append("(")
            append("muteFor=")
            append(muteFor)
            append(", ")
            append("soundId=")
            append(soundId)
            append(", ")
            append("showPreview=")
            append(showPreview)
            append(", ")
            append("useDefaultMuteStories=")
            append(useDefaultMuteStories)
            append(", ")
            append("muteStories=")
            append(muteStories)
            append(", ")
            append("storySoundId=")
            append(storySoundId)
            append(", ")
            append("showStoryPoster=")
            append(showStoryPoster)
            append(", ")
            append("disablePinnedMessageNotifications=")
            append(disablePinnedMessageNotifications)
            append(", ")
            append("disableMentionNotifications=")
            append(disableMentionNotifications)
            append(")")
        }
    }
}
