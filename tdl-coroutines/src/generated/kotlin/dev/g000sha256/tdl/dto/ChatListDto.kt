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
 * This class is an abstract base class.
 * Describes a list of chats.
 */
public sealed class ChatListDto private constructor() {
    /**
     * A main list of chats.
     */
    public class Main public constructor() : ChatListDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ChatListDto.Main()"
        }
    }

    /**
     * A list of chats usually located at the top of the main chat list. Unmuted chats are automatically moved from the Archive to the Main chat list when a new message arrives.
     */
    public class Archive public constructor() : ChatListDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ChatListDto.Archive()"
        }
    }

    /**
     * A list of chats added to a chat folder.
     *
     * @property chatFolderId Chat folder identifier.
     */
    public class Folder public constructor(
        public val chatFolderId: Int,
    ) : ChatListDto() {
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
            other as Folder
            return other.chatFolderId == chatFolderId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatFolderId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatListDto.Folder")
                append("(")
                append("chatFolderId=")
                append(chatFolderId)
                append(")")
            }
        }
    }
}
