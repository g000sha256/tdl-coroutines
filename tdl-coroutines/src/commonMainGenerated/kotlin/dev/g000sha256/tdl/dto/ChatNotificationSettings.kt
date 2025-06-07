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
 * Contains information about notification settings for a chat or a forum topic.
 *
 * @property useDefaultMuteFor If true, the value for the relevant type of chat or the forum chat is used instead of muteFor.
 * @property muteFor Time left before notifications will be unmuted, in seconds.
 * @property useDefaultSound If true, the value for the relevant type of chat or the forum chat is used instead of soundId.
 * @property soundId Identifier of the notification sound to be played for messages; 0 if sound is disabled.
 * @property useDefaultShowPreview If true, the value for the relevant type of chat or the forum chat is used instead of showPreview.
 * @property showPreview True, if message content must be displayed in notifications.
 * @property useDefaultMuteStories If true, the value for the relevant type of chat is used instead of muteStories.
 * @property muteStories True, if story notifications are disabled for the chat.
 * @property useDefaultStorySound If true, the value for the relevant type of chat is used instead of storySoundId.
 * @property storySoundId Identifier of the notification sound to be played for stories; 0 if sound is disabled.
 * @property useDefaultShowStoryPoster If true, the value for the relevant type of chat is used instead of showStoryPoster.
 * @property showStoryPoster True, if the chat that posted a story must be displayed in notifications.
 * @property useDefaultDisablePinnedMessageNotifications If true, the value for the relevant type of chat or the forum chat is used instead of disablePinnedMessageNotifications.
 * @property disablePinnedMessageNotifications If true, notifications for incoming pinned messages will be created as for an ordinary unread message.
 * @property useDefaultDisableMentionNotifications If true, the value for the relevant type of chat or the forum chat is used instead of disableMentionNotifications.
 * @property disableMentionNotifications If true, notifications for messages with mentions will be created as for an ordinary unread message.
 */
@SerialName(value = "chatNotificationSettings")
@Serializable
public class ChatNotificationSettings public constructor(
    @SerialName(value = "use_default_mute_for")
    public val useDefaultMuteFor: Boolean,
    @SerialName(value = "mute_for")
    public val muteFor: Int,
    @SerialName(value = "use_default_sound")
    public val useDefaultSound: Boolean,
    @SerialName(value = "sound_id")
    public val soundId: Long,
    @SerialName(value = "use_default_show_preview")
    public val useDefaultShowPreview: Boolean,
    @SerialName(value = "show_preview")
    public val showPreview: Boolean,
    @SerialName(value = "use_default_mute_stories")
    public val useDefaultMuteStories: Boolean,
    @SerialName(value = "mute_stories")
    public val muteStories: Boolean,
    @SerialName(value = "use_default_story_sound")
    public val useDefaultStorySound: Boolean,
    @SerialName(value = "story_sound_id")
    public val storySoundId: Long,
    @SerialName(value = "use_default_show_story_poster")
    public val useDefaultShowStoryPoster: Boolean,
    @SerialName(value = "show_story_poster")
    public val showStoryPoster: Boolean,
    @SerialName(value = "use_default_disable_pinned_message_notifications")
    public val useDefaultDisablePinnedMessageNotifications: Boolean,
    @SerialName(value = "disable_pinned_message_notifications")
    public val disablePinnedMessageNotifications: Boolean,
    @SerialName(value = "use_default_disable_mention_notifications")
    public val useDefaultDisableMentionNotifications: Boolean,
    @SerialName(value = "disable_mention_notifications")
    public val disableMentionNotifications: Boolean,
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
        other as ChatNotificationSettings
        if (other.useDefaultMuteFor != useDefaultMuteFor) {
            return false
        }
        if (other.muteFor != muteFor) {
            return false
        }
        if (other.useDefaultSound != useDefaultSound) {
            return false
        }
        if (other.soundId != soundId) {
            return false
        }
        if (other.useDefaultShowPreview != useDefaultShowPreview) {
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
        if (other.useDefaultStorySound != useDefaultStorySound) {
            return false
        }
        if (other.storySoundId != storySoundId) {
            return false
        }
        if (other.useDefaultShowStoryPoster != useDefaultShowStoryPoster) {
            return false
        }
        if (other.showStoryPoster != showStoryPoster) {
            return false
        }
        if (other.useDefaultDisablePinnedMessageNotifications != useDefaultDisablePinnedMessageNotifications) {
            return false
        }
        if (other.disablePinnedMessageNotifications != disablePinnedMessageNotifications) {
            return false
        }
        if (other.useDefaultDisableMentionNotifications != useDefaultDisableMentionNotifications) {
            return false
        }
        return other.disableMentionNotifications == disableMentionNotifications
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + useDefaultMuteFor.hashCode()
        hashCode = 31 * hashCode + muteFor.hashCode()
        hashCode = 31 * hashCode + useDefaultSound.hashCode()
        hashCode = 31 * hashCode + soundId.hashCode()
        hashCode = 31 * hashCode + useDefaultShowPreview.hashCode()
        hashCode = 31 * hashCode + showPreview.hashCode()
        hashCode = 31 * hashCode + useDefaultMuteStories.hashCode()
        hashCode = 31 * hashCode + muteStories.hashCode()
        hashCode = 31 * hashCode + useDefaultStorySound.hashCode()
        hashCode = 31 * hashCode + storySoundId.hashCode()
        hashCode = 31 * hashCode + useDefaultShowStoryPoster.hashCode()
        hashCode = 31 * hashCode + showStoryPoster.hashCode()
        hashCode = 31 * hashCode + useDefaultDisablePinnedMessageNotifications.hashCode()
        hashCode = 31 * hashCode + disablePinnedMessageNotifications.hashCode()
        hashCode = 31 * hashCode + useDefaultDisableMentionNotifications.hashCode()
        hashCode = 31 * hashCode + disableMentionNotifications.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatNotificationSettings")
            append("(")
            append("useDefaultMuteFor=")
            append(useDefaultMuteFor)
            append(", ")
            append("muteFor=")
            append(muteFor)
            append(", ")
            append("useDefaultSound=")
            append(useDefaultSound)
            append(", ")
            append("soundId=")
            append(soundId)
            append(", ")
            append("useDefaultShowPreview=")
            append(useDefaultShowPreview)
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
            append("useDefaultStorySound=")
            append(useDefaultStorySound)
            append(", ")
            append("storySoundId=")
            append(storySoundId)
            append(", ")
            append("useDefaultShowStoryPoster=")
            append(useDefaultShowStoryPoster)
            append(", ")
            append("showStoryPoster=")
            append(showStoryPoster)
            append(", ")
            append("useDefaultDisablePinnedMessageNotifications=")
            append(useDefaultDisablePinnedMessageNotifications)
            append(", ")
            append("disablePinnedMessageNotifications=")
            append(disablePinnedMessageNotifications)
            append(", ")
            append("useDefaultDisableMentionNotifications=")
            append(useDefaultDisableMentionNotifications)
            append(", ")
            append("disableMentionNotifications=")
            append(disableMentionNotifications)
            append(")")
        }
    }
}
