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
 * Contains information about an invite link to a chat folder.
 *
 * @property chatFolderInfo Basic information about the chat folder; chat folder identifier will be 0 if the user didn't have the chat folder yet.
 * @property missingChatIds Identifiers of the chats from the link, which aren't added to the folder yet.
 * @property addedChatIds Identifiers of the chats from the link, which are added to the folder already.
 */
public class ChatFolderInviteLinkInfo public constructor(
    public val chatFolderInfo: ChatFolderInfo,
    public val missingChatIds: LongArray,
    public val addedChatIds: LongArray,
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
        other as ChatFolderInviteLinkInfo
        if (other.chatFolderInfo != chatFolderInfo) {
            return false
        }
        val missingChatIdsEquals = other.missingChatIds.contentEquals(missingChatIds)
        if (!missingChatIdsEquals) {
            return false
        }
        return other.addedChatIds.contentEquals(addedChatIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatFolderInfo.hashCode()
        hashCode = 31 * hashCode + missingChatIds.contentHashCode()
        hashCode = 31 * hashCode + addedChatIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatFolderInviteLinkInfo")
            append("(")
            append("chatFolderInfo=")
            append(chatFolderInfo)
            append(", ")
            append("missingChatIds=")
            missingChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("addedChatIds=")
            addedChatIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
