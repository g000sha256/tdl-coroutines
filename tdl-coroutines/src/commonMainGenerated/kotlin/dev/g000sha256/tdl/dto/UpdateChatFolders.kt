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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of chat folders or a chat folder has changed.
 *
 * @property chatFolders The new list of chat folders.
 * @property mainChatListPosition Position of the main chat list among chat folders, 0-based.
 * @property areTagsEnabled True, if folder tags are enabled.
 */
@SerialName(value = "updateChatFolders")
@Serializable
public class UpdateChatFolders public constructor(
    @SerialName(value = "chat_folders")
    public val chatFolders: Array<ChatFolderInfo>,
    @SerialName(value = "main_chat_list_position")
    public val mainChatListPosition: Int,
    @SerialName(value = "are_tags_enabled")
    public val areTagsEnabled: Boolean,
) : Update() {
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
        other as UpdateChatFolders
        val chatFoldersEquals = other.chatFolders.contentDeepEquals(chatFolders)
        if (!chatFoldersEquals) {
            return false
        }
        if (other.mainChatListPosition != mainChatListPosition) {
            return false
        }
        return other.areTagsEnabled == areTagsEnabled
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatFolders.contentDeepHashCode()
        hashCode = 31 * hashCode + mainChatListPosition.hashCode()
        hashCode = 31 * hashCode + areTagsEnabled.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateChatFolders")
            append("(")
            append("chatFolders=")
            chatFolders
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("mainChatListPosition=")
            append(mainChatListPosition)
            append(", ")
            append("areTagsEnabled=")
            append(areTagsEnabled)
            append(")")
        }
    }
}
