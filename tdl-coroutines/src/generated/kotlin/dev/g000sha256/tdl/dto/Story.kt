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
import kotlin.Long
import kotlin.String

/**
 * Represents a story.
 *
 * @property id Unique story identifier among stories posted by the given chat.
 * @property posterChatId Identifier of the chat that posted the story.
 * @property posterId Identifier of the user or chat that posted the story; may be null if the story is posted on behalf of the posterChatId.
 * @property date Point in time (Unix timestamp) when the story was published.
 * @property isBeingPosted True, if the story is being posted by the current user.
 * @property isBeingEdited True, if the story is being edited by the current user.
 * @property isEdited True, if the story was edited.
 * @property isPostedToChatPage True, if the story is saved in the profile of the chat that posted it and will be available there after expiration.
 * @property isVisibleOnlyForSelf True, if the story is visible only for the current user.
 * @property canBeDeleted True, if the story can be deleted.
 * @property canBeEdited True, if the story can be edited.
 * @property canBeForwarded True, if the story can be forwarded as a message. Otherwise, screenshots and saving of the story content must be also forbidden.
 * @property canBeReplied True, if the story can be replied in the chat with the user that posted the story.
 * @property canToggleIsPostedToChatPage True, if the story's isPostedToChatPage value can be changed.
 * @property canGetStatistics True, if the story statistics are available through getStoryStatistics.
 * @property canGetInteractions True, if interactions with the story can be received through getStoryInteractions.
 * @property hasExpiredViewers True, if users viewed the story can't be received, because the story has expired more than getOption(&quot;story_viewers_expiration_delay&quot;) seconds ago.
 * @property repostInfo Information about the original story; may be null if the story wasn't reposted.
 * @property interactionInfo Information about interactions with the story; may be null if the story isn't owned or there were no interactions.
 * @property chosenReactionType Type of the chosen reaction; may be null if none.
 * @property privacySettings Privacy rules affecting story visibility; may be approximate for non-owned stories.
 * @property content Content of the story.
 * @property areas Clickable areas to be shown on the story content.
 * @property caption Caption of the story.
 */
public class Story public constructor(
    public val id: Int,
    public val posterChatId: Long,
    public val posterId: MessageSender?,
    public val date: Int,
    public val isBeingPosted: Boolean,
    public val isBeingEdited: Boolean,
    public val isEdited: Boolean,
    public val isPostedToChatPage: Boolean,
    public val isVisibleOnlyForSelf: Boolean,
    public val canBeDeleted: Boolean,
    public val canBeEdited: Boolean,
    public val canBeForwarded: Boolean,
    public val canBeReplied: Boolean,
    public val canToggleIsPostedToChatPage: Boolean,
    public val canGetStatistics: Boolean,
    public val canGetInteractions: Boolean,
    public val hasExpiredViewers: Boolean,
    public val repostInfo: StoryRepostInfo?,
    public val interactionInfo: StoryInteractionInfo?,
    public val chosenReactionType: ReactionType?,
    public val privacySettings: StoryPrivacySettings,
    public val content: StoryContent,
    public val areas: Array<StoryArea>,
    public val caption: FormattedText,
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
        other as Story
        if (other.id != id) {
            return false
        }
        if (other.posterChatId != posterChatId) {
            return false
        }
        if (other.posterId != posterId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.isBeingPosted != isBeingPosted) {
            return false
        }
        if (other.isBeingEdited != isBeingEdited) {
            return false
        }
        if (other.isEdited != isEdited) {
            return false
        }
        if (other.isPostedToChatPage != isPostedToChatPage) {
            return false
        }
        if (other.isVisibleOnlyForSelf != isVisibleOnlyForSelf) {
            return false
        }
        if (other.canBeDeleted != canBeDeleted) {
            return false
        }
        if (other.canBeEdited != canBeEdited) {
            return false
        }
        if (other.canBeForwarded != canBeForwarded) {
            return false
        }
        if (other.canBeReplied != canBeReplied) {
            return false
        }
        if (other.canToggleIsPostedToChatPage != canToggleIsPostedToChatPage) {
            return false
        }
        if (other.canGetStatistics != canGetStatistics) {
            return false
        }
        if (other.canGetInteractions != canGetInteractions) {
            return false
        }
        if (other.hasExpiredViewers != hasExpiredViewers) {
            return false
        }
        if (other.repostInfo != repostInfo) {
            return false
        }
        if (other.interactionInfo != interactionInfo) {
            return false
        }
        if (other.chosenReactionType != chosenReactionType) {
            return false
        }
        if (other.privacySettings != privacySettings) {
            return false
        }
        if (other.content != content) {
            return false
        }
        val areasEquals = other.areas.contentDeepEquals(areas)
        if (!areasEquals) {
            return false
        }
        return other.caption == caption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + posterChatId.hashCode()
        hashCode = 31 * hashCode + posterId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + isBeingPosted.hashCode()
        hashCode = 31 * hashCode + isBeingEdited.hashCode()
        hashCode = 31 * hashCode + isEdited.hashCode()
        hashCode = 31 * hashCode + isPostedToChatPage.hashCode()
        hashCode = 31 * hashCode + isVisibleOnlyForSelf.hashCode()
        hashCode = 31 * hashCode + canBeDeleted.hashCode()
        hashCode = 31 * hashCode + canBeEdited.hashCode()
        hashCode = 31 * hashCode + canBeForwarded.hashCode()
        hashCode = 31 * hashCode + canBeReplied.hashCode()
        hashCode = 31 * hashCode + canToggleIsPostedToChatPage.hashCode()
        hashCode = 31 * hashCode + canGetStatistics.hashCode()
        hashCode = 31 * hashCode + canGetInteractions.hashCode()
        hashCode = 31 * hashCode + hasExpiredViewers.hashCode()
        hashCode = 31 * hashCode + repostInfo.hashCode()
        hashCode = 31 * hashCode + interactionInfo.hashCode()
        hashCode = 31 * hashCode + chosenReactionType.hashCode()
        hashCode = 31 * hashCode + privacySettings.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + areas.contentDeepHashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Story")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("posterChatId=")
            append(posterChatId)
            append(", ")
            append("posterId=")
            append(posterId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("isBeingPosted=")
            append(isBeingPosted)
            append(", ")
            append("isBeingEdited=")
            append(isBeingEdited)
            append(", ")
            append("isEdited=")
            append(isEdited)
            append(", ")
            append("isPostedToChatPage=")
            append(isPostedToChatPage)
            append(", ")
            append("isVisibleOnlyForSelf=")
            append(isVisibleOnlyForSelf)
            append(", ")
            append("canBeDeleted=")
            append(canBeDeleted)
            append(", ")
            append("canBeEdited=")
            append(canBeEdited)
            append(", ")
            append("canBeForwarded=")
            append(canBeForwarded)
            append(", ")
            append("canBeReplied=")
            append(canBeReplied)
            append(", ")
            append("canToggleIsPostedToChatPage=")
            append(canToggleIsPostedToChatPage)
            append(", ")
            append("canGetStatistics=")
            append(canGetStatistics)
            append(", ")
            append("canGetInteractions=")
            append(canGetInteractions)
            append(", ")
            append("hasExpiredViewers=")
            append(hasExpiredViewers)
            append(", ")
            append("repostInfo=")
            append(repostInfo)
            append(", ")
            append("interactionInfo=")
            append(interactionInfo)
            append(", ")
            append("chosenReactionType=")
            append(chosenReactionType)
            append(", ")
            append("privacySettings=")
            append(privacySettings)
            append(", ")
            append("content=")
            append(content)
            append(", ")
            append("areas=")
            areas
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("caption=")
            append(caption)
            append(")")
        }
    }
}
