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
import kotlin.String

/**
 * Contains settings for automatic moving of chats to and from the Archive chat lists.
 *
 * @property archiveAndMuteNewChatsFromUnknownUsers True, if new chats from non-contacts will be automatically archived and muted. Can be set to true only if the option &quot;can_archive_and_mute_new_chats_from_unknown_users&quot; is true.
 * @property keepUnmutedChatsArchived True, if unmuted chats will be kept in the Archive chat list when they get a new message.
 * @property keepChatsFromFoldersArchived True, if unmuted chats, that are always included or pinned in a folder, will be kept in the Archive chat list when they get a new message. Ignored if keepUnmutedChatsArchived == true.
 */
public class ArchiveChatListSettingsDto public constructor(
    public val archiveAndMuteNewChatsFromUnknownUsers: Boolean,
    public val keepUnmutedChatsArchived: Boolean,
    public val keepChatsFromFoldersArchived: Boolean,
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
        other as ArchiveChatListSettingsDto
        if (other.archiveAndMuteNewChatsFromUnknownUsers != archiveAndMuteNewChatsFromUnknownUsers) {
            return false
        }
        if (other.keepUnmutedChatsArchived != keepUnmutedChatsArchived) {
            return false
        }
        return other.keepChatsFromFoldersArchived == keepChatsFromFoldersArchived
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + archiveAndMuteNewChatsFromUnknownUsers.hashCode()
        hashCode = 31 * hashCode + keepUnmutedChatsArchived.hashCode()
        hashCode = 31 * hashCode + keepChatsFromFoldersArchived.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ArchiveChatListSettingsDto")
            append("(")
            append("archiveAndMuteNewChatsFromUnknownUsers=")
            append(archiveAndMuteNewChatsFromUnknownUsers)
            append(", ")
            append("keepUnmutedChatsArchived=")
            append(keepUnmutedChatsArchived)
            append(", ")
            append("keepChatsFromFoldersArchived=")
            append(keepChatsFromFoldersArchived)
            append(")")
        }
    }
}
