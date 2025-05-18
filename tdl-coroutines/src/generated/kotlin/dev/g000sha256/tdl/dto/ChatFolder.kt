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
import kotlin.LongArray
import kotlin.String

/**
 * Represents a folder for user chats.
 *
 * @property name The name of the folder.
 * @property icon The chosen icon for the chat folder; may be null. If null, use getChatFolderDefaultIconName to get default icon name for the folder.
 * @property colorId The identifier of the chosen color for the chat folder icon; from -1 to 6. If -1, then color is disabled. Can't be changed if folder tags are disabled or the current user doesn't have Telegram Premium subscription.
 * @property isShareable True, if at least one link has been created for the folder.
 * @property pinnedChatIds The chat identifiers of pinned chats in the folder. There can be up to getOption(&quot;chat_folder_chosen_chat_count_max&quot;) pinned and always included non-secret chats and the same number of secret chats, but the limit can be increased with Telegram Premium.
 * @property includedChatIds The chat identifiers of always included chats in the folder. There can be up to getOption(&quot;chat_folder_chosen_chat_count_max&quot;) pinned and always included non-secret chats and the same number of secret chats, but the limit can be increased with Telegram Premium.
 * @property excludedChatIds The chat identifiers of always excluded chats in the folder. There can be up to getOption(&quot;chat_folder_chosen_chat_count_max&quot;) always excluded non-secret chats and the same number of secret chats, but the limit can be increased with Telegram Premium.
 * @property excludeMuted True, if muted chats need to be excluded.
 * @property excludeRead True, if read chats need to be excluded.
 * @property excludeArchived True, if archived chats need to be excluded.
 * @property includeContacts True, if contacts need to be included.
 * @property includeNonContacts True, if non-contact users need to be included.
 * @property includeBots True, if bots need to be included.
 * @property includeGroups True, if basic groups and supergroups need to be included.
 * @property includeChannels True, if channels need to be included.
 */
public class ChatFolder public constructor(
    public val name: ChatFolderName,
    public val icon: ChatFolderIcon?,
    public val colorId: Int,
    public val isShareable: Boolean,
    public val pinnedChatIds: LongArray,
    public val includedChatIds: LongArray,
    public val excludedChatIds: LongArray,
    public val excludeMuted: Boolean,
    public val excludeRead: Boolean,
    public val excludeArchived: Boolean,
    public val includeContacts: Boolean,
    public val includeNonContacts: Boolean,
    public val includeBots: Boolean,
    public val includeGroups: Boolean,
    public val includeChannels: Boolean,
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
        other as ChatFolder
        if (other.name != name) {
            return false
        }
        if (other.icon != icon) {
            return false
        }
        if (other.colorId != colorId) {
            return false
        }
        if (other.isShareable != isShareable) {
            return false
        }
        val pinnedChatIdsEquals = other.pinnedChatIds.contentEquals(pinnedChatIds)
        if (!pinnedChatIdsEquals) {
            return false
        }
        val includedChatIdsEquals = other.includedChatIds.contentEquals(includedChatIds)
        if (!includedChatIdsEquals) {
            return false
        }
        val excludedChatIdsEquals = other.excludedChatIds.contentEquals(excludedChatIds)
        if (!excludedChatIdsEquals) {
            return false
        }
        if (other.excludeMuted != excludeMuted) {
            return false
        }
        if (other.excludeRead != excludeRead) {
            return false
        }
        if (other.excludeArchived != excludeArchived) {
            return false
        }
        if (other.includeContacts != includeContacts) {
            return false
        }
        if (other.includeNonContacts != includeNonContacts) {
            return false
        }
        if (other.includeBots != includeBots) {
            return false
        }
        if (other.includeGroups != includeGroups) {
            return false
        }
        return other.includeChannels == includeChannels
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + icon.hashCode()
        hashCode = 31 * hashCode + colorId.hashCode()
        hashCode = 31 * hashCode + isShareable.hashCode()
        hashCode = 31 * hashCode + pinnedChatIds.contentHashCode()
        hashCode = 31 * hashCode + includedChatIds.contentHashCode()
        hashCode = 31 * hashCode + excludedChatIds.contentHashCode()
        hashCode = 31 * hashCode + excludeMuted.hashCode()
        hashCode = 31 * hashCode + excludeRead.hashCode()
        hashCode = 31 * hashCode + excludeArchived.hashCode()
        hashCode = 31 * hashCode + includeContacts.hashCode()
        hashCode = 31 * hashCode + includeNonContacts.hashCode()
        hashCode = 31 * hashCode + includeBots.hashCode()
        hashCode = 31 * hashCode + includeGroups.hashCode()
        hashCode = 31 * hashCode + includeChannels.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatFolder")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("icon=")
            append(icon)
            append(", ")
            append("colorId=")
            append(colorId)
            append(", ")
            append("isShareable=")
            append(isShareable)
            append(", ")
            append("pinnedChatIds=")
            pinnedChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("includedChatIds=")
            includedChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("excludedChatIds=")
            excludedChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("excludeMuted=")
            append(excludeMuted)
            append(", ")
            append("excludeRead=")
            append(excludeRead)
            append(", ")
            append("excludeArchived=")
            append(excludeArchived)
            append(", ")
            append("includeContacts=")
            append(includeContacts)
            append(", ")
            append("includeNonContacts=")
            append(includeNonContacts)
            append(", ")
            append("includeBots=")
            append(includeBots)
            append(", ")
            append("includeGroups=")
            append(includeGroups)
            append(", ")
            append("includeChannels=")
            append(includeChannels)
            append(")")
        }
    }
}
